/**
 * André Lebrão - 18.00356-7
 * 06/04/2020
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    
    

    public boolean validarEmail(String tryEmail){
        return (this.email.equals(tryEmail));
    }
    public boolean validarSenha(String trySenha){
        return (this.senha.equals(trySenha));
    }

    public String getNome() {
        return nome;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

}