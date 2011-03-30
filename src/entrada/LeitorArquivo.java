package entrada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lexico.Linha;

/**
 * Classe para a leitura do arquivo-fonte.
 * 
 * @author mauren
 */
public class LeitorArquivo {
	private BufferedReader reader;
	private static int numLinha = 1;
	
	/**
	 * Cria um BufferedReader para leitura do arquivo.
	 * 
	 * @param filepath
	 *            caminho do arquivo a ser lido.
	 * @throws FileNotFoundException
	 *             caso o arquivo não seja encontrado.
	 */
	public LeitorArquivo(String filepath) throws FileNotFoundException {
		this.reader = new BufferedReader(new FileReader(new File(filepath)));
	}
	
	/**
	 * Busca a próxima linha do arquivo.
	 * 
	 * @return a próxima linha do arquivo caso exista, senão null.
	 * @throws IOException
	 *             caso um erro de leitura ocorra.
	 */
	public Linha getLinha() throws IOException {
		Linha retLinha = new Linha();
		retLinha.setConteudo(this.reader.readLine());
		retLinha.setNumero(numLinha);
		
		numLinha++;
		
		return retLinha;
	}
}
