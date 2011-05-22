package sintatico.construcoes;

import geral.AdvArrayList;
import geral.Token;
import geral.enumeration.TokenEnum;
import sintatico.ErroSintaxeEnum;
import sintatico.construcoes.base.ConstrucaoBase;
import sintatico.exception.SintaxeException;

/**
 * @author Fernando Melo
 */
public class RepitaAnalisador extends ConstrucaoBase {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean analisa(AdvArrayList<Token> listaTokens)
			throws SintaxeException {
		Token tk = listaTokens.next();

		// Verifica a existência do token 'repita'
		if (tk.getTipo() == TokenEnum.TK_Repita) {
			tk = listaTokens.next();

			// TODO colocar reconhecimento de comandos

			// Verifica a existência do token 'ate'
			if (tk.getTipo() == TokenEnum.TK_Ate) {
				tk = listaTokens.next();

				// TODO colocar reconhecimento de expressões
			} else {
				throw new SintaxeException(
						ErroSintaxeEnum.PALAVRA_ATE_NAO_ENCONTRADA, tk);
			}
		} else {
			throw new SintaxeException(
					ErroSintaxeEnum.PALAVRA_REPITA_NAO_ENCONTRADA, tk);
		}

		return true;
	}
}
