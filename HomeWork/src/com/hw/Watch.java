package com.hw;

public class Watch {
	
	//�ʵ�
//	.�귣��
	String brand;
	String model;
//	.��ħ
	int hourHand = 0;
//	.��ħ
	int minuteHand = 0;
//	.��ħ
	int secondHand = 0;
//	.��¥â
	int dateWindow = 0;
//	.���͸�
	int battery = 0;
//	.���̾� �ε���
	int[] dialIndex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//	.�ð� ���� ũ���
	int timeCrown = 0;
//	.��¥ ���� ũ���
	int dateCrown = 0;
	
	
	//������		> ��ü ������ �ʱ�ȭ ���
//	�귣���
	public Watch(String brand, String model) {
		
	}
	
	//�޼ҵ�
//	1. ��ħ ����
	public int cycleOfSecondHand() {
		secondHand += 1;
		System.out.println("��ħ�� " + secondHand + "�ʸ� ����ŵ�ϴ�."); // sysout �Լ�ó��
		return secondHand;
	}
	
//	2. ��ħ ����
	public int cycleOfMinuteHand(int secondHand) {
		if(secondHand == 60) {
			this.secondHand = 0;
			minuteHand += 1;
		} else {
			//
		}
		return minuteHand;
	}
	
//	3. ��ħ ����
	public int cycleOfHourHand(int minuteHand) {
		if(minuteHand == 60) {
			this.minuteHand = 0;
			hourHand += 1;
		} else {
			//
		}
		return hourHand;
	}
	
//	4-1. ���͸���, ��뷮, �˸�
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
//	4-2. ���͸� ��뷮
	public int loseBattety() {
		battery -= 1;
		return battery;
	}
//	4-3. �˸�
	public boolean isLowbattery() {
		if(battery == 0) {
			System.out.println("���͸��� �����մϴ�.");		// sysout�� ���� �Լ�ȭ �ϱ�
			return false;
		} else {
			//pass
		}
		return true;
	}

//	5. ��¥ ����
	public int cycleOfDate() {
		int[] dates = new int[31];
		for(int i = 0; i <= 30; i++) {
			dates[i] = i+1;
		}
		return 0;
	}
	
//	6-1. �ð� ���� (��)
	public int ChangeSecond(int setnumber) {
		return 0;
	}
//	6-2. �ð� ���� (��)
	public int ChangeMinute() {
		return 0;
	}
//	6-3. �ð� ���� (��)
	public int ChangeHour() {
		return 0;
	}
	
	
//	7. ��¥ ����
	public int ChangeDate() {
		return 0;
	}
	
	
}
