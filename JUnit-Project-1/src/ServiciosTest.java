import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ServiciosTest {
    
    private Servicios servicios;

    @BeforeEach
    void setUp() {
        servicios = new Servicios();
    }

    @Test
    @DisplayName("Prueba metodo says")
    public void prueba_says(){
        Assert.assertEquals("Hello",servicios.says("Hello"));
    }

    
    @Test
    @DisplayName("Prueba metodo sonIguales para n1=3 y n2=7")
    public void prueba_sonIguales_3_2(){
        //arrange
        int numero1 = 7;
        int numero2 = 7;
        boolean ResultadoEsperado = false;
        
        //act
        boolean ResultadoObtenido = servicios.sonIguales(numero1, numero2);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }
    
    @Test
    @DisplayName("Prueba lanzar excepción")
    public void prueba_says_con_excepcion() {
        String msg = null;
        assertThrows(NullPointerException.class, () -> {
        servicios.says(msg);
        });
    }
    
    @Test
    @DisplayName("Prueba metodo esPositivo  numero1=4 ")
    public void esPositivo(){
        //arrange
        int numero1 = 4;
     
        boolean ResultadoEsperado = true;
        
        //act
        boolean ResultadoObtenido = servicios.esPositivo(numero1);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }
    @Test
    @DisplayName("Prueba metodo esNegativo  numero1= -4 ")
    public void esNegativo(){
        //arrange
        int numero1 = -4;
     
        boolean ResultadoEsperado = true;
        
        //act
        boolean ResultadoObtenido = servicios.esNegativo(numero1);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }

    @Test
    @DisplayName("Prueba metodo esPar  numero1= 30 ")
    public void esPar(){
        //arrange
        int numero1 = 30;
     
        boolean ResultadoEsperado = true;
        
        //act
        boolean ResultadoObtenido = servicios.esPar(numero1);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }


    @Test
    @DisplayName("Prueba metodo esImpar  numero1= 13 ")
    public void esImp(){
        //arrange
        int numero1 = 13;
     
        boolean ResultadoEsperado = true;
        
        //act
        boolean ResultadoObtenido = servicios.esImp(numero1);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }


    @Test
    @DisplayName("Prueba metodo contarCaracter texto = arroz  caracter  'o'")
    public void contarCaracter_1(){
        //arrange
        String texto = "arroz";
        char c = 'o';
       int ResultadoEsperado = 4;
        
        //act
       int ResultadoObtenido = servicios.contarCaracteres(texto,c);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }

    

    @Test
    @DisplayName("Prueba metodo contar caracter")
    public void contarCaracteres_2(){
        //arrange
        String texto = "tttttttt";
        char c = 't';
       int ResultadoEsperado = 8;
        
        //act
       int ResultadoObtenido = servicios.contarCaracteres(texto,c);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }

    @Test
    @DisplayName("Prueba metodo contar aracter")
    public void contarCaracteres_3(){
        //arrange
        String texto = "Estamos en China";
        char c = 'u';
       int ResultadoEsperado = 0;
        
        //act
       int ResultadoObtenido = servicios.contarCaracteres(texto,c);

        //assert
        Assert.assertEquals(ResultadoEsperado, ResultadoObtenido);
    }


    





}




