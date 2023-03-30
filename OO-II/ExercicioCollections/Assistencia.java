import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assistencia {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        ArrayList<ClienteAss> lista = new ArrayList<ClienteAss>();
        ClienteAss c = new ClienteAss();


        String menu="";

        while(menu!="5"){
            System.out.println("\nAssistência Técnica");
            System.out.println(" 1 - Cadastrar Cliente");
            System.out.println(" 2 - Listar Clientes");
            System.out.println(" 3 - Cadastrar orçamento para cliente");
            System.out.println(" 4 - Listar orçamento de um cliente");
            System.out.println(" 5 - Sair");

            menu = reader.readLine();

            switch(menu){
                case "1":
                System.out.println("\n Cadastro de cliente");
                System.out.println("Digite o nome do cliente:");
                //Criado o objeto p/ receber os dados do novo cliente
                //Salvo engano, a LISTA não aceita repetições. Logo, usando o C que foi criado acima, so os dados eram atualizados sem criar um novo cliente na lista.
                ClienteAss novoCliente = new ClienteAss();
                novoCliente.setNome(reader.readLine());
                System.out.println("Digite o cpf do cliente:");
                novoCliente.setCpf(reader.readLine());
                System.out.println("Digite o telefone do cliente:");
                novoCliente.setTelefone(reader.readLine());
                lista.add(novoCliente);
                break;

                case "2":
                for (ClienteAss d : lista) {
                    System.out.println("\nNome: " + d.nome + "\nCpf:" + d.cpf + "\nTelefone:" + d.telefone);
                }
                break;

                case "3":
                System.out.println("\n Cadastro do Orçamento");
                System.out.println("Digite o cpf do cliente:");
                String cpfCliente = reader.readLine();
                int i = 0;
                for (ClienteAss d : lista) {
                    if (d.getCpf().equals(cpfCliente)){
                        System.out.println("Digite o valor do orçamento:");
                        Double preco = Double.parseDouble(reader.readLine());
                        Orcamento orc = new Orcamento();
                        orc.setValor(preco);
                        System.out.println("Digite a descrição do serviço:");
                        orc.setDescricao(reader.readLine());
                        d.setOrcamentos(orc);
                        i++;
                    }
                }
                if (i==0){
                    System.out.println("Cliente não encontrado!");
                }
                
                break;

                case "4":
                System.out.println("Digite o CPF do cliente:");
                cpfCliente = reader.readLine();
                i=0;
                for (ClienteAss d : lista) {
                    if (d.getCpf().equals(cpfCliente)){
                        System.out.println("\nOrçamentos do cliente: " + d.getNome());
                        i++;
                        for (Orcamento orcamento : d.orcamentos) {
                            System.out.println("\nValor:" + orcamento.getValor());   
                            System.out.println("Descrição:" + orcamento.getDescricao());
                        }
                        
                    }
                }
                if (i==0){
                    System.out.println("Cliente não encontrado!");
                }
                break;

            }
        };

    }
    
}
