package lexico;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lexico.exception.LexemaNaoReconhecidoException;


/**
 * Realiza os passos da análise léxica do arquivo-fonte.
 * 
 * @author mauren
 */
public class AnalisadorLexico implements TiposToken {
	private String simbolos = "([-\\+\\^\\*/\\\\%=<>,\\[\\]\\(\\):\"]|(<-)|(<=)|(>=)|(<>)|(//)|(\\.\\.))+";
	private String string = "(\\\"[^\"]+\\\")";
	private String identificadores = "[a-zA-Z_]+";
	private String numerais = "([0-9]+(\\.[0-9]+)?)";
	private Pattern padraoLexico;
	
	public AnalisadorLexico() {
		StringBuilder padrao = new StringBuilder(100);
		final String[] padroes = new String[] { this.simbolos, this.string, this.identificadores, this.numerais };
		
		for (int i = 0; i < padroes.length; i++) {
			padrao.append(padroes[i]);
			padrao.append("|");
		}
		
		padrao.setCharAt(padrao.length() - 1, '\0');
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
	public void analisa(Linha linha) throws LexemaNaoReconhecidoException {
		String str = linha.getConteudo();
		Matcher lexico = this.padraoLexico.matcher(str);
		List<String> listaPartes = new LinkedList<String>();
		int fim = 0;
		
		while (lexico.find()) {
			String parte;
			
			if ((fim != lexico.start()) && !str.substring(fim, lexico.start()).trim().isEmpty()) {
				throw new LexemaNaoReconhecidoException(linha.getNumero(), fim + 1);
			}
			
			fim = lexico.end();
			
			parte = str.substring(lexico.start(), fim);
			listaPartes.add(parte);
		}
	}
}
