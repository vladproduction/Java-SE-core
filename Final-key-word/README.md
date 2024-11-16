The final keyword is a non-access modifier used for classes, attributes and methods, which makes
them non-changeable (impossible to inherit or override). The final keyword is useful when you want
a variable to always store the same value, like PI (3.14159...). 

Used to declare entities (variables, methods, or classes) with
a "final" characteristic, meaning they cannot be modified or overridden once they are defined.

1)Final Variables: When applied to a variable, the final keyword ensures that its value cannot be
changed once initialized. It acts as a constant. A final variable must be assigned a value either
during declaration or within the constructor. It cannot be reassigned later.

2)Final Methods: When applied to a method, the final keyword indicates that the method cannot be
overridden by any subclass. This is useful when you want to prevent method overriding and ensure
the implementation remains unaltered.

3)Final Classes: When applied to a class, the final keyword indicates that the class cannot be
subclassed or extended. It ensures that the class implementation remains unchanged and un_extended.

The usage of the final keyword provides advantages such as improving performance (for variables)
and preventing accidental modifications or undesired behavior (for methods and classes). It also
enables the compiler to perform certain optimizations.

It's worth noting that final has other specific uses, such as final parameters, which ensure that
method parameters cannot be modified within the method. Additionally, when applied to instance fields,
final guarantees that they are initialized only once and cannot be left unassigned.