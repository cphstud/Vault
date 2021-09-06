public class Vault {
    private int password;
    private static final int MAX_PASSWORD = 9999;

    public Vault(int password) {
        this.password = password;
    }

    public int getMax() {
        return this.MAX_PASSWORD;
    }

    boolean isCorrect(int password) {
        boolean hit = false;
        // make a delay
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        if (this.password == password) {
            hit = true;
            return hit;
        }
        return hit;
    }
}
