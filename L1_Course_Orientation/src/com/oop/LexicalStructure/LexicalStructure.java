/**
 * Lexical Structure
 * 
 * The lexical structure of a programming language defines the set of valid tokens that can be used to write programs in the language.
 * 
 * The Lexical Structure of Java includes the following elements:
 * - Unicode: Java programs are written using the Unicode character set, which supports a wide range of characters from different languages.
 * - Lexical Translations: Java programs are translated into Unicode characters using the Unicode escape sequences.
 * - Unicode Escapes: Unicode escape sequences are used to represent Unicode characters in Java programs.
 * - Line Terminators: Line terminators are used to mark the end of a line in a Java program.
 * - Input Elements and Tokens: Input elements are the smallest individual units of a Java program, and tokens are the meaningful sequences of input elements.
 * - White Space: White space characters are used to separate tokens and improve the readability of a Java program.
 * - Comments: Comments are used to document Java programs and improve their readability.
 * - Identifiers: Identifiers are used to name classes, methods, variables, and other elements in a Java program.
 * - Keywords: Keywords are reserved words in Java that have special meanings and cannot be used as identifiers.
 * - Literals: Literals are fixed values that are used in Java programs, such as numbers, characters, and strings.
 * - Separators: Separators are used to separate tokens in a Java program, such as parentheses, braces, and commas.
 * - Operators: Operators are used to perform operations on operands in a Java program, such as addition, subtraction, and comparison.
 * 
 * Understanding the lexical structure of Java is essential for writing correct and readable programs in the language.
 * 
 * References:
 * @see https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html
 */
package com.oop.LexicalStructure;

public class LexicalStructure {

