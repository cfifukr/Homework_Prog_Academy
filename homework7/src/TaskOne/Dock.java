package TaskOne;

public class Dock implements Runnable{
    private Ship ship;
    private boolean closed = false;

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        System.out.println(ship.getName() + "  in dock");
        this.ship = ship;
        closed = true;

    }
    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }



    @Override
    public void run() {
        int box = ship.getBoxes();
        for (int i = box; i > 0; i--) {
            try {
                Thread.sleep(500);
                ship.setBoxes(i - 1);
                System.out.println("1 box unloaded from  " + ship.getName() +". " + ship.getBoxes() + " boxes left" );

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        closed = false;
        try {
            notifyAll();
        }catch (IllegalMonitorStateException e){

        }


    }
}
