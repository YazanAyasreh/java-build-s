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
    }
}