package creational.abstract_factory;

import creational.abstract_factory.entity.button.Button;
import creational.abstract_factory.entity.checkbox.Checkbox;
import creational.abstract_factory.entity.cursor.Cursor;
import creational.abstract_factory.factory.GraphicFactory;

public class Engine {
    private Button button;
    private Checkbox checkbox;
    private Cursor cursor;

    Engine(GraphicFactory graphicFactory){
        button = graphicFactory.createButton();
        checkbox = graphicFactory.createCheckbox();
        cursor = graphicFactory.createCursor();
    }

    public void doAction(){
        System.out.println("Button: "+ button.click());
        System.out.println("Checkbox: "+checkbox.select());
        System.out.println("Cursor: "+cursor.focus());
    }

}
