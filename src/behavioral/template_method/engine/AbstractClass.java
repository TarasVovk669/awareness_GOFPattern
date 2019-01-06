package behavioral.template_method.engine;

public abstract class AbstractClass {

    public final void templateMethod() {
        step1();
        abs_step1();
        step2();
        step3();
        step4();
        abs_step2();
    }

    public void step1() {
        System.out.println("Hello from : ");
    }


    public void step2() {
        System.out.println(" default step 2");
    }

    public void step3() {
        System.out.println(" default step 3");
    }

    public void step4() {
        System.out.println(" default step 4");
    }

    public abstract void abs_step1();

    public abstract void abs_step2();

}
