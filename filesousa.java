import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.io.FileNotFoundException;
class filesousa
{
public static void main(String argv[])
{
/*------------------�����_���������t�@�C���o��---------------------*/
 Random rnd = new Random();
try{
  File file = new File("filesousa.txt");
  FileWriter filewriter = new FileWriter(file);
  for(int i=0;i<10;i++)
  {
   int ran = rnd.nextInt(100);
  filewriter.write(ran+",");
  }
  filewriter.close();
}catch(IOException e){
  System.out.println(e);
}
/*-------------------�t�@�C���ǂݍ��݁��v�Z-------------------------*/
try{
 FileReader fr=new FileReader("filesousa.txt"); //FileReader�I�u�W�F�N�g�̍쐬
 int ch=0;
 int ch2=0;
 StreamTokenizer st=new StreamTokenizer(fr);     //StreamTokenizer�I�u�W�F�N�g�̍쐬

	int i=0;
    while(st.nextToken()!=StreamTokenizer.TT_EOF)   //�t�@�C���̏I���ɒB�����TT_EOF���Ԃ����̂ŁA�����Ń��[�v�I��
   {
	  ch=(int)st.nval;
      System.out.print(""+i+":"+ch+"  ");        //�ǂݎ�����f�[�^��\������B
	  i++;
	  ch2+=ch;
   }System.out.println(" = "+ch2);
       fr.close();
       }
       catch(Exception e)
          {
          System.out.println(e);  //�G���[���N������G���[���e��\��
          }
          }     
}