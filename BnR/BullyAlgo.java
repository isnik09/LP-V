package BnR;

import java.util.ArrayList;
import java.util.List;

class Process {
    private int id;
    private boolean isCoordinator;

    public Process(int id) {
        this.id = id;
        this.isCoordinator = false;
    }

    public int getId() {
        return id;
    }

    public boolean isCoordinator() {
        return isCoordinator;
    }

    public void setCoordinator(boolean coordinator) {
        isCoordinator = coordinator;
    }

    public void startElection(List<Process> processes) {
        for (Process p : processes) {
            if (p.getId() > this.id) {
                System.out.println("Process " + this.id + " sends Election message to Process " + p.getId());
                p.respondToElection();
            }
        }
        setCoordinator(true);
        System.out.println("Process " + this.id + " declares itself as the new leader.");
        informCoordinator(processes);
    }

    public void respondToElection() {
        System.out.println("Process " + this.id + " sends OK message back.");
    }

    public void informCoordinator(List<Process> processes) {
        for (Process p : processes) {
            if (p != this) {
                p.setCoordinator(false);
                System.out.println("Process " + this.id + " sends Coordinator message to Process " + p.getId());
            }
        }
    }
}

public class BullyAlgo {
    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1));
        processes.add(new Process(2));
        processes.add(new Process(3));
        processes.add(new Process(4));
        processes.add(new Process(5));

        // Assume process 1 detects the leader failure and starts the election
        processes.get(0).startElection(processes);

        // Check the new leader
        for (Process p : processes) {
            if (p.isCoordinator()) {
                System.out.println("Process " + p.getId() + " is the new leader.");
                break;
            }
        }
    }
}
