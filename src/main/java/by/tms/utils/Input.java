package by.tms.utils;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);


    public static int getInt(){
        if(SCANNER.hasNextInt()){
            int result = SCANNER.nextInt();
            SCANNER.nextLine();
            return result;
        }
        System.out.println("Это не число! Повторите ввод!");
        SCANNER.nextLine();
        return getInt();
    }


    public static double getDouble(){
        if(SCANNER.hasNextDouble()){
            double result = SCANNER.nextDouble();
            SCANNER.nextLine();
            return result;
        }
        System.out.println("Это не число! Повторите ввод!");
        SCANNER.nextLine();
        return getDouble();
    }

}
