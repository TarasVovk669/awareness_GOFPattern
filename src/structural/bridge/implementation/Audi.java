package structural.bridge.implementation;

public class Audi implements Mark {
    @Override
    public String setName() {
        return "AUDI";
    }

    @Override
    public Double setMinPrice() {
        return 40000.50;
    }

    @Override
    public String setStatus() {
        return "COMFORT";
    }
}
