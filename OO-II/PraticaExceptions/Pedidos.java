package PraticaExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import javax.xml.crypto.Data;


public class Pedidos {
        public static void main(String[] args){
        Pedidos pe = new Pedidos();
        pe.lerArquivos();
    
    }

    public void lerArquivos(){
        try {
                BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                
                System.out.println("Escreva o nome do arquivo que deseja importar:");
                String arquivo = reader.readLine();

                BufferedReader arq = new BufferedReader(new FileReader(arquivo));
                String linha;
                while((linha = arq.readLine()) != null){
                    String[] vetLinha = linha.split(";");
                    String cliente = vetLinha[0];
                    String data = vetLinha[1];
                    Date a = new Date();


                    System.out.println(cliente + entrada + saida);
                }
                arq.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e2){
            System.out.println("Erro de leitura de arquivos.");
        }
    }
}