	public static void main(String[] args) {

		/**
		 * Unicode
		 * 
		 * Unicode is a character encoding standard that supports a wide range of
		 * characters from different languages and scripts. Java programs are written
		 * using the Unicode character set, which allows developers to use characters
		 * from various languages in their code.
		 * 
		 * Unicode escape sequences are used to represent Unicode characters in Java
		 * programs. For example, the Unicode escape sequence \u0041 represents the
		 * character 'A' in the Latin alphabet.
		 * 
		 * References:
		 * 
		 * @see https://www.unicode.org/charts/PDF/U0000.pdf
		 * @see https://www.unicode.org/charts/PDF/UFF00.pdf
		 * @see http://www.unicode.org/charts/
		 */
		System.out.println("\n\n--- Unicode ---");

		char unicodeCharacter = '\u0041';
		System.out.println("Unicode Character: " + unicodeCharacter);

		/**
		 * Line Terminators
		 * 
		 * Line terminators are used to mark the end of a line in a Java program. The
		 * line terminator can be a carriage return (CR), a line feed (LF), or a
		 * carriage return followed by a line feed (CRLF).
		 * 
		 * The line terminator is used to separate lines of code in a Java program and
		 * improve the readability of the code.
		 * 
		 * CR (Carriage Return): Moves the cursor to the beginning of the line.
		 * LF (Line Feed): Moves the cursor to the next line.
		 * CRLF (Carriage Return Line Feed): Moves the cursor to the beginning of the
		 * next line.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.4
		 */
		System.out.println("\n\n--- Lexical Translations ---");

		// Implementing Carriage Return (CR)
		System.out.print("Carriage Return (CR): ");
		System.out.print("Hello, World!\r");

		// Implementing Line Feed (LF)
		System.out.print("Line Feed (LF): ");
		System.out.print("Hello, World!\n");

		// Implementing Carriage Return Line Feed (CRLF)
		System.out.print("Carriage Return Line Feed (CRLF): ");
		System.out.print("Hello, World!\r\n");

		System.out.println("Last Line");

		/**
		 * White Space
		 * 
		 * White space characters are used to separate tokens in a Java program and
		 * improve the readability of the code. White space characters include spaces,
		 * tabs, and line terminators.
		 * 
		 * White space is ignored by the Java compiler, so developers can use it
		 * liberally to format their code and make it more readable.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.6
		 */
		System.out.println("\n\n--- White Space ---");

		// Using White Space to Improve Readability
		int number = 10;
		int result = number * 2;
		System.out.println("Result: " + result);

		if (result > 10) {
			System.out.println("Result is greater than 10");
		} else {
			System.out.println("Result is less than or equal to 10");
		}

		/**
		 * Comments
		 * 
		 * Comments are used to document Java programs and improve their readability.
		 * Comments are ignored by the Java compiler and are not executed as part of the
		 * program.
		 * 
		 * There are three types of comments in Java:
		 * - Single-Line Comments: Single-line comments start with // and continue until
		 * the end of the line.
		 * - Multi-Line Comments: Multi-line comments start with /* and end with *\/.
		 * They
		 * can span multiple lines.
		 * - Javadoc Comments: Javadoc comments start with /** and end with *\/. They
		 * are
		 * used to generate documentation from the source code.
		 * 
		 * Comments are an essential part of writing maintainable code, as they help
		 * other developers understand the purpose and functionality of the code.
		 * 
		 * References:
		 * 
		 * @see https://www.w3schools.com/java/java_comments.asp
		 */
		System.out.println("\n\n--- Comments ---");

		// Single-Line Comment
		System.out.println("Hello, World!"); // Print "Hello, World!"

		/*
		 * Multi-Line Comment
		 * This is a multi-line comment that spans
		 * multiple lines.
		 */
		System.out.println("Multi-Line Comment");

		/**
		 * Identifiers
		 * 
		 * Identifiers are used to name classes, methods, variables, and other elements
		 * in a Java program. Identifiers must follow certain rules and conventions:
		 * - An identifier can only contain letters, digits, underscores (_), and dollar
		 * signs ($).
		 * - An identifier must start with a letter, underscore, or dollar sign.
		 * - Identifiers are case-sensitive, so uppercase and lowercase letters are
		 * considered different.
		 * - Identifiers should be descriptive and follow the naming conventions of the
		 * Java programming language.
		 * 
		 * Good identifiers help make the code more readable and maintainable by
		 * providing meaningful names for the elements in the program.
		 * 
		 * References:
		 * 
		 * @see https://www.w3schools.com/java/java_variables_identifiers.asp
		 */
		System.out.println("\n\n--- Identifiers ---");

		// Identifiers Example
		int myInteger = 10;
		char _myChar = 'A';
		double $myDouble = 3.14;

		System.out.println("Integer: " + myInteger);
		System.out.println("Character: " + _myChar);
		System.out.println("Double: " + $myDouble);

		/**
		 * Keywords
		 * 
		 * Keywords are reserved words in Java that have special meanings and cannot be
		 * used as identifiers. The following are the keywords in Java:
		 * - abstract - assert - boolean - break
		 * - byte - case - catch - char
		 * - class - const - continue - default
		 * - do - double - else - enum
		 * - extends - final - finally - float
		 * - for - goto - if - implements
		 * - import - instanceof - int - interface
		 * - long - native - new - package
		 * - private - protected - public - return
		 * - short - static - strictfp - super
		 * - switch - synchronized - this - throw
		 * - throws - transient - try - void
		 * - volatile - while
		 * 
		 * Keywords are an essential part of the Java programming language and are used
		 * to define the syntax and structure of Java programs.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
		 */

		/**
		 * Literals
		 * 
		 * Literals are fixed values that are used in Java programs. There are several
		 * types of literals in Java:
		 * - Integer Literals: Integer literals are whole numbers without a decimal
		 * point.
		 * - Floating-Point Literals: Floating-point literals are numbers with a decimal
		 * point or an exponent.
		 * - Character Literals: Character literals are single characters enclosed in
		 * single quotes.
		 * - String Literals: String literals are sequences of characters enclosed in
		 * double quotes.
		 * - Boolean Literals: Boolean literals are either true or false.
		 * - Null Literal: The null literal represents the absence of a value.
		 * 
		 * Literals are used to represent fixed values in Java programs and are an
		 * essential part of writing code.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 */
		System.out.println("\n\n--- Literals ---");

		// Integer Literal
		int integerLiteral = 10;
		System.out.println("Integer Literal: " + integerLiteral);

		// Floating-Point Literal
		double floatingPointLiteral = 3.14;
		System.out.println("Floating-Point Literal: " + floatingPointLiteral);

		// Character Literal
		char characterLiteral = 'A';
		System.out.println("Character Literal: " + characterLiteral);

		// String Literal
		String stringLiteral = "Hello, World!";
		System.out.println("String Literal: " + stringLiteral);

		// Boolean Literal
		boolean booleanLiteral = true;
		System.out.println("Boolean Literal: " + booleanLiteral);

		// Null Literal
		Object nullLiteral = null;
		System.out.println("Null Literal: " + nullLiteral);

		/**
		 * Separators
		 * 
		 * Separators are used to separate tokens in a Java program. The following are
		 * the separators in Java:
		 * - Parentheses: ( )
		 * - Braces: { }
		 * - Brackets: [ ]
		 * - Semicolon: ;
		 * - Comma: ,
		 * - Period: .
		 * - Ellipsis: ...
		 * 
		 * Separators are an essential part of the Java syntax and are used to define
		 * the
		 * structure of Java programs.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
		 */
		System.out.println("\n\n--- Separators ---");

		// Using Parentheses to Group Expressions
		int result1 = (10 + 5) * 2;
		System.out.println("Result 1: " + result1);

		// Using Braces to Define Code Blocks
		if (result1 > 10) {
			System.out.println("Result 1 is greater than 10");
		} else {
			System.out.println("Result 1 is less than or equal to 10");
		}

		// Using Brackets to Access Array Elements
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println("First Element: " + numbers[0]);

		// Using Semicolon to Terminate Statements
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("Sum: " + z);

		// Using Comma to Separate Elements
		int a = 1, b = 2, c = 3;
		System.out.println("Values: " + a + ", " + b + ", " + c);

		// Using Period to Access Members
		String text = "Hello, World!";
		int length = text.length();
		System.out.println("Length: " + length);

		// Using Ellipsis to Indicate Variable Arguments
		int sum = add(1, 2, 3, 4, 5);
		System.out.println("Sum: " + sum);

		/**
		 * Operators
		 * 
		 * Operators are used to perform operations on operands in a Java program. There
		 * are several types of operators in Java:
		 * - Arithmetic Operators: Arithmetic operators are used to perform mathematical
		 * operations, such as addition, subtraction, multiplication, and division.
		 * - Relational Operators: Relational operators are used to compare values and
		 * determine the relationship between them, such as equality, inequality, and
		 * greater than or less than.
		 * - Logical Operators: Logical operators are used to combine multiple
		 * conditions
		 * and determine the truth value of a compound expression.
		 * - Assignment Operators: Assignment operators are used to assign values to
		 * variables.
		 * - Bitwise Operators: Bitwise operators are used to perform bitwise operations
		 * on integer operands.
		 * - Conditional Operator: The conditional operator is used to evaluate a
		 * boolean expression and return one of two values based on the result.
		 * - instanceof Operator: The instanceof operator is used to test if an object
		 * is
		 * an instance of a particular class.
		 * - Unary Operators: Unary operators are used to perform operations on a single
		 * operand.
		 * - Shift Operators: Shift operators are used to shift the bits of an integer
		 * value to the left or right.
		 * - Ternary Operator: The ternary operator is a shorthand form of the if-else
		 * statement.
		 * 
		 * Operators are an essential part of the Java programming language and are used
		 * to perform a wide range of operations in Java programs.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		 */
		System.out.println("\n\n--- Operators ---");

		/**
		 * Arithmetic Operators
		 * 
		 * Arithmetic operators are used to perform mathematical operations on operands.
		 * The following are the arithmetic operators in Java:
		 * - Addition (+): Adds two operands.
		 * - Subtraction (-): Subtracts the second operand from the first.
		 * - Multiplication (*): Multiplies two operands.
		 * - Division (/): Divides the first operand by the second.
		 * - Modulus (%): Returns the remainder of the division of the first operand by
		 * the second.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
		 */
		System.out.println("\n\n--- Arithmetic Operators ---");

		int operand1 = 10;
		int operand2 = 5;
		int sum1 = operand1 + operand2;
		int difference = operand1 - operand2;
		int product = operand1 * operand2;
		int quotient = operand1 / operand2;
		int remainder = operand1 % operand2;

		System.out.println("Sum: " + sum1);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);

