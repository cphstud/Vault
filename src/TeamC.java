public class TeamC extends Hacker {

    Vault vault;

    public TeamC(Vault vault) {
        this.vault = vault;
    }


    @Override
    public void run() {
        super.run();
    }

    @Override
    public boolean tryToHack(Vault vault) {

        int j = vault.getMax();
        int k = vault.getMax()/2;
        int l = vault.getMax()/2;
        for (int i = 0; i < vault.getMax(); i++) {
            if(vault.isCorrect(i) || vault.isCorrect(j) || vault.isCorrect(k) || vault.isCorrect(l)) {
                return true;
            }
            j--;
            k--;
            l++;
        }


        return false;
    }
}
