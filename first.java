public class first {
    public static void main(String[] args) {
        // will test the first code in this project and will explain the simple code for the coding language (java)
        System.out.println("Hello, World!");



        //              space

        // now we want to test the numbers on the code and explain what i do?
        System.out.println(5 + 3);
        // in this code we are adding 5 and 3 and will make the output is 8 because this is a number not a string text

        // will explain how can make a short comment and the long
        // this is a short comment
        /* this is a long comment
        and this is the second line of the long comment */

        // the short only in a one line
        // and the long on a multiple lines



        //              space

        // now we want to test variables and explain how can do it
        int num = 10; // on this is code making variable and name it "num" and put the vaule is number " 10"

        // and now we want to make a sum of variables like this
        int x = 5;
        int y = 3;
        int z = x + y;
        /* on this code will explain to how can make a variable on test x and the vaule is 5
        and make y variable and vaule of it is 3
        and make sum variable and name it "z" and the vaule is x + y
        cuz that the sum result is 8 because i'm do sum for x = 5 and y = 3 and the result is 8
        and we want to show it by System.out.println(z); to make output and print the vaule of z and the vaule is 8 */
        System.out.println(z);



        //              space

        // now on identifiers we want to explain what is that like that

        int minutesPerHour = 60;

        int m = 60;

        /* MinutesPerHour variable is so hard to type put is so easy to understand it
        put in m is so easy to type but hard to understand it
        
        cuz that we make the indetifiers to explain what i do */



        //              space

        // we want to now what is the Constant (final keyword)
        final int MINUTES_PER_HOUR = 60;
        // MINUTES_PER_HOUR = 70;

        /* this code will make an error because we can't change the value of the constant variable
        this will show error on (MINUTES_PER_HOUR = 70;) cuz i do (constant(final)) into (final int MINUTES_PER_HOUR = 60;)
        to make it the final vaule of (MINUTES_PER_HOUR)
        and the vaule is 60 not and constantly change it because this is the final value no any changes can do on it */



        //              space

        // Real-Life tests
        String StudentName = "Mohammed";
        int StudentID = 12;
        int StudentAge = 15;
        Float StudentFee = 75.60f;
        char StudentGrade = 'B';


        System.out.println("Student Name: " + StudentName);
        System.out.println("Student ID: " + StudentID);
        System.out.println("Student Age: " + StudentAge);
        System.out.println("Student Fee: " + StudentFee);
        System.out.println("Student Grade: " + StudentGrade);


        // Another Test
        int length = 7;
        int width = 3;
        int area;

        area = length * width;
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);


        
        //              space

        // The final exame to complete this tutorial how can do code

        /*
        [ do:
        Inside Main() thoose things:
        String variable name
        int variable age
        and print all of them ]
        */

        String name = "Esam";
        int age = 15;

        System.out.println(name);
        System.out.println(age);
        


        //              space

        // now we want to learn (Data Types)
        byte myByte = 100; // in byte the range is from -128 to 127
        short myShort = 5000; // in short the range is from -32,768 to 32,767
        int myInt = 100000; // in int the range is from -2,147,483,648 to 2,147,483,647
        long myLong = 100000L; // in long the range is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 5.75f; // in float the range is from 1.4E-45 to 3.4028235E38
        double myDouble = 19.99d; // in double the range is from 4.9E-324 to 1.7976931348623157E308
        boolean myBoolean = true; // in boolean the range is from true or false
        char myChar = 'A'; // in char (A)  is 65 in ASCII table  like (A + 1) is 66 in ASCII table and (A + 2) is 67 in ASCII table

        // in boolean the range is from true or false like:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // output is true
        System.out.println(isFishTasty); // output is false

        // in characters will explain how to put the characters in the code like this:
        char myGrade = 'B';
        System.out.println(myGrade); // output is B

        // another test of the characters like this:
        char test1 = 65, test2 = 66, test3 = 67;
        System.out.println(test1); // output is A
        System.out.println(test2); // output is B
        System.out.println(test3); // output is C

        // in strings will explain how to put the strings in the code like this:
        String greeting = "Hello World";
        System.out.println(greeting); // output is Hello World


        //              space

        // Real-Life tests of the data types
        int itemsongarage = 72;
        float coastperitem = 100.50f;
        float totalcoast = itemsongarage * coastperitem;
        char currency = '$';

        System.out.println("Items on Garage: " + itemsongarage);
        System.out.println("Coast per Item: " + coastperitem + currency);
        System.out.println("Total Coast: " + totalcoast + currency);



        //              space

        // non-primitive data types
        String myString = "Hello";
        // String is a non-primitive data type because it is an object, and it has methods to perform certain operations on strings.
        // but if you want a primiteve data type you can use char instead of String like this:
        char myChar1 = 'H';
        //char is a primitive data type cuz no any uppercase letter in the data type

        

        //              space

        // now we want to learn var data type
        var myVar = "Hello"; // String type
        // this is the var data type and when you put it the value of this variable is a string cuz that the value is "Hello" and the data type is String
        var myVar1 = 5; // int type
        // this is the var data type and when you put it the value of this variable is a int cuz that the value is 5 and the data type is int
        var myVar2 = 5.99; // double type
        // this is the var data type and when you put it the value of this variable is a double cuz that the value is 5.99 and the data type is double
        var myVar3 = 'A'; // char type
        // this is the var data type and when you put it the value of this variable is a char cuz that the value is 'A' and the data type is char
        var myVar4 = true; // boolean type
        // this is the var data type and when you put it the value of this variable is a boolean cuz that the value is true and the data type is boolean
        var myVar5 = 5.99f; // float type
        // this is the var data type and when you put it the value of this variable is a float cuz that the value is 5.99f and the data type is float
        var myVar6 = 100000L; // long type
        // this is the var data type and when you put it the value of this variable is a long cuz that the value is 100000L and the data type is long
        var myVar7 = 5000; // short type
        // this is the var data type and when you put it the value of this variable is a short cuz that the value is 5000 and the data type is short
        var myVar8 = 100; // byte type
        // this is the var data type and when you put it the value of this variable is a byte cuz that the value is 100 and the data type is byte



        //              space

        // now we want to learn type casting and explain how can do it
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myInt1); // output is 9

        
        int maxScore = 400;
        int userScore = 293;
        double percentage = (double) userScore / maxScore * 100.0d; // Manual casting
        System.out.println(percentage); // output is 73.25



        //              space

        // now we want to learn Operators
        // first one addition operator (+):
        int sum1 = 100 + 50; // output is 150
        System.out.println(sum1);

        // second one subtraction operator (-):
        int sum2 = 100 - 50; // output is 50
        System.out.println(sum2);

        // third one multiplication operator (*):
        int sum3 = 100 * 50; // output is 5000
        System.out.println(sum3);

        // fourth one division operator (/):
        int sum4 = 100 / 50; // output is 2
        System.out.println(sum4);

        // fifth one modulus operator (%):
        int sum5 = 100 % 50; // output is 0
        System.out.println(sum5);

        // sixth one increment operator (++):
        int sum6 = 100;
        sum6++; // output is 101
        System.out.println(sum6);

        // seventh one decrement operator (--):
        sum6--; // output is 100
        System.out.println(sum6);


        // assignment operator (=) + addition assignment operator (+=) + subtraction assignment operator (-=) + multiplication assignment operator (*=) + division assignment operator (/=) + modulus assignment operator (%=) + (&= + |= + ^= + <<= + >>= + >>>=):
        int sum7 = 100; // output is 100
        System.out.println(sum7);

        sum8 += 50; // output is 150
        System.out.println(sum8);

        sum9 -= 50; // output is 100
        System.out.println(sum9);

        sum10 *= 50; // output is 5000
        System.out.println(sum10);

        sum11 /= 50; // output is 100
        System.out.println(sum11);

        sum12 %= 50; // output is 0
        System.out.println(sum12);

        sum13 &= 50; // output is 0
        System.out.println(sum13);

        sum14 |= 50; // output is 50
        System.out.println(sum14);

        sum15 ^= 50; // output is 0
        System.out.println(sum15);
        
        sum16 <<= 50; // output is 0
        System.out.println(sum16);

        sum17 >>= 50; // output is 0
        System.out.println(sum17);

        sum18 >>>= 50; // output is 0
        System.out.println(sum18);

        // another one additional && + || + !:
        boolean sum19 = true && false; // output is false
        System.out.println(sum19);

        boolean sum20 = true || false; // output is true
        System.out.println(sum20);

        boolean sum21 = !true; // output is false
        System.out.println(sum21);



        //              space


        // now we want to learn (Precedence of Operators) and explain how can do it
        int sum22 = 10 + 5 * 2; // output is 20
        System.out.println(sum22);

        int sum23 = (10 + 5) * 2; // output is 30
        System.out.println(sum23);



        //              space

        // now will learn (Java Strings) and explain how can do it:
        String txt = "Hello World";
        System.out.println(txt); // output is Hello World

        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length()); // output is The length of the txt string is: 26

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); // output is HELLO WORLD by using the toUpperCase() method to convert the string to uppercase letters
        System.out.println(txt2.toLowerCase()); // output is hello world by using the toLowerCase() method to convert the string to lowercase letters

        String txt3 = "Hello World";
        System.out.println(txt3.indexOf("World")); // output is 6 by using the indexOf() method to return the index of the first occurrence of the specified value

        String txt4 = "Hello World";
        System.out.println(txt4.replace("World", "Java")); // output is Hello Java by using the replace() method to replace a specified value with another value in a string

        String txt5 = "Hello World";
        System.out.println(txt5.substring(0, 5)); // output is Hello by using the substring() method to extract a part of a string

        String txt6 = "Hello World";
        System.out.println(txt6.charAt(0)); // output is H by using the charAt() method to return the character at a specified index in a string

        String txt7 = "Hello World";
        String txt8 = "Hello World";
        System.out.println(txt7.equals(txt8)); // output is true by using the equals()

        String txt9 = "Hello World";
        String txt10 = "hello world";
        System.out.println(txt9.equalsIgnoreCase(txt10)); // output is true by using the equalsIgnoreCase() method to compare two strings, ignoring case considerations

        String txt11 = "   Hello World   ";
        System.out.println("Before: [" + txt11 + "]"); // output is Before: [   Hello World   ] by using the trim() method to remove whitespace from both ends of a string
        System.out.println("After: [" + txt11.trim() + "]"); // output is Hello World by using the trim() method



        //              space

        // now want to learn (Java String Concatination) and explain how can do it:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); // output is John Doe by using the + operator to concatenate two strings

        String firstName1 = "John";
        int age1 = 30;
        System.out.println("name: " + firstName1 + ", Age: " + age1); // output is name: John, Age: 30 by using the + operator to concatenate a string and an integer



        //              space

        // now want to learn (Java String Numbers and Strings) and explain how can do it:
        int x1 = 10;
        int y1 = 20;
        System.out.println(x1 + y1); // output is 30 by using the + operator to add two integers / numbers

        String x2 = "10";
        String y2 = "20";
        System.out.println(x2 + y2); // output is 1020 by using the + operator to concatenate two strings

        int x3 = 10;
        String y3 = "20";
        System.out.println(x3 + y3); // output is 1020 by using the + operator to concatenate an integer and a string



        //              space

        // now want to learn (Java String Special Characters) and explain how can do it:
        // The sequence \"  inserts a double quote in a string:
        String txt12 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt12); // output is We are the so-called "Vikings" from the north. by using the \" to escape the double quote character

        // The sequence \'  inserts a single quote in a string:
        String txt13 = "It\'s alright.";
        System.out.println(txt13); // output is It's alright. by using the \' to escape the single quote character

        //The sequence \\  inserts a single backslash in a string:
        String txt14 = "The character \\ is called backslash.";
        System.out.println(txt14); // output is The character \ is called backslash. by using the \\ to escape the backslash character

        // we have another sequences like (\n for: New Line, (\r for: Carriage Return), (\t for: Tab), (\b for: Backspace), (\f for: Form Feed) and we can use them in the string like this:
        String txt15 = "Hello\nWorld!";
        System.out.println(txt15); // output is Hello

        String txt16 = "Hello\rWorld!";
        System.out.println(txt16); // output is World! by using the \r to escape the carriage return character

        String txt17 = "Hello\tWorld!";
        System.out.println(txt17); // output is Hello    World! by using the \t to escape the tab character

        String txt18 = "Hello\bWorld!";
        System.out.println(txt18); // output is HelloWorld! by using the \b to escape the backspace character

        String txt19 = "Hello\fWorld!";
        System.out.println(txt19); // output is HelloWorld! by using the \f to escape the form feed character



        //              space

        // now we want to learn (Java Maths) and explain how can do it:
        Math.max(5, 10); // output is 10 by using the Math.max() method to return the largest of two numbers
        Math.min(5, 10); // output is 5 by using the Math.min() method to return the smallest of two numbers
        Math.sqrt(64); // output is 8.0 by using the Math.sqrt() method to return the square root of a number
        Math.abs(-4.7); // output is 4.7 by using the Math.abs() method to return the absolute value of a number
        Math.pow(2,8); // output is 256.0 by using the Math.pow() method to return the value of a number raised to a power\
        Math.round(4.7); // output is 5 by using the Math.round() method to round a number to the nearest integer
        Math.ceil(4.4); // output is 5.0 by using the Math.ceil() method to round a number upward to its nearest integer
        Math.floor(4.7); // output is 4.0 by using the Math.floor() method to round a number downward to its nearest integer
        Math.random(); // output is a random number between 0.0 and 1.0 by using the Math.random() method to return a random number between 0.0 and 1.0
        int RandomNumber = (int)(Math.random() * 101); /* output is a random number between 0 and 100 by using the Math.random() method to return a random number between 0.0 and 1.0 and then multiplying it by 101 to get a number between 0 and 100
        and then casting it to an integer to get rid of the decimal part */



        //              space

        // now we want to learn (Java Booleans) and explain how can do it:
        boolean isJavaFun1 = true; // output is true by using the boolean data type
        boolean isJavaFun2 = false; // output is false by using the boolean data type
        System.out.println(isJavaFun1); // output is true because the value of isJavaFun1 is true
        System.out.println(isJavaFun2); // output is false because the value of isJavaFun1 is true and the value of isJavaFun2 is false

        int x4 = 10;
        int y4 = 9;
        System.out.println(x4 > y4); // output is true by using the > operator to compare two numbers
        System.out.println(x4 < y4); // output is false by using the < operator to compare two numbers
        System.out.println(x4 == y4); // output is false by using the == operator to compare two numbers

        System.out.println(10 > 9); // output is true by using the > operator to compare two numbers because 10 is greater than 9

        int x5 = 10;
        System.out.println(x5 == 10); // output is true by using the == operator to compare two numbers because variable x5 is equal to 10\

        System.out.println(10 == 15); // output is false by using the == operator to compare two numbers because 10 is not equal to 15
    }
}