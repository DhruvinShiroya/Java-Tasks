package Task2;

public abstract class Keyboard {

    // TWO VARIABLE REPRESENTS THE KEYBOARD BUTTON VALUE AND FUNCTION
    private int buttonAsciiValue;
    private String buttonStringValue;

    public Keyboard(int buttonAsciiValue, String buttonStringValue) {
        this.buttonAsciiValue = buttonAsciiValue;
        this.buttonStringValue = buttonStringValue.toLowerCase();
    }

    public Keyboard() {

    }

    public int getButtonAsciiValue() {
        return buttonAsciiValue;
    }

    public void setButtonAsciiValue(int buttonAsciiValue) {
        this.buttonAsciiValue = buttonAsciiValue;
    }

    public String getButtonStringValue() {
        return buttonStringValue;
    }

    public void setButtonStringValue(String buttonStringValue) {
        this.buttonStringValue = buttonStringValue;
    }

    public static int ValidKeyStrokes(Keyboard key){
        // if the passed arugment val is proper String
        switch (key.buttonStringValue){
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
            case "g":
            case "h":
            case "i":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "o":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "u":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                return 1; // for valid key press

            case "<Esc>":
            case "<Enter>":
            case "<Tab>":
                return 0; // for valid keyboeard function keys

            default:
                return -1; // for invalid input
        }

    }

    public abstract void performKeyFunction();

    public abstract void performMacroFunction(Keyboard...keys);

    public String getUpperCaseKeyVal(){
        return this.buttonStringValue.toUpperCase();
    }
}
