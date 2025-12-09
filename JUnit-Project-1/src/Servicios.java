/**
 * La Clase Servicios incluye métodos sencillos para validar números
 * y trabajar con cadenas de texto.
 * @author Nombre Apellido1 Apellido2
 */
public class Servicios {

    public boolean esPositivo(int numero) {
        return numero > 0;
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public int contarCaracteres(String texto, char caracter) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public boolean sonIguales(int numero1, int numero2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sonIguales'");
    }

    public boolean esNegativo(int numero1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esNegativo'");
    }

    public boolean esImp(int numero1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esImp'");
    }
}
