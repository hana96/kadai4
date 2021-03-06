import java.util.*;
import java.io.*;

public class IsOpenNow {
	static int[] holiday = new int[7];//休みの曜日
	static int opent = 0;
	static int closet = 0;
	public static boolean isOpenNow(int dayOfWeek,int hour){
		for(int i = 0;holiday[i]!=0;i++){
			if(dayOfWeek == holiday[i]) {
				return false;
			}
		}
		return opent <= hour && hour < closet;
	}
	public static boolean isOpenNow() {
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		return isOpenNow(dayOfWeek,hour);
	}
	public static boolean fileRead(String fileN){
		try{
			File file = new File(fileN);
			BufferedReader br=new BufferedReader(new FileReader(file));
			String str=br.readLine();
			String[] holidayf=str.split("\t");  //タブで区切る
			for(int i = 0;i < holidayf.length;i++){
				holiday[i] = Integer.parseInt(holidayf[i]);//休みの曜日を入れる
			}
			str = br.readLine();
			String[] timef = str.split("\t");
			opent = Integer.parseInt(timef[0]);//開店時間を入れる
			closet = Integer.parseInt(timef[1]);//閉店時間を入れる
			br.close();
			return true;
		}catch(FileNotFoundException e){
			System.out.println(e);
			return false;
		}catch(IOException e){
			System.out.println(e);
			return false;
		}
	}
}
