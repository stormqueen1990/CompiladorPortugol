package lexico.exception;

/**
 * Exceção lançada quando o lexema não foi reconhecido pelo analisador léxico.
 * 
 * @author mauren
 */
public class LexemaNaoReconhecidoException extends Exception {
	private static final long serialVersionUID = 7427150021396671201L;
	
	private static String format = " Linha: %d, coluna: %d: \"%s\".";
	private static StringBuilder msg = new StringBuilder("Lexema não reconhecido.");
	
	public LexemaNaoReconhecidoException() {
		super();
	}
	
	public LexemaNaoReconhecidoException(int linha, int coluna, String complemento) {
		super(msg.append(String.format(format, linha, coluna, complemento)).toString());
	}
}
