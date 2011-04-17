package lexico;

import geral.Token;
import geral.enumeration.TokenEnum;

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
	private final String operadores = "((<-)|(<=)|(>=)|(<>)|[-\\+\\^\\*/\\\\%=<>])";
	private final String delimitadores = "([,;\\[\\]\\(\\):]|(\\.\\.))";
	private final String string = "(\"[^\"]+\")";
	private final String comentario = "(//[^\\n]*)";
	private final String identificadores = "([a-zA-Z]+[0-9]*[a-zA-Z]*)";
	private final String numerais = "([0-9]+(\\.[0-9]+)?)";
	
	private Pattern padraoLexico;
	
	private List<Token> listaTokens = new ArrayList<Token>();
	
	/**
	 * Construtor-padrão.
	 */
	public AnalisadorLexico() {
		// Monta a regex com todos os casos possíveis de busca
		StringBuilder padrao = new StringBuilder(100);
		final String[] padroes = new String[] { this.identificadores, this.numerais, this.string, this.comentario,
				this.operadores, this.delimitadores };
		
		// Junta elas em um stringão
		for (int i = 0; i < padroes.length; i++) {
			padrao.append(padroes[i]);
			
			if (i != padroes.length - 1) {
				padrao.append("|");
			}
		}
		
		padrao.append("+?");
		// Monta o padrão
		this.padraoLexico = Pattern.compile(padrao.toString());
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
		
		// Enquanto houver lexema na linha
		while (lexico.find()) {
			String parte;
			
			// Verifica se algum pedaço não foi identificado
			if ((fim != lexico.start()) && !str.substring(fim, lexico.start() - 1).trim().isEmpty()) {
				String comp = str.substring(fim + 1, lexico.start() - 1);
				throw new LexemaNaoReconhecidoException(linha.getNumero(), fim + 1, comp);
			}
			
			// Captura o final do lexema
			fim = lexico.end();
			// Substringa o lexema
			parte = str.substring(lexico.start(), fim);
			
			// Cria um token a partir do lexema
			Token token = new Token();
			token.setTexto(parte);
			
			TokenEnum tipoToken = this.buscaTipoToken(parte);
			
			// Se não encontrou tipo válido para o lexema, lança exceção
			if (tipoToken == null) {
				throw new LexemaNaoReconhecidoException(linha.getNumero(), fim, parte);
			} else {
				token.setTipo(tipoToken);
			}
			
			// Adiciona à lista de tokens
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
			fileWriter.write(tk + "\n");
		}
		
		fileWriter.close();
		
		return true;
	}
	
	/**
	 * Busca o tipo do lexema recebido por parâmetro.
	 * 
	 * @param lexema
	 *            o lexema cujo tipo deve ser buscado.
	 * @return o tipo do lexema quando encontrado, null caso contrário.
	 */
	private TokenEnum buscaTipoToken(String lexema) {
		// Verifica se passa na regex de comentário
		if (lexema.matches(this.comentario)) {
			return TokenEnum.TK_Coment;
		} // Verifica se passa na regex de numerais
		else if (lexema.matches(this.numerais)) {
			// Se passou, verifica que tipo de número é
			if (lexema.indexOf('.') == -1) {
				return TokenEnum.TK_Const_int;
			} else {
				return TokenEnum.TK_Const_real;
			}
		} // Verifica se é uma string
		else if (lexema.matches(this.string)) {
			return TokenEnum.TK_String;
		}
		
		TokenEnum[] valores = TokenEnum.values();
		
		// Varre o vetor buscando pelo seu tipo
		for (TokenEnum tk : valores) {
			if (tk.getDesLexema().equalsIgnoreCase(lexema)) {
				return tk;
			}
		}
		
		// Se não encontrou o tipo, verifica se é identificador
		if (lexema.matches(this.identificadores)) {
			return TokenEnum.TK_Ident;
		}
		
		return null;
	}
}
