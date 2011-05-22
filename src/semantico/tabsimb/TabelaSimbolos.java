package semantico.tabsimb;

import java.util.HashMap;
import java.util.Map;

import semantico.tabsimb.entradas.EntradaBase;

/**
 * Implementação da tabela de símbolos.
 * 
 * @author mauren
 */
public class TabelaSimbolos {
	private static Map<String, EntradaBase> symbolTable;

	// Inicializador de atributos estáticos
	static {
		symbolTable = new HashMap<String, EntradaBase>();
	}

	/**
	 * Adiciona uma entrada na tabela de símbolos.
	 * 
	 * @param e
	 *            a entrada a ser inserida na tabela de símbolos.
	 * @return a entrada inserida.
	 */
	public EntradaBase put(EntradaBase e) {
		return symbolTable.put(e.getId(), e);
	}

	/**
	 * Recupera uma entrada da tabela de símbolos.
	 * 
	 * @param s
	 *            o id da entrada a ser recuperada.
	 * @return a entrada da tabela de símbolos correspondente a esse id.
	 */
	public EntradaBase get(String s) {
		return symbolTable.get(s);
	}
}
