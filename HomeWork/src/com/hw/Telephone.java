package com.hw;

public class Telephone {
	
	//필드
	String brand;
	String model;
	String receiver;
	String receiverMic;
	String SpeakerPhone;
	String SpeakerPhoneMic;
	int keyPad;
	boolean isLamp;
	boolean isHookSwitch;
	int speakerPhoneButton;

	
	//생성자
	public Telephone() {}
	
	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	//메소드
//	1.전화 수신 램프등
	public boolean isLampOn(int phoneCall, boolean isHookSwitch) {		//true값일때 점등 가정
		this.isHookSwitch = isHookSwitch;
		if(!(phoneCall == 1))	{						//전화 끊어졌을 때
			return false;						
		} else if(isHookSwitch = false) {			//수화기를 들었을 때
			return false;
		} else {
			return true;
		}
	}
	
//	2.훅스위치 입력확인
	public boolean hookSwitchCheck(boolean isHookSwitch) {			//눌려있을 떄 true값
		this.isHookSwitch = isHookSwitch;
		if(isHookSwitch = true) {
			return true;
		} else {
			return false;	
		}
	}
	
//	3.수화기 출력
	public String[] outputSound(String[] othersSay) {
		return othersSay;
	}
//	4.송화기 입력
	public String[] inputSound(String[] mySay) {
		return mySay;
	}
	
//	5.스피커폰 전환
//	public int pressSpeakerPhone(int speakerPhoneButton) {
//		int num = speakerPhoneButton;
//		switch(num) {			//버튼 누른 횟수
//			case 0:
//				//
//				return 0;
//			case 1:			//스피커폰으로 전환
//				
//				return 1;
//			case 2:			//통화 종료
//				
//				return 2;
//				
//			default:
//				num = 0;
//				return 0;
//				
//		}
//	}
	
//	6.전화번호 입력(전화걸기)
	public int inputNumber(int pressKeyPad) {
		return pressKeyPad;
	}
	
//	7.전화번호 출력
	public int outputNumber(int callnumber) {
		return callnumber;
	}
//	8.수화기 내려놓기(통화종료)
	public boolean offTheHookReceiver(boolean isHookSwitch) {
		this.isHookSwitch = isHookSwitch;
		if(isHookSwitch = true) {
			return false;
		} else {
			return true;	
		}
	}
//	9.스피커폰 끄기(통화종료)
//	public int offTheHookSpeakerPhone(int pressSpeakerPhoneButton) {
//		
//		return 0;
//	}
//	
	//출력 메소드
	public void incomingCall(int phoneCall) {
		if(phoneCall == 1) {
			System.out.println("------------------------");
			System.out.println("전화가 왔습니다.");
			System.out.println("램프에 불이 들어옵니다.");
		} else {
			//
		}
	}
	
	public void callReceiver(int hookReceiver) {
		System.out.println("------------------------");
		if(hookReceiver == 1) {
			System.out.println("수화기를 들었습니다");
			System.out.println("통화를 시작합니다");
		} else if(hookReceiver == 2) {
			System.out.println("통화를 거절했습니다");
			System.out.println("종료");
		} else {
			System.out.println("수화기를 내려놓았습니다");
			System.out.println("통화를 종료합니다");
		}
	}
	
	public void callOffSpeakerPhone(int speakerPhoneButton, int hookReceiver) {
		System.out.println("------------------------");
		if(speakerPhoneButton == 1 && hookReceiver == 1) {
			System.out.println("스피커폰으로 전환합니다");
		} else if(speakerPhoneButton == 1) {
			System.out.println("스피커폰으로 전화를 받았습니다");
			System.out.println("통화를 시작합니다");	
		} else if(speakerPhoneButton == 2) {
			System.out.println("스피커폰을 종료하였습니다");
			System.out.println("통화를 종료합니다");				
		} else {
			//
		}
	}
	
}
