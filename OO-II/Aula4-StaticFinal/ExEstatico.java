public class ExEstatico {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("João");
        System.out.println("Quantidade de clientes = " + c1.qtdeClientes);

        Cliente c2 = new Cliente();
        c2.setNome("Maria");
        System.out.println("Quantidade de clientes = " + c2.qtdeClientes);

        System.out.println("Quantidade de clientes = " + c1.qtdeClientes);
        System.out.println("Quantidade de clientes = " + Cliente.qtdeClientes);
    }
}
