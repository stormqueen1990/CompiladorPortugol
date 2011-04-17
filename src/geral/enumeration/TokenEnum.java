package geral.enumeration;

/**
 * Enumeração dos tipos de token permitidos no compilador.
 * 
 * @author mauren
 */
public enum TokenEnum {
	/**
	 * 'Algoritmo'
	 */
	TK_Algoritmo(1, "algoritmo", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Var'
	 */
	TK_Var(2, "var", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Inicio'
	 */
	TK_Inicio(3, "inicio", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Fimalgoritmo'
	 */
	TK_Fim_Alg(4, "fimalgoritmo", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Para'
	 */
	TK_Para(5, "para", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'De'
	 */
	TK_De(6, "de", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Ate'
	 */
	TK_Ate(7, "ate", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Faca'
	 */
	TK_Faca(8, "faca", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Fimpara'
	 */
	TK_Fimpara(9, "fimpara", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Repita'
	 */
	TK_Repita(10, "repita", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Enquanto'
	 */
	TK_Enquanto(11, "enquanto", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Fimenquanto'
	 */
	TK_FimEnquanto(12, "fimenquanto", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Se'
	 */
	TK_Se(13, "se", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Entao'
	 */
	TK_Entao(14, "entao", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Senao'
	 */
	TK_Senao(15, "senao", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Fimse'
	 */
	TK_Fimse(16, "fimse", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Escreva'
	 */
	TK_Escreva(17, "escreva", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Leia'
	 */
	TK_Leia(18, "leia", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Inteiro'
	 */
	TK_Inteiro(19, "inteiro", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Real'
	 */
	TK_Real(20, "real", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * Comentário iniciando por //
	 */
	TK_Coment(22, "", TiposTokenEnum.COMENTARIO),
	/**
	 * String entre aspas
	 */
	TK_String(23, "", TiposTokenEnum.CONSTANTE_LITERAL),
	/**
	 * Constante inteira
	 */
	TK_Const_int(24, "", TiposTokenEnum.CONSTANTE_INTEIRA),
	/**
	 * Identificador
	 */
	TK_Ident(25, "", TiposTokenEnum.IDENTIFICADOR),
	/**
	 * :
	 */
	TK_Dois_pontos(26, ":", TiposTokenEnum.DELIMITADOR),
	/**
	 * ,
	 */
	TK_Virgula(27, ",", TiposTokenEnum.DELIMITADOR),
	/**
	 * <-
	 */
	TK_Atrib(28, "<-", TiposTokenEnum.OPERADOR_ATRIBUICAO),
	/**
	 * *
	 */
	TK_Mult(29, "*", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * +
	 */
	TK_Mais(30, "+", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * -
	 */
	TK_Menos(31, "-", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * /
	 */
	TK_Divide(32, "/", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * \
	 */
	TK_DivInt(33, "\\", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * %
	 */
	TK_Resto(34, "%", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * (
	 */
	TK_Abre_par(35, "(", TiposTokenEnum.DELIMITADOR),
	/**
	 * )
	 */
	TK_Fecha_par(36, ")", TiposTokenEnum.DELIMITADOR),
	/**
	 * <
	 */
	TK_Menor(37, "<", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * >
	 */
	TK_Maior(38, ">", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * E
	 */
	TK_E(39, "e", TiposTokenEnum.OPERADOR_LOGICO),
	/**
	 * OU
	 */
	TK_OU(40, "ou", TiposTokenEnum.OPERADOR_LOGICO),
	/**
	 * =
	 */
	TK_Igual(41, "=", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * <=
	 */
	TK_MenorIgual(42, "<=", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * >=
	 */
	TK_MaiorIgual(43, ">=", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * <>
	 */
	TK_Diferente(44, "<>", TiposTokenEnum.OPERADOR_RELACIONAL),
	/**
	 * ?
	 */
	TK_Nova_linha(45, "\n", TiposTokenEnum.DELIMITADOR),
	/**
	 * vetor[ini..fim] de <tipo>
	 */
	TK_Vetor(47, "vetor", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * [
	 */
	TK_AbreColchete(48, "[", TiposTokenEnum.DELIMITADOR),
	/**
	 * ..
	 */
	TK_PontoPonto(49, "..", TiposTokenEnum.DELIMITADOR),
	/**
	 * ]
	 */
	TK_FechaColchete(50, "]", TiposTokenEnum.DELIMITADOR),
	/**
	 * 'Logico'
	 */
	TK_Logico(51, "logico", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * ^
	 */
	TK_Potenciacao(52, "^", TiposTokenEnum.OPERADOR_ARITMETICO),
	/**
	 * constante real
	 */
	TK_Const_real(53, "", TiposTokenEnum.CONSTANTE_REAL),
	/**
	 * 'Escreval'
	 */
	TK_EscrevaL(54, "escreval", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Falso'
	 */
	TK_Falso(55, "falso", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 'Verdadeiro'
	 */
	TK_Verdadeiro(56, "verdadeiro", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * 
	 */
	TK_NAO(63, "nao", TiposTokenEnum.OPERADOR_LOGICO),
	/**
	 * 'Passo'
	 */
	TK_Passo(64, "passo", TiposTokenEnum.PALAVRA_RESERVADA),
	/**
	 * ;
	 */
	TK_PontoVirgula(65, ";", TiposTokenEnum.DELIMITADOR);
	
	private int codigoToken;
	private String desLexema;
	private TiposTokenEnum tipoToken;
	
	private TokenEnum(int codigoToken, String desLexema, TiposTokenEnum tipoToken) {
		this.codigoToken = codigoToken;
		this.desLexema = desLexema;
		this.tipoToken = tipoToken;
	}
	
	public int getCodigoToken() {
		return this.codigoToken;
	}
	
	public void setCodigoToken(int codigoToken) {
		this.codigoToken = codigoToken;
	}
	
	public String getDesLexema() {
		return this.desLexema;
	}
	
	public void setDesLexema(String desLexema) {
		this.desLexema = desLexema;
	}
	
	public TiposTokenEnum getTipoToken() {
		return this.tipoToken;
	}
	
	public void setTipoToken(TiposTokenEnum tipoToken) {
		this.tipoToken = tipoToken;
	}
	
	@Override
	public String toString() {
		return "token " + this.codigoToken + ": " + this.tipoToken;
	}
}
