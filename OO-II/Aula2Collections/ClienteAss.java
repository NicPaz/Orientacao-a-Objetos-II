import java.util.ArrayList;

public class ClienteAss {
    
    public int id;
    public String nome;
    public String cpf;
    public long telefone;
    public ArrayList<Orcamento> orcamentos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }
    public void setOrcamentos(ArrayList<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
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
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

}
