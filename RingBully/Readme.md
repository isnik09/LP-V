Compile using 
    javac Bully.java
    javac Ring.java
Run using 
    java Bully
    java Ring


QA 

Why to use election algorithms?
    Election algorithms are used in distributed systems to select a leader or coordinator among a group of nodes. The primary need for an election algorithm is to ensure the selection of a single node as the leader in a decentralized manner, even in the presence of failures or network partitions.

Who is process coordinator? What are its responsibilities?
    A process coordinator is responsible for managing and coordinating the activities of multiple processes or nodes in a distributed system. Its main responsibilities include task allocation, resource management, communication and synchronization, error handling and fault tolerance, monitoring and performance optimization, load balancing, and decision-making and coordination.


What is centralised and decentralised algorithms? 
    Centralized algorithm: An algorithm where a single entity or node controls and makes decisions for the entire system.
    Decentralized algorithm: An algorithm where multiple entities or nodes work together, distributing decision-making and control across the system.


Working of RING algo. 
    In the Ring algorithm for election, the nodes in a distributed system are organized in a ring topology. The algorithm works as follows:
    (1) Each node in the ring starts in an idle state.
    (2) When a node wants to initiate an election, it sends a special message called an "election message" along the ring to its neighboring nodes.
    (3) Upon receiving an election message, each node compares the ID of the sender with its own ID. If the sender's ID is greater, the node forwards the election message to its next neighbor. If the sender's ID is smaller, the node discards the message and remains in the idle state.
    (4) The election message continues to circulate around the ring, always moving in the direction of increasing node IDs.
    (5) Eventually, the election message reaches the node with the highest ID in the ring. This node realizes that it is the only node that has received the election message and, therefore, it has the highest ID in the system.
    (6) The node with the highest ID becomes the leader and sends a "leader message" around the ring to notify all other nodes of its status. 
    (7) Upon receiving the leader message, each node updates its own internal state to acknowledge the new leader.
    (8) The election process is complete, and the system is now ready to perform its intended tasks with the newly elected leader in control.

Working of BULLY algo. 
    In the Bully algorithm for election, the nodes in a distributed system have unique IDs, and the algorithm works as follows:
    (1) When a node detects that the leader is unavailable or has failed, it initiates an election by sending an election message to all nodes with higher IDs than itself.
    (2) If a node receives an election message, it responds by sending an "OK" message back to the sender.
    (3) If a node does not receive any response within a specified time, it assumes that it has the highest ID among the live nodes and proceeds to become the leader.
    (4) The newly elected leader sends a coordinator message to all other nodes, informing them of its status.
    (5) Upon receiving the coordinator message, each node acknowledges the new leader and updates its internal state accordingly.
    (6) The election process is complete, and the system is now ready to operate with the newly elected leader in control.

Why it is called Bully?
    The Bully algorithm is named so because it follows a strategy where the nodes with higher IDs assert their dominance over nodes with lower IDs during the election process. The term "bully" reflects the behavior of the nodes with higher IDs taking a more assertive role in the election, akin to a dominant or aggressive entity overpowering the others.

What is Token?
    A token is a special message or marker that is passed among nodes to enable controlled access or coordination. The token serves as a permission or authority for a node to perform a specific action, access a shared resource, or execute a critical section of code.



