// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class OperacionesBancariasTest {
    

    private OperacionesBancarias operacionesBancarias;

    //@BeforeEach
    //public void setUp(){
        //this.operaciones = new OperacionesBancarias();
    //}
    // porq COM ES ESTATICO, NO HAY Q INSTANCIAR NINGUN OBJETO QUE CONTIENE 

    @Test
    @DisplayName("Caso de prueba 1")
    public void operacion1(){
        //arrange
        String cBanco = "";
        int cSucursal  = 1000;
        String nCuenta = "00000";
        String clave = "00000";
        String orden = "";
        String resultadoEsperado = "Talonario y movimientos enviados";

        //act
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //assert
        assertEquals(resultadoEsperado, resultado);
    }


    @Test
    @DisplayName("Caso de prueba 2")
    public void operacion2(){
        //arrange
        String cBanco = "100";
        int cSucursal  = 9999;
        String nCuenta = "99999";
        String clave = "zzzzz";
        String orden = "Talonario";
        String resultadoEsperado = "Talonario enviado";

        //act
        String resultado = OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden);

        //assert
        assertEquals(resultadoEsperado, resultado);
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
        assertEquals(resultadoEsperado, resultado);   
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
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );
        
        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 5")
    public void operacion5(){
        //ARRANGE
        String cBanco = "99";
        int cSucursal  = 1989;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "";
        String resultadoEsperado = "Código de Banco incorrecto";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );
        
        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 6")
    public void operacion6(){
        //ARRANGE
        String cBanco = "1000";
        int cSucursal  = 1989;
        String nCuenta = "12347";
        String clave = "Kuh98";
        String orden = "";
        String resultadoEsperado = "Código de Banco incorrecto";

         //ACT
         IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
         OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
         );
         
         //ASSERT
         assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 7")
    public void operacion7() {
        //ARRANGE
         String cBanco = "" ;
         int cSucursal = 999;
         String nCuenta = "12345";
         String clave = "Kuh98";
         String orden = "";
         String resultadoEsperado = ("Código de Sucursal incorrecto");
    
        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );
        
        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage()); 
    }

    @Test
    @DisplayName("Caso de prueba 8")
    public void operacion8(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 10000;
        String nCuenta = "12345";
        String clave = "Hyu56";
        String orden = "Talonario";
        String resultadoEsperado = "Código de Sucursal incorrecto";

       //ACT
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
       OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
       );
       
       //ASSERT
       assertEquals(resultadoEsperado, exception.getMessage()); 
   }

    @Test
    @DisplayName("Caso de prueba 9")
    public void operacion9(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 2345;
        String nCuenta = "9999";
        String clave = "Jkgy5";
        String orden = "Talonario";
        String resultadoEsperado = "Número de cuenta incorrecto";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );

        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage()); 
    }

    @Test
    @DisplayName("Caso de prueba 10")
    public void operacion10(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 7863;
        String nCuenta = "100000";
        String clave = "Jkgy5";
        String orden = "Talonario";
        String resultadoEsperado = "Número de cuenta incorrecto";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );

        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 11")
    public void operacion11(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 6754;
        String nCuenta = "89765";
        String clave = "Jut8";
        String orden = "Talonario";
        String resultadoEsperado = "Clave personal de longitud incorrecta";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );

        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 12")
    public void operacion12(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 9998;
        String nCuenta = "89765";
        String clave = "Jut890";
        String orden = "Talonario";
        String resultadoEsperado = "Clave personal de longitud incorrecta";

       //ACT
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
       OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
       );

       //ASSERT
       assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 13")
    public void operacion13(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 8765;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "988";
        String resultadoEsperado = "Orden incorrecta";

       //ACT
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
       OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
       );

       //ASSERT
       assertEquals(resultadoEsperado, exception.getMessage());
    }

    @Test
    @DisplayName("Caso de prueba 14")
    public void operacion14(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 7654;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "Talonarios";
        String resultadoEsperado = "Orden incorrecta";

       //ACT
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
       OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
       );

       //ASSERT
       assertEquals(resultadoEsperado, exception.getMessage());
    }

        @Test
    @DisplayName("Caso de prueba 15")
    public void operacion15(){
        //ARRANGE
        String cBanco = "";
        int cSucursal  = 8769;
        String nCuenta = "89765";
        String clave = "Ghy78";
        String orden = "Movimiento";
        String resultadoEsperado = "Orden incorrecta";

        //ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        OperacionesBancarias.operacion(cBanco, cSucursal, nCuenta, clave, orden)
        );

        //ASSERT
        assertEquals(resultadoEsperado, exception.getMessage());
    }
}

