import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            DiscountCardsImpl bronze = new BronzeCard(0, 150);
            System.out.println(bronze.toString());
            System.out.println();

            DiscountCardsImpl silver = new SilverCard(600, 850);
            System.out.println(silver.toString());
            System.out.println();

            DiscountCardsImpl gold = new GoldCard(1500, 1300);
            System.out.println(gold.toString());
            System.out.println();

            DiscountCardsImpl bronze2 = new BronzeCard(100, -150);
            System.out.println(bronze2.toString());
            System.out.println();

            DiscountCardsImpl bronze3 = new BronzeCard(350, 150);
            System.out.println(bronze3.toString());
            System.out.println();

            DiscountCardsImpl silver2 = new SilverCard(-2, 850);
            System.out.println(silver2.toString());
            System.out.println();

            DiscountCardsImpl gold2 = new GoldCard(50.5, 1300);
            System.out.println(gold2.toString());
            System.out.println();

            DiscountCardsImpl gold3 = new GoldCard(500, 1300);
            System.out.println(gold3.toString());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

    }

}
