import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fantasy Hokey Application");
        System.out.println("Team Entry");
        System.out.println("==========================");


        for (int i =1; i <=3; i++ )
        {
            Scanner teamOne = new Scanner(System.in);  // Create team1 name
            System.out.println("Enter name for team # " + i + ": ");
            String teamOneName = teamOne.nextLine();  // Read user input

            if (teamOneName.length() < 3)
            {
                i--;  // make it back to i-1, will run in same loop again
            }
            else
            {
                System.out.println(teamOneName);  // Output user input
            }
        }

    } // public static void main

} //public class Main
