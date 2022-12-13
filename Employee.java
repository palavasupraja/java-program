class Employee
{
int wt=8;
}
class clerk extends Employee //public class
clerk :: Employee
{
int wt=10; work time
void display()
{
System.out.println(super.wt); //will print work
 of employee
Time
public static void main(String args[])
{
 clerk c=new clerk();
 c.display();
}
}
