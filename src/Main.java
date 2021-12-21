public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int replenishmentAmount = 915;
        if (replenishmentAmount >= 1000) {
            System.out.println(clientBalance + replenishmentAmount + replenishmentAmount / 100);
        } else {
            System.out.println(clientBalance + replenishmentAmount);
        }
    }
}