package com.hw;

import java.util.Scanner;

public class TelephoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone Telephone = new Telephone("LG����", "GS-492C");
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
			Telephone.isLampOn(phoneCall, Telephone.isHookSwitch);
			Telephone.incomingCall(phoneCall);
			Telephone.hookSwitchCheck(Telephone.isHookSwitch);
			
			System.out.println("-----------------------");
			System.out.println("'1'�Է�: ��ȭ����");
			System.out.println("'2'�Է�: ��ȭ ����");
			
			hookReceiver = scanner.nextInt();			
			if(hookReceiver == 1) {
				Telephone.callReceiver(hookReceiver);
				Telephone.outputSound(othersSay);
				Telephone.inputSound(mySay);
				
				System.out.println("-----------------------");
				System.out.println("'1'�Է�: ����Ŀ�� ��ư ������ | �� �� �Է�: ��ȭ�� ��������");
				
				int speakerOrHook = scanner.nextInt();
				if(speakerOrHook == 1) {
					pressSpeakerPhoneButton = 1;
					
					Telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
					
					System.out.println("-----------------------");
					System.out.println("'1'�Է�: ����Ŀ�� ��ư ������");
					
					pressSpeakerPhoneButton += scanner.nextInt();
					Telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
				} else {
					hookReceiver = speakerOrHook;
					Telephone.callOffSpeakerPhone(pressSpeakerPhoneButton, hookReceiver);
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
