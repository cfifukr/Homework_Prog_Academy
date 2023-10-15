public class Dog extends Animal{
    private String name;


    public Dog(String ration, String color, int weight, String name){
        super(ration, color, weight);
        this.name = name;

    }

    public Dog(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice(){
        return "GAV GAV";
    }

    @Override
    public void eat() {
        if (this.isHungry() == true) {
            System.out.println( this.name +" is eating");
            this.setHungry(false);
        } else {
            System.out.println(this.name +" is  not hungry ");
        }

    }
    @Override
    public void sleep() {
        if (this.isTired() == true) {
            System.out.println( this.name + " is sleeping");
            this.setTired(false);
        } else {
            System.out.println(this.name + " is not tired ");
        }

    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", " + super.toString() +
                '}';
    }
}
