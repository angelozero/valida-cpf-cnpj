package br.com.angelozero.domain;

import br.com.angelozero.interfaces.ContratoDocumento;

public class Cpf implements ContratoDocumento {

	private String codigo;

	public Cpf(String codigo) {
		setCodigo(codigo);
	}

	private String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		if (isValidDocument(codigo)) {
			this.codigo = codigo;
		} else {
			throw new RuntimeException("Erro ao validar CPF");
		}
	}

	@Override
	public boolean isValidDocument(String codigo) {
		return codigo.equals("123.111.666.78");
	}

	@Override
	public String getDocumentValue() {
		return getCodigo();
	}

}
