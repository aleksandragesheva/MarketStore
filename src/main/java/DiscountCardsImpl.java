import interfaces.DiscountCards;
import interfaces.Person;

public abstract class DiscountCardsImpl implements Person,DiscountCards {
    private String firstName;
    private String lastName;
    private int age;
    private double turnover;
    private double purchaseValue;

    protected DiscountCardsImpl(double turnover, double purchaseValue) {
        this.setTurnover(turnover);
        this.setPurchaseValue(purchaseValue);
        this.setFirstName(this.firstName);
        this.setLastName(this.lastName);
        this.setAge(this.age);
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        firstName = "Pesho";
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        lastName = "Peshev";
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        age = 20;
        this.age = age;
    }

    @Override
    public double getTurnover() {
        return this.turnover;
    }

    @Override
    public void setTurnover(double turnover) {
        String className = this.getClass().getSimpleName();
        int indexOfLetterC = className.lastIndexOf("C");
        className = new StringBuilder(className).insert(indexOfLetterC, " ").toString();
        if(turnover < 0){
            throw new IllegalArgumentException(
                    String.format("The turnover of the %s can't be less than 0.",
                    className.toLowerCase()));
        }
        this.turnover = turnover;
    }

    @Override
    public double getPurchaseValue() {
        return this.purchaseValue;
    }

    @Override
    public void setPurchaseValue(double purchaseValue) {
        String className = this.getClass().getSimpleName();
        int indexOfLetterC = className.lastIndexOf("C");
        className = new StringBuilder(className).insert(indexOfLetterC, " ").toString();
        if(purchaseValue < 0){
            throw new IllegalArgumentException(
                    String.format("The purchase value of the %s can't be less than 0.",
                            className.toLowerCase()));
        }
        this.purchaseValue = purchaseValue;
    }

    @Override
    public abstract double discountRate();

    @Override
    public double calculateDiscount(){
        return (this.discountRate() / 100) * this.getPurchaseValue();
    }

    @Override
    public double totalPurchasedVale(){
        return this.getPurchaseValue() - this.calculateDiscount();
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        int indexOfLetterC = className.lastIndexOf("C");
        className = new StringBuilder(className).insert(indexOfLetterC, " ").toString();
        return String.format("%s:%n" +
                        "Purchase value: $%.2f%n" +
                "Discount rate: %.1f%%%n" +
                "Discount: $%.2f%n" +
                "Total: $%.2f",
                className,
                this.getPurchaseValue(),
                this.discountRate(),
                this.calculateDiscount(),
                this.totalPurchasedVale());
    }
}
