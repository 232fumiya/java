class Fibonacci
{
public static void main(String argv[])
{
/*---------------------------------*/
System.out.print("フィボナッチ数列の調べたい数を入れてください：");
int f_kazu = new java.util.Scanner(System.in).nextInt();
long f[] = new long[f_kazu];
f[0]=0;
f[1]=1;
for(int i=0;i<f_kazu;i++)
{
if(i>1)
{
	f[i]=f[i-1]+f[i-2];
}
System.out.println(f[i]);
}
/*--------------------------------*/
System.out.print("リュカ数列の調べたい数を入れてください：");
int r_kazu = new java.util.Scanner(System.in).nextInt();
long r[]=new long[r_kazu];
r[0]=1;
r[1]=3;
for(int j=0;j<r_kazu;j++)
{
if(j>1)
{
	r[j]=r[j-1]+r[j-2];
}
System.out.println(r[j]);
}
}
}