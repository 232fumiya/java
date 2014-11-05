import java.math.BigDecimal;
class Fibonacci_ryuka
{
public static void main(String argv[])
{
/*--------------------フィボナッチ---------------------------*/
System.out.print("フィボナッチ数列の調べたい数を入れてください：");
//調べたい数を持ってくる
int f_kazu = new java.util.Scanner(System.in).nextInt();
//調べたい数の配列を用意する
BigDecimal [] f = new BigDecimal[f_kazu];
//error表示対策＆初期値設定
if(f_kazu>0)
	f[0]=BigDecimal.valueOf(0);
if(f_kazu>1)
	f[1]=BigDecimal.valueOf(1);
//調べたい数を繰り返し計算
for(int i=0;i<f_kazu;i++)
{
	if(i>1)
		f[i]=f[i-1].add(f[i-2]);
	//結果出力
	System.out.println(f[i]);
}
/*----------------------リュカ-------------------------*/
System.out.print("リュカ数列の調べたい数を入れてください：");
//調べたい数を持ってくる
int r_kazu = new java.util.Scanner(System.in).nextInt();
//調べたい数の配列を用意する
BigDecimal [] r = new BigDecimal[r_kazu];
//error表示対策＆初期値設定
if(r_kazu>0)
	r[0]=BigDecimal.valueOf(1);
if(r_kazu>1)
	r[1]=BigDecimal.valueOf(3);
//調べたい数を繰り返し計算
for(int j=0;j<r_kazu;j++)
{	
	if(j>1)
		r[j]=r[j-1].add(r[j-2]);
	//結果出力
	System.out.println(r[j]);
}
}
}