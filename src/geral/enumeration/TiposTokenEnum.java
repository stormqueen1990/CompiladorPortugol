package geral.enumeration;

public enum TiposTokenEnum {
	PALAVRA_RESERVADA("Palavra-reservada"),
	OPERADOR_ATRIBUICAO("Operador de atribuição"),
	OPERADOR_ARITMETICO("Operador aritmético"),
	OPERADOR_LOGICO("Operador lógico"),
	OPERADOR_RELACIONAL("Operador relacional"),
	CONSTANTE_INTEIRA("Constante inteira"),
	CONSTANTE_REAL("Constante real"),
	CONSTANTE_LITERAL("Constante literal"),
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
	
	@Override
	public String toString() {
		return this.getDescricao();
	}
}
