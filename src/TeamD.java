public class TeamD extends Hacker{

//    Vault vault;
    int iter = 0;

    public TeamD(Vault vault) {
        super.vault = vault;
        System.out.println("Created team d");
    }



    @Override
    public void run() {
        System.out.println("here");
        super.run();
    }

    @Override
    public boolean tryToHack(Vault vault) {
//        System.out.println(super.vault.getMax());
        if (vault.isCorrect(iter)) {
            return true;
        }
        iter++;

        return false;
    }
}
