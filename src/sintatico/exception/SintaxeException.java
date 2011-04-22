package sintatico.exception;

import geral.Token;
import sintatico.ErroSintaxeEnum;

/**
 * Exceção lançada quando um erro de sintaxe é encontrado.
 * 
 * @author mauren
 */
public class SintaxeException extends Exception {
	private static final long serialVersionUID = 3677359292795337633L;
	
	private static final String format = "Erro de sintaxe próximo ao token \'%s\' na linha %d: %s.";
	
	public SintaxeException() {
		super();
	}
	
	public SintaxeException(ErroSintaxeEnum msgEnum, Token token) {
		super(String.format(format, token.getTexto(), token.getLinha(), msgEnum.getTextoMsg()));
	}
}
