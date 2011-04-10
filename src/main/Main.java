package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import lexico.AnalisadorLexico;
import lexico.Linha;
import lexico.exception.LexemaNaoReconhecidoException;
import constants.Messages;
import entrada.LeitorArquivo;

public class Main {
	public static void main(String[] args) {
		try {
			String nomeArquivoEntrada = args[0];
			LeitorArquivo leitor = new LeitorArquivo(args[0]);
			AnalisadorLexico lexico = new AnalisadorLexico();
			Linha linha;
			
			do {
				linha = leitor.getLinha();
			} while ((linha.getConteudo() != null) && lexico.analisa(linha));
			
			String nomeArqSaida = nomeArquivoEntrada.split("\\.")[0] + ".lex";
			
			lexico.geraArquivoSaida(nomeArqSaida);
		} catch (FileNotFoundException e) {
			System.out.println(Messages.ARQUIVO_NAO_ENCONTRADO);
		} catch (IOException e) {
			System.out.println(Messages.ERRO_NA_LEITURA);
		} catch (LexemaNaoReconhecidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
