/**
 * La Clase Calculadora incluye operaciones aritméticas básicas:
 * suma, resta, multiplicación y división.
 * @author Nombre Apellido1 Apellido2
 */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public void divisionException(int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divisionException'");
    }

    public int sumaNegativos(int numero1, int numero2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumaNegativos'");
    }
}
