import java.util.*;

public class Example {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        char op = sc.next().charAt(0);
        sc.close();
        double out;
        switch(op)
        {
            case '+':
            	out = num1 + num2;
                break;
            case '-':
            	out = num1- num2;
                break;
            case '*':
            	out = num1*num2;
                break;
            case '/':
            	out = num1 / num2;
                break;
            default:
                System.out.printf("enter correct operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}