import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        Напишите программу,
//        в которой пользователь вводит с клавиатуры целое число, а программа ему рассказывает,
//        отрицательное это число, положительное или ноль, и делится ли оно на три.
public class Ifelse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 0) {
            System.out.println("number is positive ..");
        }else {
            System.out.println("number is negative..");
        }

    }
}
