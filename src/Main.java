public class Main {

    public static void main(String[] args) {
        Vault vault = new Vault(20);
        // instantiate teamhackers, start and join

        TeamD team = new TeamD(vault);
        team.run();

        System.out.println("Done starting");
    }
}
