import br.maua.models.GUI;
import br.maua.models.Usuario;
//TODO: javadocs de tudo
public class App {
    
    public static void main(String[] args) throws Exception {
        Usuario testeUsuario = new Usuario("teste", "123456", "teste@email.com");
        GUI.run(testeUsuario);
    }
}
