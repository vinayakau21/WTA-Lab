class A
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
   public void methodC()
   {
      super.methodA();
      System.out.println("method of Class C");
   }
   public void methodA() {
      System.out.println("Overriding class A method");
   }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodC();
    }
}
