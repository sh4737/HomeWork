package com.hw;

public class Telephone {
	
	//�ʵ�
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

	
	//������
	public Telephone() {}
	
	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	//�޼ҵ�
//	1.��ȭ ���� ������
	public boolean isLampOn(int phoneCall, boolean isHookSwitch) {		//true���϶� ���� ����
		this.isHookSwitch = isHookSwitch;
		if(!(phoneCall == 1))	{						//��ȭ �������� ��
			return false;						
		} else if(isHookSwitch = false) {			//��ȭ�⸦ ����� ��
			return false;
		} else {
			return true;
		}
	}
	
//	2.�Ž���ġ �Է�Ȯ��
	public boolean hookSwitchCheck(boolean isHookSwitch) {			//�������� �� true��
		this.isHookSwitch = isHookSwitch;
		if(isHookSwitch = true) {
			return true;
		} else {
			return false;	
		}
	}
	
//	3.��ȭ�� ���
	public String[] outputSound(String[] othersSay) {
		return othersSay;
	}
//	4.��ȭ�� �Է�
	public String[] inputSound(String[] mySay) {
		return mySay;
	}
	
//	5.����Ŀ�� ��ȯ
//	public int pressSpeakerPhone(int speakerPhoneButton) {
//		int num = speakerPhoneButton;
//		switch(num) {			//��ư ���� Ƚ��
//			case 0:
//				//
//				return 0;
//			case 1:			//����Ŀ������ ��ȯ
//				
//				return 1;
//			case 2:			//��ȭ ����
//				
//				return 2;
//				
//			default:
//				num = 0;
//				return 0;
//				
//		}
//	}
	
//	6.��ȭ��ȣ �Է�(��ȭ�ɱ�)
	public int inputNumber(int pressKeyPad) {
		return pressKeyPad;
	}
	
//	7.��ȭ��ȣ ���
	public int outputNumber(int callnumber) {
		return callnumber;
	}
//	8.��ȭ�� ��������(��ȭ����)
	public boolean offTheHookReceiver(boolean isHookSwitch) {
		this.isHookSwitch = isHookSwitch;
		if(isHookSwitch = true) {
			return false;
		} else {
			return true;	
		}
	}
//	9.����Ŀ�� ����(��ȭ����)
//	public int offTheHookSpeakerPhone(int pressSpeakerPhoneButton) {
//		
//		return 0;
//	}
//	
	//��� �޼ҵ�
	public void incomingCall(int phoneCall) {
		if(phoneCall == 1) {
			System.out.println("------------------------");
			System.out.println("��ȭ�� �Խ��ϴ�.");
			System.out.println("������ ���� ���ɴϴ�.");
		} else {
			//
		}
	}
	
	public void callReceiver(int hookReceiver) {
		System.out.println("------------------------");
		if(hookReceiver == 1) {
			System.out.println("��ȭ�⸦ ������ϴ�");
			System.out.println("��ȭ�� �����մϴ�");
		} else if(hookReceiver == 2) {
			System.out.println("��ȭ�� �����߽��ϴ�");
			System.out.println("����");
		} else {
			System.out.println("��ȭ�⸦ �������ҽ��ϴ�");
			System.out.println("��ȭ�� �����մϴ�");
		}
	}
	
	public void callOffSpeakerPhone(int speakerPhoneButton, int hookReceiver) {
		System.out.println("------------------------");
		if(speakerPhoneButton == 1 && hookReceiver == 1) {
			System.out.println("����Ŀ������ ��ȯ�մϴ�");
		} else if(speakerPhoneButton == 1) {
			System.out.println("����Ŀ������ ��ȭ�� �޾ҽ��ϴ�");
			System.out.println("��ȭ�� �����մϴ�");	
		} else if(speakerPhoneButton == 2) {
			System.out.println("����Ŀ���� �����Ͽ����ϴ�");
			System.out.println("��ȭ�� �����մϴ�");				
		} else {
			//
		}
	}
	
}
