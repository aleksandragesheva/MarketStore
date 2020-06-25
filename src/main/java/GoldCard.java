public class GoldCard extends DiscountCardsImpl {

    private static final double INITIAL_DISCOUNT_RATE = 2;

    public GoldCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double discountRate() {
        double turnover = this.getTurnover();
        int growingOfDiscount = (int) (turnover / 100);
        if(growingOfDiscount > 8){
            int discountToExtract = growingOfDiscount - 8;
            growingOfDiscount -= discountToExtract;
            return INITIAL_DISCOUNT_RATE + growingOfDiscount;
        }
        return INITIAL_DISCOUNT_RATE + growingOfDiscount;
    }
}
