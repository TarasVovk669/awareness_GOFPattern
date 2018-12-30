package behavioral.memento;

import behavioral.memento.engine.Hero;
import behavioral.memento.engine.History;

public class MainEngine {

    public static void main(String[] args) {
        Hero hero = new Hero();
        History history = new History();

        //start game
        hero.set("Taras", 0,0,1,0.0);
        history.save(hero.save());
        System.out.println(hero);

        hero.set("Taras", 55,87,6,76.9);
        history.save(hero.save());
        System.out.println(hero);

        hero.set("Taras", 89,123,9,21.8);
        System.out.println(hero);
        System.out.println("Hero RIP / load last save!");
        hero.load(history.getLastSave());
        System.out.println(hero);
    }
}
