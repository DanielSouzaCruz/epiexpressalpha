package modelo;

public class Usuario {
    private int codUsuario;
        private String nome;
        private String senha;
        private boolean nivel;


        public Usuario() {
        }

        public Usuario(int codUsuario, String nome, String senha, boolean nivel) {
            this.codUsuario = codUsuario;
            this.nome = nome;
            this.senha = senha;
            this.nivel = nivel;
        }

        public int getCodUsuario() {
            return this.codUsuario;
        }

        public String getNome() {
            return this.nome;
        }

        public String getSenha() {
            return this.senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public boolean getNivel() {
            return this.nivel;
        }

        public void setNivel(boolean nivel) {
            this.nivel = nivel;
        }

        @Override
        public String toString() {
            return "usuario{" + "codUsuario= " + codUsuario + ", nome= " + nome + ", senha= " + senha + ", nivel= " + nivel + '}';
        }
}
