class Emp
{
 int eid;
 String name;
 Emp(int eid,String name)//p.constructor
 {
    this.eid=eid;
    this.name=name;
 }
 void show()
 {
    System.out.println(eid+""+name);
 }
 public static void main(String args[])
 {
 Emp e1=new Emp(1006,"karlos");
 Emp e2=new Emp(1008,"ray");
 e1.show();
 e2.show();
 }
}