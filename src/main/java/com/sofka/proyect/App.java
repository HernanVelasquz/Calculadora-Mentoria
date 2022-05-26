package com.sofka.proyect;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CalculatorApp.class.getName());
        Scanner inputValue = new Scanner(System.in);
        CalculatorApp operation = new CalculatorApp();

        logger.info("Bienvenid@ a la calculadora SofkaU");

        Double numberOne, numberTwo, result;

        logger.info("Ingrese el numero 1");

        numberOne = inputValue.nextDouble();

        logger.info("Ingfrese el numero 2");
        numberTwo = inputValue.nextDouble();

        logger.info("Seleccione Una Opcion correspondiente a la operación a Realizar:");

        logger.info("1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");

        int option = inputValue.nextInt();

        if(option == 1){
            logger.info("Esto es una suma");
            operation.addNumbers(numberOne,numberTwo);
        }
        if(option == 2){
            logger.info("Esto es una Resta");
            operation.substract(numberOne,numberTwo);
        }
        if (option == 3){
            logger.info("Esto es una Multiplicación");
            operation.multiplier(numberOne,numberTwo);


        }if (option == 4){
            logger.info("Esto es una División");
            operation.splint(numberOne,numberTwo);
        }

        inputValue.close();
    }
}
