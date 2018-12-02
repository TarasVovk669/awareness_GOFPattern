package creational.abstract_factory.factory;

import creational.abstract_factory.entity.button.Button;
import creational.abstract_factory.entity.checkbox.Checkbox;
import creational.abstract_factory.entity.cursor.Cursor;

public interface GraphicFactory {
    Button createButton();
    Checkbox createCheckbox();
    Cursor createCursor();

}
