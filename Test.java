package week9;

import java.time.LocalDate;
import java.util.*;
public class Test {
	
	
	//특정 날짜의 출제자를 알려주거나 이름을 입력하면 자신의 출제일을 출력하는 프로그램. (4월 28일부터 6월 22일까지만 구현되어 있음.)
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		
		String[] sequence = {"박민혁", "최기범", "한만규", "조민정", "서지민", "이건희", "김현우", "김성결"};
		
		int[] elapsed_day_calendar = elapsed_day_return(); //아래 메소드에서 달력을 채워서 전달
		String[] name_of_taker_calendar = test_takers_name_return(sequence); //아래 메소드에서 달력을 채워서 전달
		
		int today_or_specday_or_mydate = 0;
		
		for(int k=0; k<1; k++) {
			try {
				System.err.print("오늘의 출제자를 보려면 '0' \n특정 날짜의 출제자를 보려면 '1' \n자신의 출제일을 보려면 '2'\n를 입력해 주세요. \n\n"); try {Thread.sleep(3);} catch(InterruptedException err_1){Thread.currentThread().interrupt();} //0.003초간 지연
				System.out.print(">>> "); today_or_specday_or_mydate = sc.nextInt(); sc.nextLine();
			} catch(Exception err_2){
				System.out.println("0, 1, 2 세 가지 숫자 중 하나만을 입력해 주세요.\n"); try {Thread.sleep(3);} catch(InterruptedException err_3){Thread.currentThread().interrupt();}
				k--;
				sc.next();
				continue;
			}
			if(!(today_or_specday_or_mydate==0 || today_or_specday_or_mydate==1 || today_or_specday_or_mydate==2)) {
				System.out.println("0, 1, 2 세 가지 숫자 중 하나만을 입력해 주세요.\n"); try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
				k--;
			}
		}
		
		
		
		
		if(today_or_specday_or_mydate == 0) { //오늘의 출제자
			int today_month = today.getMonthValue();
			int today_day = today.getDayOfMonth();
			
			if(today_month == 6 && today_day>0 && today_day<23) {
				System.out.printf("오늘의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", name_of_taker_calendar[33+today_day], elapsed_day_calendar[33+today_day]);
			}
			else if(today_month == 5 && today_day>0 && today_day<32) {
				System.out.printf("오늘의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", name_of_taker_calendar[2+today_day], elapsed_day_calendar[2+today_day]);
			}
			else if(today_month == 4 && today_day>27 && today_day<31) {
				System.out.printf("오늘의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", name_of_taker_calendar[today_day-28], elapsed_day_calendar[today_day-28]);
			}
			else {
				System.out.println("구현되지 않은 날짜입니다. ");
			}
		}
		else if(today_or_specday_or_mydate == 1) { //어떤 날짜의 출제자

			for(int t=0; t<1; t++) {
				System.err.print("\n몇 월? \n"); try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
				System.out.print(">>> "); int month = sc.nextInt();
				System.err.print("며칠? \n"); try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
				System.out.print(">>> "); int day = sc.nextInt();

				
				if(month == 6 && day>0 && day<23) {
					System.out.printf("\n6월 %d일의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", day, name_of_taker_calendar[33+day], elapsed_day_calendar[33+day]);
				}
				else if(month == 5 && day>0 && day<32) {
					System.out.printf("\n5월 %d일의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", day, name_of_taker_calendar[2+day], elapsed_day_calendar[2+day]);
				}
				else if(month == 4 && day>27 && day<31) {
					System.out.printf("\n4월 %d일의 출제자는 %s입니다. 출제일로부터 %d일 경과되었습니다. ", day, name_of_taker_calendar[day-28], elapsed_day_calendar[day-28]);
				}
				else {
					System.out.println("\n구현되지 않은 날짜입니다. ");
					t--;
				}
			}
			
		}
		else if(today_or_specday_or_mydate == 2) { //그 사람의 출제일
			System.err.printf("\n자신의 이름을 입력해주세요. \n--> 총 %d명이 등록되어 있습니다. <-- \n-->%s<--\n", sequence.length, Arrays.toString(sequence)); try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
			ArrayList<String> sequence_List = new ArrayList<String>(Arrays.asList(sequence)); //문자열 내에 그 사람 이름이 있는지 검색.
			ArrayList<String> only_Name_List = new ArrayList<String>(); //성을 제외한 리스트도 만듦.
			for(int i=0; i<sequence.length; i++) {
				only_Name_List.add(sequence_List.get(i).substring(1)); //이름만 뽑아내어 only_Name_List 리스트에 저장.
			}
			
			for(int t=0; t<1; t++) {
				
				System.out.print(">>> "); String myName = sc.nextLine();
				myName = myName.replaceAll("[^가-힣]", ""); //실수로 스페이스바나 특수기호가 들어가더라도 한글만 뽑아내줌.
				
				
				if(sequence_List.contains(myName) || only_Name_List.contains(myName)) {
					if(only_Name_List.contains(myName)) {
						myName = sequence[only_Name_List.indexOf(myName)];
					}
					System.out.printf("'%s'님의 출제일은: ", myName);
					
					try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
					
					for(int k=0; k<56; k++) {
						if(name_of_taker_calendar[k].equals(myName) && elapsed_day_calendar[k] == 0) {
							if(k<3) {//4월
								System.err.printf("  [ 4월 %d일 ]  입니다.", k+28);
							}
							else if(k>=3 && k<34) {//5월
								System.err.printf("  [ 5월 %d일 ]  입니다.", k-2);
							}
							else if(k>=34) {//6월
								System.err.printf("  [ 6월 %d일 ]  입니다.", k-33);
							}
						}
					}
					
				}
				else { //일치하는 이름이 없다면 오류메세지 출력 후 다시 이름을 입력받음.
					System.err.println("등록되지 않은 이름입니다. "); try {Thread.sleep(3);} catch(InterruptedException err){Thread.currentThread().interrupt();}
					t--;
				}
			}
			
		}
	
	}
	
	
	
	
	
	public static int[] elapsed_day_return() {
		
		int reset_elapse = 0;
		int[] elapse_day_calendar = new int[56];
		
		for(int k = 0; k<56; k++) {
			elapse_day_calendar[k] = reset_elapse; reset_elapse++;
			if(reset_elapse == 7) {
				reset_elapse = 0;
			}
		}
		
		return elapse_day_calendar;
	}
	
	
	public static String[] test_takers_name_return(String[] sequence) {
		
		int reset_sequence = 0;
		String[] name_of_taker_calendar = new String[56];
		
		for(int k = 0; k<56; k++) {
			name_of_taker_calendar[k] = sequence[reset_sequence/7]; reset_sequence++;
		}
		
		return name_of_taker_calendar;
	}
}