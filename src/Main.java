import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);

        String[] pocket = new String[5];

        boolean active = true;
        while (active) {

            System.out.println("Would you like to buy a cup of coffee to put in your pocket?");
            String answer = scanner.nextLine();

            if (answer.equals("yes")) {
                for (int i = 0; i < pocket.length; i++) {
                    if (pocket[i] == null) {
                        pocket[i] = "coffee";
                        break;
                    }
                }
                for (String space : pocket) {
                    System.out.println(space);
                }
            } else {
                System.out.println("Ok then bye I guess");

                System.out.println("Here is what you bought");
                for (String space : pocket) {
                    System.out.println(space);
                }
                active = false;
            }
        }

            System.out.println("Would you like to drink one cup or all the cups?");
            String answerTwo = scanner.nextLine();

            if (answerTwo.equals("one")) {
                for (int i = 0; i < pocket.length; i++) {
                    if (pocket[i].equals("coffee")) {
                        pocket[i] = null;
                        System.out.println("Mmmm, refreshing! (You just drank coffee out of your pocket, you freak)");
                        break;
                    }
                }
            } else if (answerTwo.equals("all")) {
                for (int i = 0; i < pocket.length; i++) {
                    if (pocket[i] == null) {
                        break;
                    } else if (pocket[i].equals("coffee")) {
                        pocket[i] = null;
                        System.out.println("Mmmm, refreshing! (You just drank coffee out of your pocket, you freak)");
                    }
                }
            }

            for (String space : pocket) {
                System.out.println(space);
            }
        }

        static void shopCoffee(){

        }

    }