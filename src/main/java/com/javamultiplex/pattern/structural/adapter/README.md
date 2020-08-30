# Adapter Pattern

The adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together. In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.


- **Target** -  This defines the domain-specific interface that the client uses. This is the Shape interface in our example.
- **Adapter** - This adapts the interface from the adaptee to the target interface.
- **Adaptee** - This defines an existing interface that needs adapting. This is the GeometricShape interface in our example.
- **Client** - This collaborates with objects conforming to the Target interface. The Drawing class is the client in our example.
