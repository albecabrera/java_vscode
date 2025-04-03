package paquetePruebas;

public class SumaNumeros {

        // Método de suma con dos valores
        public int suma(int a, int b) {
            int resultado = a + b; // Se realiza el cálculo
            return resultado; // Se devuelve el resultado
        }
    
    class Main {
        public static void main(String[] args) {
            // Objeto de tipo suma
            SumaNumeros suma1 = new SumaNumeros();
            // Llamada al método suma con dos números
            int resultado = suma1.suma(10, 7);
            // Imprimimos el resultado
            System.out.println(resultado);
            // Hacemos una nueva suma con el valor obtenido de la anterior
            resultado = suma1.suma(resultado, 10);
            // Imprimimos el nuevo resultado
            System.out.println(resultado);
        }
    }

}
