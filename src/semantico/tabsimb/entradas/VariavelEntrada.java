package semantico.tabsimb.entradas;

import geral.enumeration.TipoDadoEnum;

/**
 * Entrada de variáveis na tabela de símbolos.
 * 
 * @author mauren
 */
public class VariavelEntrada extends EntradaBase {
	private TipoDadoEnum tipo;

	/**
	 * Retorna o tipo da variável.
	 * 
	 * @return o tipo da variável.
	 */
	public TipoDadoEnum getTipo() {
		return this.tipo;
	}

	/**
	 * Seta o tipo da variável.
	 * 
	 * @param tipo
	 *            o tipo da variável.
	 */
	public void setTipo(TipoDadoEnum tipo) {
		this.tipo = tipo;
	}
}