		/**
		 * Relational Operators
		 * 
		 * Relational operators are used to compare values and determine the
		 * relationship
		 * between them. The following are the relational operators in Java:
		 * - Equal to (==): Checks if two operands are equal.
		 * - Not equal to (!=): Checks if two operands are not equal.
		 * - Greater than (>): Checks if the first operand is greater than the second.
		 * - Less than (<): Checks if the first operand is less than the second.
		 * - Greater than or equal to (>=): Checks if the first operand is greater than
		 * or equal to the second.
		 * - Less than or equal to (<=): Checks if the first operand is less than or
		 * equal to the second.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		 */
		System.out.println("\n\n--- Relational Operators ---");

		boolean isEqual = operand1 == operand2;
		boolean isNotEqual = operand1 != operand2;
		boolean isGreater = operand1 > operand2;
		boolean isLess = operand1 < operand2;
		boolean isGreaterOrEqual = operand1 >= operand2;
		boolean isLessOrEqual = operand1 <= operand2;

		System.out.println("Is Equal: " + isEqual);
		System.out.println("Is Not Equal: " + isNotEqual);
		System.out.println("Is Greater: " + isGreater);
		System.out.println("Is Less: " + isLess);
		System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
		System.out.println("Is Less or Equal: " + isLessOrEqual);

