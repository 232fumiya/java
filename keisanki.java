class keisanki
{
public static void main(String argv[])
{
//���́F��̐��l�����
System.out.print("���l����͂��Ă��������F");
int suuzi1 = new java.util.Scanner(System.in).nextInt();
System.out.print("�v�Z�L������͂��Ă�������:+ or - or * or / or %:");
String kigou = new java.util.Scanner(System.in).nextLine();
System.out.print("���l����͂��Ă��������F");
int suuzi2 = new java.util.Scanner(System.in).nextInt();
//�����F�����Z
int tasizan=suuzi1+suuzi2;
//�����F�����Z
int hikizan=suuzi1-suuzi2;
//�����F�|���Z
int kakezan=suuzi1*suuzi2;
//�����F����Z
int warizan=suuzi1/suuzi2;
//�����F�]��
int amari=suuzi1%suuzi2;
//�v�Z���ʂ��o��
if(kigou.equals("+"))
{
System.out.println("�����Z�F"+tasizan);
}
else if(kigou.equals("-"))
{
System.out.println("�����Z�F"+hikizan);
}
else if(kigou.equals("*"))
{
System.out.println("�|���Z�F"+kakezan);
}
else if(kigou.equals("/"))
{
System.out.println("����Z�F"+warizan);
}
else if(kigou.equals("%"))
{
System.out.println("�]��F"+amari);
}
}
}