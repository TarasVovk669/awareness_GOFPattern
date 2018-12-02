package creational.abstract_factory.entity.button;

public class MacOSButton implements Button {
    @Override
    public String click() {
        return "I'm Mac Button!";
    }
}
