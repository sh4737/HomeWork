package com.hw;

public class Join {
	
	//?��?��
	String id = "?��?��?�� ?��?��";
	String kakaoDomain = "@kakao.com";
	String idExplain;
	String passWord = "비�?번호(8~32?���?)";
	String passWordRe = "비�?번호 ?��?��?��";
	String nickName = "?��?��?��?�� ?��?��?��주세?��.";
	String interNum = "+82";
	String phoneNumber = "?��?��번호";
	int birthYear;
	int birthMon;
	int birthDate;
	boolean birthLunar = false;
	String gender = "?��?�� ?��?��";
	String terms;
	String privacy;
	String operPol;
	String serCen;
	String notice;
	String language = "?���??��";
	String copyRight;
	
	//메소?��
	
//	1. ?��?��?�� 중복?���? 출력
	public void idCheck(String id) {
		String dbId = "";
		if(id.equals(dbId)) {
			System.out.println("?�� ?��?��?��?�� ?��?��?�� ?�� ?��?��?��?��.");
		} else {
			System.out.println("?�� ?��?��?��?�� ?��?��?�� ?�� ?��?��?��?��.");
		}
	}
//	2. 비�?번호 ?���? ?��?�� 결과 출력
	public void passWordCheck(String passWord, String passWordRe) {
		if(passWord.equals(passWordRe)) {
			System.out.println("비�?번호 ?���?");
		} else {
			System.out.println("비�?번호�? ?��치하�? ?��?��?��?��.");
			System.out.println("비�?번호�? ?��?�� ?��?��?��주세?��.");
		}
	}
	
//	3. ?��증번?�� 발송
	public int sendCertifiNum(int phoneNumber) {
		return 0000;
	}
	
//	4. ?��증번?�� ?��?�� 결과 출력
	public void certifiNumCheck(int inputNum) {
		int certifiNum = 0000;
		if(inputNum == certifiNum) {
			System.out.println("?���? ?���?");
		} else {
			System.out.println("?���? ?��?��");
			System.out.println("?��증번?���? ?��?�� ?��?��?��주세?��.");
		}
	}
	
//	5. ?��?��?���? ?��?���?�?
	public void goNextPage() {
		
	}
//	6. ?��?��?���? 링크 ?��?���?�?
	public void goTermsPage() {
		
	}
//	7. 개인?���? 링크 ?��?���?�?
	public void goPrivacyPage() {
		
	}
//	8. ?��?��?���? 링크 ?��?���?�?
	public void goOperPolPage() {
		
	}
//	9. 고객?��?�� 링크 ?��?���?�?
	public void goSerCenPage() {
		
	}
//	10. 공�??��?�� 링크 ?��?���?�?
	public void goNoticePage() {
		
	}
//	11. ?��?�� 바꾸�?
	public void changeLang(String language) {
		String position = language;
		switch(position) {
			case "?���??��":
				
				break;
			case "english":
				
				break;
			case "?��?���?":
				
				break;
			case "�??��":
				
				break;
			case "français":
				
				break;
			case "Deutsch":
				
				break;
		}
		
	}

}
