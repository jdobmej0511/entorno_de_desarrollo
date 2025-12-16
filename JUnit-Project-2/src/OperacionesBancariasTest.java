import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class OperacionesBancariasTest {
    

    private OperacionesBancarias operaciones;

    @BeforeEach
    public void setUp(){
        operaciones = new OperacionesBancarias();
    }

    @Test
    @DisplayName("Caso de prueba 1")
    public void operacion1(){
        String cBanco = "";
        int cSucursal  = 1000;
        String nCuenta = "00000";
        String clave = "00000";
        String orden = "";
        String resultadoEsperado = "Talonario y movimientos enviados";

        //act
        String resultado= OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //assert
        Assert.assertEquals(resultadoEsperado, resultado);
    }


    @Test
    @DisplayName("Caso de prueba 2")
    public void operacion2(){
        String cBanco = "100";
        int cSucursal  = 9999;
        String nCuenta = "99999";
        String clave = "zzzzz";
        String orden = "Talonario";
        String resultadoEsperado = "Talonario enviado";

        //act
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //assert
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 3")
    public void operacion3(){
        String cBanco = "999";
        int cSucursal  = 1001;
        String nCuenta = "12345";
        String clave = "Hyu56";
        String orden = "Movimientos";
        String resultadoEsperado = "Movimientos enviados";

        //ACT       
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);
        
        //ASSERT 
        Assert.assertEquals(resultadoEsperado, resultado);   
    }

    @Test
    @DisplayName("Caso de prueba 4")
    public void operacion4(){
        String cBanco = "30A";
        int cSucursal  = 1989;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);
        
        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 5")
    public void operacion5(){
        String cBanco = "99";
        int cSucursal  = 1989;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);
    
        
        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 6")
    public void operacion6(){
        String cBanco = "1000";
        int cSucursal  = 1989;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);
        
        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 7 ")
    public void operacion7(){
        String cBanco = "";
        int cSucursal  = 999;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "Código de Sucursal incorrecto";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 8")
    public void operacion8(){
        String cBanco = "";
        int cSucursal  = 10000;
        String nCuenta = "12345";
        String clave = "Hyu56";
        String orden = "Talonario";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 9")
    public void operacion9(){
        String cBanco = "";
        int cSucursal  = 2345;
        String nCuenta = "9999";
        String clave = "Jkgy5";
        String orden = "Talonario";
        String resultadoEsperado = "Número de cuenta incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 10")
    public void operacion10(){
        String cBanco = "";
        int cSucursal  = 7863;
        String nCuenta = "100000";
        String clave = "Jkgy5";
        String orden = "Talonario";
        String resultadoEsperado = "Número de cuenta incorrecto";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 11")
    public void operacion11(){
        String cBanco = "";
        int cSucursal  = 6754;
        String nCuenta = "89765";
        String clave = "Jut8";
        String orden = "Talonario";
        String resultadoEsperado = "Clave personal de longitud incorrecta";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 12")
    public void operacion12(){
        String cBanco = "";
        int cSucursal  = 9998;
        String nCuenta = "89765";
        String clave = "Jut890";
        String orden = "Talonario";
        String resultadoEsperado = "Clave personal de longitud incorrecta";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 13")
    public void operacion13(){
        String cBanco = "";
        int cSucursal  = 8765;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "988";
        String resultadoEsperado = "Orden incorrecta";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Caso de prueba 14")
    public void operacion14(){
        String cBanco = "";
        int cSucursal  = 7654;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "Talonario";
        String resultadoEsperado = "Orden incorrecta";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }

        @Test
    @DisplayName("Caso de prueba 15")
    public void operacion15(){
        String cBanco = "";
        int cSucursal  = 8769;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "Movimiento";
        String resultadoEsperado = "Orden incorrecta";

        //ACT
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //ASSERT
        Assert.assertEquals(resultadoEsperado, resultado);
    }
}

