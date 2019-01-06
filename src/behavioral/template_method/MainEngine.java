package behavioral.template_method;


import behavioral.template_method.engine.AbstractClass;
import behavioral.template_method.engine.ClassA;
import behavioral.template_method.engine.ClassB;

public class MainEngine {


    public static void main(String[] args) {
        AbstractClass a = new ClassA();
        a.templateMethod();
        System.out.println("---------------------------");
        AbstractClass b = new ClassB();
        b.templateMethod();
    }

}
