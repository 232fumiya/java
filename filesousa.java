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
/*------------------ランダム生成＆ファイル出力---------------------*/
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
/*-------------------ファイル読み込み＆計算-------------------------*/
try{
 FileReader fr=new FileReader("filesousa.txt"); //FileReaderオブジェクトの作成
 int ch=0;
 int ch2=0;
 StreamTokenizer st=new StreamTokenizer(fr);     //StreamTokenizerオブジェクトの作成

	int i=0;
    while(st.nextToken()!=StreamTokenizer.TT_EOF)   //ファイルの終わりに達するとTT_EOFが返されるので、そこでループ終了
   {
	  ch=(int)st.nval;
      System.out.print(""+i+":"+ch+"  ");        //読み取ったデータを表示する。
	  i++;
	  ch2+=ch;
   }System.out.println(" = "+ch2);
       fr.close();
       }
       catch(Exception e)
          {
          System.out.println(e);  //エラーが起きたらエラー内容を表示
          }
          }     
}