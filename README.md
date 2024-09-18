# Java-SE-core
**Key moments of Java Language**

**The main aim of this Repository is to open basic mechanisms of working with Java-programming language.  
Each Project represent concrete theme with description.**
##

Java Platform, Standard Edition (Java SE) is a computing platform for development and deployment of portable code for desktop and server environments. 
The Java Runtime Environment (JRE) and Java Development Kit (JDK) are the actual files downloaded and installed on a computer to run or develop Java programs, respectively.

👀General purpose packages:

✔-java.lang:
  *Object – the class that is the root of every class hierarchy.
  *Enum – the base class for enumeration classes (as of J2SE 5.0).
  *Class – the class that is the root of the Java reflection system.
  *Throwable – the class that is the base class of the exception class hierarchy.
  *Error, Exception, and RuntimeException – the base classes for each exception type.
  *Thread – the class that allows operations on threads.
  *String – the class for strings and string literals.
  *StringBuffer and StringBuilder – classes for performing string manipulation (StringBuilder as of J2SE 5.0).
  *Comparable – the interface that allows generic comparison and ordering of objects (as of J2SE 1.2).
  *Iterable – the interface that allows generic iteration using the enhanced for loop (as of J2SE 5.0).
  *ClassLoader, Process, Runtime, SecurityManager, and System – classes that provide "system operations" that manage the dynamic loading of classes, creation of external processes, host environment inquiries such as the time of day, and enforcement of security policies.
  *Math and StrictMath – classes that provide basic math functions such as sine, cosine, and square root (StrictMath as of J2SE 1.3).
  *The primitive wrapper classes that encapsulate primitive types as objects.
  *The basic exception classes thrown for language-level and other common exceptions.

✔-java.lang.ref:
  *SoftReference can be used to implement a cache. "Keep this object when nothing else references it, unless the memory is needed."
  *WeakReference is used to implement weak maps. An object that is not strongly or softly reachable, but is referenced by a weak reference is called "weakly reachable". "get rid of this object when nothing else references it at the next garbage collection."
  *A PhantomReference is used to reference objects that have been marked for garbage collection and have been finalized, but have not yet been reclaimed. "this object is no longer needed and has been finalized in preparation for being collected."

✔-java.lang.reflect:
  *Reflection is used to instantiate classes and invoke methods using their names, a concept that allows for dynamic programming. Classes, interfaces, methods, fields, and constructors can all be discovered and used at runtime. Reflection is supported by metadata that the JVM has about the program.

✔-java.io (provides for system input and output through data streams, serialization and the file system.):
  *InputStream and OutputStream,- which are abstract base classes for reading from and writing to byte streams, respectively. 
  *Reader and Writer - the related classes  are abstract base classes for reading from and writing to character streams, respectively. The package also has a few miscellaneous classes to support interactions with the host file system.

✔-java.nio (defines buffers, which are containers for data, and provides an overview of the other NIO packages):
  *Buffers, which are containers for data;
  *Charsets and their associated decoders and encoders, which translate between bytes and Unicode characters;
  *Channels of various types, which represent connections to entities capable of performing I/O operations; and
  *Selectors and selection keys, which together with selectable channels define a multiplexed, non-blocking I/O facility.

✔-java.math(supports multiprecision arithmetic (including modular arithmetic operations) and provides multiprecision prime number generators used for cryptographic key generation):
  *BigDecimal – provides arbitrary-precision signed decimal numbers. BigDecimal gives the user control over rounding behavior through RoundingMode.
  *BigInteger – provides arbitrary-precision integers. Operations on BigInteger do not overflow or lose precision. In addition to standard arithmetic operations, it provides modular arithmetic, GCD calculation, primality testing, prime number generation, bit manipulation, and other miscellaneous operations.
  *MathContext – encapsulate the context settings that describe certain rules for numerical operators.
  *RoundingMode – an enumeration that provides eight rounding behaviors.

✔-java.net (provides special IO routines for networks, allowing HTTP requests, as well as other common transactions):
can be roughly divided in two sections:
  *Low Level API, which deals with the following abstractions:
    -Addresses, which are networking identifiers, like IP addresses.
    -Sockets, which are basic bidirectional data communication mechanisms.
    -Interfaces, which describe network interfaces.
  *High Level API, which deals with the following abstractions:
    -URIs, which represent Universal Resource Identifiers.
    -URLs, which represent Universal Resource Locators.
    -Connections, which represents connections to the resource pointed to by URLs.

✔-java.text (implements parsing routines for strings and supports various human-readable languages and locale-specific parsing):
contains three main groups of classes and interfaces:
  *Classes for iteration over text
  *Classes for formatting and parsing
  *Classes for string collation


✔-java.util:
Contains the collections framework, some internationalization support classes, a service loader, properties, random number generation, string parsing and scanning classes, base64 encoding and decoding, a bit array, and several miscellaneous utility classes.

👀Special purpose packages:
-java.applet;
-java.beans;
-java.awt;
-java.rmi;
-java.security;
-java.sql;
-javax.rmi;
-javax.swing;
-javax.swing.text.html.parser;
-javax.xml.bind.annotation;

