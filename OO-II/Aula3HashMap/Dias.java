import java.util.HashMap;

public class Dias {
    public static void main(String[] args) {
      HashMap<String, String> diasSemana = new HashMap<String, String>();

        diasSemana.put("SEG", "Segunda-feira");
        diasSemana.put("TER", "Terça-feira");
        diasSemana.put("QUA", "Quarta-feira");
        diasSemana.put("QUI", "Quinta-feira");
        diasSemana.put("SEX", "Sexta-feira");
        diasSemana.put("SAB", "Sábado");
        diasSemana.put("DOM", "Domingo");

        System.out.println("Mostrando os pares amazenados");
        System.out.println(diasSemana);

        //VERFICANDO SE UM DIA EXISTE
        System.out.println("\nQUA existe?" + diasSemana.containsKey("QUA"));
        System.out.println("ABC existe?" + diasSemana.containsKey("ABC"));

        //PEGANDO UM ITEM APARTIR DA CHAVE
        System.out.println(diasSemana.get("TER"));

        //MOSTRANDO A QUANTIDADE DE PARES
        System.out.println("\nQuantidade de pares:" + diasSemana.size());

        //REMOVENDO UM ITEM 
        String remover = diasSemana.remove("TER");
        System.out.println("\nO removido foi: " + remover);
        System.out.println("Quantidade de pares: " + diasSemana.size());


        //PERCORRER CHAVE
        for(String chave : diasSemana.keySet()) {
            System.out.println(chave);
        }
        
        //PERCORRER VALORES
        for(String item : diasSemana.values()){
            System.out.println(item);
        }
        
    }
}