
// Add 20 numbers in an array using 4 cores

#include <stdio.h>
#include "mpi.h"
int main(int argc, char *argv[])
{
    int rank, size, len;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    printf("Hello, world, I am %d of %d\n", rank, size);
    MPI_Finalize();
    return 0;
}


// Compile using mpicc HelloWorld.c 

// Run using mpirun -np 4 ./a.out