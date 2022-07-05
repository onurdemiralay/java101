public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Onur", 10, 100, 73, 25);
        Fighter f2 = new Fighter("Demiralay", 10, 100, 73, 25);

        Ring r = new Ring(f1, f2, 70, 80);
        r.start();
        r.fight();
    }
}