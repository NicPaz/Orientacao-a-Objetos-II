import java.util.HashMap;

public class CadEstado {
    
    public static void main(String[] args) {
        HashMap<String, Estado> estados = new HashMap<String,Estado>();

        Estado e1 = new Estado();
        e1.setNome("Paraná");
        e1.setRegiao("Sul");
        estados.put("PR", e1);
        
        Estado e2 = new Estado();
        e1.setNome("São Paulo");
        e1.setRegiao("Sul");
        estados.put("PR", e1);
        
        Estado e3 = new Estado();
        e1.setNome("Paraná");
        e1.setRegiao("Sul");
        estados.put("PR", e1);

        System.out.println("Estados Armazenados:" + estados);
        String pesquisado = "SP";

        if(estados.containsKey(pesquisado)){
            System.out.println(pesquisado + "Existe no Hashmap");
            System.out.println("Buscando a região do estado de " + pesquisado);
            System.out.println(estados.get(pesquisado).getRegiao());
        }

        //PERCORRENDO OS VALORES
        for (Estado item: estados.values()){
            System.out.println(item.getNome());
        }
        
    }
}
