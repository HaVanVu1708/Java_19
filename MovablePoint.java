package Java_19;

import Java_19.Movable;

public class MovablePoint implements Movable {
    private int x, y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    @Override
    public void moveUp(){
        y--;
    }
    @Override
    public void moveDown(){
        y++;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
}
