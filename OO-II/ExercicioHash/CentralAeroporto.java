import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class CentralAeroporto {
    
    public BufferedReader reader;
        
    HashMap<String,Aeroporto> aeroportos = new HashMap<>();

    public static void menu(){
        System.out.println("\n\t Aeroportos do  Brasil");
            System.out.println("1 - Cadastrar aeroporto");
            System.out.println("2 - Ver aeroportos cadastrados");
            System.out.println("3 - Remover um aeroporto");
            System.out.println("4 - Consultar detalhes de um aeroporto");
            System.out.println("5 - Sair");
    }

    public static void cadastro(){
        System.out.println("\n\t Cadastro de Aeroporto");
        Aeroporto a = new Aeroporto();

        System.out.println("Informe o nome do aeroporto:");
        a.setNome(reader.readLine());
                    
        System.out.println("Informe a cidade do aeroporto:");
        a.setCidade(reader.readLine());
                    
        System.out.println("Informe a altitude do aeroporto:");
        a.setAltitude(reader.readLine());

        System.out.println("Informe a sigla do aeroporto:");
        String sigla = reader.readLine();

        aeroportos.put(sigla, a);
    }

    public static void ler(){
        System.out.println("\n");
        for (Aeroporto item: aeroportos.values()){
            System.out.println(item.getNome());
        }
    }

    public static void remover(){
        System.out.println("\n\t Remover Aeroporto");
        System.out.println("Informe a SIGLA do aeroporto que deseja remover:");
        String remover = reader.readLine();
        if(aeroportos.containsKey(remover)){
            aeroportos.remove(remover);
            System.out.println("Aeroporto removido: " + remover);
        }
        else{
            System.out.println("Não foi encontrado aeroporto com a sigla informada!");
        }

    }

    public static void detalhar(){
        System.out.println("\n\t Consultar detalhes de um aeroporto");
        System.out.println("Informe a SIGLA do aeroporto:");
        String detalhes = reader.readLine();

        if(aeroportos.containsKey(detalhes)){
            Aeroporto a1 = aeroportos.get(detalhes);

            System.out.println("\nNome:" +  a1.getNome());
            System.out.println("Cidade:" +  a1.getCidade());
            System.out.println("Altitude:" +  a1.getAltitude());
                        
        }

    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        CentralAeroporto ca = new CentralAeroporto();
        
        ca.reader = new BufferedReader(
            new InputStreamReader(System.in));

        Integer opcao = 0;

        while(opcao != 5){
            CentralAeroporto.menu();
            opcao = Integer.parseInt(ca.reader.readLine());

            switch(opcao){
                case 1:
                CentralAeroporto.cadastro();
                break;

                case 2:
                CentralAeroporto.ler();
                break;

                case 3:
                CentralAeroporto.remover();
                break;

                case 4:
                CentralAeroporto.detalhar();
                break;
            }

        }



    }
}
