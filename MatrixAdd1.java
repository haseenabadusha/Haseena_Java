import java.util.Scanner;
public class MatrixAdd1
{
public static void main(String[] args)
{
int p,q,m,n;
Scanner s= new Scanner(System.in);
System.out.print("Enter nuber of rows in first matrix");
p=s.nextInt();
System.out.print("Enter nuber of colunsin first matrix");
q=s.nextInt();
System.out.print("Enter nuber of rows in secondmatrix");
m=s.nextInt();
System.out.print("Enter nuber of colunsin second matrix");
n=s.nextInt();

if (p==m&&q==n)
{
int a[][]=new int[p][q];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("Ente all the elements of the first matrix");
for(int i=0;i<p;i++)
	for(int j=0;j<q;j++)
	a[i][j]=s.nextInt();
System.out.println("Ente all the elements of the second matrix");
for(int i=0;i<m;i++)
	for(int j=0;j<n;j++)
	b[i][j]=s.nextInt();

System.out.println("First matrix:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
System.out.print(a[i][j]+"_");
System.out.println("");
}
System.out.println("second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
System.out.print(b[i][j]+"_");
System.out.println("");
}

for(int i=0;i<p;i++)
	for(int j=0;j<n;j++)
	   for(int k=0;k<q;k++)
	      c[i][j]=a[i][j]+b[i][j];

System.out.println(" matrix after addition:");
for(int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
System.out.print(c[i][j]+"_");
System.out.println("");
}
}
else
{
System.out.println("Addition would not done");
}
}
}





