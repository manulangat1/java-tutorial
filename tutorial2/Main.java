package tutorial2;

public class Main {
    public static void main(String[] args) {
        Level lvl = Level.LOW;
        Level[] arr = Level.values();

        if (lvl == Level.LOW) {
            System.out.print(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.print("med");
        } else if (lvl == Level.HIGH) {
            System.out.print("so high");
        }
        System.out.println("\n ---->");

        // System.out.println(Level.values().toString());
        for (Level e : arr) {
            System.out.println(e);
        }
    }
}
