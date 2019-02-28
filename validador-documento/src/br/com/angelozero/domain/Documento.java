package br.com.angelozero.domain;

public abstract class Documento {

	private String codigo;

	public Documento(String codigo) {
		setCodigo(codigo);
	}

	private String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		if (isValidDocument(codigo)) {
			this.codigo = codigo;
		} else {
			throw new RuntimeException("Erro ao validar o numero do documento: " + codigo);
		}
	}

	public abstract boolean isValidDocument(String codigo);

	public String getDocumentValue() {
		return getCodigo();
	}
}
