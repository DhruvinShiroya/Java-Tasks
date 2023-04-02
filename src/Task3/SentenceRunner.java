// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task3;


import java.util.Locale;
import java.util.Scanner;

public class SentenceRunner {

    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        boolean moreInput = true;

        while(moreInput){

            Scanner userInput = new Scanner(System.in);

            // ask user for input word
            System.out.println("Plese Enter word you want? ");
            sentence.setSentence(userInput.nextLine());


            // ask user if he want to quit this

            System.out.println("Enter no if you want to quit this");

            //if use answer no for more input
            if(userInput.nextLine().toLowerCase().equals("no")){
                moreInput = false;
            }
        }

        System.out.println("this is odd length word list word you have entered");
        System.out.println(sentence.getOddCharacterWords().toString());
        System.out.println("_______________________________________________________");
        System.out.println("this is even length word list word you have entered");
        System.out.println(sentence.getEvenCharacterWords().toString());
        System.out.println("_______________________________________________________");
    }

}
