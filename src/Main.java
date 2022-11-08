public class Main {
    public static void main(String[] args) {
        int amount = 2500;
        boolean isBye = true;

        int bonus;
        if (isBye) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int mile = amount / 20 * bonus;
        System.out.println("Итого миль:" + mile);
    }
}

