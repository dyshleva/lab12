package ucu.edu.ua;

public class ATM {
    private Tray firstTray;

    public ATM() {
        firstTray = new Tray(500);
        Tray tray200 = new Tray(200);
        firstTray.setNext(tray200);
        tray200.setNext(new Tray5());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
