public class BronzeCard extends DiscountCardsImpl {

    private static final double INITIAL_DISCOUNT_RATE = 0;

    public BronzeCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double discountRate() {
        if(this.getTurnover() < 100){
            return INITIAL_DISCOUNT_RATE;
        }else if(this.getTurnover() >= 100 && this.getTurnover() <= 300){
            return INITIAL_DISCOUNT_RATE + 1;
        }else {
            return INITIAL_DISCOUNT_RATE + 2.5;
        }
    }
}
