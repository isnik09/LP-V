package BnR;
import java.io.*;
import java.util.Scanner;

// create class BullyAlgoExample to understand how bully algorithms works  
class BullyAlgo{

    static int numberOfProcess;
    static int priorities[] = new int[100];
    static int status[] = new int[100];
    static int cord;

    public static void main(String args[])
            throws IOException {
        // get input from the user for the number of processes
        System.out.println("Enter total number of processes:");

        // create scanner class object to get input from user
        Scanner sc = new Scanner(System.in);
        numberOfProcess = sc.nextInt();

        int i;

        // use for loop to set priority and status of each process
        for (i = 0; i < numberOfProcess; i++) {
            System.out.println("Status for process " + (i + 1) + ":");
            status[i] = sc.nextInt();
            System.out.println("Priority of process " + (i + 1) + ":");
            priorities[i] = sc.nextInt();
        }

        System.out.println("Enter proces which will initiate election");
        int ele = sc.nextInt();

        sc.close();

        // call electProcess() method
        electProcess(ele);
        System.out.println("After electing process the final coordinator is " + cord);
    }

    // create electProcess() method
    static void electProcess(int ele) {
        ele = ele - 1;
        cord = ele + 1;

        for (int i = 0; i < numberOfProcess; i++) {
            if (priorities[ele] < priorities[i]) {
                System.out.println("Election message is sent from " + (ele + 1) + " to " + (i + 1));
                if (status[i] == 1)
                    electProcess(i + 1);
            }
        }
    }
}