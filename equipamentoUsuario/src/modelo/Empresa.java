
package modelo;


public class Empresa {
    private int codEmpresa;
    private String nome;
    private String cnpj;
    private String email;
    private String telefone;

    public Empresa() {
    }

    public Empresa(int codEmpresa, String nome, String cnpj, String email, String telefone) {
        this.codEmpresa = codEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodEmpresa() {
        return this.codEmpresa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codEmpresa=" + codEmpresa + ", nome=" + nome + ", cnpj=" + cnpj + ", email=" + email + ", telefone=" + telefone + '}';
    }

    
}
