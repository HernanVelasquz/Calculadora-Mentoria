package com.sofka.proyect;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CalculatorApp.class.getName());
        Scanner inputValue = new Scanner(System.in);

        Double numberOne, numberTwo, result;

        logger.info("Ingfrese el numero 1");

        numberOne = inputValue.nextDouble();

        logger.info("Ingfrese el numero 2");
        numberTwo = inputValue.nextDouble();

        logger.info("Seleccione Una Opcion correspondiente a la operación a Realizar:");

        logger.info("1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");

        int option = inputValue.nextInt();

        if(option == 1){
            logger.info("Esto es una suma");
        }
        else if (option == 2) {
            logger.info("Esto es una Resta");
        }
        else if (option == 3){
            logger.info("Esto es una Multiplicación");


        }else if (option == 4){
            logger.info("Esto es una División");
        }

        inputValue.close();
    }
}
