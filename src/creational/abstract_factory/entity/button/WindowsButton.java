package creational.abstract_factory.entity.button;

public class WindowsButton implements Button {
    @Override
    public String click() {
        return "I'm Windows Button!";
    }
}
