class Example2
{
publicstaticvoidmain (String args[])
{
Try
{
int a[]=new int[7];
a[4]=30/0;
System.out.println("first print statement in try block");
}
catch(AirthmeticException e)
{
System.out.println("warning:ArithmeticException");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("warning:ArrayIndexOutOfBoundsException");
}
catch(Exception e)
{
 System.out.println("warning:Some Other exception");
 System.out.println("Out of try-catch block...");
}
}
