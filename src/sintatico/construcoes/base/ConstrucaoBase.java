package sintatico.construcoes.base;

import geral.AdvArrayList;
import geral.Token;
import semantico.tabsimb.TabelaSimbolos;
import sintatico.exception.SintaxeException;

/**
 * Classe-base para construção das classes de análise das construções da linguagem.
 * 
 * @author mauren
 */
public abstract class ConstrucaoBase {
	protected static TabelaSimbolos tabelaSimbolos;

	static {
		tabelaSimbolos = new TabelaSimbolos();
	}

	/**
	 * Realiza a análise sintática da construção.
	 * 
	 * @return true se a sintaxe está correta.
	 */
	public abstract boolean analisa(AdvArrayList<Token> listaTokens) throws SintaxeException;
}
