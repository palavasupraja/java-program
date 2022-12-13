class Example1
{
public static void main(String Args[])
 {
int num1,num2;
try   
{
num1=0;
num2=62/num1;
System.out.println(num2);
System.out.println("hey i'm at the end of try block");
}
catch(ArithmeticException e)
{
 System.out.println("you should not divide a number by zero");
}
catch(Exception e)
{
System.out.println("exception occured");
}
System.out.println("i'm out of try-catch block in java.");
 }
}