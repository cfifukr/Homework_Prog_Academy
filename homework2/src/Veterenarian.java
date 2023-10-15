public class Veterenarian {
    private String name;

    public Veterenarian(String name) {
        this.name = name;
    }
    public Veterenarian(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment_dog(Dog animal) {
        if (animal.isSick() == true){
            animal.setSick(false);
            System.out.println(animal.getName() + " has been successfully treated");
        }else{
            System.out.println( animal.getName() + " doesn't need treatment");

        }

    }
    public void treatment_cat(Cat animal) {
        if (animal.isSick() == true){
            animal.setSick(false);
            System.out.println(animal.getName() + " has been successfully treated");
        }else{
            System.out.println( animal.getName() + " doesn't need treatment");
        }

    }

    @Override
    public String toString() {
        return "Veterenarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
