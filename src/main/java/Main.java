public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(59);
        Cat[] arrayCat = new Cat[3];
        {

            arrayCat[0] = new Cat("Barsik", 10);
            arrayCat[1] = new Cat("Caca", 20);
            arrayCat[2] = new Cat("Pupos", 30);
            for (Cat cat : arrayCat) {
                cat.eat(plate);
                cat.info();
            }


        }
    }
}