		/**
		 * Logical Operators
		 * 
		 * Logical operators are used to combine multiple conditions and determine the
		 * truth value of a compound expression. The following are the logical operators
		 * in Java:
		 * - AND (&&): Returns true if both operands are true.
		 * - OR (||): Returns true if at least one of the operands is true.
		 * - NOT (!): Returns true if the operand is false.
		 */
		System.out.println("\n\n--- Logical Operators ---");

		boolean condition1 = true;
		boolean condition2 = false;
		boolean andResult = condition1 && condition2;
		boolean orResult = condition1 || condition2;
		boolean notResult1 = !condition1;
		boolean notResult2 = !condition2;

		System.out.println("AND Result: " + andResult);
		System.out.println("OR Result: " + orResult);
		System.out.println("NOT Result 1: " + notResult1);
		System.out.println("NOT Result 2: " + notResult2);

		/**
		 * Assignment Operators
		 * 
		 * Assignment operators are used to assign values to variables. The following
		 * are the assignment operators in Java:
		 * - Assignment (=): Assigns the value of the right operand to the left operand.
		 * - Addition Assignment (+=): Adds the value of the right operand to the left
		 * operand and assigns the result to the left operand.
		 * - Subtraction Assignment (-=): Subtracts the value of the right operand from
		 * the left operand and assigns the result to the left operand.
		 * - Multiplication Assignment (*=): Multiplies the value of the right operand
		 * with the left operand and assigns the result to the left operand.
		 * - Division Assignment (/=): Divides the value of the left operand by the
		 * right
		 * operand and assigns the result to the left operand.
		 * - Modulus Assignment (%=): Computes the remainder of the division of the left
		 * operand by the right operand and assigns the result to the left operand.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
		 */
		System.out.println("\n\n--- Assignment Operators ---");

		int value = 10;
		value += 5;
		value -= 3;
		value *= 2;
		value /= 4;
		value %= 3;

		System.out.println("Value: " + value);

		/**
		 * Bitwise Operators
		 * 
		 * Bitwise operators are used to perform bitwise operations on integer operands.
		 * The following are the bitwise operators in Java:
		 * - AND (&): Performs a bitwise AND operation on the operands.
		 * - OR (|): Performs a bitwise OR operation on the operands.
		 * - XOR (^): Performs a bitwise XOR operation on the operands.
		 * - Complement (~): Performs a bitwise complement operation on the operand.
		 * - Left Shift (<<): Shifts the bits of the operand to the left by a specified
		 * number of positions.
		 * - Right Shift (>>): Shifts the bits of the operand to the right by a
		 * specified
		 * number of positions.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
		 */
		System.out.println("\n\n--- Bitwise Operators ---");

