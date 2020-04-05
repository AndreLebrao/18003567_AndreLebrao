/**
 * Usuario
 */
public class Usuario {
    private String nickname, password, email;

    public Usuario(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public boolean validarSenha(String senha){
        return senha.equals(password);
    }

    public boolean validarEmail(String email){
        return email.equals(email);
    }

    public String getNickname(){
        return nickname;
    }
}