import java.time.temporal.ValueRange;

public abstract class Hacker extends Thread {
    Vault vault;
    String name;

    public Hacker()
    {

    }

    @Override
    public void run() {
        System.out.println("called by " + this.getName());

        while(!tryToHack(vault)) {
            System.out.println(this.getName() + " is Not done ..");
        }
        System.out.println(this.getName() + " DID IT!" );
    }

    public abstract boolean tryToHack(Vault vault);
}
