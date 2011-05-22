package sintatico;

/**
 * Enumeração com os tipos de erro sintático possíveis.
 * 
 * @author mauren
 */
public enum ErroSintaxeEnum {
	PALAVRA_ALGORITMO_NAO_ENCONTRADA(1, "Palavra-chave \'Algoritmo\' não encontrada."),
	PALAVRA_INICIO_NAO_ENCONTRADA(2, "Palavra-chave \'Inicio\' não encontrada."),
	PALAVRA_FIMALGORITMO_NAO_ENCONTRADA(3, "Palavra-chave \'Fimalgoritmo\' não encontrada."),
	PALAVRA_REPITA_NAO_ENCONTRADA(4, "Palavra-chave \'Repita\' não encontrada."),
	PALAVRA_ATE_NAO_ENCONTRADA(5, "Palavra-chave \'Ate\' não encontrada."),
	PALAVRA_PARA_NAO_ENCONTRADA(6, "Palavra-chave \'Para\' não encontrada."),
	VARIAVEL_CONTROLE_NAO_ENCONTRADA(7, "Variável de controle do laço não encontrada."),
	VARIAVEL_CONTROLE_NAO_DECLARADA(8, "Variável de controle do laço não declarada.");

	private Integer codMsg;
	private String textoMsg;

	private ErroSintaxeEnum(Integer codMsg, String textoMsg) {
		this.codMsg = codMsg;
		this.textoMsg = textoMsg;
	}

	public Integer getCodMsg() {
		return this.codMsg;
	}

	public void setCodMsg(Integer codMsg) {
		this.codMsg = codMsg;
	}

	public String getTextoMsg() {
		return this.textoMsg;
	}

	public void setTextoMsg(String textoMsg) {
		this.textoMsg = textoMsg;
	}
}
