class Teacher
{
void teach()
{
System.out.println("Teaching subjects");
}
}
class students extends Teacher
{
void listen()
{
System.out.println("listening to teacher");
}
}
class check
{
public static void main(String args[])
{
students s1=new students();
s1.teach();
s1.listen();
}
}