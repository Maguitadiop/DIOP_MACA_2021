package td1.refactor.api.general;

public class Meat implements Product {
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

        public double price() {
            double rtr;
            switch (this) {
                case MeatType.WHITEFISH:
                    rtr = 6;
                    break;
                case MeatType.BEEF:
                default:
                    rtr = 4;
            }
            return rtr;
        }

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    double calories_per_100g(){
        switch (this) {
            case MeatType.WHITEFISH:
                rtr = 200;
                break;
            case MeatType.BEEF:
            default:
                rtr = 170;
        }
        return rtr;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
