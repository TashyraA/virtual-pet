package virtual_pet;

public class VirtualPet {
    private int hungriness;
    private int tiredness;
    private int happiness;
    private int cleanliness;

    public VirtualPet(int hunger, int tired, int happy, int clean) {
        this.hungriness = hunger;
        this.tiredness = tired;
        this.happiness = happy;
        this.cleanliness = clean;
    }

    public int getHunger() {
        return hungriness;
    }

    public int getTired() {
        return tiredness;
    }

    public int getHappy() {
        return happiness;
    }

    public int getClean() {
        return cleanliness;
    }

    public void tick() {
        hungriness = hungriness + 10;
        tiredness = tiredness + 5;
        happiness = happiness + 8;
        cleanliness = cleanliness + 2;
    }

    public void hunger(int hungerGoesUp) {
        hungriness = hungriness + hungerGoesUp;
    }

    public void tired(int tirednessGoesUp) {
        tiredness = tiredness + tirednessGoesUp;
    }

    public void happy(int happinessGoesUp) {
        happiness = happiness + happinessGoesUp;
    }

    public void clean(int cleanlinessGoesDown) {
        cleanliness = cleanliness + cleanlinessGoesDown;
    }

    public void feed(int hungerGoesDown) {
        if (hungriness <= 5) {
            hungriness -= hungriness;
        } else {
            hungriness = hungriness + 5;
        }
        happiness = happiness + 4;
    }

    public void play(int tirednessGoesUp) {
        if (tiredness < tirednessGoesUp) {
            tiredness = tiredness + tirednessGoesUp;
        } else {
            tiredness += tiredness;
        }
    }

}



