package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {

	public static void main(String[] args) {
		
		String cpf = "09589026400";
		String cnpj = "89319105000111";
		String tituloEleitor = "116045760809";
		
		String cpfSemFormatacao =  formatarDocumento(new CPFFormatter(), cpf);
		System.out.println(cpf);
		System.out.println(cpfSemFormatacao);
		
		String cnpjSemFormatacao = formatarDocumento(new CNPJFormatter(), cnpj);
		System.out.println(cnpj);
		System.out.println(cnpjSemFormatacao);
		
		String tituloComFormatacao = formatarDocumento(new TituloEleitoralFormatter(),tituloEleitor);
		System.out.println(tituloEleitor);
		System.out.println(tituloComFormatacao);
		
	}
	
	private static  String formatarDocumento(Formatter formatar, String documento) {
		
		return formatar.format(documento);
	}
}
