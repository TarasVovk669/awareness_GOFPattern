package behavioral.template_method.engine;

public class ClassB extends AbstractClass{
    @Override
    public void abs_step1() {
        System.out.println("Class [B]");
    }

    @Override
    public void abs_step2() {
        System.out.println("Method from Class B and BBBBB");
    }
}
