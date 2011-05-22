package sintatico.construcoes;

import geral.AdvArrayList;
import geral.Token;
import sintatico.construcoes.base.ConstrucaoBase;
import sintatico.exception.SintaxeException;

/**
 * Classe de reconhecimento de expressões lógicas, relacionais e aritméticas.
 * @author shaman
 */
public class ExpressaoAnalisador extends ConstrucaoBase {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean analisa(AdvArrayList<Token> listaTokens)
			throws SintaxeException {
		Token tk = listaTokens.next();
		
		// Verifica 
		return true;
	}

}
