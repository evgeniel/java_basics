public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            if (floor == currentFloor) { System.out.println("Вы задали текущий этаж - " + getCurrentFloor() + "!"); }
            if (floor > currentFloor) {
                for(int i = currentFloor; i < floor; i++) {
                    moveUp();
                    System.out.println("Этаж: " + getCurrentFloor());
                }
            } else {
                for(int i = currentFloor; i > floor; i--) {
                    moveDown();
                    System.out.println("Этаж: " + getCurrentFloor());
                }
            }
        } else {
            System.out.println("Этаж задан неверно!");
        }
    }

}
