import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assistencia {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
            new InputStreamReaderder(System.in));

        String menu;

        do{
            System.out.println("Assistência Técnica");
            System.out.println(" 1 - Cadastrar Cliente");
            System.out.println(" 2 - Listar Cliente");
            System.out.println(" 3 - Cadastrar orçamento para cliente");
            System.out.println(" 4 - Listar orçamento de um cliente");
            System.out.println(" 5 - Sair");

            menu = reader.readLine();

            switch(menu){
                case "1":
                System.out.println("opcao 1");
                break;

                case "2":
                break;

                case "3":
                break;

                case "4":
                break;

                case "5":
                break;
            }
        }while(menu!="5");

    }
    
}
