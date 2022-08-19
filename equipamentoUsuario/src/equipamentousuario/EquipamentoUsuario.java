package equipamentousuario;

import modelo.Usuario;
import modelo.Equipamento;

public class EquipamentoUsuario {

    public static void main(String[] args) {
        
        Usuario u1 = new Usuario(1,"Eduardo", "123123", true);
        Usuario u2 = new Usuario(2, "Marcelo", "542684", true);
        Usuario u3 = new Usuario(3, "Miguel", "123123", false);
        
        Equipamento e1 = new Equipamento(1, "Luva", "245158-5156", 2, u1);
        Equipamento e2 = new Equipamento(2, "Bota", "1542-544", 2, u2);
        Equipamento e3 = new Equipamento(5, "Capacete", "58489-654", 1, u3);
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
    
}
