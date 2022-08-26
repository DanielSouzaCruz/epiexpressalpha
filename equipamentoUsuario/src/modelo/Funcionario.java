//primeira version por daniel
package modelo;

public class Funcionario {
  private int codFuncionario;
    private String nome;
    private String cpf;
    private int idSetor;
    private int idFuncao;
    private Empresa empresa;

    public Funcionario() {
    }

    public Funcionario(int codFuncionario, String nome, String cpf, int idSetor,int idFuncao, Empresa empresa) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.idSetor = idSetor;
        this.idFuncao = idFuncao;
        this.empresa = empresa;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public int getCodFuncionario() {
        return this.codFuncionario;
    }

    public void setCodFuncionario(int id) {
        this.codFuncionario = id;
    }

    public int getIdSetor() {
        return this.idSetor;
    }

    public int getIdFuncao() {
        return this.idFuncao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codFuncionario=" + codFuncionario + ", nome=" + nome + ", cpf=" + cpf + ", idSetor=" + idSetor + ", idFuncao=" + idFuncao + ", empresa=" + empresa + '}';
    }

    
}
