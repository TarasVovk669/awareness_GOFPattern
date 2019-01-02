package behavioral.state.engine;

public class WorkState implements State {
    private int dayCountOfWeek = 1;

    @Override
    public void doAction(Human human) {
        if (dayCountOfWeek <= 5) {
            System.out.println(human.getName() + " get work day");
            dayCountOfWeek++;
        } else {
            human.changeState(new SelfDevelopmentState());
        }
    }
}
