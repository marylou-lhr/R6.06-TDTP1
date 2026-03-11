public class BasicClass {

    public BasicClass() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
        new BasicClass().add(1,2);

        System.out.println("Hello world");
    }
}