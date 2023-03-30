import java.util.ArrayList;
import java.util.Iterator;


public class CadCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente();
        c1.setNome("Humberto");
        c1.setEmail("humberto@ifpr.com");
        c1.setCpf("12312312356");
        lista.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Nicole");
        c2.setEmail("nicole@ifpr.com");
        c2.setCpf("56756756789");
        lista.add(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Allan");
        c3.setEmail("allan@ifpr.com");
        c3.setCpf("45612378985");
        lista.add(c3);

        System.out.println("Lista de clientes:");
        Iterator<Cliente> it = lista.iterator();

        while(it.hasNext()){
            Cliente cli = it.next();
            System.out.println("\nCliente: " + cli.getNome() + "\nCPF: " + cli.getCpf());
        }

        //Remover um item da lista - percorrendo com iterator
        Cliente cliRemover = new Cliente();
        cliRemover.setCpf("45612378985");
        Iterator<Cliente> itRemover = lista.iterator();
        while(itRemover.hasNext()){
            if(itRemover.next().getCpf().equals(cliRemover.getCpf())){
                System.out.println("\nRemovendo cliente...");
                itRemover.remove();
            }
        }

        //percorrendo com foreach
        for (Cliente cli : lista){
            if(cli.getCpf().equals("12312312356")){
                System.out.println("Cliente removido: " + cli.getNome());
                lista.remove(cli);
            }

        }

        for (Cliente cli : lista){
            System.out.println("\nLista de clientes restantes:");
            System.out.println("Cliente: " + cli.getNome() + "\nCPF: " + cli.getCpf());
        }

    }
    
}
