import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi {



    public static void main(String[] args) {
        int disks = noDisks();
        char tower1 = 'A';
        char tower2 = 'B';
        char tower3 = 'C';

        moveDisks(disks, tower1, tower2, tower3, "Tower 1", "Tower 2");


    }

    public static void moveDisks(int n, char startTower, char targetTower, char otherTower, String startName, String TargetName ){
        if (n==0) {
            return;
        }
        moveDisks(n-1, startTower, otherTower, targetTower, "Tower 1", "Tower 3");
        System.out.println("moving disk " + n + " from " + startName + " to " + TargetName  );
        moveDisks(n-1,  otherTower, targetTower, startTower, "Tower 3", "Tower 2");

    }

    public static int noDisks() {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of disks on first tower: ");
        String n = myScanner.nextLine();
        int nD = Integer.parseInt(n);
        return nD;
    }

    public static List<Integer> populate(int N) {
        List<Integer> tower = new ArrayList<>();
        for (int i=1; i<N+1; i++ ){
            tower.add(i);
        }
        return tower;
    }

}
