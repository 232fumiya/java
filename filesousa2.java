import java.io.*;
import java.util.Random;
import java.util.ArrayList;
class filesousa2
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
   int ran = rnd.nextInt(1000);
  filewriter.write(ran+",");
  }
  filewriter.close();
}catch(IOException e){
  System.out.println(e);
}
/*-------------------ファイル読み込み＆計算-------------------------*/
try{
 //FileReader fr=new FileReader("filesousa.txt"); //FileReaderオブジェクトの作成
int kazu=0;
 BufferedReader br = new BufferedReader(new FileReader("filesousa.txt"));
 String line = null;
while((line = br.readLine()) != null) {//1.lineでテキストファイルから１行ずつ読み込む
String[] array = line.split(",");//2.その１行をカンマで区切って二つの要素にする
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
          System.out.println(e);  //エラーが起きたらエラー内容を表示
          }
          }     
}