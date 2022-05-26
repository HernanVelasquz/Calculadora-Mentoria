package com.sofka.proyect;

/**
 * Esta clase define objeto para realizar las cuatro operaciones Basicas de la calculadora 
 *  Suma
 *  Resta
 *  Divicion
 *  Multiplicacion 
 * @author Daniel F. Marin 
 * @author Hernan D. Velasquez
 * @version 20/05/2022/A 
 * */


public class CalculatorApp {
    
    /**
     * Método que recibe dos números tipo double para realizar la suma entre ellos y
     * 
     * @return El resultado de dicha operación
     */
    public double addNumbers(double numberOne,double numberTwo){
        return numberOne + numberTwo;
    }

    /**
     Método que recibe dos números tipo double para realizar la resta entre ellos y
     @return El resultado de dicha operación
     */
    public double substract(double numberOne,double numberTwo){
        return numberOne - numberTwo;
    }
    
    /**
     * Metodo que devuelve el resultado de la multipliclar
     * @return el resultado multiplicar los numeros.
     */
    public double multiplier(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    /**
     * Metodo encargado de realizar la operación de la división
     * @return el resutado de dividir dos numeros.
     */
    public double split(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }

}
