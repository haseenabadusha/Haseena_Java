class A{
public int data=40;
public void msg()
{
System.out.println("Hello java");
}
}
public class SimplePublic
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}