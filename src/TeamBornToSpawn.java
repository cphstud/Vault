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
        super.run();
    }

    @Override
    public boolean tryToHack(Vault vault)
    {
        
        return false;
    }
}
