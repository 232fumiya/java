import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.FileReader;
import java.io.FileNotFoundException;
class filesousa
{
public static void main(String argv[])
{
/*------------------ランダム生成＆ファイル出力---------------------*/
 Random rnd = new Random();
try{
  File file = new File("filesousa.txt");
  FileWriter filewriter = new FileWriter(file);
  for(int i=0;i<100;i++)
  {
   int ran = rnd.nextInt(10);
  filewriter.write(ran+",");
  }
  filewriter.close();
}catch(IOException e){
  System.out.println(e);
}
/*-------------------ファイル読み込み＆計算-------------------------*/
try{
 File file2 = new File("filesousa.txt");
 FileReader filereader = new FileReader(file2);
 int ch = filereader.read();
 int ch2=0;
 while(ch!=-1){
    System.out.print((char)ch);
	if((int)ch != 44)
	{
	ch2+=ch;
	}
	else
	{
	ch2-=44;
	//結果が5000を越えるのは","の44が足されているから??
	}
	ch = filereader.read();
 }
 System.out.println("合計："+ch2);
}catch(FileNotFoundException e){
  System.out.println(e);
}catch(IOException e){
  System.out.println(e);
}
}
}