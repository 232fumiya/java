class keisanki
{
public static void main(String argv[])
{
//入力：二つの数値を入力
System.out.print("数値を入力してください：");
int suuzi1 = new java.util.Scanner(System.in).nextInt();
System.out.print("計算記号を入力してください:+ or - or * or / or %:");
String kigou = new java.util.Scanner(System.in).nextLine();
System.out.print("数値を入力してください：");
int suuzi2 = new java.util.Scanner(System.in).nextInt();
//処理：足し算
int tasizan=suuzi1+suuzi2;
//処理：引き算
int hikizan=suuzi1-suuzi2;
//処理：掛け算
int kakezan=suuzi1*suuzi2;
//処理：割り算
int warizan=suuzi1/suuzi2;
//処理：余り
int amari=suuzi1%suuzi2;
//計算結果を出力
if(kigou.equals("+"))
{
System.out.println("足し算："+tasizan);
}
else if(kigou.equals("-"))
{
System.out.println("引き算："+hikizan);
}
else if(kigou.equals("*"))
{
System.out.println("掛け算："+kakezan);
}
else if(kigou.equals("/"))
{
System.out.println("割り算："+warizan);
}
else if(kigou.equals("%"))
{
System.out.println("余り："+amari);
}
}
}