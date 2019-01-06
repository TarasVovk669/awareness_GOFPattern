package behavioral.template_method.engine;

public class ClassA extends AbstractClass{
    @Override
    public void abs_step1() {
        System.out.println("Class [A]");
    }

    @Override
    public void abs_step2() {
        System.out.println("Method from Class A");
    }
}
