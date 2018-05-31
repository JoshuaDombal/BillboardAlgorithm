// Assignment 3
// Josh Dombal
//

import java.util.*;
import java.io.*;


public class BillboardAlg {


    public static void main(String[] args) throws FileNotFoundException{

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String file = reader.next();
        File inFile = new File(file);
        reader.close();


        Scanner scan = new Scanner(inFile);
        //ArrayList<Integer> revenues = new ArrayList<Integer>();


        String[] intLine = scan.nextLine().split("\\s+");
        int minInterval = Integer.parseInt(intLine[0]);
        int maxInterval = Integer.parseInt(intLine[1]);

        // Gets location distances from second line of input
        String[] nextLine = scan.nextLine().split("\\s+");
        int[] locations = new int[nextLine.length];
        int i = 0;
        for (String c : nextLine) {
            locations[i] = Integer.parseInt(c);
            System.out.print(c);
            i++;
        }

        System.out.println();
        // Gets revenues from third line of input
        String[] nextLine2 = scan.nextLine().split("\\s+");
        int[] revenues = new int[nextLine2.length];

        int j = 0;
        for (String c : nextLine2) {
            locations[j] = Integer.parseInt(c);
            System.out.print(c);
            j++;
        }
        //System.out.println(ni);


        max(locations, revenue, minInterval);











    }

    public static int max(int[] distance, int[] revenues, int minInterval) {

        int nextBoard = 0;
        int[] MR = new int[distance.length+1];

        for (int i = 0; i < distance.length; i++) {

            if (nextBoard < distance.length) {
                if (distance[i] >= minInterval) {
                    MR[i] = 
                }
            }


        }






































    }
}
