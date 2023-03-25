package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        Написать программу, в которую вводится имя и
//        фамилия пользователя в одну строку через пробел.
//
//        Программа должна выводить имя и фамилию на разных строках.
public class homework3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Введите имя и фамилию : ");
        String fullName = br.readLine();

        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];


        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
    }
}


