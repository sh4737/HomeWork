package com.hw;

public class Join {
	
	//?•„?“œ
	String id = "?•„?´?”” ?…? ¥";
	String kakaoDomain = "@kakao.com";
	String idExplain;
	String passWord = "ë¹„ë?ë²ˆí˜¸(8~32?ë¦?)";
	String passWordRe = "ë¹„ë?ë²ˆí˜¸ ?¬?…? ¥";
	String nickName = "?‹‰?„¤?„?„ ?…? ¥?•´ì£¼ì„¸?š”.";
	String interNum = "+82";
	String phoneNumber = "? „?™”ë²ˆí˜¸";
	int birthYear;
	int birthMon;
	int birthDate;
	boolean birthLunar = false;
	String gender = "?„ ?ƒ ?•ˆ?•¨";
	String terms;
	String privacy;
	String operPol;
	String serCen;
	String notice;
	String language = "?•œêµ??–´";
	String copyRight;
	
	//ë©”ì†Œ?“œ
	
//	1. ?•„?´?”” ì¤‘ë³µ?—¬ë¶? ì¶œë ¥
	public void idCheck(String id) {
		String dbId = "";
		if(id.equals(dbId)) {
			System.out.println("?´ ?•„?´?””?Š” ?‚¬?š©?•  ?ˆ˜ ?—†?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("?´ ?•„?´?””?Š” ?‚¬?š©?•  ?ˆ˜ ?ˆ?Šµ?‹ˆ?‹¤.");
		}
	}
//	2. ë¹„ë?ë²ˆí˜¸ ?¼ì¹? ?™•?¸ ê²°ê³¼ ì¶œë ¥
	public void passWordCheck(String passWord, String passWordRe) {
		if(passWord.equals(passWordRe)) {
			System.out.println("ë¹„ë?ë²ˆí˜¸ ?¼ì¹?");
		} else {
			System.out.println("ë¹„ë?ë²ˆí˜¸ê°? ?¼ì¹˜í•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
			System.out.println("ë¹„ë?ë²ˆí˜¸ë¥? ?‹¤?‹œ ?™•?¸?•´ì£¼ì„¸?š”.");
		}
	}
	
//	3. ?¸ì¦ë²ˆ?˜¸ ë°œì†¡
	public int sendCertifiNum(int phoneNumber) {
		return 0000;
	}
	
//	4. ?¸ì¦ë²ˆ?˜¸ ?…? ¥ ê²°ê³¼ ì¶œë ¥
	public void certifiNumCheck(int inputNum) {
		int certifiNum = 0000;
		if(inputNum == certifiNum) {
			System.out.println("?¸ì¦? ?™„ë£?");
		} else {
			System.out.println("?¸ì¦? ?‹¤?Œ¨");
			System.out.println("?¸ì¦ë²ˆ?˜¸ë¥? ?‹¤?‹œ ?™•?¸?•´ì£¼ì„¸?š”.");
		}
	}
	
//	5. ?‹¤?Œ?œ¼ë¡? ?„˜?–´ê°?ê¸?
	public void goNextPage() {
		
	}
//	6. ?´?š©?•½ê´? ë§í¬ ?„˜?–´ê°?ê¸?
	public void goTermsPage() {
		
	}
//	7. ê°œì¸? •ë³? ë§í¬ ?„˜?–´ê°?ê¸?
	public void goPrivacyPage() {
		
	}
//	8. ?š´?˜? •ì±? ë§í¬ ?„˜?–´ê°?ê¸?
	public void goOperPolPage() {
		
	}
//	9. ê³ ê°?„¼?„° ë§í¬ ?„˜?–´ê°?ê¸?
	public void goSerCenPage() {
		
	}
//	10. ê³µì??‚¬?•­ ë§í¬ ?„˜?–´ê°?ê¸?
	public void goNoticePage() {
		
	}
//	11. ?–¸?–´ ë°”ê¾¸ê¸?
	public void changeLang(String language) {
		String position = language;
		switch(position) {
			case "?•œêµ??–´":
				
				break;
			case "english":
				
				break;
			case "?—¥?œ¬èª?":
				
				break;
			case "ä¸??–‡":
				
				break;
			case "franÃ§ais":
				
				break;
			case "Deutsch":
				
				break;
		}
		
	}

}
