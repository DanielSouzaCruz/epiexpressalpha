
package modelo;


public class Equipamento {
    private int codEquipamento;
    private String nome;
    private String ca;
    private int quantidade;
    private Usuario usuario;

    public Equipamento() {
    }

    public Equipamento(int codEquipamento, String nome, String ca, int quantidade, Usuario usuario) {
        this.codEquipamento = codEquipamento;
        this.nome = nome;
        this.ca = ca;
        this.quantidade = quantidade;
        this.usuario = usuario;
    }

    public int getCodEquipamento() {
        return this.codEquipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCa() {
        return this.ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }  

    @Override
    public String toString() {
        return "Equipamento{" + "codEquipamento=" + codEquipamento + ", nome=" + nome + ", ca=" + ca + ", quantidade=" + quantidade + ", usuario=" + usuario.getNome() + '}';
    }
    
    
    
}
