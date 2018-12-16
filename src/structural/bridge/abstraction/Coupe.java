package structural.bridge.abstraction;

import structural.bridge.implementation.Mark;

public class Coupe  extends CarType{

    public Coupe(Mark mark) {
        super(mark);
    }

    @Override
    public String getInfo() {
        return "Coupe{" +
                "name='" + mark.setName() + '\'' +
                ", min_price=" + mark.setMinPrice() +
                ", status='" + mark.setStatus() + '\'' +
                '}';
    }
}
