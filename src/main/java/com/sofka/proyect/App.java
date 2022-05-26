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

        /*
        Se declaran las variables que van a almacenar los dos números de tipo double para que permita el ingreso de números
        decimales, se especifica que el valor será asignado por el usuario a través de teclado
         */
        double numberOne;
        double numberTwo;
        double result;

        logger.info("Bienvenid@ a la calculadora SofkaU");



        logger.info("Ingrese el numero 1");
        numberOne = inputValue.nextDouble();

        logger.info("Ingfrese el numero 2");
        numberTwo = inputValue.nextDouble();

        logger.info("Seleccione Una Opcion correspondiente a la operación a Realizar:");

        logger.info("\n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");

        /*
        Esta variable va a almacenar la opción seleccionada por el usuario.
         */
        int option = inputValue.nextInt();


        /*
        Esta ciclo if dependera del valor recibido por teclado en el cual  se decide que operación se desea realizar
        Al indicar que operación se va a efectuar se usa el objeto de la clase CalculatorApp instanciado para acceder a los métodos
        para cada operación se envían los dos parametros tipo double correspondientes a ambos números.
         */
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
