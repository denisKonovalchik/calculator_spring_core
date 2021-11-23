package by.tms;

import by.tms.operations.MathOperation;
import by.tms.utils.Input;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class Calculator {
    private final List<MathOperation> mathOperationList;


    void run(){
        while(true) {
           MathOperation mathOperation = selectOperation();    //ConsoleWriter
            if(mathOperation == null) break;
                Writer.getPrint().println("Введите число: ");
                double num1 = Input.getDouble();
                Writer.getPrint().println("Введите число: ");
                double num2 = Input.getDouble();
                double result = mathOperation.getCalculate(num1, num2);
                Writer.getPrint().println("Результат операции: " + result);
        }
        Writer.getPrint().println("Пока!");
    }

    private MathOperation selectOperation() {
        showMenu();
        Writer.getPrint().println("Введите номер операции: ");
        int operation = Input.getInt();
        if (operation < mathOperationList.size()){
            if (operation != 0) {
                return mathOperationList.get(operation - 1);
            } else return null;
        }else {
            System.out.println("Такой операции нет! Выберите операцию: ");
            return selectOperation();
        }
    }

    private void showMenu(){
        Writer.getPrint().println("Выберите операцию: ");
        Writer.getPrint().println(String.format(" %d - exit", 0));
        for(int i = 0; i < mathOperationList.size(); i++) {
            int number = i+1;
            Writer.getPrint().println(String.format(" %d - %s", number, mathOperationList.get(i).getName()));
        }
    }

}
