package com.hw;

import java.util.Scanner;

public class TelephoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone telephone = new Telephone("LG전자", "GS-492C");
		Scanner scanner = new Scanner(System.in);
		int phoneCall = 0;
		String[] othersSay = {};
		String[] mySay = {};
		int pressSpeakerPhoneButton = 0;
//		int pressKeyPad;		// 미구현
//		int callnumber;			// 미구현
		int hookReceiver = 0;
		
		
		System.out.println("-----------------------");
		System.out.println("전화를 연결하려면 '1'을 입력해주세요");
		System.out.println("종료하려면 '0'을 입력해주세요");
		phoneCall = scanner.nextInt();
		
		if(phoneCall == 0) {
			System.out.println("종료");
			scanner.close();
		
		} else {
			telephone.isLampOn(phoneCall, telephone.isHookSwitch);
			telephone.incomingCall(phoneCall);
			telephone.hookSwitchCheck(telephone.isHookSwitch);
			
			System.out.println("-----------------------");
			System.out.println("'1'입력: 수화기들기");
			System.out.println("'2'입력: 전화 거절");
			
			hookReceiver = scanner.nextInt();			
			if(hookReceiver == 1) {
				telephone.callReceiver(hookReceiver);
				telephone.outputSound(othersSay);
				telephone.inputSound(mySay);
				
				System.out.println("-----------------------");
				System.out.println("'1'입력: 스피커폰 버튼 누르기 | 그 외 입력: 수화기 내려놓기");
				
				int speakerOrHook = scanner.nextInt();
				if(speakerOrHook == 1) {
					pressSpeakerPhoneButton = 1;
					
					telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
					
					System.out.println("-----------------------");
					System.out.println("'1'입력: 스피커폰 버튼 누르기");
					
					pressSpeakerPhoneButton += scanner.nextInt();
					telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
				} else {
					hookReceiver = speakerOrHook;
					telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
				}
				
				
			} else if(hookReceiver == 2) {
				//
			} else {
				//
			}
			
			
			if(pressSpeakerPhoneButton == 2 || (hookReceiver == 1) || (hookReceiver == 2) ) {
				scanner.close();
				
			} else {
				//
			}
			
		}
		
		
	}

}
