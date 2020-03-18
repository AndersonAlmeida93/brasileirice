package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {

		String cpf = "09589026400";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("CPF INV�LIDO : " + e);
		}

		String cnpj = "79859623000174";
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("CNPJ INV�LIDO : " + e);
		}

		String tituloEleitor = "116045760809";
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("TITULO V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("TITULO INV�LIDO: " + e);
		}

	}

	private static void validarDocumentos(Validator<String> validador, String documento) {

		validador.assertValid(documento);
	}
}
