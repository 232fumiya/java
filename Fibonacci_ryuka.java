import java.math.BigDecimal;
class Fibonacci_ryuka
{
public static void main(String argv[])
{
/*--------------------�t�B�{�i�b�`---------------------------*/
System.out.print("�t�B�{�i�b�`����F");
//���ׂ������������Ă���
int f_kazu = new java.util.Scanner(System.in).nextInt();
//���ׂ������̔z���p�ӂ���
BigDecimal [] f = new BigDecimal[f_kazu];
//error�\���΍􁕏����l�ݒ�
if(f_kazu>0)
	f[0]=BigDecimal.valueOf(0);
if(f_kazu>1)
	f[1]=BigDecimal.valueOf(1);
//���ׂ��������J��Ԃ��v�Z
for(int i=0;i<f_kazu;i++)
{
	if(i>1)
		f[i]=f[i-1].add(f[i-2]);
	//���ʏo��
	System.out.println(i+1+"�Ԗ�:"+f[i]);
}
/*----------------------�����J-------------------------*/
System.out.print("�����J����F");
//���ׂ������������Ă���
int r_kazu = new java.util.Scanner(System.in).nextInt();
//���ׂ������̔z���p�ӂ���
BigDecimal [] r = new BigDecimal[r_kazu];
BigDecimal sum=BigDecimal.valueOf(0);
//error�\���΍􁕏����l�ݒ�
if(r_kazu>0)
	r[0]=BigDecimal.valueOf(1);
if(r_kazu>1)
	r[1]=BigDecimal.valueOf(3);
//���ׂ��������J��Ԃ��v�Z
for(int j=0;j<r_kazu;j++)
{	
	if(j>1)
		r[j]=r[j-1].add(r[j-2]);
	sum=r[j].add(sum);
	//���ʏo��
	System.out.println(j+1+"�Ԗ�:"+r[j]);
}
	System.out.println("���v�F"+sum);
}
}