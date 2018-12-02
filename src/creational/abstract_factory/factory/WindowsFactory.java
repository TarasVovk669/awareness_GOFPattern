package creational.abstract_factory.factory;

import creational.abstract_factory.entity.button.Button;
import creational.abstract_factory.entity.button.WindowsButton;
import creational.abstract_factory.entity.checkbox.Checkbox;
import creational.abstract_factory.entity.checkbox.WindowsCheckbox;
import creational.abstract_factory.entity.cursor.Cursor;
import creational.abstract_factory.entity.cursor.WindowsCursor;

public class WindowsFactory implements GraphicFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Cursor createCursor() {
        return new WindowsCursor();
    }
}
