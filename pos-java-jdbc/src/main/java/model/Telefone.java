package model;

public class Telefone {
	
	private long id;
	private String numero;
	private String tipo;
	private long usuário;

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getUsuário() {
		return usuário;
	}

	public void setUsuário(long usuário) {
		this.usuário = usuário;
	}
	
}
