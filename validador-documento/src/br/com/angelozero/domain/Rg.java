package br.com.angelozero.domain;

public class Rg extends Documento {

	public Rg(String codigo) {
		super(codigo);
	}

	@Override
	public boolean isValidDocument(String codigo) {
		return codigo.equals("11.111.222-1");
	}

}
