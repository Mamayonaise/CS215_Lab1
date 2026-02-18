package lab6;

import java.time.*;

public class Lab6Submission {

	public static void main(String[] args) throws Exception {
		Ar_UList myAr_UList = new Ar_UList();
		
		LocalDateTime t1 = LocalDateTime.now();
		
		for (int i = 1; i<Ar_UList.MAXSIZE; i++) {
			myAr_UList.putItem(i);
		}
		
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println("uList PutItem duration: " + Duration.between(t1, t2).toMillis());
		
		LocalDateTime t3 = LocalDateTime.now();
		for (int i = 1; i<Ar_UList.MAXSIZE; i++) {
			myAr_UList.getItem(i);
		}
		LocalDateTime t4 = LocalDateTime.now();
		System.out.println("uList GetItem duration: " + Duration.between(t3, t4).toMillis());
		//-----------------------------------------------------------------------------------------------
		Ar_SList myAr_SList = new Ar_SList();
		
		LocalDateTime t5 = LocalDateTime.now();
		
		for (int i = 1; i<Ar_SList.MAXSIZE; i++) {
				myAr_SList.putItem(i);
		}
		
		LocalDateTime t6 = LocalDateTime.now();
		System.out.println("sList PutItem duration: " + Duration.between(t5, t6).toMillis());
		
		LocalDateTime t7 = LocalDateTime.now();
		for (int i = 1; i<Ar_UList.MAXSIZE; i++) {
			myAr_SList.getItem(i);
		}
		LocalDateTime t8 = LocalDateTime.now();
		System.out.println("sList GetItem duration: " + Duration.between(t7, t8).toMillis());
	}

}
