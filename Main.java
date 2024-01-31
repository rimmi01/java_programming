class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hi");
        // Print different types of data
        // System.out.println(156 + 7);  // Integer + integer
        // System.out.println("156" + "7"); // string + string
        // System.out.println("156" + 7); // string +int (type casting is done here, the int is converted to string, it happens behind the print function)

        // Int Data
        int marks = 80;
        // System.out.println("marks " + (marks + 1));

        int a = 10;
        int b = a;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a + b);

        // Long Datatype
        // You should not convert from Long to Int to avoid overflow
        long distance = 12342343545680745L; //Long numbers should terminate with L, as a rule of java
        short planets = 9;
        long planets_count = 9L;
        int dist = (int)distance;  // Explicit Typecasting
        // System.out.println(distance);
        // System.out.println(dist);


        // Short 
        short red_pixel = 200;
        byte age = 29;
        int money = 1884/378;
        // System.out.println(red_pixel);
        // System.out.println(age);
        // System.out.println(money);

        // Float and Doubles(more precision)
        // by default java treats everything as a doubles
        double price = 75.30;
        float cost = (float)32.50;
        // System.out.println(cost);

        // Char    // Char is used to convert it's numeric values to it's character values
        char letter = 'A';   // letters in char datatype, can only be written in single quotes, and not the double quotes, if you write it in the double quotes, then, it will give a compile time error
        // System.out.println(letter); // converting char to int
        
        int number = (int)letter;  // Typecast char to int
        // System.out.println(number);

        char ch = (char)65;   //
        System.out.println(ch);

        // Add Chars
        System.out.println("A" + "B");   // 131 addition
        System.out.println("A" + "B");   // AB concatenation
        // Important understanding of how important are these short and long datatype

        // Add Strings
        boolean x;  // Creating a variable
        x = true;  // Assign a value of later
        boolean y = false;  // Initialisation(creating + assigning value)
        System.out.println(x);
        System.out.println(y);


        // *************Arithmetic Operators (+, -, *, /, %) ***************************//

        
        
    }
}

// Why we have 4 different data-types for integers?
// long(64 bite), int(32 bite), short(16 bite~10^9), byte(8 bite~10^18)