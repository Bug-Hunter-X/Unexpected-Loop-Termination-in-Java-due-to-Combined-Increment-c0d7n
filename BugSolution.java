public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; // Increment in a single, clear location
            if (i == 5) {
                break; // Exit loop at i=5
            }
        }
        System.out.println("Loop finished");
    }
}