package structural.bridge.abstraction;

import structural.bridge.implementation.Mark;

public class Pickup extends CarType {

    public Pickup(Mark mark) {
        super(mark);
    }

    @Override
    public String getInfo() {
        return "Pickup{" +
                "name='" + mark.setName() + '\'' +
                ", min_price=" + mark.setMinPrice() +
                ", status='" + mark.setStatus() + '\'' +
                '}';
    }
}
