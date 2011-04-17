package geral;

import geral.enumeration.TokenEnum;

/**
 * Abstração do token da linguagem.
 * 
 * @author mauren
 */
public class Token {
	private String texto;
	private TokenEnum tipo;
	
	/**
	 * @return texto correspondente a esse token.
	 */
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	/**
	 * @return tipo do token em questão.
	 */
	public TokenEnum getTipo() {
		return this.tipo;
	}
	
	public void setTipo(TokenEnum tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return this.texto + " - " + this.getTipo();
	}
}
