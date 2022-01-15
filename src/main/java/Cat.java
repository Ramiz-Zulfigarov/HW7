public class Cat {
    private String name;
    private int appetite;
    private boolean hangry;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.hangry = true;
    }
    void info() {
        String isHungry = !hangry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hangry && plate.decreaseFood(appetite))
            hangry = false;
    }



    }


