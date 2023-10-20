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

    public void treatment(Animal animal) {
        if (animal.isSick() == true){
            animal.setSick(false);
            System.out.println("Pet has been successfully treated");
        }else{
            System.out.println("Pet doesn't need treatment");

        }

    }

    @Override
    public String toString() {
        return "Veterenarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
