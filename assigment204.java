import java.util.Scanner;

public class assigment204 {

    static String[] fruitNames; // Nama-nama buah
    static int DAYS = 7; // Jumlah hari
    static int[][] salesData; // Data penjualan buah
    
    //input data penjualan buah
        public static void inputFruitSalesData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of fruit types: ");
            int numberOfFruits = sc.nextInt();
            
            fruitNames = new String[numberOfFruits];
            salesData = new int[numberOfFruits][DAYS]; 
            
            for (int i = 0; i < numberOfFruits; i++) {
                System.out.print("Enter fruit name " + (i + 1) + ": ");
                fruitNames[i] = sc.next();
                System.out.println("Enter sales " + fruitNames[i] + " for every day (1-7):");
                for (int j = 0; j < DAYS; j++) {
                    System.out.print("Day " + (j + 1) + ": ");
                    salesData[i][j] = sc.nextInt();
                }
            }
        }
        
        //menampilkan semua data penjualan buah
        public static void displayAllFruitData() {
            System.out.println("\nFruit sales data:");
            for (int i = 0; i < fruitNames.length; i++) {
                System.out.print(fruitNames[i] + ": ");
                for (int j : salesData[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        
        //menemukan hari dengan jumlah penjualan terbesar
        public static void findDayWithMaxSales() {
            int[] totalSalesPerDay = new int[DAYS];
            
            for (int i = 0; i < salesData.length; i++) {
                for (int j = 0; j < DAYS; j++) {
                    totalSalesPerDay[j] += salesData[i][j];
                }
            }
            
            int maxSalesDay = 0;
            for (int i = 1; i < DAYS; i++) {
                if (totalSalesPerDay[i] > totalSalesPerDay[maxSalesDay]) {
                    maxSalesDay = i;
                }
            }
            System.out.println("\nThe day with the largest number of sales is Day " + (maxSalesDay + 1) +
            " with the total " + totalSalesPerDay[maxSalesDay] + " fruit.");
        }
        
        //menampilkan buah terlaris setiap hari
        public static void displayBestSellingFruitPerDay() {
            System.out.println("\nbest-selling fruits per day: ");
            
            for (int i = 0; i < DAYS; i++) {
                String bestSellingFruit = null;
                int maxSales = 0;
                for (int j = 0; j < fruitNames.length; j++) {
                    int salesForToday = salesData[j][i];
                    if (salesForToday > maxSales) {
                        maxSales = salesForToday;
                        bestSellingFruit = fruitNames[j];
                    }
                }
                System.out.println("Day " + (i + 1) + ": " + bestSellingFruit + " with " + maxSales + " sold.");
            }
        }

     public static void main(String[] args) {
        inputFruitSalesData();
        displayAllFruitData();
        findDayWithMaxSales();
        displayBestSellingFruitPerDay();
    }


    //public class Assignment204 {

        // public static final int DAYS = 7; // Jumlah hari
        // public static String[] fruitNames; // Nama-nama buah
        // public static int[][] salesData; // Data penjualan buah
    
        // // Input data penjualan buah
        // public static void inputFruitSalesData() {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter number of fruit types: ");
        //     int numberOfFruits = sc.nextInt();
    
        //     fruitNames = new String[numberOfFruits];
        //     salesData = new int[numberOfFruits][DAYS];
    
        //     for (int i = 0; i < numberOfFruits; i++) {
        //         System.out.print("Enter fruit name " + (i + 1) + ": ");
        //         fruitNames[i] = sc.next();
        //         System.out.println("Enter sales " + fruitNames[i] + " for every day (1-7):");
        //         for (int j = 0; j < DAYS; j++) {
        //             System.out.print("Day " + (j + 1) + ": ");
        //             salesData[i][j] = sc.nextInt();
        //         }
        //     }
        // }
    
        // // Menampilkan semua data penjualan buah
        // public static void displayAllFruitData() {
        //     System.out.println("\nFruit sales data:");
        //     for (int i = 0; i < fruitNames.length; i++) {
        //         System.out.print(fruitNames[i] + ": ");
        //         for (int day : salesData[i]) {
        //             System.out.print(day + " ");
        //         }
        //         System.out.println();
        //     }
        // }
    
        // // Menemukan hari dengan jumlah penjualan terbesar
        // public static int findDayWithMaxSales() {
        //     int[] totalSalesPerDay = new int[DAYS];
    
        //     for (int i = 0; i < salesData.length; i++) {
        //         for (int day = 0; day < DAYS; day++) {
        //             totalSalesPerDay[day] += salesData[i][day];
        //         }
        //     }
    
        //     int maxSalesDay = 0;
        //     for (int day = 1; day < DAYS; day++) {
        //         if (totalSalesPerDay[day] > totalSalesPerDay[maxSalesDay]) {
        //             maxSalesDay = day;
        //         }
        //     }
    
        //     return maxSalesDay;
        // }
    
        // // Menampilkan buah terlaris setiap hari
        // public static String[] findBestSellingFruitPerDay() {
        //     String[] bestSellingFruits = new String[DAYS];
    
        //     for (int day = 0; day < DAYS; day++) {
        //         String bestSellingFruit = null;
        //         int maxSales = 0;
    
        //         for (int i = 0; i < fruitNames.length; i++) {
        //             int salesForToday = salesData[i][day];
    
        //             if (salesForToday > maxSales) {
        //                 maxSales = salesForToday;
        //                 bestSellingFruit = fruitNames[i];
        //             }
        //         }
    
        //         bestSellingFruits[day] = bestSellingFruit;
        //     }
    
        //     return bestSellingFruits;
        // }
    
        // // Fungsi tambahan untuk mendapatkan total penjualan pada hari tertentu
        // public static int getTotalSalesForDay(int day) {
        //     int totalSales = 0;
        //     for (int i = 0; i < salesData.length; i++) {
        //         totalSales += salesData[i][day];
        //     }
        //     return totalSales;
        // }

        // public static void main(String[] args) {
        //     inputFruitSalesData();
        //     displayAllFruitData();
            
        //     // Menggunakan hasil return untuk menampilkan hari dengan penjualan terbesar
        //     int maxSalesDay = findDayWithMaxSales();
        //     System.out.println("\nThe day with the largest number of sales is Day " + (maxSalesDay + 1) +
        //         " with the total sales of " + getTotalSalesForDay(maxSalesDay) + " fruit.");
            
        //     // Menggunakan hasil return untuk menampilkan buah terlaris setiap hari
        //     String[] bestSellingFruits = findBestSellingFruitPerDay();
        //     System.out.println("\nBest-selling fruits per day:");
        //     for (int day = 0; day < DAYS; day++) {
        //         System.out.println("Day " + (day + 1) + ": " + bestSellingFruits[day]);
        //     }
        // }
}