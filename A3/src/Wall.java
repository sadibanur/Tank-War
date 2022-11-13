/*
 * Author: Nuzhat Mastura
 * Course: CSC 335
 */



public class Wall extends Entity {
    public Wall(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }
    private int health = 3;

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public double getAngle() {
        return super.getAngle();
    }

    @Override
    public double getXBound(){
        return getX() + Constants.WALL_WIDTH;
    }

    @Override
    public double getYBound(){
        return getY() + Constants.WALL_HEIGHT;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth() {
        health--;
    }

    @Override
    public void move(GameWorld gameWorld) {

    }

    @Override
    public boolean checkBounds() {
        return false;
    }

}
