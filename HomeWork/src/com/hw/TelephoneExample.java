package com.HW;

import java.util.Scanner;

public class TelephoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone telephone = new Telephone("LG����", "GS-492C");
		Scanner scanner = new Scanner(System.in);
		int phoneCall = 0;
		String[] othersSay = {};
		String[] mySay = {};
		int pressSpeakerPhoneButton = 0;
//		int pressKeyPad;		// �̱���
//		int callnumber;			// �̱���
		int hookReceiver = 0;
		
		
		System.out.println("-----------------------");
		System.out.println("��ȭ�� �����Ϸ��� '1'�� �Է����ּ���");
		System.out.println("�����Ϸ��� '0'�� �Է����ּ���");
		phoneCall = scanner.nextInt();
		
		if(phoneCall == 0) {
			System.out.println("����");
			scanner.close();
		
		} else {
			telephone.isLampOn(phoneCall, telephone.isHookSwitch);
			telephone.incomingCall(phoneCall);
			telephone.hookSwitchCheck(telephone.isHookSwitch);
			
			System.out.println("-----------------------");
			System.out.println("'1'�Է�: ��ȭ����");
			System.out.println("'2'�Է�: ��ȭ ����");
			
			hookReceiver = scanner.nextInt();			
			if(hookReceiver == 1) {
				telephone.callReceiver(hookReceiver);
				telephone.outputSound(othersSay);
				telephone.inputSound(mySay);
				
				System.out.println("-----------------------");
				System.out.println("'1'�Է�: ����Ŀ�� ��ư ������ | �� �� �Է�: ��ȭ�� ��������");
				
				int speakerOrHook = scanner.nextInt();
				if(speakerOrHook == 1) {
					pressSpeakerPhoneButton = 1;
					
					telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
					
					System.out.println("-----------------------");
					System.out.println("'1'�Է�: ����Ŀ�� ��ư ������");
					
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
