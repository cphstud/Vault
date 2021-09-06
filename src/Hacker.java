import java.time.temporal.ValueRange;

public class Hacker extends Thread {
    Vault vault;

    public Hacker(Vault vault) {
        this.vault = vault;
    }

    @Override
    public void run() {
        while(!tryToHack(vault)) {
            System.out.println("Not done ..");
        }
    }


    public boolean tryToHack(Vault vault)  {
        int counter=0;
        boolean retVal = false;
        while (counter < vault.getMax() && retVal == false) {
            counter++;
            retVal = vault.isCorrect(counter);
            System.out.println("Try " + counter + " gave " + retVal);
        }
        System.out.println("HIT");

        return retVal;
    }
}
