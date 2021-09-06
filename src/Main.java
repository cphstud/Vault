public class Main {

    public static void main(String[] args) {
        Vault vault = new Vault(20);
        Hacker hacker = new Hacker(vault);
        hacker.start();
        System.out.println("Done main");
    }
}
