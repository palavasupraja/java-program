class Mltply
{
void mul(int a, int b)
{
System.out.println("Multiplication of two="+(a*b));
}
void mul(int a, int b, int c)
{
System.out.println("Multiplication of three="+(a*b*c));
}
}
class polymorphisam
{
public static void main(String args[])
{
Mltply m=new Mltply();
m.mul(6,10);
m.mul(10,6,5);
}
}