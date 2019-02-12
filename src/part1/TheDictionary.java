/*
 * #Declaration
 * 
 * ##Primitive Vs References
 * 
 * ###Primitive
 * 
 * Stored by value, passed by value
 * 
 * - int - short - boolean - char - double //for decimals - long //for big
 * numbers
 * 
 * 
 * ## References
 * 
 * Stored by Object reference, passed by reference NOT value
 * 
 * When you make a change in the object, all variables pointing to that object
 * get changed.
 * 
 * ## Variable declaration
 * 
 * 
 * <data type> <variable name> = <value>; - Data type can be be primitive (int,
 * double, etc.) or a *class name* (String, Person, Integer, Book, Car) -
 * Variable name can be anything you want, doesn't mean anything other than a
 * pointer to the memory location where it's storing value or reference to
 * object - Value is assigned based on the *data type*, i.e if you are declaring
 * an int, you assign int. If you are declaring a Person object, you assign a
 * Person - WHEN Variable is not defined, value for REFERENCES is null and for
 * primitives it is their default i.e number is 0, boolean is false. - int
 * someVar; //created an int with variable name someVar but it has value 0 -
 * Scanner myScanner; //Created a variable myScanner, which can point to a
 * Scanner object. The value right now is null - if you try to use myScanner
 * without assigning object such that I do myScanner.nextInt(); Will throw Null
 * pointer exception as myScanner is null - Examples: - int myNum = 4;
 * //Declared an int with 4 value - String str = "Hello World!"; //Declared a
 * String with value "Hello World!" - Scanner myScanner = new
 * Scanner(System.in); // Create Scanner object listening to System.in,
 * myScanner points to scanner object
 * 
 * ## Arrays
 * 
 * - List of items - Have a fixed size - Index starts from 0
 * 
 * ### Declare Arrays
 * 
 * <data type>[] <variable name> = new <data type>[<size>]; - Creates an array
 * which can hold that data type, array has fixed size - Examples - String[]
 * names = new String[5]; //Declares an array which can hold 5 String objects -
 * names[0] = "Test"; //assigning "Test" String object to first box in array -
 * names.length //gives length of array - default value for array variable is
 * null i.e int[] myArray; //myArray is null
 * 
 * 
 * ## Methods
 * 
 * Synonyms: Function, Behaviour, instance method (refers to object method)
 * 
 * Methods hold a set of instructions They can have inputs and output, arguments
 * and return
 * 
 * Usually we try to group a functionality into a method
 * 
 * Their are two types of declarations:
 * 
 * - Static - <visibility> static <return type> <name> (<Argument Type>
 * <argument name>....) { ...body...} - void return type when nothing is
 * returned by function - Examples - public static void printName(String name)
 * {....} - public static int calculatedSomething() {} - private static double
 * doSomethingPrivately() {} - static double anotherMethod() {} // **We didn't
 * write visibility(i.e public) here, it has default visibility - Non static -
 * We don't write static, only differece. Also belongs to Object, need to create
 * object before calling it - <visibility> <return type> <name> (<Argument Type>
 * <argument name>....) { ...body...} - void return type when nothing is
 * returned by function - Examples - public void printName(String name) {....} -
 * public int calculatedSomething() {} - private double doSomethingPrivately()
 * {} - double anotherMethod() {} // **We didn't write visibility(i.e public)
 * here, it has default visibility
 * 
 * ## Class declaration
 * 
 * constructor....
 * 
 * <visibility> class <the name> {
 * 
 * //declaring instance variables //they are non static <attribute type>
 * <attribute variable name>;
 * 
 * //declaring static variables <attribute type> static <attribute variable
 * name>;
 * 
 * 
 * //Constructor declaration *this is a comment* <the name of class>(<Argument
 * type> <argument name>...) {
 * 
 * }
 * 
 * //methods in a class
 * 
 * //static <visibility> static <return type> <name> (<Argument Type> <argument
 * name>....) { ...body...}
 * 
 * //non static <visibility> <return type> <name> (<Argument Type> <argument
 * name>....) { ...body...} }
 * 
 * Java executes code in a class. We use class to organize our code.
 * 
 * Classes are blueprints, objects are instances of classes.
 * 
 * Classes can extend other classes.
 * 
 * Examples
 * 
 * public class Person {
 * 
 * //Name and age are instance variables, belong to object, String name; static
 * String someStaticValue = 5; // static variable, belongs to class, same across
 * all objects of Person, DONOT need to create object to access private int age;
 * 
 * public Person (String name, int age) { this.name = name; this.age = age; }
 * 
 * //instance method to access age of a person public int getAge() { return age;
 * }
 * 
 * //instance method to increment age of a person public void growOlder() {
 * age++; }
 * 
 * //Static method belongs to class, don't need to create object, i.e
 * Person.printNameOfClass() can be done! public static void printNameOfClass()
 * { System.out.println("This is Person class"); }
 * 
 * }
 * 
 * 
 * 
 * User class inherits from Person. It inherits all public, protected, and
 * default instance variables and methods public class User extends Person {
 * .... }
 * 
 * 
 * ##Creating instance
 * 
 * <class name> <variable name> = new <class name>(<Argument1>, <Argument2>...);
 * 
 * creates an object of the class by calling the constructor of the class.
 * 
 * i.e Person somebody = new Person("Yasir", 55); //Created an instance of
 * Person class. It called the constructor of person class to create object
 * 
 * 
 * 
 * ## Dictionary
 * 
 * 
 * - instance: Synonym: object. An object created from a class, used as:
 * instance of User meaning an object of User class - constructor: Used to
 * create an object or instance
 * 
 * 
 * 
 * ## Anti patterns (you can't do this)
 * 
 * Cannot have method calls outside of methods, only declarations.
 * 
 * for example:
 * 
 * class Car { int speed; String name; int currentSpeed; public Car (String
 * name, int speed) { this.name = name; this.speed = speed; }
 ************************ 
 * CAN NOT DO THIS*********** //this is outside a function, which is only meant
 * for declaration and definitions! System.out.println(name); }
 * 
 * ## Abstract class
 * 
 * Abstract classes are classes that can not be instantiated meaning you can not
 * create an instance of that class. This is because they are usually
 * incomplete.
 * 
 * They are usefull in the scenario where you want the child classes to
 * implement their specifc functionality, i.e a Car has braking, accelerating,
 * but every car does it differently, so you would make those functions
 * abstract. Java will enforce all concrete classes to implement the missig
 * functionality.
 * 
 * //note everything is same except for when you want funtionality to be
 * implemented by child classes you make it abstract
 * 
 * abstract class <class-name> {
 * 
 * //declaring instance variables //they are non static <attribute type>
 * <attribute variable name>;
 * 
 * //declaring static variables <attribute type> static <attribute variable
 * name>;
 * 
 * 
 * //Constructor declaration *this is a comment* <the name of class>(<Argument
 * type> <argument name>...) {
 * 
 * }
 * 
 * //*Impleneted* methods in a class
 * 
 * //static <visibility> static <return type> <name> (<Argument Type> <argument
 * name>....) { ...body...}
 * 
 * //non static <visibility> <return type> <name> (<Argument Type> <argument
 * name>....) { ...body...}
 * 
 * 
 * //***ABSTRACT Methods <visibility> abstract <return type> <name> (<Argument
 * type> <argument name>....); ///NOTE HOW BODY IS NOT THERE
 * 
 * }
 * 
 * 
 * Example
 * 
 * 
 * abstract class Car {
 * 
 * int speed, maxSpeed; String name;
 * 
 * public Car(int speed, int maxSpeed, String name) {
 * 
 * this.speed = speed; this.maxSpeed = maxSpeed; this.name = name; }
 * 
 * void printCar() {
 * 
 * System.out.println("Name: "+name +" MAx speed: "+maxSpeed); }
 * 
 * //Abstract methods, so their functionality is no implemented, only
 * implemented by complete/concrete classes public abstract void accelerate();
 * public abstract void brake();
 * 
 * }
 * 
 * 
 * public class Mazda extends Car{
 * 
 * public Mazda(int speed, int maxSpeed) { super(speed,maxSpeed, "Mazda"); }
 * 
 * //Abstract methods *HAVE* to be implemented here now, as this is a concrete
 * class
 * 
 * public void accelerate() { speed += 10; }
 * 
 * public void brake() { speed -= 15; } }
 * 
 * Mazda m = new Mazda(30, 180);
 * 
 * Car car2 = new Mazda(0, 200);//this is valid because parent can be a child,
 * as child inherits everything the parent
 * 
 * 
 * Car car3 = new Car(0,200,"SomeCar"); //
 * 
 * m.accelerate(); m.brake();
 */