/**
 * @author Doblas Mejías José Carlos
 */

package examen;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

//import org.junit.jupiter.api.BeforeEach;

public class CalculadoraAvanzadaTest {

    private CalculadoraAvanzada calculadoraAvanzada;


    //@BeforeEach
    //public void setUp(){
        //this.calculo = new CalculadoraAvanzada();
    //}
    //NO HAY QUE INSTANCIAR NINGUN OBJETO QUE CONTIENE 


    //Test de potencias
    @Test
    @DisplayName("Test potencia 1") // Calculo potencia normal
    public void calculo1(){
        //ARRANGE
        double base = 3;
        int exponente = 2; 
        double resultadoEsperado = 9;

        //ACT
        double resultado = CalculadoraAvanzada.potencia(base, exponente);

        //ASSERT
        assertEquals(resultadoEsperado, resultado,0.001);
    }

    @Test
    @DisplayName("Test potencia 2") // Calculo base 1
    public void calculo2(){
        //ARRANGE
        double base = 1;
        int exponente = 3; 
        double resultadoEsperado = 1;

        //ACT
        double resultado = CalculadoraAvanzada.potencia(base, exponente);

        //ASSERT
        assertEquals(resultadoEsperado, resultado,0.001);
    }

    @Test
    @DisplayName("Test potencia 3") // Calculo base 0
    public void calculo3(){
        //ARRANGE
        double base = 0;
        int exponente = 3; 
        double resultadoEsperado = 0;

        //ACT
        double resultado = CalculadoraAvanzada.potencia(base, exponente);

        //ASSERT
        assertEquals(resultadoEsperado, resultado,0.001);
    }

    //Test raiz
    @Test
    @DisplayName("Test raiz 1") // Calculo raiz exacta
    public void calculo4(){
        //ARRANGE
        double radicando = 25;
        double resultadoEsperado = 5;

        //ACT
        double resultado = CalculadoraAvanzada.raizCuadrada(radicando);

        //ASSERT
        assertEquals(resultadoEsperado, resultado,0.001);
    }

    @Test
    @DisplayName("Test raiz 2") // Calculo de raiz con radicando igual a 0
    public void calculo5(){
        //ARRANGE
        double radicando = 0;
        double resultadoEsperado = 0;

        //ACT
        double resultado = CalculadoraAvanzada.raizCuadrada(radicando);

        //ASSERT
        assertEquals(resultadoEsperado, resultado,0.001);
    }

    @Test
    @DisplayName("Test raiz 3") //Calculo de raiz con radicando negativo
    public void calculo6(){
        //ARRANGE
        double radicando = -4;
        String resultadoEsperado = "No puede ser menor que 0";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        CalculadoraAvanzada.raizCuadrada(radicando)
        );
        
        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }
}
