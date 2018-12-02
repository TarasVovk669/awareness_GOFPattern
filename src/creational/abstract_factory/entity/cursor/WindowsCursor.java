package creational.abstract_factory.entity.cursor;

public class WindowsCursor implements Cursor{
    @Override
    public String focus() {
        return "Focus Windows";
    }
}
