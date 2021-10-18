package td1.refactor.api.general;

public class Tomato implements Product {

    private double weight;
    private double BASE_PRICE = 0.5;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    double calories_per_100g(){
        
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }
  
}
