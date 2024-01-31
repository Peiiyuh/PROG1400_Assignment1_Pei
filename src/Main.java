import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fantasy Hokey Application");
        System.out.println("Team Entry:");
        System.out.println("==========================");

        Scanner teamOne = new Scanner(System.in);  // Create team1 name
        System.out.println("Enter name for team # 1:");

        String teamOneName = teamOne.nextLine();  // Read user input
        System.out.println(teamOneName);  // Output user input

    }
}
