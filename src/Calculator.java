/**
 * Created by niisoks on 02/05/18.
 */
import java.util.*;
public class Calculator {

    public static String a = "a";

    public static String test(){
        return a;
    }

    public static void main(String[] args){ //i forgot what this shit is ask dom


        System.out.println(Calculator.test());
        Calculator.a = "b";
        System.out.println(Calculator.test());


        System.out.println(Calculator.test());




        //all ur ints and strings and shit go here i guess
        int num1 = 0; //obviously the first number retard
        int num2 = 0; // you dont need me to tell you this shit
        char operator; //mans + - x / or whatever lad
        double answer = 0.0; //double just gives you a decimal place dunnnit

        //remember sout because fuck typing all that
        Scanner scanObject = new Scanner(System.in);

        System.out.println("numba 1");
        num1 = scanObject.nextInt();
        System.out.println("numba 2");
        num2 = scanObject.nextInt();
        System.out.println("oh baby gimme that thing");
        operator = scanObject.next().charAt(0);

        switch (operator) { //so i guess this switch statement recieves the operator and then picks a case
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            // i guess its kinda like an if statement
            //ask dom what the difference is lazy boi
        }
        System.out.println(num1+" "+operator+" "+num2+" = " +answer ); //obviously this just prints the whole thing

        }

    }

