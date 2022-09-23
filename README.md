# Event-Drive & Object-Oriented with Java
## Dobble Simulator with Java

Others Languages

* [Spanish](https://github.com/vastien/jframe-dobble-simulator/READMEes.md)

_________________________________________________________________
                  
                  
Event-Drive & Object-Oriented Paradigm                         
Programming Language: Java                              
Developer: Bastián Escribano - @vastien                      
University of Santiago of Chile                        
Computer Science Department                
July, 2022.        

# Event-Drive Paradigm

In computer programming, event-driven programming is a programming paradigm in which the flow of the program is determined by events such as user actions (mouse clicks, key presses), sensor outputs, or message passing from other programs or threads. Event-driven programming is the dominant paradigm used in graphical user interfaces and other applications (e.g., JavaScript web applications) that are centered on performing certain actions in response to user input. This is also true of programming for device drivers (e.g., P in USB device driver stacks[1]).

In an event-driven application, there is generally a main loop that listens for events and then triggers a callback function when one of those events is detected. In embedded systems, the same may be achieved using hardware interrupts instead of a constantly running main loop. Event-driven programs can be written in any programming language, although the task is easier in languages that provide high-level abstractions, such as await and closures.


# Object-Oriented Paradigm
OOP (Object-oriented programming) is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).

A common feature of objects is that procedures (or methods) are attached to them and can access and modify the object's data fields. In this brand of OOP, there is usually a special name such as this or self used to refer to the current object. In OOP, computer programs are designed by making them out of objects that interact with one another. OOP languages are diverse, but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.

## Encapsulation
Encapsulation contains all the important information about an object within it and only exposes selected information to the outside world.
This property makes it possible to ensure that the information of an object is hidden from the outside world, grouping in a Class the characteristics or attributes that have private access, and the behaviors or methods that have public access.

The encapsulation of each object is responsible for its own information and its own state. The only way this can be modified is through the object's own methods. Therefore, the internal attributes of an object should be inaccessible from the outside, being able to be modified only by calling the corresponding functions. With this we manage to keep the state safe from improper use or that may be unexpected.

We use a car as an example to explain encapsulation. The car shares public information through the brake lights or blinkers to indicate turns (public interface). On the contrary, we have the internal interface, which would be the propulsion mechanism of the car, which is hidden under the hood. When driving a car, it is necessary to indicate your movements to other drivers, but not to expose private data about the type of fuel or the temperature of the engine, since there is a lot of data, which would confuse the rest of the drivers.

## Abstraction
Abstraction is when the user interacts with only selected attributes and methods of an object, using simplified high-level tools to access a complex object.

In object-oriented programming, programs are usually very large, and objects communicate a lot with each other. The concept of abstraction makes it easy to maintain a large code, where different changes can arise over time.

Thus, abstraction is based on using simple things to represent complexity. Objects and classes represent underlying code, hiding complex details from the user. Therefore, it is an extension of encapsulation. Continuing with the car example, you don't need to know all the details of how the engine works in order to drive it.

## Inheritance
Inheritance defines hierarchical relationships between classes so that common attributes and methods can be reused. Parent classes extend attributes and behaviors to child classes. By defining the basic attributes and behaviors in a class, child classes can be created, thus extending the functionality of the parent class and adding additional attributes and behaviors.

Going back to the animals example, you can use a single animal class and add an animal type attribute that specifies the type of animal. Different types of animals will need different methods, for example birds need to be able to lay eggs and fish swim. Even when the animals have a method in common, such as moving, the implementation would need many "if" statements to ensure the correct movement behavior. For example, frogs jump, while snakes slither. The principle of inheritance allows us to solve this problem.

## Polymorphism
Polymorphism is about designing objects to share behaviors, which allows us to process objects in different ways. It is the ability to present the same interface to different underlying forms or data types. By using inheritance, objects can override shared parent behaviors, with specific child behaviors. Polymorphism allows the same method to perform different behaviors in two ways: method overriding and method overloading.

Many things are built around these object-oriented programming principles. For example, the SOLID Principles, or the Design Patterns, which are recipes that are applied to recurring problems that have been found and are repeated in several projects.


## Dobble - Spot It!
Dobble is a game in which players have to find symbols in common between two cards. It was the UK’s best-selling game in 2018 and 2019.
In 1976, inspired by Kirkman's schoolgirl problem, French mathematics enthusiast Jacques Cottereau devised a game consisting of a set of 31 cards each with six images of insects, with exactly one image shared between each pair of them. In 2008, journalist and game designer Denis Blanchot found a few of the cards from the "game of insects" and developed the idea to create Dobble.                                                    
                                                    
Dobble was released in France in 2009, and in the UK and North America in 2011 under Blue Orange Games. In 2015, the French board game company Asmodee acquired the rights to Dobble and Spot It!.
                                                    
The special way that symbols are arranged on Dobble cards can be understood using geometry. If we represent each card by a line, and each symbol by a point where two lines intersect, then the properties of Dobble are that:
                                                                                                        
any two lines intersect at exactly one point, and
any two points are joined by exactly one line.
This geometric structure is an example of a finite projective plane.

If there are 3 points in each line this creates a structure known as the Fano plane. This represents a simpler version of Dobble with 3 symbols on each card, 7 cards and 7 symbols.

In general, a finite projective plane with n points on each line has n2-n+1 points and lines.

To represent the real game of Dobble, each line must join 8 points. This results in a structure with 57 lines and 57 points (82-8+1=57), corresponding to 57 cards and 57 symbols. However, the game works fine with fewer cards too, and Dobble is marketed with 55 cards in the deck (but 57 different symbols). A junior version of Dobble is marketed with 6 symbols per card, 30 cards, and 31 different symbols (62-6+1=31).

<p align="center">
<img width="400" src="https://i.postimg.cc/qvbwfjTm/Fplane.png" alt="Fano plane">
</p>


## Install

### Requirements
* [Java 8 o superior](https://www.java.com/es/download/ie_manual.jsp)         
* [Git](https://git-scm.com/downloads)

  ### Use

        Clone https://github.com/vastien/jframe-dobble-simulator/
        
        Windows
        
                $ cd Desktop
                $ mkdir dobbleSimulator
                $ cd dobbleSimulator
                $ git clone https://github.com/vastien/jframe-dobble-simulator/
                
        Unix (Linux and MacOS) 
        
                $ mkdir dobbleSimulator
                $ cd dobbleSimulator
                $ git clone https://github.com/vastien/jframe-dobble-simulator/

        
        
## License
[MIT](https://choosealicense.com/licenses/mit/)

