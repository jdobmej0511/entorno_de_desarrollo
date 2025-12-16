package examen;

/**
 * @author Doblas Mejías José Carlos
 */

public class CalculadoraAvanzada {

   
    public static double potencia(double base, int exponente){
        double resultado;

        resultado = Math.pow(base, exponente);

        return resultado;
    }

    public static double raizCuadrada(double radicando){
        double resultado;

        if(radicando<0){
            throw new IllegalArgumentException("No puede ser menor que 0");
        }

        resultado = Math.sqrt(radicando);

        return resultado;
    }
}

