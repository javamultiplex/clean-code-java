# Clean code principles

- SOLID
- KISS
- DRY
- YAGNI
- Delegation
- Encapsulate What Changes

# Design Patterns

 - Creational
 - Structural
 - Behavioral

# Unit Test Prinicples

1. Test case should be understandable and should not take more than 15 seconds to read  (Don’t write all scenarios in one test).
2. Unit tests should be self-sufficient - A single test should not depend on running other tests before it, nor should it be affected by the order of execution of other tests. Running the same unit test 1,000 times should return the same result every time.
3. Tests should be deterministic - The worst test is the one that passes some of the time. A test should either pass all the time or fail until fixed. Having a unit test that passes some of the time is equivalent to not having a test at all.
4. Naming conventions
5. Don't repeat yourself
6. Don’t write test cases of entity class and DTO
7. Don’t write test for coverage, cover all scenarios

## Creational Patterns
- **Prototype** - A fully initialized instance to be copied or cloned. Ex - Chess board.
- **Builder** - Seperate object construction from its representation. Ex - Menu of any restaurant
- **Singleton** - A class of which only a single instance can exist. Ex - President of country, Database connection, Logging
- **Factory method** - Creates a factory of object types. Ex - Shape factory that generates different shapes.

## Structural Patterns
- **Proxy** - An object representing another object. Ex - Credit card, Debit card
- **Decorator** - Add responsibilities to the object dynamically. Ex - Adding discount on order, Adding toppings on pizza, Java IO.
- **Facade** - A single class that represent an entire subsystem. Ex - Event manager, Online booking order.
- **Adapter** - Match interfaces of different class. Ex - Power adapter.
- **Flyweight** - A fine grained instance used for efficient sharing. Ex - Public switched network, JDBC Connection pooling.

## Behavioural
- Chain of resposibility - A way of passing a request between chain of objects. Ex - Exception handling in Java.
- Iterator - Sequentially access elements of a collection. Ex - Iterator class, next and prev button on Tv remote.
- State - Alter an object behaviour when its state changes. Ex - Fan wall control
- Strategy - Encapsulate an algorithm inside a class. Ex - Sorting based on different algorithms.
- Observer - A way of notifying a change to number of classes. Ex - Newspaper
- Visitor - Define a new operation to a class without change. Ex - Operation of a taxi company.
- Template method - Defer an exact steps of an algorithm to a sub class. Ex - House plan.
- Command - Encapsulate a command request as a object. Ex - Runnable interface, Waiter take order and pass it to cook.
- Memento - Capture and restore object's internal state. Ex - Serialization, Undo/Redo.
- Mediator - Defines simplified communication between classes. Ex - Air traffic controller.
