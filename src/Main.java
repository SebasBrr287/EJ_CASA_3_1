//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        u1.setUsername("gabriel_dev");
        u1.setCorreo("gabriel@udla.edu.ec");
        u1.setNivel(3);
        u1.activar();

        System.out.println(u1.getUsername());
        System.out.println(u1.getCorreo());
        System.out.println(u1.getNivel());
        System.out.println(u1.isActivo());
    }
}
