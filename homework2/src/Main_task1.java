
public class Main_task1 {
    public static void main(String[] args) {

        Animal animal1 = new Animal("organic corm", "white", 4);


        System.out.println(animal1);
        animal1.setTired(true);
        System.out.println(animal1);
        animal1.sleep();
        System.out.println(animal1);
        animal1.sleep();


        Cat Barsik = new Cat("non-organic corm", "black", 3, "Barsik");

        System.out.println(Barsik);
        Barsik.setHungry(true);
        System.out.println(Barsik);
        Barsik.eat();
        System.out.println(Barsik);
        System.out.println(Barsik.getVoice());

        Dog Reks = new Dog("people", "red_black", 10 , "Reks");

        System.out.println(Reks);
        Reks.setHungry(true);
        Reks.setTired(true);
        System.out.println(Reks);
        Reks.sleep();
        System.out.println(Reks);


        Veterenarian Vlad  = new Veterenarian("Vlad");

        System.out.println(Vlad);

        Reks.setSick(true);

        System.out.println(Reks);
        Vlad.treatment(Reks);
        Vlad.treatment(Barsik);




    }

}