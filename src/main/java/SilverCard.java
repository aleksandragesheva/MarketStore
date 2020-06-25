public class SilverCard extends DiscountCardsImpl {

    private static final double INITIAL_DISCOUNT_RATE = 2;

    public SilverCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double discountRate() {
        if(this.getTurnover() > 300){
            return INITIAL_DISCOUNT_RATE + 1.5;
        }else {
            return INITIAL_DISCOUNT_RATE;
        }
    }
}
