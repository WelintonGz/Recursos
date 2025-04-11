public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Resultado: " + resultadoFinal);
        EjerciciosRecursos e = new EjerciciosRecursos();
        int fibo = e.fibonacci(6);
        System.out.println(fibo);
        int conse = e.sumaConsecutivos(5);
        System.out.println("Suma de Consecutivos");
        System.out.println(conse);
        int getp = e.getPotencia(5, 2);
        System.out.println("Potencia");
        System.out.println(getp);
        int digitos = e.sumadeDigitos(65);
        System.out.println("Suma de Digitos");
        System.out.println(digitos);
    }

    public static int factorial (int n) {
        if(n==0) {
            System.out.println("Alcanze el caso base");
            return 1;
        }

        int resultado = n * factorial(n-1);
        System.out.println("Calculando el factorial de: "+n+"* factorial ("+(n-1)+" - 1)");
        return resultado;
    }
}