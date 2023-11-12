package TaskOne;

public class TaskOne {

    public static void main(String[] args) {
        //test 1

        Port portA = new Port(2);


        Ship ship1 = new Ship("Ship A");
        Ship ship2 = new Ship("Ship B");
        Ship ship3 = new Ship("Ship C");

        portA.addShip(ship1, ship2, ship3);

        portA.unloading();



        //test 2

        try {
            Thread.sleep(6000);
            System.out.println("TEST 2");
        }catch (InterruptedException e){}

        Port portB = new Port(3);

        Ship A = new Ship("Bismark(Germany)");
        Ship B = new Ship("Prince Wales(UK)");
        Ship C = new Ship("Hood(UK)");
        Ship D = new Ship("Yamato(Japan)");
        Ship E = new Ship("Queen Elithabeth(UK)");
        Ship F = new Ship("North Caroline(USA)");
        Ship G = new Ship("Iowa(USA)");

        portB.addShip(A, B, C, D, E, F, G);

        portB.unloading();




    }

}
