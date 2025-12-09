/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profesora
 */
public class PruebasUnitariasNoJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String resultado;
        
        //Movimientos y talonario
        System.out.print("Caso de prueba 1: ");
        try {
            resultado=OperacionesBancarias.operacion("",1000,"00000","00000","");
            if (resultado.equals("Talonario y movimientos enviados")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            } 
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
        //Talonario
        System.out.print("Caso de prueba 2: ");
        try {
            resultado=OperacionesBancarias.operacion("100",9999,"99999","zzzzz","Talonario");
            if (resultado.equals("Talonario enviado")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            } 
        } catch (Exception e){
            System.out.println("Fallo");
        }
        

        //Movimientos
        System.out.print("Caso de prueba 3: ");
        try {
            resultado=OperacionesBancarias.operacion("999",1001,"12345","Hyu56","Movimientos");
            if (resultado.equals("Movimientos enviados")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            } 
        } catch (Exception e){
            System.out.println("Fallo");
        }
         
        //Código de banco incorrecto
        System.out.print("Caso de prueba 4: ");
        try {
            resultado=OperacionesBancarias.operacion("30A",1989,"12347","Kuh98","");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Código de Banco incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
        //Código de banco incorrecto
        System.out.print("Caso de prueba 5: ");
        try {
            resultado=OperacionesBancarias.operacion("99",1989,"12347","Kuh98","");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Código de Banco incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
                         
        //Código de banco incorrecto
        System.out.print("Caso de prueba 6: ");
        try {
            resultado=OperacionesBancarias.operacion("1000",1989,"12347","Kuh98","");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Código de Banco incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
                
        //Código de sucursal incorrecto
        System.out.print("Caso de prueba 7: ");
        try {
            resultado=OperacionesBancarias.operacion("",999,"12347","Kuh98","");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Código de Sucursal incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
                
        //Código de sucursal incorrecto
        System.out.print("Caso de prueba 8: ");
        try {
            resultado=OperacionesBancarias.operacion("",10000,"12345","Hyu56","Talonario");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Código de Sucursal incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
        //Número de cuenta erróneo
        System.out.print("Caso de prueba 9: ");
        try {
            resultado=OperacionesBancarias.operacion("",2345,"9999","Jkgy5","Talonario");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Número de cuenta incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
                
        //Número de cuenta erróneo
        System.out.print("Caso de prueba 10: ");
        try {
            resultado=OperacionesBancarias.operacion("",7863,"100000","Jkgy5","Talonario");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Número de cuenta incorrecto")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
          
        //Clave errónea
        System.out.print("Caso de prueba 11: ");
        try {
            resultado=OperacionesBancarias.operacion("",6754,"89765","Jut8","Talonario");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Clave personal de longitud incorrecta")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
        //Clave errónea    
        System.out.print("Caso de prueba 12: ");
        try {
            resultado=OperacionesBancarias.operacion("",9998,"89765","Jut890","Talonario");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Clave personal de longitud incorrecta")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
        
        //Orden errónea
        System.out.print("Caso de prueba 13: ");
        try {
            resultado=OperacionesBancarias.operacion("",8765,"89765","Ghy78","988");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Orden incorrecta")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }

        //Orden errónea
        System.out.print("Caso de prueba 14: ");
        try {
            resultado=OperacionesBancarias.operacion("",7654,"89765","Ghy78","Talonarios");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Orden incorrecta")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }

        //Orden errónea
        System.out.print("Caso de prueba 15: ");
        try {
            resultado=OperacionesBancarias.operacion("",8769,"89765","Ghy78","Movimiento");
            System.out.println("Fallo");
        } catch (IllegalArgumentException ie){
            if (ie.getMessage().equals("Orden incorrecta")){
                System.out.println("OK");
            } else {
                System.out.println("Fallo");
            }
        } catch (Exception e){
            System.out.println("Fallo");
        }
    }
}
