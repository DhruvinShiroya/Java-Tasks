// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task2;

public class Computer extends Keyboard implements IButton {




    @Override
    public void onClickEvent(String val) {
        if(BTN_VALUE.equals(val)){
            performKeyFunction();
        }
    }

    @Override
    public void performKeyFunction() {
        switch (this.getButtonStringValue()){
            case "<Esc>":
                System.out.println("Esc key is pressed");
                break;
            case "<Enter>":
                System.out.println("Enter is pressed");
                break;
            case "<Tab>":
                System.out.println("Tab key is pressed");
        }
        return;
    }

    @Override
    public void performMacroFunction(Keyboard... keys) {
        StringBuilder macroString = null;
        for (Keyboard key:
             keys) {
            macroString.append(key.getButtonStringValue());
            macroString.append("//");
        }
        if(macroString.toString().equals("<Esc>//m//")){
            System.out.println("Macro is working in background");
        }
    }


    @Override
    public boolean buttonPressed(Keyboard key) {
        return false;
    }
}
