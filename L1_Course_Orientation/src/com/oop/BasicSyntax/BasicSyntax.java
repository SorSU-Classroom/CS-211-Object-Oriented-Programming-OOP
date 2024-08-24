/**
 * Java Basic Syntax
 * 
 * Java is a case-sensitive language. This means that the language keywords,
 * variables, function names, and any other identifiers must always be typed
 * with a consistent capitalization of letters. The following are the keywords
 * in Java.These are reserved words that have special meaning to the compiler
 * and cannot be used for other purposes:
 * - abstract		- assert		- boolean		- break
 * - byte			- case			- catch			- char
 * - class			- const			- continue		- default
 * - do				- double		- else			- enum
 * - extends		- final			- finally		- float
 * - for			- goto			- if			- implements
 * - import			- instanceof	- int			- interface
 * - long			- native		- new			- package
 * - private		- protected		- public		- return
 * - short			- static		- strictfp		- super
 * - switch			- synchronized	- this			- throw
 * - throws			- transient		- try			- void
 * - volatile		- while
 * 
 * Java Program Structure
 * 
 * A Java program is a collection of classes. A class is a blueprint for objects.
 * A class can contain fields, methods, constructors, and blocks.
 */

/**
 * The line `package com.oop.BasicSyntax;` in Java is used to declare the package to which the current Java
 * file belongs. In this case, the Java file is part of the `com.oop.BasicSyntax` package. Packages are
 * used to organize classes and interfaces into namespaces, making it easier to manage and maintain
 * large Java projects.
 * 
 * The package declaration must be the first line in a Java file, and it is optional. If a package
 * declaration is not included in a Java file, the file is considered to be part of the default package.
 * 
 * The package name must be a valid Java identifier, and it should follow the Java naming conventions.
 * The package name can be a simple name or a compound name separated by periods. For example, `com.oop.BasicSyntax`
 * is a simple package name, and `com.oop.BasicSyntax.util` is a compound package name.
 * 
 * The package has the following syntax:
 * - package package_name;
 * 
 * The package declaration includes the following components:
 * - package: The keyword that indicates the start of the package declaration.
 * - package_name: The name of the package to which the Java file belongs.
 * 
 * References:
 * @see https://docs.oracle.com/javase/tutorial/java/package/packages.html
 */
package com.oop.BasicSyntax;

/**
 * The BasicSyntax class contains a main method that serves as the entry
 * point for the Java
 * 
 * The class has the following syntax:
 * - [access_modifier] class class_name {
 * // class body
 * }
 * 
 * The class_name must be a valid Java identifier, and it should follow the Java
 * naming conventions.
 * The class_name should start with an uppercase letter and use camel case for
 * multi-word names.
 * 
 * The class declaration includes the following components:
 * - access_modifier: Specifies the visibility of the class. The access
 * modifiers in Java are public, protected, default, and private.
 * * - public: The class is accessible from any other class.
 * * - protected: The class is accessible within the same package and by
 * subclasses.
 * * - default: The class is accessible only within the same package.
 * * - private: The class is accessible only within the same class.
 * - class: The keyword that indicates the start of the class declaration.
 * - class_name: The name of the class.
 * - class body: The body of the class that contains the class members, such as
 * fields, methods, constructors, and blocks.
 * 
 * The class body is enclosed in curly braces `{}` and contains the class
 * members, such as fields, methods,
 * constructors, and blocks.
 * 
 * References:
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 */
public class BasicSyntax {
	/**
	 * The main method is the entry point for the Java program. When the Java
	 * program is executed, the main method is called by the Java Virtual Machine
	 * (JVM).
	 * 
	 * The main method has the following syntax:
	 * - public static void main(String[] args) {
	 * // method body
	 * }
	 * 
	 * The main method includes the following components:
	 * - public: The access modifier that specifies that the main method is
	 * accessible from any other class.
	 * - static: The keyword that indicates that the main method belongs to the
	 * class and not to the instances of the class.
	 * - void: The return type of the main method. The main method does not return
	 * any value.
	 * - main: The name of the main method.
	 * - String[] args: The parameter of the main method. The args parameter is an
	 * array of strings that stores the command-line arguments passed to the Java
	 * program.
	 * - method body: The body of the main method that contains the statements to
	 * be executed when the Java program is run.
	 * 
	 * The main method is the starting point of the Java program, and it is
	 * required in every Java program.
	 * 
	 * References:
	 * 
	 * @see https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
	 * @see https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
	 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
	 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {

		/**
		 * The System.out.println() method is used to print the specified message to the
		 * standard output stream (console).
		 * 
		 * The System class is a predefined class in Java that provides access to
		 * standard input, output, and error streams, as well as other utility methods.
		 * 
		 * The out is a static member of the System class that represents the standard
		 * output stream.
		 * 
		 * The println() method is used to print the specified message followed by a
		 * newline character. The newline character moves the cursor to the next line
		 * after printing the message.
		 * 
		 * The System.out.println() method is commonly used to print messages,
		 * variables,
		 * and other information to the console during program execution.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/8/docs/api/java/lang/System.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
		 * @see https://docs.oracle.com/javase/tutorial/essential/io/cl.html
		 * @see https://docs.oracle.com/javase/tutorial/essential/io/formatting.html
		 */
		System.out.println("This is the basic syntax of Java programming language.");
	}
}
