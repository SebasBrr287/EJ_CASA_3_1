void main() {
    Usuario u1 = new Usuario();

    u1.setUsername("gabriel_dev");
    u1.setCorreo("gabriel@udla.edu.ec");
    u1.setNivel(3);
    u1.activar();

    System.out.println("Nombre de usuario: " + u1.getUsername());
    System.out.println("Correo electrónico: " + u1.getCorreo());
    System.out.println("Nivel actual: " + u1.getNivel());
    System.out.println("¿Cuenta activa?: " + u1.isActivo());
}

