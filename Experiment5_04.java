public class Experiment5_04 {
    static void show (String str, int... a) {
        System.out.println("String: "+str);
        System.out.println("Number of arguments/parameters: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show("Programming Fundaentals 2023", 100, 200);
        show("Information Tehcnology", 1, 2, 3, 4, 5);
        show("Informatics");
    }

    //example for num 3
    public static void printData(Object... data) {
        for (Object datum : data) {
            System.out.println(datum);
        }
    }
}
