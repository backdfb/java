import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        boolean playing = true;
        Scanner scanner = new Scanner(System.in); // Scanner 클래스를 사용하여 사용자의 입력을 받고, if-else 구문을 사용하여 조건에 따른 동작을 수행

        while (playing) {
            System.out.println("Choose a number:");
            int a = scanner.nextInt();

            System.out.println("Choose another one:");
            int b = scanner.nextInt();

            System.out.println("Choose an operation:");
            System.out.println("    Options are: +, -, *, or /.");
            System.out.println("    Write 'exit' to finish.");
            String operation = scanner.next();

            if (operation.equals("+")) {
                int result = a + b;
                System.out.println(result);
            } else if (operation.equals("-")) {
                int result = a - b;
                System.out.println(result);
            } else if (operation.equals("*")) {
                int result = a * b;
                System.out.println(result);
            } else if (operation.equals("/")) { // 자바의 정수형(int)과 실수형(double)의 나눗셈 결과는 정확한 값을 얻기 위해 형변환이 필요함
                if (b == 0) {
                    System.out.println("Don't Use 0 in another one");
                } else {
                    double result = (double) a / b;
                    System.out.println(result);
                }
            } else if (operation.equals("exit")) {
                System.out.println("See You Again.");
                playing = false;
            } else {
                System.out.println("Retry.");
            }
        }
  }
}

