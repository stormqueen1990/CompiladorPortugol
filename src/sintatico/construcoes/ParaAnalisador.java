package sintatico.construcoes;

import geral.AdvArrayList;
import geral.Token;
import geral.enumeration.TokenEnum;
import semantico.tabsimb.entradas.VariavelEntrada;
import sintatico.ErroSintaxeEnum;
import sintatico.construcoes.base.ConstrucaoBase;
import sintatico.exception.SintaxeException;

/**
 * Verificador da sintaxe da construção 'para'.
 * 
 * @author Mauren
 */
public class ParaAnalisador extends ConstrucaoBase {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean analisa(AdvArrayList<Token> listaTokens) throws SintaxeException {
		boolean retorno = false;
		Token tk = listaTokens.next();

		// Verifica a existência do token 'para'
		if (tk.getTipo() == TokenEnum.TK_Para) {
			tk = listaTokens.next();

			// Verifica a existência de uma variável de controle
			if (tk.getTipo() == TokenEnum.TK_Ident) {
				VariavelEntrada entrada = (VariavelEntrada) tabelaSimbolos.get(tk.getTexto());

				// Verifica se a variável de controle foi declarada anteriormente
				if (entrada == null) {
					throw new SintaxeException(ErroSintaxeEnum.VARIAVEL_CONTROLE_NAO_DECLARADA, tk);
				}

				tk = listaTokens.next();
			} else {
				throw new SintaxeException(ErroSintaxeEnum.VARIAVEL_CONTROLE_NAO_ENCONTRADA, tk);
			}
		} else {
			throw new SintaxeException(ErroSintaxeEnum.PALAVRA_PARA_NAO_ENCONTRADA, tk);
		}

		return retorno;
	}
}
