package com.sofka.proyect;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CalculatorApp.class.getName());
        Scanner entrada = new Scanner(System.in);

        logger.info("Seleccione Una Opcion de la Calculadora:");
        int option = entrada.nextInt();

        if(option == 1){
            logger.info("Esto es una suma");
        }
        else if(option == 2){
            logger.info("Esto es una Resta");
        }

        entrada.close();
    }
}
