package com.hw;

public class Join {
	
	//??
	String id = "??΄? ?? ₯";
	String kakaoDomain = "@kakao.com";
	String idExplain;
	String passWord = "λΉλ?λ²νΈ(8~32?λ¦?)";
	String passWordRe = "λΉλ?λ²νΈ ?¬?? ₯";
	String nickName = "??€?? ?? ₯?΄μ£ΌμΈ?.";
	String interNum = "+82";
	String phoneNumber = "? ?λ²νΈ";
	int birthYear;
	int birthMon;
	int birthDate;
	boolean birthLunar = false;
	String gender = "? ? ??¨";
	String terms;
	String privacy;
	String operPol;
	String serCen;
	String notice;
	String language = "?κ΅??΄";
	String copyRight;
	
	//λ©μ?
	
//	1. ??΄? μ€λ³΅?¬λΆ? μΆλ ₯
	public void idCheck(String id) {
		String dbId = "";
		if(id.equals(dbId)) {
			System.out.println("?΄ ??΄?? ?¬?©?  ? ??΅??€.");
		} else {
			System.out.println("?΄ ??΄?? ?¬?©?  ? ??΅??€.");
		}
	}
//	2. λΉλ?λ²νΈ ?ΌμΉ? ??Έ κ²°κ³Ό μΆλ ₯
	public void passWordCheck(String passWord, String passWordRe) {
		if(passWord.equals(passWordRe)) {
			System.out.println("λΉλ?λ²νΈ ?ΌμΉ?");
		} else {
			System.out.println("λΉλ?λ²νΈκ°? ?ΌμΉνμ§? ??΅??€.");
			System.out.println("λΉλ?λ²νΈλ₯? ?€? ??Έ?΄μ£ΌμΈ?.");
		}
	}
	
//	3. ?Έμ¦λ²?Έ λ°μ‘
	public int sendCertifiNum(int phoneNumber) {
		return 0000;
	}
	
//	4. ?Έμ¦λ²?Έ ?? ₯ κ²°κ³Ό μΆλ ₯
	public void certifiNumCheck(int inputNum) {
		int certifiNum = 0000;
		if(inputNum == certifiNum) {
			System.out.println("?Έμ¦? ?λ£?");
		} else {
			System.out.println("?Έμ¦? ?€?¨");
			System.out.println("?Έμ¦λ²?Έλ₯? ?€? ??Έ?΄μ£ΌμΈ?.");
		}
	}
	
//	5. ?€??Όλ‘? ??΄κ°?κΈ?
	public void goNextPage() {
		
	}
//	6. ?΄?©?½κ΄? λ§ν¬ ??΄κ°?κΈ?
	public void goTermsPage() {
		
	}
//	7. κ°μΈ? λ³? λ§ν¬ ??΄κ°?κΈ?
	public void goPrivacyPage() {
		
	}
//	8. ?΄?? μ±? λ§ν¬ ??΄κ°?κΈ?
	public void goOperPolPage() {
		
	}
//	9. κ³ κ°?Ό?° λ§ν¬ ??΄κ°?κΈ?
	public void goSerCenPage() {
		
	}
//	10. κ³΅μ??¬?­ λ§ν¬ ??΄κ°?κΈ?
	public void goNoticePage() {
		
	}
//	11. ?Έ?΄ λ°κΎΈκΈ?
	public void changeLang(String language) {
		String position = language;
		switch(position) {
			case "?κ΅??΄":
				
				break;
			case "english":
				
				break;
			case "?₯?¬θͺ?":
				
				break;
			case "δΈ??":
				
				break;
			case "franΓ§ais":
				
				break;
			case "Deutsch":
				
				break;
		}
		
	}

}
