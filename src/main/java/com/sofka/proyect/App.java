package com.sofka.proyect;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
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
            logger.log(Level.INFO,"El resultado es: {0}", result);
        }
        else if (option == 2) {
            logger.info("Esto es una Resta");
            operation.substract(numberOne,numberTwo);
        }
        else if (option == 3){
            logger.info("Esto es una Multiplicación");
            operation.multiplier(numberOne,numberTwo);


        }else if (option == 4){
            logger.info("Esto es una División");
            operation.split(numberOne,numberTwo);
        }

        inputValue.close();
    }
}
