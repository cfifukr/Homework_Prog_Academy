package TaskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Port {
    private Dock[] port;
    public Thread[] arrayThreads;
    ConcurrentLinkedQueue<Ship> ships = new ConcurrentLinkedQueue<>();

    public Port(int numberDocks) {
        this.port = new Dock[numberDocks];
        this.arrayThreads = new Thread[numberDocks];
        for (int i = 0; i < numberDocks; i++) {
            port[i] = new Dock();
        }
    }

    public void addShip(Ship ... ship) {
        for(Ship i : ship) {
            ships.add(i);
        }
    }

    public synchronized void unloading() {
        Integer openDock;
        while (!ships.isEmpty()) {
            openDock = getFreeDock();
            if (openDock != null){
                port[openDock].setShip(ships.poll());
                arrayThreads[openDock] = new Thread(port[openDock]);
                arrayThreads[openDock].start();
            }
        }

    }

    public Integer getFreeDock() {
        Integer result = null;
        for (int i = 0; i < port.length; i++) {
            if (!port[i].isClosed()) {
                return i;
            }
        }
        return result;
    }
}