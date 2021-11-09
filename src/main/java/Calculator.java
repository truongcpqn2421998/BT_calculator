import java.io.IOException;

public class Calculator {
    public static float calculator(float num1,float num2 ,String operator){
        switch (operator){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                try {
                    return num1 / num2;
                }catch (Exception a){
                    a.printStackTrace();
                }
            default:
                return 0;
        }
    }
}
