# Chain of Responsibility Pattern

The chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request.

#### Example - Try-Catch Block

## UML Diagram
![Chain of responsibility pattern UML diagram](https://github.com/javamultiplex/clean-code-principles-and-patterns/blob/master/src/main/java/com/javamultiplex/pattern/behavioral/uml/Chain_of_Responsibility_Design_Pattern_UML.jpg)

- In the above UML class diagram, the **Sender** class doesn't refer to a particular receiver class directly. Instead, **Sender** refers to the **Handler** interface for handling a request (handler.handleRequest()), which makes the Sender independent of which receiver handles the request. The **Receiver1**, **Receiver2**, and **Receiver3** classes implement the **Handler** interface by either handling or forwarding a request (depending on run-time conditions).
- The UML sequence diagram shows the run-time interactions: In this example, the **Sender** object calls handleRequest() on the receiver1 object (of type Handler). The receiver1 forwards the request to receiver2, which in turn forwards the request to receiver3, which handles (performs) the request.
