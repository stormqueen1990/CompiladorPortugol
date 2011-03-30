package lexico;

/**
 * Abstração da linha do arquivo-fonte.
 * 
 * @author mauren
 */
public class Linha {
	// Número da linha no arquivo-fonte (iniciando em 1)
	private Integer numero;
	// Conteúdo da linha lido do arquivo-fonte
	private String conteudo;
	
	/**
	 * @return o número da linha no arquivo-fonte
	 */
	public Integer getNumero() {
		return this.numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	/**
	 * @return conteúdo da linha no arquivo fonte.
	 */
	public String getConteudo() {
		return this.conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
