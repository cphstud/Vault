public class Main {

    public static void main(String[] args) {
        Vault vault = new Vault(20);
        //Hacker hacker = new Hacker(vault);
        //hacker.start();
        AscHacker ascHacker = new AscHacker(vault);
        DescHacker descHacker = new DescHacker(vault);
        ascHacker.start();
        descHacker.start();
        System.out.println("Done starting");
    }
}
