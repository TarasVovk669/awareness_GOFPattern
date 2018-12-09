package creational.prototype.version1;

public class Body implements Clonable {
    private int qtyLegs;
    private int qtyHands;

    public Body(int qtyLegs, int qtyHands) {
        this.qtyLegs = qtyLegs;
        this.qtyHands = qtyHands;
    }

    @Override
    public Object copy() {
        return new Body(qtyLegs, qtyHands);
    }

    public int getQtyLegs() {
        return qtyLegs;
    }

    public void setQtyLegs(int qtyLegs) {
        this.qtyLegs = qtyLegs;
    }

    public int getQtyHands() {
        return qtyHands;
    }

    public void setQtyHands(int qtyHands) {
        this.qtyHands = qtyHands;
    }

    //
//    @Override
//    public String toString() {
//        return "Body{" +
//                "qtyLegs=" + qtyLegs +
//                ", qtyHands=" + qtyHands +
//                '}';
//    }
}
