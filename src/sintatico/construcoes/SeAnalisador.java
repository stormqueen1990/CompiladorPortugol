package sintatico.construcoes;

import geral.AdvArrayList;
import geral.Token;
import geral.enumeration.TokenEnum;
import sintatico.ErroSintaxeEnum;
import sintatico.construcoes.base.ConstrucaoBase;
import sintatico.exception.SintaxeException;

public class SeAnalisador extends ConstrucaoBase{
	@Override
	public boolean analisa(AdvArrayList<Token> listaTokens)
			throws SintaxeException {
		Token tk = listaTokens.next();

		// Verifica a existência do token 'se'
		if (tk.getTipo() == TokenEnum.TK_Se) {
			tk = listaTokens.next();
			
			// TODO colocar reconhecimento de expressões
			
			// Verifica a existência do token 'entao'
			if (tk.getTipo() == TokenEnum.TK_Entao) {
				tk = listaTokens.next();

				// TODO colocar reconhecimento de expressões
				
				// Verifica a existência do token 'senap'
				if (tk.getTipo() == TokenEnum.TK_Senao) {
					tk = listaTokens.next();	
					
					// TODO colocar reconhecimento de expressões
				}
				
				// Verifica a existência do token 'Fimse'
				if (tk.getTipo() == TokenEnum.TK_Fimse) {
					tk = listaTokens.next();	
				} else{
					throw new SintaxeException(ErroSintaxeEnum.PALAVRA_FIMSE_NAO_ENCONTRADA, tk);
				}
				
			} else {
				throw new SintaxeException(
						ErroSintaxeEnum.PALAVRA_ENTAO_NAO_ENCONTRADA, tk);
			}
		} else {
			throw new SintaxeException(
					ErroSintaxeEnum.PALAVRA_SE_NAO_ENCONTRADA, tk);
		}

		return true;
	}
}
