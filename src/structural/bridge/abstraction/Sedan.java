package structural.bridge.abstraction;

import structural.bridge.implementation.Mark;

public class Sedan extends CarType {

    public Sedan(Mark mark) {
        super(mark);
    }

    @Override
    public String getInfo() {
        return "Sedan{" +
                "name='" + mark.setName() + '\'' +
                ", min_price=" + mark.setMinPrice() +
                ", status='" + mark.setStatus() + '\'' +
                '}';
    }
}
