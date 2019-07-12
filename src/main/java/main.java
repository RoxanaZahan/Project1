public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter pekka = new Counter(2);

        System.out.println(pekka.value());
        pekka.increase(1);
        System.out.println(pekka.value());
        pekka.decrease(5);
        System.out.println(pekka.value());
    }
}
