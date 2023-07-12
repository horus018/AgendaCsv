package AgendaCsv;

public class Endereco {
	private String logradouro, cep, cidade, estado, complemento, email;

	public Endereco() {

	}

	public Endereco(String logradouro, String cep, String cidade, String estado, String complemento) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
	    return  "{\n" +
	            "  logradouro: " + logradouro + "\n" +
	            "  cep: " + cep + "\n" +
	            "  cidade: " + cidade + "\n" +
	            "  estado: " + estado + "\n" +
	            "  complemento: " + complemento + "\n" +
	            "  }";
	}
	
}
