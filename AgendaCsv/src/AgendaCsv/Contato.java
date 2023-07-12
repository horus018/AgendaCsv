package AgendaCsv;

public class Contato {
	private String nome, sobrenome, email, celular, dataNascimento;
	private Endereco endereco;

	public Contato() {

	}

	public Contato(String email, String nome, String sobrenome, String celular, String dataNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
	    return "Contato {\n" +
	            "  nome: " + nome + "\n" +
	            "  sobrenome: " + sobrenome + "\n" +
	            "  email: " + email + "\n" +
	            "  celular: " + celular + "\n" +
	            "  dataNascimento: " + dataNascimento + "\n" +
	            "\n" +
	            "  Endereco: " + endereco + "\n" +
	            "}";
	}
	
}
