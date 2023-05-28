
Generate Java Stub Files:
Use the idlj command-line tool provided by the Java Development Kit (JDK) to generate the Java stub files from the IDL interface.

"idlj -fall Calculator.idl"

javac *.java

Then 

Open 2 terminals : 

Terminal 1 : java Server
Terminal 2 : java Client


QA 

What is Middleware? 
    Middleware refers to the software layer that sits between the operating system and applications or services in a distributed computing environment. It acts as a bridge or intermediary that enables communication and interaction between different software components, systems, or devices

What is CORBA? 
    CORBA acts as a middleware layer that allows objects to communicate and invoke methods on remote objects located on different machines. It defines a standard protocol for communication and a set of interfaces and services that facilitate the interaction between objects.

What is ORB?
    ORB = Object Request Broker
    The main purpose of an ORB is to enable objects implemented in different programming languages and running on different platforms to communicate and invoke methods on each other seamlessly. It provides a transparent mechanism for remote method invocation (RMI) and object distribution.

What is IDL?
    IDL (Interface Definition Language) is a language-neutral specification language used in middleware technologies like CORBA (Common Object Request Broker Architecture) to define the interfaces of distributed objects
    IDL interface serves as a contract that describes the methods, attributes, and exceptions that an object supports, enabling interoperability between objects implemented in different programming languages.


What is ORB daemon?
    The ORB daemon is responsible for managing the runtime environment and providing the necessary services for the ORB to function within a distributed system.


What are the different types of Middleware? 
    Message-Oriented Middleware (MOM)
    Remote Procedure Call (RPC) Middleware
    Web Services Middlewar
    Enterprise Service Bus (ESB)
    Database Middleware
    Object Request Broker (ORB)
    Transaction Middleware

Uses of Middleware
    Integration
    Interoperability
    Communication and Messaging
    Service-Oriented Architecture (SOA)
    Scalability and Load Balancing
    Security and Authentication
    Data Transformation and Integration
    Transaction Management
    Caching and Performance Optimization
    Monitoring and Management


Applications of CORBA
    Telecommunications systems
    Financial services
    Healthcare information systems
    Manufacturing and industrial automation
    Defense and aerospace systems
    Supply chain management
    Grid and cloud computing
    Enterprise application integration
    Internet of Things (IoT) platforms
    Distributed control systems.
