Generate Java Stub Files:
Use the idlj command-line tool provided by the Java Development Kit (JDK) to generate the Java stub files from the IDL interface.

"idlj -fall Calculator.idl"

javac *.java

Then 

Open 2 terminals : 

Terminal 1 : java Server
Terminal 2 : java Client


All about CORBA : 
CORBA (Common Object Request Broker Architecture) is a middleware technology that enables communication and interoperability between distributed objects in a distributed system. It provides a platform-independent, language-neutral framework for creating and accessing distributed objects across different programming languages and hardware platforms.

In a distributed system, CORBA acts as a middleware layer that allows objects to communicate and invoke methods on remote objects located on different machines. It defines a standard protocol for communication and a set of interfaces and services that facilitate the interaction between objects.

The key components of CORBA include:

Object Request Broker (ORB): The ORB is responsible for managing the communication between distributed objects. It handles the request and response messages, marshaling and unmarshaling of parameters, and locating the appropriate object to handle a request.

Interface Definition Language (IDL): CORBA uses IDL to define the interface of objects in a language-neutral way. IDL describes the methods, attributes, and exceptions that an object supports, and it serves as a contract between the client and the server.

Object Adapter: The Object Adapter is responsible for managing the lifecycle of objects and exposing them to clients. It acts as an intermediary between the ORB and the actual object implementation, handling object instantiation, method invocation, and object destruction.

Services: CORBA provides various services to support common distributed system functionalities, such as naming, event notification, security, and transaction management. These services can be accessed by objects through well-defined interfaces.

CORBA supports a wide range of programming languages, including Java, C++, Python, and others. It allows objects implemented in different languages to interact seamlessly, as long as they conform to the IDL interface specifications.

Overall, CORBA simplifies the development of distributed systems by providing a standardized and interoperable framework for object communication, allowing developers to focus on the business logic of their applications rather than low-level networking details.