		int operand3 = 5;
		int operand4 = 3;
		int andResult1 = operand3 & operand4;
		int orResult1 = operand3 | operand4;
		int xorResult = operand3 ^ operand4;
		int complementResult = ~operand3;
		int leftShiftResult = operand3 << 1;
		int rightShiftResult = operand3 >> 1;

		System.out.println("AND Result 1: " + andResult1);
		System.out.println("OR Result 1: " + orResult1);
		System.out.println("XOR Result: " + xorResult);
		System.out.println("Complement Result: " + complementResult);
		System.out.println("Left Shift Result: " + leftShiftResult);
		System.out.println("Right Shift Result: " + rightShiftResult);

		/**
		 * Conditional Operator
		 * 
		 * The conditional operator is used to evaluate a boolean expression and return
		 * one of two values based on the result. The conditional operator has the
		 * following syntax:
		 * - condition ? value1 : value2
		 * 
		 * If the condition is true, the value of value1 is returned. If the condition
		 * is false, the value of value2 is returned.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		 */
		System.out.println("\n\n--- Conditional Operator ---");

		int number1 = 10;
		int number2 = 20;
		int max = (number1 > number2) ? number1 : number2;

		System.out.println("Max: " + max);

		/**
		 * instanceof Operator
		 * 
		 * The instanceof operator is used to test if an object is an instance of a
		 * particular class. The instanceof operator has the following syntax:
		 * - object instanceof class
		 * 
		 * If the object is an instance of the specified class or one of its subclasses,
		 * the instanceof operator returns true. Otherwise, it returns false.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		 */
		System.out.println("\n\n--- instanceof Operator ---");

		Object object = new Object();
		boolean isInstance = object instanceof Object;

		System.out.println("Is Instance: " + isInstance);

		/**
		 * Unary Operators
		 * 
		 * Unary operators are used to perform operations on a single operand. The
		 * following are the unary operators in Java:
		 * - Unary Plus (+): Returns the value of the operand.
		 * - Unary Minus (-): Negates the value of the operand.
		 * - Increment (++): Increments the value of the operand by 1.
		 * - Decrement (--): Decrements the value of the operand by 1.
		 * - Logical Complement (!): Returns the logical complement of the operand.
		 */
		System.out.println("\n\n--- Unary Operators ---");

		int operand5 = 10;
		int increment = ++operand5;
		int decrement = --operand5;
		boolean isTrue = true;
		boolean notResult3 = !isTrue;

		System.out.println("Increment: " + increment);
		System.out.println("Decrement: " + decrement);
		System.out.println("NOT Result 3: " + notResult3);

		/**
		 * Shift Operators
		 * 
		 * Shift operators are used to shift the bits of an integer value to the left or
		 * right. The following are the shift operators in Java:
		 * - Left Shift (<<): Shifts the bits of the operand to the left by a specified
		 * number of positions.
		 * - Right Shift (>>): Shifts the bits of the operand to the right by a
		 * specified number of positions.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
		 */
		System.out.println("\n\n--- Shift Operators ---");

		int operand6 = 5;
		int leftShiftResult1 = operand6 << 1;
		int rightShiftResult1 = operand6 >> 1;

		System.out.println("Left Shift Result 1: " + leftShiftResult1);
		System.out.println("Right Shift Result 1: " + rightShiftResult1);

		/**
		 * Ternary Operator
		 * 
		 * The ternary operator is a shorthand form of the if-else statement. The
		 * ternary
		 * operator has the following syntax:
		 * - condition ? value1 : value2
		 * 
		 * If the condition is true, the value of value1 is returned. If the condition
		 * is false, the value of value2 is returned.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		 */
		System.out.println("\n\n--- Ternary Operator ---");

		int number3 = 10;
		int number4 = 20;
		int min = (number3 < number4) ? number3 : number4;

		System.out.println("Min: " + min);
	}

	/**
	 * Method to Calculate the Sum of Variable Arguments
	 * 
	 * @param numbers the variable arguments to be added
	 * @return the sum of the variable arguments
	 */
	public static int add(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
