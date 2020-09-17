# Builder Pattern

Separate the construction of an object from its representation.

## Important Links
- https://medium.com/@hazraarka072/fluent-builder-and-powering-it-up-with-recursive-generics-in-java-483005a85fcd

- https://www.sitepoint.com/self-types-with-javas-generics/

## Builder is widely used in Java core libraries:

- java.lang.StringBuilder#append() (unsynchronized)
- java.lang.StringBuffer#append() (synchronized)
- java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
- javax.swing.GroupLayout.Group#addComponent()

## UML Diagram
![Builder pattern UML diagram](https://github.com/javamultiplex/clean-code-principles-and-patterns/blob/master/src/main/java/com/javamultiplex/pattern/creational/uml/Builder_Design_Pattern_UML.jpg)
