package structural.bridge.implementation;

public class Mersedes implements Mark {
    @Override
    public String setName() {
        return "MERSEDES";
    }

    @Override
    public Double setMinPrice() {
        return 20000.89;
    }

    @Override
    public String setStatus() {
        return "COMFORT";
    }
}
