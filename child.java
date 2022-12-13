class Parent
{
public void work()
{
System.out.println("parent is under retirement from work.");
}
}
class child  extends Parent
{
public void work()
{
 System.out.println("child has a job");
 System.out.println("he is doing it well");
}
public static void main(String args[])
{
child cl=new child ();
cl.work();
}
}