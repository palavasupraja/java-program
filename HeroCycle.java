abstract class Cycle 
{
abstract void work();//method declaration 
}
class HeroCycle extends Cycle
{
void work()//method definition
{
 System.out.println("Selling good");
}
public static void main (String arg[])
{
Cycle o=new HeroCycle();
o.work();
System.out.println("code executed");
}
}
