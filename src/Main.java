public class Main {
    public static void main(String[] args) {
        double random = Math.random() * 1000;
        String result = String.format("%.2f", random);
        System.out.println(result);
    }
}