package Task2;

public abstract class Heart {

    HeartHeath HeartHealth = HeartHeath.Normal;

    private int hearBeatRatePerMinute = 60;

    public Heart(HeartHeath heartHealth, int hearBeatRatePerMinute) {
        HeartHealth = heartHealth;
        if(hearBeatRatePerMinute <250){
            throw new IllegalArgumentException("You are not human please get help");
        }else {
            this.hearBeatRatePerMinute = hearBeatRatePerMinute;
        }
    }

    public Heart() {
    }

    public HeartHeath getHeartHealth() {
        return HeartHealth;
    }

    public void setHeartHealth(HeartHeath heartHealth) {
        HeartHealth = heartHealth;
    }

    public int getHearBeatRatePerMinute() {
        return hearBeatRatePerMinute;
    }

    public void setHearBeatRatePerMinute(int hearBeatRatePerMinute) {
        this.hearBeatRatePerMinute = hearBeatRatePerMinute;
    }

    public abstract void updateHearthHealth();


    public abstract void checkForCriticalCondition();
}
