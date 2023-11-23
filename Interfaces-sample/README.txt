Interfaces
•It’s a reference type, similar to a class.
•Can contain only constants, method signatures, default
methods, static methods, and nested types.
•Method bodies exist only for default methods and static
methods.
•Interfaces cannot be instantiated.
•In its most common form, an interface is a group of
related methods with empty bodies.
•Implementing an interface allows a class to become
more formal about the behavior it promises to provide.
•Interfaces form a contract between the class and the
outside world, and this contract is enforced at build time
by the compiler.
•All methods defined by that interface must appear in its
source code before the class for it to compile
successfully.

Default Methods.
•Default methods enable you to add new functionality
to the interfaces of your libraries and ensure binary
compatibility with code written for older versions of
those interfaces.
Static Methods.
•A static method is a method that is associated with
the class in which it is defined rather than with any
object. Every instance of the class shares its static
methods.
