package lexico;

import geral.Token;
import geral.enumeration.TiposTokenEnum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lexico.exception.LexemaNaoReconhecidoException;

/**
 * Realiza os passos da análise léxica do arquivo-fonte.
 * 
 * @author mauren
 */
public class AnalisadorLexico {
	private String operadores = "([-\\+\\^\\*/\\\\%=<>]|(<-)|(<=)|(>=)|(<>))+";
	private String delimitadores = "([,\\[\\]\\(\\):]|(\\.\\.))+";
	private String string = "(\\\"[^\"]+\\\")";
	private String comentario = "(//[^\\n]+)";
	private String identificadores = "[a-zA-Z_]+[0-9]+[a-zA-Z_]*";
	private String numerais = "([0-9]+(\\.[0-9]+)?)";
	private List<String> operadoresLogicos = new ArrayList<String>();
	private List<String> palavrasReservadas = new ArrayList<String>();
	private Pattern padraoLexico;
	
	private List<Token> listaTokens = new ArrayList<Token>();
	
	public AnalisadorLexico() {
		StringBuilder padrao = new StringBuilder(100);
		final String[] padroes = new String[] { this.operadores, this.delimitadores, this.string, this.comentario,
				this.identificadores, this.numerais };
		
		for (int i = 0; i < padroes.length; i++) {
			padrao.append(padroes[i]);
			padrao.append("|");
		}
		
		padrao.setCharAt(padrao.length() - 1, '\0');
		this.padraoLexico = Pattern.compile(padrao.toString());
		
		this.preencheListas();
	}
	
	/**
	 * Preenche a lista de palavras reservadas.
	 */
	private void preencheListas() {
		// Preenche a lista de operadores lógicos
		this.operadoresLogicos.add("e");
		this.operadoresLogicos.add("ou");
		// Preenche a lista de palavras reservadas
		this.palavrasReservadas.add("algoritmo");
		this.palavrasReservadas.add("var");
		this.palavrasReservadas.add("inicio");
		this.palavrasReservadas.add("fimalgoritmo");
		this.palavrasReservadas.add("para");
		this.palavrasReservadas.add("de");
		this.palavrasReservadas.add("ate");
		this.palavrasReservadas.add("faca");
		this.palavrasReservadas.add("fimpara");
		this.palavrasReservadas.add("repita");
		this.palavrasReservadas.add("enquanto");
		this.palavrasReservadas.add("fimenquanto");
		this.palavrasReservadas.add("se");
		this.palavrasReservadas.add("entao");
		this.palavrasReservadas.add("senao");
		this.palavrasReservadas.add("fimse");
		this.palavrasReservadas.add("escreva");
		this.palavrasReservadas.add("leia");
		this.palavrasReservadas.add("inteiro");
		this.palavrasReservadas.add("real");
		this.palavrasReservadas.add("vetor");
		this.palavrasReservadas.add("logico");
		this.palavrasReservadas.add("escreval");
		this.palavrasReservadas.add("falso");
		this.palavrasReservadas.add("verdadeiro");
		this.palavrasReservadas.add("passo");
	}
	
	/**
	 * Realiza a análise léxica do arquivo-fonte.
	 * 
	 * @param str
	 *            a linha do arquivo-fonte a ser analisada
	 * @throws LexemaNaoReconhecidoException
	 *             quando há algum lexema não permitido pela linguagem na linha em questão
	 */
	public boolean analisa(Linha linha) throws LexemaNaoReconhecidoException {
		String str = linha.getConteudo();
		Matcher lexico = this.padraoLexico.matcher(str);
		int fim = 0;
		
		// lexico.
		
		// Enquanto houver lexema na linha
		while (lexico.find()) {
			String parte;
			
			// Verifica se algum pedaço não foi identificado
			if ((fim != lexico.start()) && !str.substring(fim, lexico.start()).trim().isEmpty()) {
				throw new LexemaNaoReconhecidoException(linha.getNumero(), fim + 1);
			}
			
			fim = lexico.end();
			
			parte = str.substring(lexico.start(), fim);
			
			Token token = new Token();
			token.setTexto(parte);
			token.setTipo(this.buscaTipoToken(parte));
			this.listaTokens.add(token);
		}
		
		return true;
	}
	
	/**
	 * Gera o arquivo de saída, com uma seqüência de lexemas e tokens identificados.
	 * 
	 * @param nomeArqSaida
	 *            o nome que o arquivo de saída deve ter.
	 * @return true se não ocorrer nenhum erro.
	 * @throws IOException
	 */
	public boolean geraArquivoSaida(String nomeArqSaida) throws IOException {
		BufferedWriter fileWriter = new BufferedWriter(new FileWriter(new File(nomeArqSaida)));
		
		for (Token tk : this.listaTokens) {
			fileWriter.write("(" + tk.getTexto() + " - " + tk.getTipo().getDescricao() + ")");
		}
		
		return true;
	}
	
	/**
	 * Verifica qual o tipo de token do lexema encontrado.
	 * 
	 * @param lexema
	 *            o lexema encontrado.
	 * @return o tipo de token identificado.
	 */
	private TiposTokenEnum buscaTipoToken(String lexema) {
		Pattern pat = Pattern.compile(this.comentario);
		Matcher matcher = pat.matcher(lexema);
		
		if (matcher.matches()) {
			return TiposTokenEnum.COMENTARIO;
		}
		
		matcher = matcher.usePattern(Pattern.compile(this.delimitadores));
		
		if (matcher.matches()) {
			return TiposTokenEnum.DELIMITADOR;
		}
		
		matcher = matcher.usePattern(Pattern.compile(this.identificadores));
		
		if (matcher.matches()) {
			if (this.operadoresLogicos.contains(lexema)) {
				return TiposTokenEnum.OPERADOR;
			} else if (this.palavrasReservadas.contains(lexema)) {
				return TiposTokenEnum.PALAVRA_RESERVADA;
			} else {
				return TiposTokenEnum.IDENTIFICADOR;
			}
		}
		
		matcher = matcher.usePattern(Pattern.compile(this.operadores));
		
		if (matcher.matches()) {
			return TiposTokenEnum.OPERADOR;
		}
		
		matcher = matcher.usePattern(Pattern.compile(this.numerais + "|" + this.string));
		
		if (matcher.matches()) {
			return TiposTokenEnum.CONSTANTE;
		}
		
		return null;
	}
}
