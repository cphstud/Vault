public class TeamBornToSpawn extends Hacker
{
    Vault vault;

    public TeamBornToSpawn(Vault vault)
    {
        this.vault=vault;
    }

    @Override
    public void run()
    {
        System.out.println("called by " + this.getName());


        tryToHack(vault);

    }

    @Override
    public boolean tryToHack(Vault vault)
    {
        for (int i = 1; i <= 9999; i++) {

            if(vault.isCorrect(i))
            {
                System.out.println("Password is: " + i);
                return true;
            }
            else
            {
                System.out.println("Attempting Password: " + i);
                vault.isCorrect(i);
            }   
        }
        return false;
    }


    public static void main(String[] args) throws InterruptedException {
        Vault vault = new Vault(20);
        TeamBornToSpawn tbs = new TeamBornToSpawn(vault);
        // instantiate teamhackers, start and join
        System.out.println("Done starting");
        Thread t1 = new Thread(tbs);
        t1.start();
        t1.join();
        System.out.println(t1.getName() + " DID IT!" );


    }
}
