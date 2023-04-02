// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task2;

public class Human extends Heart implements IHiar{

    private int heightInCm; // height in cm becuase in to feet can be converted
    private int weightInKg; // because pound converstion sucks

    private String hairColor;

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public String getHairColor() {
        return hairColor;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    private HairStyle hairStyle;

    // set hearth health based on the hearth health
    @Override
    public void updateHearthHealth() {
        if(this.getHearBeatRatePerMinute() < 70 && this.getHearBeatRatePerMinute() > 50){
            this.setHeartHealth(HeartHeath.Excellent);
        }else if(this.getHearBeatRatePerMinute() > 70 && this.getHearBeatRatePerMinute() < 80){
            this.setHeartHealth(HeartHeath.Normal);
        }else if(this.getHearBeatRatePerMinute() < 50 && this.getHearBeatRatePerMinute() > 30){
            this.setHeartHealth(HeartHeath.Weak);
        }else if(this.getHearBeatRatePerMinute() == 0){
            this.setHeartHealth(HeartHeath.HeartFailure);
        }

    }

    // if heart condition is weak, heartfilure , heartAttack display the message
    @Override
    public void checkForCriticalCondition() {

        if(this.getHeartHealth().equals(HeartHeath.HeartAttack)){
            System.out.println("Person is having hearth attack call ambulance");
        }else if(this.getHeartHealth().equals(HeartHeath.HeartFailure)){
            System.out.println("Person had hearth failure call ambulance");
        }else if(this.getHeartHealth().equals(HeartHeath.Weak)){
            System.out.println("Person has week heart take medication or hospital checkup");
        }

    }

    @Override
    public void changeHairStyle(HairStyle hair) {

        this.hairStyle = hair;
    }

    public Human(HeartHeath heartHealth, int hearBeatRatePerMinute, int heightInCm, int weightInKg) {
        super(heartHealth, hearBeatRatePerMinute);
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
    }

    public Human(int heightInCm, int weightInKg) {
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
    }

    public Human(HeartHeath heartHealth, int hearBeatRatePerMinute, int heightInCm, int weightInKg, String hairColor, HairStyle hairStyle) {
        super(heartHealth, hearBeatRatePerMinute);
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    public Human(int heightInCm, int weightInKg, String hairColor, HairStyle hairStyle) {
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    @Override
    public void changeHairColour(String color) {
        this.hairColor = color.toUpperCase();
    }
}
