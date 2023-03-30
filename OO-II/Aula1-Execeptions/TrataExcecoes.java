import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrataExcecoes {
    public static void main(String[] args) throws Exception{

        TrataExcecoes le = new TrataExcecoes();
        le.lerArquivo();
    }

    public void lerArquivo() {
        try{
            String arqEntrada = "arquivo.txt";
            BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
            String linha;
            while((linha = arq.readLine()) != null){
                System.out.println(linha + "\n");
            }
            arq.close();
        }catch(FileNotFoundException e1){//Mais Especializada
            System.out.println("Arquivo não encontrado");
        }catch(IOException e2){
            System.out.println("Erro de leitura no arquivo");
        }catch(Exception e3){
            System.out.println("Erro Inesperado!");
            System.out.println("Descrição do erro:" + e3.getMessage());
        }finally{
            System.out.println("Encerrando.");
        }
    }
}
