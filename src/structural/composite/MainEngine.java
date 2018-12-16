package structural.composite;

import structural.composite.engine.CompositeBox;
import structural.composite.engine.items.*;

public class MainEngine {

    public static void main(String[] args) {
       CompositeBox box = fillBox();
        System.out.println(box.getPrice());
    }


    private static CompositeBox fillBox(){
        Item milk = new Milk();
        Item milkNew = new Milk();
        Item milkVersion2 = new Milk();

        Item phone = new Phone();

        Item pen = new Pen();
        Item penOld = new Pen();

        Item pencil = new Pencil();
        Item pencilOld = new Pencil();

        Item book1 = new Book();
        Item book2 = new Book();
        Item book3 = new Book();
        Item book4 = new Book();


        CompositeBox milkHolder = new CompositeBox();
        CompositeBox penAndPencilHolder = new CompositeBox();
        CompositeBox bookHolder = new CompositeBox();
        //fill holders
        milkHolder.addItem(milk);
        milkHolder.addItem(milkNew);
        milkHolder.addItem(milkVersion2);

        penAndPencilHolder.addItem(pen);
        penAndPencilHolder.addItem(penOld);
        penAndPencilHolder.addItem(pencil);
        penAndPencilHolder.addItem(pencilOld);

        bookHolder.addItem(book1);
        bookHolder.addItem(book2);
        bookHolder.addItem(book3);
        bookHolder.addItem(book4);
        //Main Holder
        CompositeBox mainBox = new CompositeBox();
        mainBox.addItem(phone);
        mainBox.addItem(milkHolder);
        mainBox.addItem(penAndPencilHolder);
        mainBox.addItem(bookHolder);

        return mainBox;
    }
}
