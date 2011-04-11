package geral.enumeration;

/**
 * Enumeração dos tipos de token permitidos no compilador.
 * 
 * @author mauren
 */
public enum TokensValidosEnum {
	/**
	 * 'Algoritmo'
	 */
	TK_Algoritmo(1, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Var'
	 */
	TK_Var(2, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Inicio'
	 */
	TK_Inicio(3, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Fimalgoritmo'
	 */
	TK_Fim_Alg(4, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Para'
	 */
	TK_Para(5, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'De'
	 */
	TK_De(6, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Ate'
	 */
	TK_Ate(7, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Faca'
	 */
	TK_Faca(8, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Fimpara'
	 */
	TK_Fimpara(9, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Repita'
	 */
	TK_Repita(10, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Enquanto'
	 */
	TK_Enquanto(11, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Fimenquanto'
	 */
	TK_FimEnquanto(12, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Se'
	 */
	TK_Se(13, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Entao'
	 */
	TK_Entao(14, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Senao'
	 */
	TK_Senao(15, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Fimse'
	 */
	TK_Fimse(16, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Escreva'
	 */
	TK_Escreva(17, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Leia'
	 */
	TK_Leia(18, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Inteiro'
	 */
	TK_Inteiro(19, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Real'
	 */
	TK_Real(20, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * Comentário iniciando por //
	 */
	TK_Coment(22, TiposTokenEnum.COMENTARIO.getDescricao()),
	/**
	 * String entre aspas
	 */
	TK_String(23, TiposTokenEnum.CONSTANTE_INTEIRA.getDescricao()),
	TK_Const_int(24, TiposTokenEnum.CONSTANTE_INTEIRA.getDescricao()),
	/**
	 * Identificador
	 */
	TK_Ident(25, TiposTokenEnum.IDENTIFICADOR.getDescricao()),
	/**
	 * :
	 */
	TK_Dois_pontos(26, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * ,
	 */
	TK_Virgula(27, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * <-
	 */
	TK_Atrib(28, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * *
	 */
	TK_Mult(29, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * +
	 */
	TK_Mais(30, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * -
	 */
	TK_Menos(31, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * /
	 */
	TK_Divide(32, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * \
	 */
	TK_DivInt(33, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * %
	 */
	TK_Resto(34, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * (
	 */
	TK_Abre_par(35, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * )
	 */
	TK_Fecha_par(36, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * <
	 */
	TK_Menor(37, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * >
	 */
	TK_Maior(38, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * E
	 */
	TK_E(39, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * OU
	 */
	TK_OU(40, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * =
	 */
	TK_Igual(41, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * <=
	 */
	TK_MenorIgual(42, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * >=
	 */
	TK_MaiorIgual(43, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * <>
	 */
	TK_Diferente(44, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * ?
	 */
	TK_Nova_linha(45, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * vetor[ini..fim] de <tipo>
	 */
	TK_Vetor(47, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * [
	 */
	TK_AbreColchete(48, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * ..
	 */
	TK_PontoPonto(49, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * ]
	 */
	TK_FechaColchete(50, TiposTokenEnum.DELIMITADOR.getDescricao()),
	/**
	 * 'Logico'
	 */
	TK_Logico(51, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * ^
	 */
	TK_Potenciacao(52, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * constante real
	 */
	TK_Const_real(53, TiposTokenEnum.CONSTANTE_INTEIRA.getDescricao()),
	/**
	 * 'Escreval'
	 */
	TK_EscrevaL(54, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Falso'
	 */
	TK_Falso(55, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 'Verdadeiro'
	 */
	TK_Verdadeiro(56, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao()),
	/**
	 * 
	 */
	TK_NAO(63, TiposTokenEnum.OPERADOR_ARITMETICO.getDescricao()),
	/**
	 * 'Passo'
	 */
	TK_Passo(64, TiposTokenEnum.PALAVRA_RESERVADA.getDescricao());
	
	private int codigoToken;
	private String tipoToken;
	
	private TokensValidosEnum(int codigoToken, String tipoToken) {
		this.codigoToken = codigoToken;
		this.tipoToken = tipoToken;
	}
	
	public int getCodigoToken() {
		return this.codigoToken;
	}
	
	public void setCodigoToken(int codigoToken) {
		this.codigoToken = codigoToken;
	}
	
	public String getDescricaoToken() {
		return this.tipoToken;
	}
	
	public void setDescricaoToken(String descricaoToken) {
		this.tipoToken = descricaoToken;
	}
}
