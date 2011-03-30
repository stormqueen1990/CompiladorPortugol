package geral;

import lexico.TiposToken;

/**
 * Abstração do token da linguagem.
 * 
 * @author mauren
 */
public class Token {
	private String texto;
	private TiposToken tipo;
	
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
	public TiposToken getTipo() {
		return this.tipo;
	}
	
	public void setTipo(TiposToken tipo) {
		this.tipo = tipo;
	}
}
