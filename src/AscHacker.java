public class AscHacker extends Hacker {
    public AscHacker(Vault vault) {
        super(vault);
        this.setName("Asc-hacker");
    }

    @Override
    public void run() {
        System.out.println("Calling run ..");
        super.run();
    }

    @Override
    public boolean tryToHack(Vault vault) {
        int counter=0;
        while(counter < vault.getMax() && !vault.isCorrect(counter)) {
            System.out.println(this.getName() + " trying " + counter);
            counter++;
        }
        System.out.println(this.getName() + " gættede!!! " + counter);
        return true;
    }
}
