package paquetePruebas;

public class Test {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Alberto", "Cabrera", 25);
        System.out.println(usuario.nombre);
        System.out.println(usuario.apellido);
        System.out.println(usuario.edad);
        System.out.println(usuario.nombre + " " + usuario.apellido + " " + usuario.edad);
        System.out.println("Hola Alberto");
        System.out.println(5 + 5);
        System.out.println(5 - 5);
        System.out.println();
        System.out.println("Hola Lalo");
        System.out.println("Idiota");
        System.out.println("Hola Lalo");
    }

}
