import java.util.Scanner;

public class CubeStudent04 {

    public static int calculateArea(int sisi) {
        int surfaceArea = 6 * sisi * sisi;
        return surfaceArea;
    }

    public static int calculateVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input length of the side of the cube:");
        int sisi = sc.nextInt();

        int surfaceArea = calculateArea(sisi);
        int volume = calculateVolume(sisi);

        System.out.print("Surface area of cube: " + surfaceArea);
        System.out.println("\nVolume of cube: " + volume);
    }
}
