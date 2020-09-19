package com.jiangsu.guokang;

import java.util.Scanner;

public class wuXingDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//1: 获取五行年
		System.out.println("请输入您的生辰年：");
		int year = scan.nextInt();
		
		String yearStr1 = getYearBySky(year);
		System.out.println(year+ "年；根据天地算法，您的干支年为：" + yearStr1);
		
		//2:获取五行月
		System.out.println("请输入您的生辰月份农历(1-12)：");
		int month = scan.nextInt();
		
		String monthStr = getMonth(yearStr1,month);
		System.out.println(month + "月；您的干支月为：" + monthStr);
		
		//3:获取五行日
		System.out.println("请输入您的生辰月份阳历(1-12)：");
		int ymonth = scan.nextInt();
		
		System.out.println("请输入你的生辰日：");
		int day = scan.nextInt();
		
		String dayStr = getDay(year,ymonth,day);
		System.out.println(day + "日；您的干支月为：" + dayStr);
	
		//4:获取五行时
		System.out.println("请输入你的生辰时(0-23)：");
		int hour = scan.nextInt();
		
		String hourStr = getHour(dayStr,hour);
	}

	/**
	 * 	获取时辰
	 * 
	 * 	甲子、乙丑、丙寅、丁卯、戊辰、己巳、庚午、辛未、壬申、癸酉、甲戌、乙亥、
		丙子、丁丑、戊寅、己卯、庚辰、辛巳、壬午、癸未、甲申、乙酉、丙戌、丁亥、
		戊子、己丑、庚寅、辛卯、壬辰、癸巳、甲午、乙未、丙申、丁酉、戊戌、己亥、
		庚子、辛丑、壬寅、癸卯、甲辰、乙巳、丙午、丁未、戊申、己酉、庚戌、辛亥、
		壬子、癸丑、甲寅、乙卯、丙辰、丁巳、戊午、己未、庚申、辛酉、壬戌、癸亥
	 */
	private static String getHour(String dayStr, int hour) {
		return null;
	}

	/**
	 * 
	 * 	天干结果： 1(甲)；2(乙)；3(丙)；4(丁)；5(戊)；6(己)；7(庚)；8(辛)； 9(壬)；10(癸)
		地支结果： 1(子)；2(丑)；3(寅)；4(卯)；5(辰)；6(巳)；7(午)；8(未)；9(申)；10(酉)；11(戌)；12(亥)
	 * 
	 * @param month:阳历的月份
	 */
	private static String getDay(int year, int month, int day) {
		
		int y1 = year / 1000;
		int y2 = year % 1000 / 100;
		int y3 = year % 1000 % 100 / 10;
		int y4 = year % 1000 % 100 % 10;
		
		int a = y1*10 + y2; //年份的前两位
		int b = y3*10 + y4; //年份的后两位
		
		//获取月份c；
		int c = month;
		if(c == 1) {
			c = 13;
		}else if(c == 2) {
			c = 14;
		}
		
		int d = day;//获取日期
		
		int e = month % 2 == 0 ? 6 : 0;//获取e 偶数月为6；奇数月为0
		
		//如果c等于13或14；年后两位需要减一
		if(c == 13 || c == 14) {
			b--;
		}

		int tg = (4*a + a/4 + 5*b + b/4 + 3*(c+1)/5 + d - 3) % 10;
		int dz = (8*a + a/4 + 5*b + b/4 + 3*(c+1)/5 + d + 7 + e) % 12;
		
		
		//天干结果： 1(甲)；2(乙)；3(丙)；4(丁)；5(戊)；6(己)；7(庚)；8(辛)； 9(壬)；10(癸)
		String tgStr;
		
		if(tg == 1) {
			tgStr = "甲";
		}else if(tg == 2) {
			tgStr = "乙";
		}else if(tg == 3) {
			tgStr = "丙";
		}else if(tg == 4) {
			tgStr = "丁";
		}else if(tg == 5) {
			tgStr = "戊";
		}else if(tg == 6) {
			tgStr = "己";
		}else if(tg == 7) {
			tgStr = "庚";
		}else if(tg == 8) {
			tgStr = "辛";
		}else if(tg == 9) {
			tgStr = "壬";
		}else{
			tgStr = "癸";
		}
		
		//地支结果： 1(子)；2(丑)；3(寅)；4(卯)；5(辰)；6(巳)；7(午)；8(未)；9(申)；10(酉)；11(戌)；12(亥)
		String dzStr;
		if(dz == 1) {
			dzStr = "子";
		}else if(dz == 2) {
			dzStr = "丑";
		}else if(dz == 3) {
			dzStr = "寅";
		}else if(dz == 4) {
			dzStr = "卯";
		}else if(dz == 5) {
			dzStr = "辰";
		}else if(dz == 6) {
			dzStr = "巳";
		}else if(dz == 7) {
			dzStr = "午";
		}else if(dz == 8) {
			dzStr = "未";
		}else if(dz == 9) {
			dzStr = "申";
		}else if(dz == 10) {
			dzStr = "酉";
		}else if(dz == 11) {
			dzStr = "戌";
		}else {
			dzStr = "亥";
		}
		
		return tgStr + dzStr;
	}

	
	/**
	 * 
	 * 	年天干	正月	二月	三月	四月	五月	六月	七月	八月	九月	十月	十一月    十二月
		甲、己	丙寅	丁卯	戊辰	己巳	庚午	辛未	壬申	癸酉	甲戌	乙亥	丙子	      丁丑
		乙、庚	戊寅	己卯	庚辰	辛巳	壬午	癸未	甲申	乙酉	丙戌	丁亥	戊子	      己丑
		丙、辛	庚寅	辛卯	壬辰	癸巳	甲午	乙未	丙申	丁酉	戊戌	己亥	庚子	      辛丑
		丁、壬	壬寅	癸卯	甲辰	乙巳	丙午	丁未	戊申	己酉	庚戌	辛亥	壬子	      癸丑
		戊、癸	甲寅	乙卯	丙辰	丁巳	戊午	己未	庚申	辛酉	壬戌	癸亥	甲子	      乙丑	
	 */
	private static String getMonth(String yearStr1,int month) {

		//1:获取干支年的第一个字
		String one = yearStr1.substring(0,1);
		if(one.equals("甲") || one.equals("己")) {
			
			//1-12月对应的干支月
			switch (month) {
				case 1:
					return "丙寅";
				case 2:
					return "丁卯";
				case 3:
					return "戊辰";
				case 4:
					return "己巳";
				case 5:
					return "庚午";
				case 6:
					return "辛未";
				case 7:
					return "壬申";
				case 8:
					return "癸酉";
				case 9:
					return "甲戌";
				case 10:
					return "乙亥";
				case 11:
					return "丙子";
				case 12:
					return "丁丑";
			}
			
		}else if(one.equals("乙") || one.equals("庚")) {
			
			//戊寅	己卯	庚辰	辛巳	壬午	癸未	甲申	乙酉	丙戌	丁亥	戊子	      己丑
			switch (month) {
				case 1:
					return "戊寅";
				case 2:
					return "己卯";
				case 3:
					return "庚辰";
				case 4:
					return "辛巳";
				case 5:
					return "壬午";
				case 6:
					return "癸未";
				case 7:
					return "甲申";
				case 8:
					return "乙酉";
				case 9:
					return "丙戌";
				case 10:
					return "丁亥";
				case 11:
					return "戊子";
				case 12:
					return "己丑";
			}
			
		}else if(one.equals("丙") || one.equals("辛")) {
			
			//庚寅	辛卯	壬辰	癸巳	甲午	乙未	丙申	丁酉	戊戌	己亥	庚子	      辛丑 
			switch (month) {
				case 1:
					return "庚寅";
				case 2:
					return "辛卯";
				case 3:
					return "壬辰";
				case 4:
					return "癸巳";
				case 5:
					return "甲午";
				case 6:
					return "乙未";
				case 7:
					return "丙申";
				case 8:
					return "丁酉";
				case 9:
					return "戊戌";
				case 10:
					return "己亥";
				case 11:
					return "庚子";
				case 12:
					return "辛丑 ";
			}
			
		}else if(one.equals("丁") || one.equals("壬")) {
			
			//壬寅	癸卯	甲辰	乙巳	丙午	丁未	戊申	己酉	庚戌	辛亥	壬子	      癸丑
			
			switch (month) {
				case 1:
					return "壬寅";
				case 2:
					return "癸卯";
				case 3:
					return "甲辰";
				case 4:
					return "乙巳";
				case 5:
					return "丙午";
				case 6:
					return "丁未";
				case 7:
					return "戊申";
				case 8:
					return "己酉";
				case 9:
					return "庚戌";
				case 10:
					return "辛亥";
				case 11:
					return "壬子";
				case 12:
					return "癸丑";
			}
			
		}else if(one.equals("戊") || one.equals("癸")) {
			
			//甲寅	乙卯	丙辰	丁巳	戊午	己未	庚申	辛酉	壬戌	癸亥	甲子	      乙丑	
			switch (month) {
				case 1:
					return "甲寅";
				case 2:
					return "乙卯";
				case 3:
					return "丙辰";
				case 4:
					return "丁巳";
				case 5:
					return "戊午";
				case 6:
					return "己未";
				case 7:
					return "庚申";
				case 8:
					return "辛酉";
				case 9:
					return "壬戌";
				case 10:
					return "癸亥";
				case 11:
					return "甲子";
				case 12:
					return "乙丑";
			}
		}
		
		return null;
	}
	
	
	

	/**
	 * 根据六十环周表获取生辰年份
	   甲子│  乙丑│  丙寅│  丁卯│  戊辰│  己巳│  庚午│  辛未│  壬申│  癸酉│  
	   甲戌│  乙亥│  丙子│  丁丑│  戊寅│  己卯│  庚辰│  辛巳│  壬午│  癸未│  
	   甲申│  乙酉│  丙戌│  丁亥│  戊子│  己丑│  庚寅│  辛卯│  壬辰│  癸巳│  
	   甲午│  乙未│  丙申│  丁酉│  戊戌│  己亥│  庚子│  辛丑│  壬寅│  癸卯│  
	   甲辰│  乙巳│  丙午│  丁未│  戊申│  己酉│  庚戌│  辛亥│  壬子│  癸丑│  
	   甲寅│  乙卯│  丙辰│  丁巳│  戊午│  己未│  庚申│  辛酉│  壬戌│  癸亥│
	 */
	private static String getYearBy60(int year) {
		
		int ganzhi = (year-3) % 60;
		
		switch (ganzhi) {
			case 1:
				return "甲子";
			case 2:
				return "乙丑";
			case 3:
				return "丙寅";
			case 4:
				return "丁卯";
			case 5:
				return "戊辰";
			case 6:
				return "己巳";
			case 7:
				return "庚午";
			case 8:
				return "辛未";
			case 9:
				return "壬申";
			case 10:
				return "癸酉";
			case 11:
				return "甲戌";
			case 12:
				return "乙亥";
			case 13:
				return "丙子";
			case 14:
				return "丁丑";
			case 15:
				return "戊寅";
			case 16:
				return "己卯";
			case 17:
				return "庚辰";
			case 18:
				return "辛巳";
			case 19:
				return "壬午";
			case 20:
				return "癸未";
			case 21:
				return "甲申";
			case 22:
				return "乙酉";
			case 23:
				return "丙戌";
			case 24:
				return "丁亥";
			case 25:
				return "戊子";
			case 26:
				return "己丑";
			case 27:
				return "庚寅";
			case 28:
				return "辛卯";
			case 29:
				return "壬辰";
			case 30:
				return "癸巳";
			case 31:
				return "甲午";
			case 32:
				return "乙未";
			case 33:
				return "丙申";
			case 34:
				return "丁酉";
			case 35:
				return "戊戌";
			case 36:
				return "己亥";
			case 37:
				return "庚子";
			case 38:
				return "辛丑";
			case 39:
				return "壬寅";
			case 40:
				return "癸卯";
			case 41:
				return "甲辰";
			case 42:
				return "乙巳";
			case 43:
				return "丙午";
			case 44:
				return "丁未";
			case 45:
				return "戊申";
			case 46:
				return "己酉";
			case 47:
				return "庚戌";
			case 48:
				return "辛亥";
			case 49:
				return "壬子";
			case 50:
				return "癸丑";
			case 51:
				return "甲寅";
			case 52:
				return "乙卯";
			case 53:
				return "丙辰";
			case 54:
				return "丁巳";
			case 55:
				return "戊午";
			case 56:
				return "己未";
			case 57:
				return "庚申";
			case 58:
				return "辛酉";
			case 59:
				return "壬戌";
			case 0:
				return "癸亥";
		}
		return "";
	}
	
	/**
	 * 根据天干地支获取生辰年份
	 天干：
	 	甲（jiǎ）、乙（ yǐ ）、丙bai（bǐng）、丁（dīdung）、戊zhi（wù ）、
		己（jǐ ）、庚（gēng）、辛（xīn ）、壬（rén ）、癸（guǐ）
	 
	 地支：
	 	子（ zǐ ）、丑（chǒu）、寅（ yín ）、卯（mǎo）、辰（chén）、巳（ sì ）、
		午（wǔ）、未（ wèi ）、申（shēn）、酉（yǒu ）、戌（ xū ）、亥（hài）
	 
	 地支生肖：
	 	子：鼠；丑：牛；寅：虎；卯：兔；辰：龙；巳：蛇； 
	 	午：马；未：羊；申：猴；酉：鸡；戌：狗；亥：猪；
	 */
	private static String getYearBySky(int year) {
		
		char[] sky = {'庚','辛','壬','癸','甲','乙','丙','丁','戊','己'};
		char[] land = {'申','酉','戌','亥','子','丑','寅','卯','辰','巳','午','未'};
		
		//获取年份的尾数
		int end = year % 1000 % 100 % 10;
		
		//获取年份%12
		int ld = year % 12;
		
		//获取年份对应的干支
		String str = sky[end] + "" + land[ld];
		
		return str;
	}
	
	

}
