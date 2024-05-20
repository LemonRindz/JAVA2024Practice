/*
    05.16.2024 Imani Hollie
    Starting Out With Programming Logic and Design 5E Ch. 2
    Input, Processing, and Output in Java
*/

import java.util.Scanner;
//This import statement tells the Java compiler that you'll make
//a 'Scanner' object

//When starting a new Java Program, write a class declaration:
public class JavaP1
/*
    A class is a type of container
    'public' and 'class' are keyworks;
    In Java keywords are in lowercase.
    'Practice1' is the name of the class;
    In practice, capitalize the first character.
    The class name must be the same as the filename;
    EX. Simple is stored in Simple.java
    Curly braces [{}] enclose the method inside of the class
*/
{
    //When writing code, write a method declaration:
    public static void main (String[] args)
    /*
        A method is another type of container
        'main' is the name of the method;
        In practice, utilize camelcase.
        The method header must be as follows:
        'public static void main'
        [{}] encloses the code inside of the method
    */
    {
       //Write code within the [{}]
    }

    public static void output1a2 (String[] args)
    {
        System.out.println('My major is Computer Science.',
                           'I plan to be a software developer.');
        /*
            The 'System.out.println()' statement displays a line of
            output on separate lines by advancing the output cursor
            to the next line
            Write a string inside of the parentheses [()]
            encased in single or double apostrophes [''/""]
            End the statement with a semicolon [;]
            Class and Method headers and [{}] don't need [;]
            because they're not statements
            You can separate strings you want on different lines
            by using a comma [,]
        */
        System.out.print('Programming ');
        System.out.print('is ');
        System.out.print('fun!');
        /*
            The 'System.out.print()' statement displays a line of output
            on the same line. To separate words, you have to insert
            spaces between the strings displayed.
        */
    }

    public static void variableDemo (String[] args)
    {
        /*
            The 'DataType VariableName;' (variable declaration) 
            statement must be used prior to using them in the program
            'DataType' is the name of a Java data type
            'VariableName' is the name of the variable declared
            There are rules when naming variables in Java:
                The first character must be a letter, underscore [_],
                or dollar sign [$]
                The second character and etc. can incldue digits [0-9]
                Uppercase and Lowercase letters are distinct
                Variable names cannot include spaces
            End the statement with a [;]
            Variables can be initialized when they are declared

        */
        String name = 'Imani Hollie';
        int hours = 40, overtime = 20;
        //Several variables can be declared in the same statement
        double pay = 852.99;
        /*
            The 'int' data type holds Integers in a range
            of -2,147,483,648 to 2,147,483,647
            The 'float' data type holds Floating-Point Numbers
            (Decimals) in a range of +/-3.4*10^-38 to +/-3.4*10^38,
            with 7 digits of accuracy
            The 'double' data type holds Decimals in a range of
            +/-1.7*10^-308 to +/-1.7*10^308,
            with 15 digits of accuracy
            'String' is written with an initial uppercase and isn't
            considered a data type in Java - it is a class -
            The 'String' class holds strings of text
        */
        System.out.println(name, hours, overtime, pay);
    }

    public static void getInputAndGrossPay (String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
            To read keyboard input in Java create a 'Scanner' object
            which can read values from the keyboard and assign them
            to variables
            The earlier import statement ('import java.util.Scanner') tells
            the Java compiler that you'll make a 'Scanner' object later on
            in the program
            The 'Scanner' declaration statement creates the 'Scanner' object
            'input' is the object name
        */
        String name;
        int hours;
        final double PAY_RATE = 15.25;
        /*
            You can create named constants in Java using the 'final' keyword
            in a variable declaration just before the data type
            In practice, the constant name is then written in all uppercase letter
        */
        float grossPay;

        System.out.print('Enter your name: ');
        name = input.nextLine();
        //'input' reads a string value and assigns it to the name variable
        
        System.out.println('Enter number of hours worked: ');
        hours = input.nextInt();
        //'input' reads an integer value and assigns it to the name variable
        
        grossPay = PAY_RATE * hours;
        /*
            Arithmetic operators are used to calculate values and assign them to
            variables. Common math operators include the following:
                Addition [+], Subtraction [-], Multiplication [*], Division [/],
                Modulus [MOD or %] (divides and gives the remainder), Exponent [^ or **]
            For Java the Modulus operator is the percent sign [%]
            There isn't an exponent operator, but there is a the 'Math.pow' method which
            takes two double arguments and rasies the first to the second to return
            the result as a double.
            EX. result = Math.pow(4.0, 2.0) which is like result = 4^2
        */

        System.out.println(name + ' worked for ' + hours + ' hours.',
                           'You are due ' + grossPay);
        /*
            The string concatenation operator [+] appends strings together
            by combining two strings used as its operands
            It can also be used to concatenate the contents of a
            variable to a string
        */
    }
}