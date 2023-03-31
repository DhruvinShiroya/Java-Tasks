package Task2;

public interface IButton {

    final String BTN_VALUE = "SUBMIT";
    final boolean ON_CLICK_VALUE = true;

    // return true if the method was successfully registered value of keybutton
    boolean buttonPressed(Keyboard key);

    // trigger the event on special button pressed
    void onClickEvent(String val);
}
