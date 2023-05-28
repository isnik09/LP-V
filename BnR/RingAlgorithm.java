package BnR;

import java.util.ArrayList;
import java.util.List;

class Process {
    private int id;
    private boolean isCoordinator;
    private Process nextProcess;

    public Process(int id) {
        this.id = id;
        this.isCoordinator = false;
        this.nextProcess = null;
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

    public void setNextProcess(Process nextProcess) {
        this.nextProcess = nextProcess;
    }

    public void startElection() {
        System.out.println("Process " + this.id + " initiates the election.");
        if (nextProcess != null) {
            nextProcess.processElection(id);
        }
    }

    public void processElection(int initiatorId) {
        if (id > initiatorId) {
            System.out.println("Process " + this.id + " forwards Election message to next process.");
            nextProcess.processElection(initiatorId);
        } else if (id < initiatorId && !isCoordinator) {
            System.out.println("Process " + this.id + " discards Election message.");
        } else {
            setCoordinator(true);
            System.out.println("Process " + this.id + " declares itself as the new leader.");
            informCoordinator();
        }
    }

    public void informCoordinator() {
        if (nextProcess != null && !nextProcess.isCoordinator()) {
            System.out.println("Process " + this.id + " sends Coordinator message to next process.");
            nextProcess.setCoordinator(true);
            nextProcess.informCoordinator();
        }
    }
}

public class RingAlgorithm {
    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1));
        processes.add(new Process(2));
        processes.add(new Process(3));
        processes.add(new Process(4));
        processes.add(new Process(5));

        // Set up the ring structure
        for (int i = 0; i < processes.size(); i++) {
            Process currentProcess = processes.get(i);
            Process nextProcess = processes.get((i + 1) % processes.size());
            currentProcess.setNextProcess(nextProcess);
        }

        // Assume process 1 detects the leader failure and starts the election
        processes.get(0).startElection();

        // Check the new leader
        for (Process p : processes) {
            if (p.isCoordinator()) {
                System.out.println("Process " + p.getId() + " is the new leader.");
                break;
            }
        }
    }
}
