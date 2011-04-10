package geral.enumeration;

public enum TiposTokenEnum {
	PALAVRA_RESERVADA("Palavra-reservada"),
	OPERADOR("Operador"),
	CONSTANTE("Constante"),
	IDENTIFICADOR("Identificador"),
	COMENTARIO("Comentario"),
	DELIMITADOR("Delimitador");
	
	private String descricao;
	
	private TiposTokenEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
