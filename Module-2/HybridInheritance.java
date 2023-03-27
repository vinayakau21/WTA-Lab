// There are other types also. Explore them.

class HumanBody  
{  
    public void displayHuman()  
    {  
        System.out.println("Method defined inside HumanBody class");  
    }  
}

interface Male  
{  
    public void show();  
}

interface Female  
{  
    public void show();  
}

public class HybridInheritance extends HumanBody implements Male, Female  
{  
    public void show()  
    {  
        System.out.println("Implementation of show() method defined in interfaces Male and Female");  
    }    
    public void displayChild()  
    {  
        System.out.println("Method defined inside Child class");  
    }   
    public static void main(String args[])  
    {  
        HybridInheritance obj = new HybridInheritance();  
        System.out.println("Implementation of Hybrid Inheritance in Java");  
        obj.show();  
        obj.displayChild();  
    }  
} 