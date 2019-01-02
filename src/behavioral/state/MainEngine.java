package behavioral.state;

import behavioral.state.engine.Human;
import behavioral.state.engine.WorkState;

public class MainEngine {

    public static void main(String[] args) {
        Human human = new Human("Taras", new WorkState());

        for (int i = 0; i <= 7; i++) {
            human.live();
        }
    }


}
