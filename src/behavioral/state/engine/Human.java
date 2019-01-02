package behavioral.state.engine;

//Context
public class Human {
    private String name;
    private State state;

    public Human(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void live() {
        state.doAction(this);
    }

    public String getName() {
        return name;
    }
}
