import java.io.*;
import java.util.Random;
import java.util.ArrayList;
class filesousa2
{
public static void main(String argv[])
{
/*------------------�����_���������t�@�C���o��---------------------*/
 Random rnd = new Random();
try{
  File file = new File("filesousa.txt");
  FileWriter filewriter = new FileWriter(file);
  for(int i=0;i<100;i++)
  {
   int ran = rnd.nextInt(1000);
  filewriter.write(ran+",");
  }
  filewriter.close();
}catch(IOException e){
  System.out.println(e);
}
/*-------------------�t�@�C���ǂݍ��݁��v�Z-------------------------*/
try{
 //FileReader fr=new FileReader("filesousa.txt"); //FileReader�I�u�W�F�N�g�̍쐬
int kazu=0;
 BufferedReader br = new BufferedReader(new FileReader("filesousa.txt"));
 String line = null;
while((line = br.readLine()) != null) {//1.line�Ńe�L�X�g�t�@�C������P�s���ǂݍ���
String[] array = line.split(",");//2.���̂P�s���J���}�ŋ�؂��ē�̗v�f�ɂ���
for(int i=0;i<100;i++)
{
System.out.print(array[i]+"  ");
int suuchi = new Integer(array[i]).intValue();  
kazu=kazu+suuchi;
}
System.out.print("="+kazu); 
}
       }
       catch(Exception e)
          {
          System.out.println(e);  //�G���[���N������G���[���e��\��
          }
          }     
}