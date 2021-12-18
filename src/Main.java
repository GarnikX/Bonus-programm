public class Main {
    public static void main(String[] args) {
        int client_balance = 100;
        int replenishment_amount = 915;
        if (replenishment_amount >= 1000) {

            System.out.println(client_balance + replenishment_amount + replenishment_amount / 100);
        } else {
            System.out.println(client_balance + replenishment_amount);
        }
    }
}