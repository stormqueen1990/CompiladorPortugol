package sintatico.construcoes;

import geral.AdvArrayList;
import geral.Token;
import geral.enumeration.TokenEnum;
import sintatico.construcoes.base.ConstrucaoBase;

/**
 * Verificador da sintaxe das declarações de variáveis.
 * 
 * @author mauren
 */
public class VarAnalisador extends ConstrucaoBase {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean analisa(AdvArrayList<Token> listaTokens) {
		Token tk = listaTokens.next();
		
		// Verifica a existência do token var
		if (tk.getTipo() == TokenEnum.TK_Var) {
			tk = listaTokens.next();
			
			// Verifica se é um identificador
			if (tk.getTipo() == TokenEnum.TK_Ident) {
				tk = listaTokens.next();
			}
		}
		
		return false;
	}
}
