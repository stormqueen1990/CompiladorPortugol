package sintatico;

/**
 * Enumeração com os tipos de erro sintático possíveis.
 * 
 * @author mauren
 */
public enum ErroSintaxeEnum {
	PALAVRA_ALGORITMO_NAO_ENCONTRADA(1, "Palavra-chave \'Algoritmo\' não encontrada.");
	
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
