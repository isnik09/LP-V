Compile using 
    g++ -o output RingToken.cpp
Run using 
    ./output


QA

What is Mutual Exclusion? 
    Mutual exclusion is a concept in computer science and concurrent programming that ensures that only one process or thread can access a shared resource or a critical section of code at any given time. It is used to prevent multiple processes or threads from concurrently modifying shared data in an inconsistent or incorrect manner.

What is RACE condition?
    A race condition is a software behavior that occurs when the correctness of a program's outcome depends on the relative timing or interleaving of concurrent operations. It arises when multiple processes or threads access shared resources or perform operations in an unsynchronized or non-atomic manner.
    In a race condition, the final result of the program becomes unpredictable or incorrect because the timing of events can vary each time the program is executed. This can lead to data corruption, inconsistent states, and unexpected behavior.

What is Deadlock?
    Deadlock: Deadlock is a situation where two or more processes or threads are unable to proceed because each is waiting for a resource that another process holds, resulting in a circular dependency. In other words, it's a state where processes are indefinitely blocked, waiting for each other to release resources they hold. As a result, none of the processes can move forward, and the system becomes stuck.

What is Starvation?
    Starvation: Starvation refers to a situation where a process is continuously denied necessary resources or unable to make progress, even though it is not in a deadlock state. It occurs when a low-priority process or thread is constantly preempted or bypassed by higher-priority processes, preventing it from executing and completing its tasks.

How to prevent mutual exclusion using Ring Token Algo.
    (1) Establish a logical ring: The participating processes are organized in a logical ring structure. Each process is connected to its neighboring processes in a specific order, forming a closed ring.
    (2) Token initialization: Initially, a single token is created and assigned to a specific process in the ring. This process is responsible for initiating the token circulation.
    (3) Token passing: The token circulates sequentially among the processes in the ring. Only the process holding the token has the right to access the shared resource.
    (4) Requesting access: When a process wants to access the shared resource, it must wait until it receives the token.
    (5) Token-based access: Once a process holds the token, it can access the shared resource exclusively. It performs its critical section operations and releases the token afterward.
    (6) Token circulation: After a process completes its critical section and releases the token, it passes the token to the next process in the logical ring, allowing the next process to access the shared resource. 
    By following these steps, the Ring token algorithm ensures that only the process holding the token can access the shared resource at any given time. Other processes have to wait in a sequential manner until the token reaches them.



