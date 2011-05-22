package semantico.tabsimb.entradas;

/**
 * Entrada de variáveis do tipo vetor na tabela de símbolos.
 * 
 * @author mauren
 */
public class VetorEntrada extends VariavelEntrada {
	private Integer tamanhoVetor;

	/**
	 * Retorna o tamanho do vetor em número de posições.
	 * 
	 * @return o tamanho do vetor.
	 */
	public Integer getTamanhoVetor() {
		return this.tamanhoVetor;
	}

	/**
	 * Seta o tamanho do vetor, em número de posições.
	 * 
	 * @param tamanhoVetor
	 *            o tamanho do vetor.
	 */
	public void setTamanhoVetor(Integer tamanhoVetor) {
		this.tamanhoVetor = tamanhoVetor;
	}
}
