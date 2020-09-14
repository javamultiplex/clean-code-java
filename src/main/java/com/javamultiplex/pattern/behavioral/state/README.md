# State Pattern

According to GoF definition, a state allows an object to alter its behavior when its internal state changes. 

> The state pattern solves problems where an object should change its behavior when its internal state changes. Also, adding new states should not affect the behavior of existing states.

## UML Diagram
![State pattern UML Diagram](https://github.com/javamultiplex/clean-code-principles-and-patterns/blob/master/src/main/java/com/javamultiplex/pattern/behavioral/uml/State_Design_Pattern_UML.jpg)

# Real world example of state pattern
- To make things simple, let’s visualize a TV box operated with remote controller. We can change the state of TV by pressing buttons on remote. But the state of TV will change or not, it depends on the current state of the TV. If TV is ON, we can switch it OFF, mute or change aspects and source. But if TV is OFF, nothing will happen when we press remote buttons.
For a switched OFF TV. only possible next state can be switch ON.

- State patterns are used to implement state machine implementations in complex applications.
- Another example can be of Java thread states. A thread can be one of its five states during it’s life cycle. It’s next state can be determined only after getting it’s current state. e.g. we can not start a stopped thread or we cannot a make a thread wait, until it has started running.
3
