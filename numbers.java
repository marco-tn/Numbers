//異なる3桁の数字を当てるゲームです。
import java.io.*;

public class numbers{
	public static void main(String[]args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("これは数字を3つ当てるゲームです。");
			System.out.println("答えは0~9の中の異なる3つの数字です。");
			System.out.println("位置と数字が合っていたらEAT、数字は合っているが位置が合っていない場合はBITEとなります。");
			System.out.println("EAT、BITEの数から答えを推測し7回以内に3EATとなればあなたの勝ちです。");
			int[] a = new int[3];
			int[] b = new int[3];
			int c = 0,d = 0,u = 0;
			for (int f = 0;f < 3;f++){
			boolean g = false;
			a[f] = (int)(Math.random () * 10);
			do{
			g = false;
			for (int h = f-1;h>=0;h--){if(a[f] == a[h]){
			g = true;
			a[f] = (int)(Math.random () * 10);
			}
			}
			}while (g == true);
			}
			while(true){
			u++;
			System.out.println(""+u+"回目です。");
			for (int f = 0;f < 3;f++){
			System.out.println((f+1)+"個目を入力してください。");
			try{
			b[f] = Integer.parseInt(reader.readLine());
			if(b[f] < 0 || 10 <= b[f]){System.err.println("0~9の数値を入力してください。");return;}
			}catch(NumberFormatException e){System.err.println("0~9の数値を入力してください。");
			f--;
			}catch(IOException e){
			System.err.println("もう一度入力してください。");
			f--;
			}
			}
			c = 0;
			d = 0;
			for (int f = 0;f < 3;f++){for (int h = 0;h < 3;h++){
			if(f == h&&b[f] == a[h]){
			c++;
			}else if (b[f] == a[h]){
			d++;
			}
			}
			}
			System.out.println(+c+"EAT"+d+"BITE");
			if(c == 3){
			System.out.println("Congratulations!!");
			System.out.println("You're a winner!!");
			break;
			}else if(u == 7){
			System.out.println("You're a loser!!");
			System.out.println("答えは");
			System.out.println("1個目は"+a[0]);
			System.out.println("2個目は"+a[1]);
			System.out.println("3個目は"+a[2]);
			break;
			}
			}
	}
}