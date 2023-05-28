Installation of openMPI
1. Download openmpi-4.1.4.tar.bz2 from http://www.open-mpi.org in a folder say LP5.
2. Goto the terminal (Command prompt)
3. update using
sudo apt-get update
sudo apt install gcc {if not already installed}
4. Goto the directory which contains the downloaded file
5. Extract the files using
tar -jxf openmpi-4.1.4.tar.bz2
6. The directory openmpi-4.1.4 is created
7. Configure, compile and install by executing the following commands
./configure --prefix=$HOME/opt/openmpi
make all
make install
8. Now openmpi folder is created in ‘opt‘ folder of Home directory.
9. Now the folder LP5 can be deleted (optional)
10. Update the PATH and LD_LIBRARY_PATH environment variable using
echo "export PATH=\$PATH:\$HOME/opt/openmpi/bin" >> $HOME/.bashrc
echo "export LD_LIBRARY_PATH=\$LD_LIBRARY_PATH:\$HOME/opt/openmpi/lib">>$HOME/.bashrc
11. Compile the program using
mpicc name of the program
12. Execute the program using
mpirun -np N ./a.out






QA

What is MPI?
    MPI, which stands for Message Passing Interface, is a tool that helps computers work together effectively when they need to solve big problems or handle complex tasks. It's like a language that allows different parts of a computer program to talk to each other and share information.
    It is useful for : 
    Parallel computation
    Message passing
    Collective operations
    Scalability
    Portability

Why do we provide rank to process in MPI?
    Providing ranks to processes is a way to identify and distinguish individual processes within a parallel program

MPI Operations
    Broadcast (MPI_Bcast): In a broadcast operation, one process sends a message to all other processes in a group. It is like a radio broadcast where one station transmits a message, and all receivers tune in to receive it. The broadcast operation allows a single process to share data with all other processes efficiently.
    .
    Reduce (MPI_Reduce): The reduce operation combines data from multiple processes into a single result. It performs an operation (such as sum, product, maximum, minimum, etc.) on a set of values from each process and produces a single value that represents the collective result. For example, in a summation reduce operation, all processes contribute their values, and the result is the sum of those values.
    .
    Scatter (MPI_Scatter): In a scatter operation, one process distributes data from a single source to all other processes in a group. It is like a teacher handing out assignments to students, where the teacher has the complete set of data, and each student receives a portion of that data. Each process receives a different part of the data, enabling parallel processing of distributed information.
    .
    Gather (MPI_Gather): The gather operation collects data from all processes in a group and gathers it into a single process. It is like students submitting their completed assignments to the teacher, who collects all the work together. Each process sends its portion of data, and the receiving process gathers all the data into a single collection, typically an array.
    .
    All-to-All (MPI_Alltoall): In an all-to-all operation, each process sends a message to all other processes in the group and receives a message from each process as well. It is like a conversation where every person speaks to and listens to every other person. This operation is useful when each process needs to exchange data with all other processes in a parallel program.
    .
    Barrier (MPI_Barrier): The barrier operation ensures that all processes reach a specific point in the program before proceeding further. It acts as a synchronization point, similar to a checkpoint or a finish line. The barrier operation halts the execution of processes until all processes have reached the barrier, at which point they can continue executing.
    .
    Abort (MPI_ABORT) is a function in the MPI (Message Passing Interface) library that aborts the execution of all processes in a parallel program. It is a collective operation, meaning it must be called by all processes in the program.
    .
    Finalize (MPI_FINALIZE) is used to finalize and clean up MPI-related resources at the end of an MPI program. It must be called by all processes in a parallel program after they have finished using MPI functionalities.
    It performs (a)Termination (b)Resource Deallocation (c)Clean shutdown
