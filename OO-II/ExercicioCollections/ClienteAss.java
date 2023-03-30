import java.util.ArrayList;

public class ClienteAss {
    
    public String nome;
    public String cpf;
    public String telefone;
    public ArrayList<Orcamento> orcamentos;

    public ClienteAss(){
        this.orcamentos = new ArrayList<Orcamento>();
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }
 
    public void setOrcamentos(Orcamento novo) {
        this.orcamentos.add(novo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
