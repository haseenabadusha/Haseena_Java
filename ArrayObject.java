class pdt
{
  int pdtId;
  String pdtName;
  pdt(int pid,String pname)
  {
    pdtId=pid;
    pdtName=pname;
   }
   public void display()
   {
     System.out.print("Product id:"+pdtId+"\n"+"Product name:"+pdtName+"\n");
   }
}
public class ArrayObject
{
  public static void main(String args[])
  {
    pdt ob[]=new pdt[5];
    ob[0]=new pdt(1,"Pen");
    ob[1]=new pdt(2,"Pencil");
    ob[2]=new pdt(3,"Rubber");
    ob[3]=new pdt(4,"Scale");
    ob[4]=new pdt(5,"Cutter");
    System.out.println("Product object 1:");
    ob[0].display();
    System.out.println("\n Product object 2:");
    ob[1].display();
    System.out.println("\n Product object 3:");
    ob[2].display();
    System.out.println("\n Product object 4:");
    ob[3].display();
    System.out.println("\n Product object 5:");
    ob[4].display();
   }
}