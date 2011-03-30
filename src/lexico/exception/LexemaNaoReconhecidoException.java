package lexico.exception;

/**
 * Exceção lançada quando o lexema não foi reconhecido pelas regexes.
 * 
 * @author mauren
 */
public class LexemaNaoReconhecidoException extends Exception {
	private static final long serialVersionUID = 7427150021396671201L;
	
	private static String format = " Linha: %d, coluna: %d.";
	private static StringBuilder msg = new StringBuilder("Lexema não reconhecido.");
	
	public LexemaNaoReconhecidoException() {
		super();
	}
	
	public LexemaNaoReconhecidoException(int linha, int coluna) {
		super(msg.append(String.format(format, linha, coluna)).toString());
	}
}