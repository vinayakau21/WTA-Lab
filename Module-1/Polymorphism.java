class MethodOverloading {
    static int Multiply(int a, int b)
    {
        return a * b;
    }

    static double Multiply(double a, double b)
    {
        return a * b;
    }
 
    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}

class constructorOverloading {
    int a, b, c;
    constructorOverloading() {
        a = b = c = 0;
        System.out.println("Default constructor: " + a + " " + b + " " + c);
    }
    constructorOverloading(int x, int y, int z) {
        a = x;
        b = y;
        c = z;

        System.out.println("Overloaded constructor: " + a + " " + b + " " + c);
    }
}

class Parent {
    static void Print() {
        System.out.println("Parent");
    }
}

class Child1 extends Parent {
    static void Print() {
        System.out.println("Child1 Overriding parent methods");
    }
}

class Child2 extends Parent {
    static void Print() {
        System.out.println("Child2 Overriding parent methods");
    }
}

class Polymorphism {
    public static void main(String[] args)
    {
        System.out.println(MethodOverloading.Multiply(2, 4));
        System.out.println(MethodOverloading.Multiply(2.5, 1.5));
        System.out.println(MethodOverloading.Multiply(2, 7, 3));

        constructorOverloading obj1 = new constructorOverloading();
        constructorOverloading obj2 = new constructorOverloading(1, 3, 4);

        Child1 obj3 = new Child1();
        obj3.Print();
        Child2 obj4 = new Child2();
        obj4.Print();
    }   
}