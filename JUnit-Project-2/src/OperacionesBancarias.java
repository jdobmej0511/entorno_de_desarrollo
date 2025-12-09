/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author profesora
 */
public class OperacionesBancarias {

    /**
     *
     * @param cBanco Código del banco. Debe o bien estar en blanco o tener tres dígitos, en cuyo caso el primero debe ser mayor que 1
     * @param cSucursal Código de la sucursal. Debe ser un número de 4 dígitos, el primero distinto de 0
     * @param nCuenta Número de cuenta. Debe ser un número de 5 dígitos.
     * @param clave Clave personal. Debe ser una cadena de 5 caracteres.
     * @param orden Operación a realizar. Puede estar en blanco o tomar los valores "Talonario" o "Movimientos".
     * @return Si los parámetros son correctos enviará un talonario de cheques si la orden era "Talonario" 
     *         o los movimientos de la cuenta durante el mes en curso si la orden era "Movimientos". Si orden 
     *         está en blanco se enviarán ambos documentos.
     * @throws IllegalArgumentException Si alguno de los parámetros es incorrecto
     */
    public static String operacion(String cBanco,
                                   int cSucursal,
                                   String nCuenta,
                                   String clave,
                                   String orden) throws IllegalArgumentException {
        String resultado="";
        int cB;
        if (!cBanco.equals("")){
            try {
                cB=Integer.parseInt(cBanco);
            } catch (Exception e){
                throw new IllegalArgumentException("Código de Banco incorrecto");
            }
            if (cB < 100 || cB >999){
                throw new IllegalArgumentException("Código de Banco incorrecto");
            }
        }
        if (cSucursal < 1000 || cSucursal >9999){
            throw new IllegalArgumentException("Código de Sucursal incorrecto");
        }
        if (nCuenta.length()!= 5){
            throw new IllegalArgumentException("Número de cuenta incorrecto");
        } else {
            try {
                Integer.parseInt(nCuenta);
            } catch (Exception e){
                throw new IllegalArgumentException("Número de cuenta incorrecto");
            }            
        }
        if (clave.length()!=5){
            throw new IllegalArgumentException("Clave personal de longitud incorrecta");
        }
        
        
        if (orden.equals("Talonario")){
            resultado = "Talonario enviado";
        } else if (orden.equals("Movimientos")){
            resultado = "Movimientos enviados";
        } else {
            resultado = "Talonario y movimientos enviados";
        }
        return resultado;
    }
    
}
