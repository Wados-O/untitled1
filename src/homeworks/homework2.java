package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Optional;

//        Написать простого бота, который задаёт три вопроса.
//        Сделать его ответы разными — использовать if … else и сравнение строк.
public class homework2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi! How are you ?");
        String hallo = br.readLine();
        if (hallo.equalsIgnoreCase("fine .. and you?")) {
            System.out.println("Oh you are so friendly.. ");
        } else {
            System.out.println("okay...");
        }
        System.out.println("What's your name? ");
        String name = br.readLine();
        if (name.equalsIgnoreCase("andrey")) {
            System.out.println("This is my favorite");
        }
        System.out.println("Where are you from?");
        String city = br.readLine();
        if (city.equalsIgnoreCase("Berlin")) {
            System.out.println("Cool !!! I am also!!!");

            System.out.println("Maybe we can meet tomorrow in Berlin and Drink some coffee?");
            String ask = br.readLine();
            if (ask.equalsIgnoreCase("yes")) {
                System.out.println("Send me message with answer in slak!!");
            }
        } else {
            System.out.println("Oh cool i was there !!!");
            System.out.println("Sorry i gotta go!!! ");
        }
    }
}