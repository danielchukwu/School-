package com.designpatterns;

public class Main {
    // What are Software Design Patterns?
    // These are general, reusable solutions to commonly occurring problems in software design

    // Software Design Patterns
    // - Creational: focuses on how objects are created
    // - Structural: focuses on how objects relate to one another
    // - Behavioural: focuses on how objects interact with one another

    // Types of Design patterns
    // - Creational
    //   - Abstract Factory: this lets you produce families of related objects without
    //                       specifying their concrete classes.
    //   - Factory Method:   provides an interface for creating objects in a superclass, but allows subclasses
    //                       to alter the type of objects that will be created.
    //   - Singleton:        this lets you ensure that a class has only one instance
    //   - Builder
    //   - Prototype
    //
    // - Structural
    //   - Adapter: this allows objects with incompatible interfaces to collaborate
    //   - Bridge:  this is used to separate a large class or a set of closely related
    //              classes into two hierarchies - abstraction and implementation
    //   - Facade:  this provides a simplified interface to a library, a framework, or any
    //              other complex set of classes.
    //   - Composite
    //   - Flyweight
    //   - Proxy
    //   - Decorator
    //
    // - Behavioural
    //   - Iterator: this allows you traverse the elements of a collection without revealing its
    //               underlying implementation (e.g list, stack, tree)
    //   - Observer: this looks for change in a data/event
    //   - State:    this lets an object alter its behavior when its internal state changes
    //   - Chain Of Responsibility
    //   - Command
    //   - Mediator
    //   - Memento
    //   - Strategy
    //   - Template Method
    //   - Visitor


    public static void main(String[] args) {
        // Singleton pattern
        // Grab an instance of the Singleton object
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        // Print memory locations of the 3 object instances above (they should be the same)
        System.out.println("Instance1 Hashcode: " + instance1.hashCode());
        System.out.println("Instance2 Hashcode: " + instance2.hashCode());
        System.out.println("Instance3 Hashcode: " + instance3.hashCode());
    }
}
