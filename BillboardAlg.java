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
        ArrayList<Integer> revenues = new ArrayList<Integer>();

        int minInterval = 0;
        int maxInterval = 0;
        int count = 0;

        while (scan.hasNextInt()) {
            if (count == 0) {
                minInterval = scan.nextInt();
                count++;
            } else if (count == 1) {
                maxInterval = scan.nextInt();
                count++;
            } else {
                int ni = scan.nextInt();
                revenues.add(ni);
                //System.out.println(ni);
            }
        }
    }

    public static int max(int min, int max, ArrayList<Integer> revs) {


        return max()


    }
}
