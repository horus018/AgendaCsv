package AgendaCsv;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		boolean continuar = true;
		LeitorArquivo leitorArquivo = new LeitorArquivo();
		leitorArquivo.lerArquivo();

		while (continuar) {
			Object[] opcoes = { "Cadastrar contato", "Localizar contato", "Sair do programa" };
			int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "Agenda csv",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

			if (opcaoSelecionada == 0) {				
				String email = JOptionPane.showInputDialog(null, "Digite o e-mail do contato");
				String nome = JOptionPane.showInputDialog(null, "Digite o nome do contato");
				String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do contato");
				String celular = JOptionPane.showInputDialog(null, "Digite o celular do contato");
				String dataNascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento do contato");			
				String logradouro = JOptionPane.showInputDialog(null, "Digite o logradouro do contato");
				String cep = JOptionPane.showInputDialog(null, "Digite o cep do contato");
				String cidade = JOptionPane.showInputDialog(null, "Digite a cidade do contato");
				String estado = JOptionPane.showInputDialog(null, "Digite o estado do contato");
				String complemento = JOptionPane.showInputDialog(null, "Digite o complemento do contato");
				
				Endereco endereco = new Endereco(logradouro, cep, cidade, estado, complemento);
				Contato contato = new Contato(email, nome, sobrenome, celular, dataNascimento);
				contato.setEndereco(endereco);
				leitorArquivo.getListaContatos().add(contato);
				
				JOptionPane.showMessageDialog(null, "Contato cadastrado!");

			} else if (opcaoSelecionada == 1) {
				String email = JOptionPane.showInputDialog(null, "Digite o e-mail do contato");

				if (email == null) {
					continuar = false;
				} else if (!email.isEmpty()) {
					boolean contatoEncontrado = false;
					for (Contato contato : leitorArquivo.getListaContatos()) {
						if (contato.getEmail().equalsIgnoreCase(email)) {
							JOptionPane.showMessageDialog(null, contato);
							contatoEncontrado = true;
						}
					}
					if (contatoEncontrado == false) {
						JOptionPane.showMessageDialog(null, "Contato não encontrado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha o campo de e-mail");
				}

			} else {
				continuar = false;
			}

		}

	}

}
