package AgendaCsv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LeitorArquivo {
	
	private ArrayList<Contato> listaContatos = new ArrayList<>();
	private ArrayList<Endereco> listaEnderecos = new ArrayList<>();

	public ArrayList<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(ArrayList<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	public void lerArquivo() {
		try {
			Reader leitorArquivoContatos = new FileReader("contatos.csv");
			Reader leitorArquivoEnderecos = new FileReader("endereco.csv");
			
			CSVFormat configCSVContatos = CSVFormat.Builder.create().setHeader("email","nome","sobrenome","celular","data_nascimento").setSkipHeaderRecord(true).build();
			CSVFormat configCSVEnderecos = CSVFormat.Builder.create().setHeader("logradouro","cep","cidade","estado","complemento","email").setSkipHeaderRecord(true).build();
			
			CSVParser interpretadorCSVContatos = configCSVContatos.parse(leitorArquivoContatos);
			CSVParser interpretadorCSVEnderecos = configCSVEnderecos.parse(leitorArquivoEnderecos);
			
			for (CSVRecord record : interpretadorCSVEnderecos.getRecords()) {
				Endereco endereco = new Endereco(record.get("logradouro"), record.get("cep"), record.get("cidade"),
						record.get("estado"), record.get("complemento"));
				endereco.setEmail(record.get("email"));
				listaEnderecos.add(endereco);
			}
			
			for (CSVRecord record : interpretadorCSVContatos.getRecords()) {
				Contato contato = new Contato(record.get("email"), record.get("nome"), record.get("sobrenome"),
						record.get("celular"), record.get("data_nascimento"));
				
				for (Endereco endereco : listaEnderecos) {
					if (contato.getEmail().equals(endereco.getEmail())) {
						contato.setEndereco(endereco);
					}
				}
				
				listaContatos.add(contato);
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir arquivo CSV");
		}
	}
}
