// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task3;

import java.util.ArrayList;

public class Sentence {

    private StringBuilder sentence;

    private ArrayList<String> oddCharacterWords = new ArrayList<>();
    private ArrayList<String> evenCharacterWords = new ArrayList<>();

    public Sentence(String sentence) {
        if(sentence.trim().length() < 3){
            throw new IllegalArgumentException("Please Enter valid length word");
        }else {
            this.sentence = new StringBuilder(sentence.trim());
            if(this.sentence.length() % 2 == 0){
                evenCharacterWords.add(this.sentence.toString());
            }else{
                oddCharacterWords.add(this.sentence.toString());
            }
        }
    }

    public Sentence(StringBuilder sentence) {
        if(sentence.toString().trim().length() < 3) {
            throw new IllegalArgumentException("Please Enter valid length word");
        }else{

            this.sentence = sentence;

            if(this.sentence.length() % 2 == 0){
                evenCharacterWords.add(this.sentence.toString());
            }else {
                oddCharacterWords.add(this.sentence.toString());
            }
        }
    }

    public Sentence() {
        this.sentence = new StringBuilder("");
    }

    public String getLastWord() {
        return sentence.toString();
    }

    public ArrayList<String> getOddCharacterWords() {
        return oddCharacterWords;
    }

    public ArrayList<String> getEvenCharacterWords() {
        return evenCharacterWords;
    }

    public void setSentence(StringBuilder sentence) {
        if(sentence.toString().trim().length() < 3) {
            throw new IllegalArgumentException("Please Enter valid length word");
        }else{
            String temp = sentence.toString().trim();
            this.sentence.setLength(0);
            this.sentence = this.sentence.append(temp);

            if(this.sentence.length() % 2 == 0){
                evenCharacterWords.add(this.sentence.toString());
            }else {
                oddCharacterWords.add(this.sentence.toString());
            }
        }
    }

    public void setSentence(String sentence) {
        if(sentence.trim().length() < 3) {
            throw new IllegalArgumentException("Please Enter valid length word");
        }else{
            this.sentence.setLength(0);
            this.sentence = this.sentence.append(sentence.trim());

            if(this.sentence.length() % 2 == 0){
                evenCharacterWords.add(this.sentence.toString());
            }else {
                oddCharacterWords.add(this.sentence.toString());
            }
        }
    }
}
