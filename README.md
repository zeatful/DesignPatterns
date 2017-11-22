# Design Patterns - with Java examples
A design pattern is a repeatable solution to a common problem.  They are great to leverage to make code cleaner, more maintainable, more extensible and generally avoid design pitfalls for problems that easily fit into a given pattern.  Design patterns are no supplement for thoughtful design, but can prevent reinventing the wheel for a common problem.

## Purpose of this project
This project is my attempt to better my knowledge of design patterns through Java examples so that I can better recognize and socialize design patterns within my own development group.

For great explanations and examples, also checkout: [SourceMaking](https://sourcemaking.com/design_patterns)
## Design patterns can be categorized into three types:
* Creational
* Structural
* Behavioral

### Creational
* __Abstract Factory__
    - Creates an instance of several families of classes_
* __Builder__
    - Separates object construction from its representation)
* __Factory Method__
    - Creates an instance of several derived classes
* __Object Pool__
    - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* __Prototype__
    - A fully initialized instance to be copied or cloned
* __Singleton__
    - A class of which only a single instance can exist
    
### Structural
* __Adapter__
    - Match interfaces of different classes
* __Bridge__
    - Separates an object’s interface from its implementation
* __Composite__
    - A tree structure of simple and composite objects
* __Decorator__
    - Add responsibilities to objects dynamically
* __Facade__
    - A single class that represents an entire subsystem
* __Flyweight__
    - A fine-grained instance used for efficient sharing
* __Private Class Data__
    - Restricts accessor/mutator access
* __Proxy__
    - An object representing another object
    
### Behavioral
* __Chain of responsibility__
    - A way of passing a request between a chain of objects
* __Command__
    - Encapsulate a command request as an object
* __Interpreter__
    - A way to include language elements in a program
* __Iterator__
    - Sequentially access the elements of a collection
* __Mediator__
    - Defines simplified communication between classes
* __Memento__
    - Capture and restore an object's internal state
* __Null Object__
    - Designed to act as a default value of an object
* __Observer__
    - A way of notifying change to a number of classes