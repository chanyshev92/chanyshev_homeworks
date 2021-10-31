public class MoverToZer0 implements Mover{
    //перемещение в конкретную точку (0;0)
    @Override
    public int newY() {
        return 0;
    }

    @Override
    public int newX() {
        return 0;
    }
}
