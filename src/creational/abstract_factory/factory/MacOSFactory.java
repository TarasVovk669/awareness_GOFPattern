package creational.abstract_factory.factory;

import creational.abstract_factory.entity.button.Button;
import creational.abstract_factory.entity.button.MacOSButton;
import creational.abstract_factory.entity.checkbox.Checkbox;
import creational.abstract_factory.entity.checkbox.MacOSCheckbox;
import creational.abstract_factory.entity.cursor.Cursor;
import creational.abstract_factory.entity.cursor.MacOSCursor;

public class MacOSFactory implements GraphicFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public Cursor createCursor() {
        return new MacOSCursor();
    }
}
