abstract class demo
{
  abstract void add();
   void display()
    {
       System.out.println("im concreat method");

     }
}

 
class abstract1 extends demo
 {
    public void add()
    {
     System.out.println("im abstract method");
    }



   
   public static void main(String args[])
    {
      abstract1 d=new abstract1();
      d.add();
      d.display();
    }
 }