import java.util.Scanner;

public class StudentGrades {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        
        int[] marks = new int[n];
        
        System.out.println("Enter the marks obtained in each subject (out of 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double Percentage = (double) total / n;
        
        char grade;
        if (Percentage >= 90) {
            grade = 'A';
        } else if (Percentage >= 80) {
            grade = 'B';
        } else if (Percentage >= 70) {
            grade = 'C';
        } else if (Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%",Percentage);
        System.out.println("\nGrade: " + grade);
        
        scanner.close();
    }
}
