import java.util.Scanner;

public class StudentScore04 {

//     static String[] studentName;
//     static int week = 7;
//     static int[][] dataScore;

//     public static void inputStudentsGradeData() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input student grade data: ");
//         int studentGradeData = sc.nextInt();

//         studentName = new String[studentGradeData];
//         dataScore = new int[studentGradeData][week];

//         for (int i = 0; i < studentGradeData; i++) {
//             System.out.print("Input student name "+ ( i +1)+ ": ");
//             studentName[i] = sc.next();
//             System.out.println("Enter value "+ studentName.length+" for the week (1-7): ");
//             for (int j = 0; j < week; j++) {
//                 System.out.print("Week "+ (j + 1) + ": ");
//                 dataScore[i][j] = sc.nextInt();
//             }
//         }   
//     }


//     public static void studentScoreDataDisplay() {
//         System.out.println("\nStudent data value: ");
//         for (int i = 0; i < studentName.length; i++) {
//             System.out.print(studentName[i] + ": ");
//             for (int j : dataScore[i]) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void findHighestGradeOfallStudents () {
//         int[] totalDataValuePerWeek = new int[week];

//         for (int i = 0; i < dataScore.length; i ++) {
//             for (int j = 0; j < week; j++) {
//                 totalDataValuePerWeek[j] += dataScore[i][j];
//             }
//         }

//         int highValueWeek = 0;
//         for (int i = 0; i < week; i++) {
//             if (totalDataValuePerWeek[i]> totalDataValuePerWeek[highValueWeek]) {
//                 highValueWeek = i;
//             }
//         }
//         System.out.println("\nThe week with the highest grade of score is week " + (highValueWeek + 1) +
//         " with the total " + totalDataValuePerWeek[highValueWeek] + " score.");
//     }

//     public static void displayOfStudentsWithTheHighestScoresInEachWeek () {
//         System.out.print("\nhighest score in each week: ");

//         for (int i = 0; i <week; i++) {
//             String highestScore = null;
//             int totalScore = 0;
//             for (int j = 0; j < studentName.length; j++) {
//                 int scoreForWeek = dataScore[j][i];
//                 if (scoreForWeek > totalScore) {
//                     totalScore = scoreForWeek;
//                     highestScore = studentName[j];
//                 }
//             }
//             System.out.println("Week "+ (i + 1) + ": " + highestScore + " with " + totalScore + " score.");
//         }
//     }

//     public static void main(String[] args) {
//         inputStudentsGradeData();
//         studentScoreDataDisplay();
//         findHighestGradeOfallStudents();
//         displayOfStudentsWithTheHighestScoresInEachWeek();
//     }
// }




    // UBAH

    static String[] studentName;
    static int week;
    static int[][] dataScore;

    public static void inputStudentsGradeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student grade data: ");
        int studentGradeData = sc.nextInt();
        System.out.print("Input the number of week: ");
        week = sc.nextInt();

        studentName = new String[studentGradeData];
        dataScore = new int[studentGradeData][week];

        for (int i = 0; i < studentGradeData; i++) {
            System.out.print("Input student name "+ ( i +1)+ ": ");
            studentName[i] = sc.next();
            System.out.println("Enter value "+ studentName.length+" for the week (1-7): ");
            for (int j = 0; j < week; j++) {
                System.out.print("Week "+ (j + 1) + ": ");
                dataScore[i][j] = sc.nextInt();
            }
        }   
    }


    public static void studentScoreDataDisplay() {
        System.out.println("\nStudent data value: ");
        for (int i = 0; i < studentName.length; i++) {
            System.out.print(studentName[i] + ": ");
            for (int j : dataScore[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void findHighestGradeOfallStudents () {
        int[] totalDataValuePerWeek = new int[week];

        for (int i = 0; i < dataScore.length; i ++) {
            for (int j = 0; j < week; j++) {
                totalDataValuePerWeek[j] += dataScore[i][j];
            }
        }

        int highValueWeek = 0;
        for (int i = 0; i < week; i++) {
            if (totalDataValuePerWeek[i]> totalDataValuePerWeek[highValueWeek]) {
                highValueWeek = i;
            }
        }
        System.out.println("\nThe week with the highest grade of score is week " + (highValueWeek + 1) +
        " with the total " + totalDataValuePerWeek[highValueWeek] + " score.");
    }

    public static void displayOfStudentsWithTheHighestScoresInEachWeek () {
        System.out.println("\nhighest score in each week: ");

        for (int i = 0; i <week; i++) {
            String highestScore = null;
            int totalScore = 0;
            for (int j = 0; j < studentName.length; j++) {
                int scoreForWeek = dataScore[j][i];
                if (scoreForWeek > totalScore) {
                    totalScore = scoreForWeek;
                    highestScore = studentName[j];
                }
            }
            System.out.println("Week "+ (i + 1) + ": " + highestScore + " with " + totalScore + " score.");
        }
    }

    public static void main(String[] args) {
        inputStudentsGradeData();
        studentScoreDataDisplay();
        findHighestGradeOfallStudents();
        displayOfStudentsWithTheHighestScoresInEachWeek();
    }
}