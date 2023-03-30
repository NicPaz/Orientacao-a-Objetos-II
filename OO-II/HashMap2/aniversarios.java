import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class aniversarios {
    
    public BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        HashMap<String,ArrayList<String>> aniversarios = new HashMap<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        aniversarios a = new aniversarios();
        a.menu();
        
    }

    public void menu() throws NumberFormatException, IOException{
        Integer opcao = 0;
        aniversarios a = new aniversarios();

        while(opcao != 4){

            System.out.println("\n\t Aniversarios!");
            System.out.println("1 - Adicionar Aniversariante");
            System.out.println("2 - Listar datas de aniversário");
            System.out.println("3 - Consultar os aniversariantes de uma data");
            System.out.println("4 - Sair");
            System.out.println("\nEscolha uma opção:");

            opcao = Integer.parseInt(reader.readLine());

            switch(opcao){
                case 1:
                a.adicionar();
                break;

                case 2:
                a.listardata();
                break;

                case 3:
                a.consultaraniversariantes();
                break;
            }

        }
        
    }

    private void adicionar() throws IOException {
        System.out.println("Digite o nome do aniversariante:");
        String nome = reader.readLine();
        System.out.println("Digite a data de nascimento do aniversariante:");
        String data = reader.readLine();
        if(!aniversarios.containsKey(data)){
            ArrayList<String> aniversariantes = new ArrayList<>();
            aniversariantes.add(nome);
            aniversarios.put(data,aniversariantes);
        }else{
            aniversarios.get(data).add(nome);
        }
    }

    private void listardata() {
        for (String data : aniversarios.keySet()) {
            System.out.println(data);
        }

    }

    private void consultaraniversariantes() throws IOException {
        System.out.println("Digite a data de aniversário que deseja consultar:");
        String data = reader.readLine();
        if (aniversarios.containsKey(data)) {
            ArrayList<String> arrayNomes = this.aniversarios.get(data);
            System.out.println("\nAniversariantes do dia " + data + ":");
            for(String nome : arrayNomes){
                System.out.println(nome);
            }
        } else {
            System.out.println("Não há aniversariantes cadastrados para esta data.");
        }
    }
    


}
