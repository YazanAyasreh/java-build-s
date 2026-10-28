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

        
    }
}