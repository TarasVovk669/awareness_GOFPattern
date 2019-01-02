package behavioral.state.engine;

public class SelfDevelopmentState implements State {

    @Override
    public void doAction(Human human) {
        System.out.println(human.getName()+ " get self-development day");
        human.changeState(new RelaxState());
    }
}
