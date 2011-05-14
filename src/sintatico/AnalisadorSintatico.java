package sintatico;

import geral.AdvArrayList;
import geral.Token;
import geral.enumeration.TokenEnum;
import sintatico.exception.SintaxeException;

/**
 * Realiza os passos da análise sintática do arquivo-fonte.
 * 
 * @author mauren
 */
public class AnalisadorSintatico {
	private AdvArrayList<Token> listaTokens;
	
	/**
	 * Evita a supressão do construtor-padrão.
	 */
	public AnalisadorSintatico() {
		this.listaTokens = new AdvArrayList<Token>();
	}
	
	/**
	 * Construtor.
	 * 
	 * @param listaTokens
	 *            a lista de tokens gerada pelo analisador léxico.
	 */
	public AnalisadorSintatico(AdvArrayList<Token> listaTokens) {
		this.listaTokens = listaTokens;
	}
	
	/**
	 * Realiza a análise sintática do arquivo-fonte.
	 * 
	 * @return true se o arquivo não possui erros de sintaxe.
	 */
	public boolean analisa() throws SintaxeException {
		Token tk = this.listaTokens.next();
		
		// Verifica se inicia pela palavra-chave Algoritmo
		if (tk.getTipo() == TokenEnum.TK_Algoritmo) {
			tk = this.listaTokens.next();
			
			// Verifica a existência de uma string com o nome do algoritmo (opcional)
			if (tk.getTipo() == TokenEnum.TK_String) {
				tk = this.listaTokens.next();
			}
			
			//Verifica a existência de declarações de variáveis (opcional)
			if (tk.getTipo() == TokenEnum.TK_Var){
				tk = this.listaTokens.next();
			}			
			
			//Verifica a existência da palavra-chave Inico
			if (tk.getTipo() == TokenEnum.TK_Inicio){
				tk = this.listaTokens.next();
				
				//TODO Colocar verificação de comandos
				
				//Verifica a existência da palavra-chave FimAlgortimo
				if (tk.getTipo() == TokenEnum.TK_Fim_Alg){
					tk = this.listaTokens.next();
				}
				else{
					throw new SintaxeException(ErroSintaxeEnum.PALAVRA_FIMALGORITMO_NAO_ENCONTRADA, tk);
				}
			}			
			else{
				throw new SintaxeException(ErroSintaxeEnum.PALAVRA_INICIO_NAO_ENCONTRADA, tk);
			}			
		} else {
			throw new SintaxeException(ErroSintaxeEnum.PALAVRA_ALGORITMO_NAO_ENCONTRADA, tk);
		}
		
		return true;
	}
}
