package behavioral.state.engine;

public class RelaxState implements State{

    @Override
    public void doAction(Human human) {
        System.out.println(human.getName()+ " get relax day");
        human.changeState(new WorkState());
    }
}
