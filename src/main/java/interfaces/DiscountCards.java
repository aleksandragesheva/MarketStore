package interfaces;

public interface DiscountCards {
    double getTurnover();
    void setTurnover(double turnover);
    double getPurchaseValue();
    void setPurchaseValue(double purchaseValue);
    double discountRate();
    double calculateDiscount();
    double totalPurchasedVale();
}
