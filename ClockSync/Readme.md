Open 2 terminals 

In terminal 1 :  
     g++ -o Server Server.cpp
     ./Server 

In terminal 2 :    
     g++ -o Client Client.cpp
     ./Client

HAVE FUN...


QA 

Why it is necessary to sync clocks? 
     Coordination
     Event Ordering
     Timestamping and Logging
     Time-sensitive Applications


Working of Berkeleys Algorithm
     (1) Node Selection: One node in the system is designated as the time server or time coordinator. This node is responsible for initiating and coordinating the clock synchronization process.
     (2) Time Request: The time server periodically sends a time request message to all other nodes in the system. This message contains the server's current timestamp.
     (3) Clock Adjustment: Upon receiving the time request, each participating node adjusts its local clock based on the timestamp received from the time server. The adjustment is calculated by comparing the received timestamp with the node's current local time.
     (4) Time Response: After adjusting their clocks, the participating nodes respond to the time server with their updated local time.
     (5) Time Calculation: The time server receives the time responses from the participating nodes. It calculates the average or median of the received timestamps, representing an estimate of the most accurate time among the nodes.
     (6) Time Distribution: The time server then broadcasts the calculated time value to all participating nodes, including its own updated time. Each node adjusts its clock once again based on the received time value, aligning its local clock with the estimated accurate time.
     (7) Iterative Process: The clock synchronization process typically involves multiple iterations. The time server periodically initiates synchronization rounds to ensure ongoing accuracy as clocks may drift or experience variations over time.


What are other algorithms for time synchromisation in DS?
     (1) Network Time Protocol (NTP)
     (2) Precision Time Protocol (PTP)
     (3) Cristian's Algorithm
     (4) Marzullo's Algorithm
     (5) Reference Broadcast Synchronization (RBS)

Logical clocks VS physical clocks
     A logical clock is an abstract concept that measures the ordering of events in a distributed system without relying on physical time.
     A physical clock represents the actual time and measures the passage of time in the physical world.
     Logical clocks are used for event ordering and maintaining causality, while physical clocks provide real-time measurements and are synchronized for coordination and time-based operations in distributed systems.
