public class Animal {
    private String ration;
    private String color;
    private int weight;
    private boolean hungry = false;
    private boolean tired = false;
    private boolean sick = false;


    public Animal(String ration, String color, int weight){

        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal(){
        super();

    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public String getVoice(){
        return "There is nothing we can say @Unknown animal";
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public void eat(){
        if (this.hungry == true) {
            System.out.println("Animal is eating");
            this.hungry = false;
        }else{
            System.out.println("Animal is  not hungry ");
        }
    }

    public void sleep(){

        if (this.tired == true) {
            System.out.println("Animal is sleeping");
            this.tired = false;
        }else{
            System.out.println("Animal is not tired ");
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", hungry=" + hungry +
                ", tired=" + tired +
                ", sick=" + sick +
                '}';
    }
}
