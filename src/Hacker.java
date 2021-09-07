import java.time.temporal.ValueRange;

public abstract class Hacker extends Thread {
    Vault vault;
    String name;

    public Hacker(Vault vault) {
        this.vault = vault;
    }

    @Override
    public void run() {
        while(!tryToHack(vault)) {
            System.out.println(this.getName() + " is Not done ..");
        }
        System.out.println(this.getName() + " DID IT!" );
    }

    public abstract boolean tryToHack(Vault vault);
}
