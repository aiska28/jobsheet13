public class assigment104 {

    public static void main(String[] args) {
        System.out.println(printNumbers(0));
    }
     static int printNumbers (int evenNumber) {
        int i;
       for (i = 1; i < 100; i++) {
        if (i % 2 == 0) {
            System.out.print(i+ " ");
        }
    }
    return i;
}
}