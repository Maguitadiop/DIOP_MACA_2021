package td1.refactor.api.general;

public class Sauce implements Product{
        BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    public double calories_per_100g(){
        double rtr;
            switch (this) {
                case type.BURGER:
                    rtr = 240;
                    break;
                case type.BARBECURE:
                    rtr = 130;
                    break;
                case: type.BEARNAISE:
                default
                    rtr = 550;
            }
            return rtr;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}
