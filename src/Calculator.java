import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Screen screen = new Screen();
        Calculate calculate;
        screen.addHeader();
        screen.menuStart();
        screen.menuInput();
        int start = scanner.nextInt();
        if(start==99){
            System.exit(300);
        }

        screen.addHeader();
        screen.value1();
        int value1 = scanner.nextInt();
        screen.value2();
        int value2 = scanner.nextInt();
        calculate = new Calculate(value1,value2);

        screen.addHeader();
        screen.operation();
        screen.menuInput();
        int userOperation = scanner.nextInt();
        screen.result();
        switch (userOperation){
            case 1:
                System.out.println(calculate.addValue());
                break;
            case 2:
                System.out.println( calculate.subValue());
                break;
            case 3:
                System.out.println(calculate.multiplyValue());
                break;
            case 4:
                System.out.println(calculate.divideValue());
                break;
        }

        scanner.close();
    }
}
