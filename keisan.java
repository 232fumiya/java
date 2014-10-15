class keisan
{
public static void main(String argv[])
{
//入力：二つの数値を入力
System.out.print("数値を入力してください：");
int suuzi1 = new java.util.Scanner(System.in).nextInt();
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
System.out.println("足し算："+tasizan);
System.out.println("引き算："+hikizan);
System.out.println("掛け算："+kakezan);
System.out.println("割り算："+warizan);
System.out.println("余り："+amari);
}
}