package structural.bridge.implementation;

public class BMW implements Mark {
    @Override
    public String setName() {
        return "BMW";
    }

    @Override
    public Double setMinPrice() {
        return 80000.00;
    }

    @Override
    public String setStatus() {
        return "PREMIUM";
    }
}
