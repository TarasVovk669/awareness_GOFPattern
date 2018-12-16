package structural.bridge.abstraction;

import structural.bridge.implementation.Mark;

public abstract class CarType {
    Mark mark;

    public CarType(Mark mark){
        this.mark = mark;
    }

    public abstract String getInfo();

}
