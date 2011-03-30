package lexico;

/**
 * Enumeração dos tipos de token permitidos no compilador.
 * 
 * @author mauren
 */
public interface TiposToken {
	/**
	 * Palavra-chave 'algoritmo'
	 */
	public static final Integer TK_Algoritmo = 1;
	/**
	 * Palavra-chave 'var'
	 */
	public static final Integer TK_Var = 2;
	/**
	 * Palavra-chave 'inicio'
	 */
	public static final Integer TK_Inicio = 3;
	/**
	 * Palavra-chave 'fimalgoritmo'
	 */
	public static final Integer TK_Fim_Alg = 4; // Fimalgoritmo;
	/**
	 * Palavra-chave 'para'
	 */
	public static final Integer TK_Para = 5;
	/**
	 * Palavra-chave 'de'
	 */
	public static final Integer TK_De = 6;
	/**
	 * Palavra-chave 'ate'
	 */
	public static final Integer TK_Ate = 7;
	/**
	 * Palavra-chave 'faca'
	 */
	public static final Integer TK_Faca = 8;
	/**
	 * Palavra-chave 'fimpara'
	 */
	public static final Integer TK_Fimpara = 9;
	/**
	 * Palavra-chave 'repita'
	 */
	public static final Integer TK_Repita = 10;
	/**
	 * Palavra-chave 'enquanto'
	 */
	public static final Integer TK_Enquanto = 11;
	/**
	 * Palavra-chave 'fimenquanto'
	 */
	public static final Integer TK_FimEnquanto = 12;
	/**
	 * Palavra-chave 'se'
	 */
	public static final Integer TK_Se = 13;
	/**
	 * Palavra-chave 'entao'
	 */
	public static final Integer TK_Entao = 14;
	/**
	 * Palavra-chave 'senao'
	 */
	public static final Integer TK_Senao = 15;
	/**
	 * Palavra-chave 'fimse'
	 */
	public static final Integer TK_Fimse = 16;
	/**
	 * Palavra-chave 'escreva'
	 */
	public static final Integer TK_Escreva = 17;
	/**
	 * Palavra-chave 'leia'
	 */
	public static final Integer TK_Leia = 18;
	/**
	 * Palavra-chave 'inteiro'
	 */
	public static final Integer TK_Inteiro = 19;
	/**
	 * Palavra-chave 'real'
	 */
	public static final Integer TK_Real = 20;
	/**
	 * Comentário '//'
	 */
	public static final Integer TK_Coment = 22;
	/**
	 * ???
	 */
	public static final Integer TK_String = 23;
	public static final Integer TK_Const_int = 24;
	public static final Integer TK_Ident = 25;
	public static final Integer TK_Dois_pontos = 26;
	public static final Integer TK_Virgula = 27;
	public static final Integer TK_Atrib = 28;
	public static final Integer TK_Mult = 29;
	public static final Integer TK_Mais = 30;
	public static final Integer TK_Menos = 31;
	public static final Integer TK_Divide = 32;
	public static final Integer TK_DivInt = 33;
	public static final Integer TK_Resto = 34;
	public static final Integer TK_Abre_par = 35;
	public static final Integer TK_Fecha_par = 36;
	public static final Integer TK_Menor = 37;
	public static final Integer TK_Maior = 38;
	public static final Integer TK_E = 39;
	public static final Integer TK_OU = 40;
	public static final Integer TK_Igual = 41;
	public static final Integer TK_MenorIgual = 42;
	public static final Integer TK_MaiorIgual = 43;
	public static final Integer TK_Diferente = 44;
	public static final Integer TK_Nova_linha = 45;
	public static final Integer TK_Literal = 46; // Não será usado nesse trabalho
	public static final Integer TK_Vetor = 47;
	public static final Integer TK_AbreColchete = 48;
	public static final Integer TK_pontoponto = 49;
	public static final Integer TK_FechaColchete = 50;
	public static final Integer TK_Logico = 51;
	public static final Integer TK_Potenciacao = 52;
	public static final Integer TK_Const_real = 53;
	public static final Integer TK_EscrevaL = 54;
	public static final Integer TK_Falso = 55;
	public static final Integer TK_Verdadeiro = 56;
	public static final Integer TK_Funcao = 57; // Não será usado nesse trabalho
	public static final Integer TK_Fimfuncao = 58; // Não será usado nesse trabalho
	public static final Integer TK_Procedimento = 59; // Não será usado nesse trabalho
	public static final Integer TK_Fimprocedimento = 60; // Não será usado nesse trabalho
	public static final Integer TK_Ponto_e_virgula = 61; // Não será usado nesse trabalho
	public static final Integer TK_Retorne = 62; // Não será usado nesse trabalho
	public static final Integer TK_NAO = 63;
	public static final Integer TK_Passo = 64;
}
