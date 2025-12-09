import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    

private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }
   

    //prueba suma de numeros 
       @Test
    @DisplayName("Prueba metodo sumar numero1=3 numero2=2 ")
    public void sumar(){
        //arrange
        int numero1 = 3;
        int numero2 = 2;
         int ResultadoEsperado = 5;
        
        //act
        int ResultadoObtenido = calculadora.sumar(numero1,numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }
   

    //prueba suma de numero negativos 
    @Test
    @DisplayName("Prueba metodo sumar numero1=-3 numero2=-2 ")
    public void sumaNegativos(){
        //arrange
        int numero1 = -3;
        int numero2 = -2;
         int ResultadoEsperado = -5;
        
        //act
        int ResultadoObtenido = calculadora.sumaNegativos(numero1,numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }
      

    //prueba de resta 
    @Test
    @DisplayName("Prueba metodo resta numero1=3 numero2=2 ")
    public void restar(){
        //arrange
        int numero1 = 3;
        int numero2 = 2;
         int ResultadoEsperado = 1;
        
        //act
        int ResultadoObtenido = calculadora.restar(numero1,numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }


     //prueba de la multiplicacion  
    @Test
    @DisplayName("Prueba metodo multiplicar numero1=3 numero2=2 ")
    public void multiplicar(){
        //arrange
        int numero1 = 3;
        int numero2 = 2;
         int ResultadoEsperado = 6;
        
        //act
        int ResultadoObtenido = calculadora.multiplicar(numero1,numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }
     
    
    //prueba de una de division y salida de su excepción 
    @Test
    @DisplayName("Prueba metodo division numero1=6 numero2=2 ")
    public void dividir(){
        //arrange
        int numero1 = 6;
        int numero2 = 2;
         int ResultadoEsperado = 3;
        
        //act
        int ResultadoObtenido = calculadora.dividir(numero1,numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }

    @Test
    @DisplayName("Prueba lanzar excepción")
        public void divisionException() {
        int b = 0;
        assertThrows(ArithmeticException.class){
             calculadora.divisionException(b);
        };
    }
}
