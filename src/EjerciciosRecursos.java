public class EjerciciosRecursos {

    public int fibonacci(int n) {
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

    public int sumaConsecutivos(int n) {
        if(n==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultadoC = n + resultadoParcial;
        return resultadoC;
        
    }
    /*
     * Escribe una funcion recursiva que calcule la potencia
     * de un númro base elevado a un exponente entero exponente
     * Por ejemplo, si base 2 y exponente es 3,
     * lafuncion debe devolver 2^3=8
     */
    public int getPotencia (int base, int exponente){
        if(exponente==0) {
            return 1;
        }else{
            return  base * getPotencia(base, exponente -1);
        }

    }

    public int sumadeDigitos(int numero){
        if (numero<10){
            return numero;
        }else{
            int ultdigito = numero %10;
            int unumero = numero/10;
            return ultdigito + sumadeDigitos(unumero);
        }

    }

    public int denauno(int num) {
        if (num == 1) {
            System.out.print(num);
            return num;
        }
    
        System.out.print(num + ", ");
        return denauno(num - 1);
    }
    
    public int reverso(int nume) {
        return reversoHelper(nume, 0);
    }

    private int reversoHelper(int nume, int invertido) {
        if (nume == 0) {
            return invertido;
        }
        int ultimoDigito = nume % 10;
        return reversoHelper(nume / 10, invertido * 10 + ultimoDigito);
    }

    
}