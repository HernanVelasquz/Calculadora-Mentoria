package com.sofka.proyect;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase define objeto para realizar la inicializacion del programa de Calculadora
 * @author Daniel F. Marin 
 * @author Hernan D. Velasquez
 * @version 20/05/2022/A 
 */
public class App {
    /**
     * Clase estatica encargaa de Arrancar el programa de la Calculadora 
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CalculatorApp.class.getName());
        Scanner inputValue = new Scanner(System.in);
        CalculatorApp operation = new CalculatorApp();

        logger.info("Bienvenid@ a la calculadora SofkaU");

        double numberOne;
        double numberTwo;
        double result;

        logger.info("Ingrese el numero 1");

        numberOne = inputValue.nextDouble();

        logger.info("Ingfrese el numero 2");
        numberTwo = inputValue.nextDouble();

        logger.info("Seleccione Una Opcion correspondiente a la operación a Realizar:");

        logger.info("\n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");

        int option = inputValue.nextInt();


        
        if(option == 1){
            result = operation.addNumbers(numberOne, numberTwo);
            logger.log(Level.INFO,"El resultado de la Suma es: {0}", result);
        }
        else if (option == 2) {
            result = operation.substract(numberOne, numberTwo);
            logger.log(Level.INFO,"El resultado de la Resta es: {0}", result);
        }
        else if (option == 3){
            result = operation.multiplier(numberOne, numberTwo);
            logger.log(Level.INFO,"El resultado de la Multiplicacion es: {0}", result);
        }else if (option == 4){
            result = operation.split(numberOne, numberTwo);
            logger.log(Level.INFO,"El resultado de la Divicion es: {0}", result);
        }

        inputValue.close();
    }
}
