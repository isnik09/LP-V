Open 2 terminals 
In first terminal 
    javac Server.java
    java ./Server
In Second terminal 
    javac Client.java
    java ./Client

What is Interprocess communication 
    IPC refers to the mechanisms and techniques used for communication between different processes running on different machines within a distributed system. It enables processes to exchange data, coordinate activities, and synchronize their execution across multiple nodes in a distributed environment.
    IPC Mechanisms : Message Passing, Remote Procedure Call (RPC), Publish-Subscribe, Data Streams etc.

What is a Socket? 
    A socket refers to a software interface that allows processes to communicate with each other over a network.
    Sockets can be classified into two main types: Stream sockets (TCP) and Datagram sockets (UDP). Stream sockets provide reliable, connection-oriented communication where data is delivered in a sequential and error-free manner. Datagram sockets, on the other hand, provide connectionless communication where data is divided into smaller units called datagrams and sent independently.

TCP vs UDP
    Connection-Oriented vs. Connectionless:
    TCP: TCP is connection-oriented. It establishes a reliable connection between the sender and receiver before data transfer. It ensures that data is delivered in the same order as sent.
    UDP: UDP is connectionless. It does not establish a prior connection and simply sends data packets (datagrams) to the recipient without checking if it is available or ready. UDP does not guarantee order preservation.
    .
    .
    .
    Reliability:
    TCP: TCP provides reliable communication. It guarantees that data is delivered without errors and in the correct order. It uses acknowledgment mechanisms and retransmissions to ensure reliable data transfer.
    UDP: UDP is unreliable. It does not provide acknowledgment or retransmission mechanisms, so there is no guarantee of data delivery. Some packets may be lost, duplicated, or arrive out of order.
    .
    .
    .
    Error Checking:
    TCP: TCP performs error checking by using checksums to detect any errors in the received data. If an error is detected, TCP requests retransmission of the corrupted data.
    UDP: UDP does not have built-in error checking. It does not detect or correct errors in the received data. If data integrity is critical, the application layer needs to handle error detection and recovery.
    .
    .
    .
    Flow Control and Congestion Control:
    TCP: TCP includes flow control and congestion control mechanisms. Flow control regulates the rate of data transmission to avoid overwhelming the receiver. Congestion control prevents network congestion by adjusting the data transmission rate based on network conditions.
    UDP: UDP does not have flow control or congestion control mechanisms. It sends data packets at the maximum possible rate, which can potentially lead to network congestion if not managed at the application level.
    .
    .
    .
    Overhead:
    TCP: TCP has higher overhead compared to UDP. It adds additional control information and performs more error checking, which increases the overall data size and processing requirements.
    UDP: UDP has lower overhead compared to TCP. It includes minimal control information, resulting in smaller packet sizes and lower processing requirements.
    .
    .
    .
    Applications:
    TCP: TCP is commonly used for applications that require reliable and ordered data transmission. Examples include web browsing, file transfer (FTP), email (SMTP), remote login (SSH), and many other applications that prioritize data integrity.
    UDP: UDP is suitable for applications that can tolerate some data loss or prioritize speed over reliability. It is commonly used in real-time streaming, video conferencing, online gaming, VoIP (Voice over IP), DNS (Domain Name System), DHCP (Dynamic Host Configuration Protocol), and other applications where low latency is essential.



What is shared memory programming?
    Shared memory programming refers to a programming paradigm that allows multiple processes or threads to access and manipulate a common region of memory, known as shared memory. It enables efficient and fast communication and data sharing between these processes or threads, as they can directly read from and write to the shared memory region. 
    Pros : Communication and Data Sharing, Efficiency, Synchronization, Parallel Processing

