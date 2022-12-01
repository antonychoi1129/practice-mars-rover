package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommands(Command command) {
        switch (command){
            case M: {
                moveForward(locationX, locationY, direction);
                break;
            }
            case L: {
                turnLeft();
                break;
            }
            case R: {
                turnRight();
                break;
            }
        }
    }

    private void turnRight() {
        switch (direction){
            case N : {
                direction = Direction.E;
                break;
            }
            case S : {
                direction = Direction.W;
                break;
            }
        }
    }

    private void moveForward(int locationX, int locationY, Direction direction) {
        switch (direction){
            case N: {
                addLocationY();
                break;
            }
            case S: {
                minusLocationY();
                break;
            }
        }
    }

    private void minusLocationY() {
        this.locationY--;
    }

    private void turnLeft() {
        switch (direction){
            case N : {
                direction = Direction.W;
                break;
            }
            case S : {
                direction = Direction.E;
                break;
            }
        }
    }

    private void addLocationY() {
        this.locationY++;
    }

    public int getLocationX() {
        return 0;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return this.direction;
    }
}
