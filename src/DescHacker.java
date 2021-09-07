public class DescHacker extends Hacker {

    public DescHacker(Vault vault) {
        super(vault);
        this.setName("Desc-hacker");
    }

    @Override
    public boolean tryToHack(Vault vault) {
        int counter = vault.getMax();
        while(counter >= 0 && !vault.isCorrect(counter)) {
            System.out.println(this.getName() + " trying " + counter);
            counter--;
        }
        return false;
    }

    @Override
    public void run() {
        super.run();
    }
}
