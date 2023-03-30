public class Cliente{
    private String nome;
    private String email;
    public static int qtdeClientes;

    public Cliente() {
        qtdeClientes++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static int getQtdeClientes() {
        return qtdeClientes;
    }
    public static void setQtdeClientes(int qtdeClientes) {
        Cliente.qtdeClientes = qtdeClientes;
    }

    
}