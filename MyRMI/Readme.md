compile RemoteInterface by "javac  RemoteInterface.java"
compile RemoteImplementation by "javac RemoteImplementation.java -cp . RemoteInterface.java"
compile Server by "javac Server.java -cp . RemoteImplementation.java RemoteInterface.java"
compile Client by "javac Client.java -cp . RemoteImplementation.java RemoteInterface.java"

open 2 terminals
terminal 1 : java Server
terminal 2 : java Client





QA 
What is RMI and how it works.
    RMI (Remote Method Invocation) is a way for the client program to call and use the functions of the server program, even though they are running on different computers. It allows the client to treat the server's functions as if they were its own.
    Working : 
    1. Define a set of functions in an interface that both the client and server understand. This interface specifies what functions the client can call on the server.
    2. Implement the interface on the server side. This means writing the code for the actual functions and how they should behave.
    3. Start a special program called the RMI registry, which acts like a phone book. It keeps track of the server's functions and provides a way for the client to find them.
    4. Register the server's functions with the RMI registry, so the client knows where to find them.
    5. On the client side, look up the server's functions in the RMI registry. This is like searching for a phone number in the phone book.
    6. Once the client finds the functions, it can call them and use them as if they were its own functions. The RMI system takes care of the communication between the client and server over the network.

What is binding? 
    Binding refers to the process of associating or connecting a name with a remote object in a naming or registry service.

What is role of RMI registry and why we start it first?
    It acts as a central repository or directory service for remote objects, allowing clients to locate and obtain references to those objects.

What is "UnicastRemoteObject"?
    It is a class in Java's RMI (Remote Method Invocation) framework that provides functionality for exporting a remote object and making it available for remote invocation.

What is lookup()?
    lookup(): This method is used by clients to look up a remote object in the RMI registry. Clients provide the registered name of the remote object they want to access, and the lookup() method returns a reference to the remote object if it exists in the registry. It allows clients to obtain a reference to a remote object for further method invocations.

What is rebind()?
    rebind(): The rebind() method is used by the server to bind or register a remote object with a specific name in the RMI registry. It replaces any existing binding with the same name. If no binding with the specified name exists, the rebind() method creates a new binding.

What is bind()?
    bind(): Similar to rebind(), the bind() method is also used by the server to bind or register a remote object with a specific name in the RMI registry. However, unlike rebind(), if a binding with the specified name already exists, the bind() method throws a NameAlreadyBoundException.

What is Strub and Skeleton?
    Stub:
    A stub is a client-side proxy object that represents the remote object on the client's side. When a client wants to invoke a method on a remote object, it actually invokes the method on the stub object. The stub's main purpose is to marshal the method parameters, send them over the network to the server, and wait for the server's response. It provides a transparent interface to the client, making it appear as if the remote object is a local object.
    .
    .    
    Skeleton:
    A skeleton is a server-side object that receives the method calls from the client, unmarshals the parameters, and invokes the corresponding methods on the actual remote object. It acts as an intermediary between the network and the remote object, handling the low-level details of network communication. The skeleton then takes the return value or exception from the remote object's method invocation, marshals it, and sends it back to the client via the stub.

Exception VS RemoteExceptions: 
    Exception is a general exception class used for a wide range of exceptional conditions in Java programming. On the other hand, RemoteException is a specific exception class related to remote method invocation in the RMI framework. While Exception is used for general programming scenarios, RemoteException is specialized for RMI-related issues and is automatically handled within the RMI framework.