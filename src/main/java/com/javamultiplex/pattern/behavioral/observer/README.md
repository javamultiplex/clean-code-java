# Observer Pattern

- Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. 
- It specifies communication between objects: observable and observers. An observable is an object which notifies observers about the changes in its state.

#### Examples 
- JMS (Java Messaging Service)
- MVC Framework (Model is subject and views are observers)

## UML Diagram
![Observer Pattern UML Diagram](https://github.com/javamultiplex/clean-code-principles-and-patterns/blob/master/src/main/java/com/javamultiplex/pattern/behavioral/uml/Observer_Design_Pattern_UML.jpg)

- In the above UML class diagram, the **Subject** class does not update the state of dependent objects directly. Instead, **Subject** refers to the **Observer** interface (update()) for updating state, which makes the **Subject** independent of how the state of dependent objects is updated. The **Observer1** and **Observer2** classes implement the **Observer** interface by synchronizing their state with subject's state.

- The UML sequence diagram shows the run-time interactions: The **Observer1** and **Observer2** objects call attach(this) on **Subject1** to register themselves. Assuming that the state of **Subject1** changes, **Subject1** calls notify() on itself.
notify() calls update() on the registered **Observer1** and **Observer2** objects, which request the changed data (getState()) from Subject1 to update (synchronize) their state.
