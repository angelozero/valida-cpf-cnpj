package br.com.angelozero.principal;

import br.com.angelozero.domain.Cnpj;
import br.com.angelozero.domain.Cpf;
import br.com.angelozero.domain.Documento;
import br.com.angelozero.domain.Rg;
import br.com.angelozero.interfaces.ContratoDocumento;

public class Principal {

	public static void main(String[] args) {

		Cpf cpf = new Cpf("123.111.666.78");
		Cnpj cnpj = new Cnpj("123.111.666.78/0001");
		Rg rg = new Rg("11.111.222-1");
		
		
		System.out.println("CPF");
		getValueDocument(cpf);

		System.out.println("\nCNPJ");
		getValueDocument(cnpj);

		System.out.println("\nRG");
		getValueDocument(rg);

	}

	public static void getValueDocument(ContratoDocumento documento) {
		System.out.println(documento.getDocumentValue());
	}

	public static void getValueDocument(Documento documento) {
		System.out.println(documento.getDocumentValue());
	}

}
