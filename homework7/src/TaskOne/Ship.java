package TaskOne;
public class Ship {
    private String name;
    private int boxes = 10;

    public Ship(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getBoxes() {
        return boxes;
    }

    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", drawerCapacity=" + boxes +
                '}';
    }
}