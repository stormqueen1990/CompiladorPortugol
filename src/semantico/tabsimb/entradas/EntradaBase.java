package semantico.tabsimb.entradas;

/**
 * Classe-base para todos os tipos de entrada da tabela de símbolos.
 * 
 * @author mauren
 */
public abstract class EntradaBase {
	private String id;

	/**
	 * Retorna o identificador dessa entrada na tabela de símbolos.
	 * 
	 * @return id dessa entrada na tabela de símbolos.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Seta o identificador dessa entrada na tabela de símbolos.
	 * 
	 * @param id
	 *            o id dessa entrada na tabela de símbolos.
	 */
	public void setId(String id) {
		this.id = id;
	}
}
