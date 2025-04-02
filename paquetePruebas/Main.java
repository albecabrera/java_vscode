package paquetePruebas;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Alberto");
        System.out.println(5 + 5);
        System.out.println(5 - 5);
        System.out.println();
        System.out.println("Hola Lalo");
        System.out.println("Idiota");
        papafeo();

    }
    public static void papafeo(){
        int feo = 1;
        for (int i = 1; i < 100; i++) {
            feo = feo+1;
            System.out.println("Papa gordo "+feo+" kilogramos.");
        }
    }
}