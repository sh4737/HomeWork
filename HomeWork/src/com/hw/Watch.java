package com.hw;

public class Watch {
	
	//필드
//	.브랜드
	String brand;
	String model;
//	.시침
	int hourHand = 0;
//	.분침
	int minuteHand = 0;
//	.초침
	int secondHand = 0;
//	.날짜창
	int dateWindow = 0;
//	.배터리
	int battery = 0;
//	.다이얼 인덱스
	int[] dialIndex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//	.시간 설정 크라운
	int timeCrown = 0;
//	.날짜 설정 크라운
	int dateCrown = 0;
	
	
	//생성자		> 객체 생성시 초기화 담당
//	브랜드명
	public Watch(String brand, String model) {
		
	}
	
	//메소드
//	1. 초침 동작
	public int cycleOfSecondHand() {
		secondHand += 1;
		System.out.println("초침이 " + secondHand + "초를 가리킵니다."); // sysout 함수처리
		return secondHand;
	}
	
//	2. 분침 동작
	public int cycleOfMinuteHand(int secondHand) {
		if(secondHand == 60) {
			this.secondHand = 0;
			minuteHand += 1;
		} else {
			//
		}
		return minuteHand;
	}
	
//	3. 시침 동작
	public int cycleOfHourHand(int minuteHand) {
		if(minuteHand == 60) {
			this.minuteHand = 0;
			hourHand += 1;
		} else {
			//
		}
		return hourHand;
	}
	
//	4-1. 배터리량, 사용량, 알림
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
//	4-2. 배터리 사용량
	public int loseBattety() {
		battery -= 1;
		return battery;
	}
//	4-3. 알림
	public boolean isLowbattery() {
		if(battery == 0) {
			System.out.println("배터리가 부족합니다.");		// sysout은 따로 함수화 하기
			return false;
		} else {
			//pass
		}
		return true;
	}

//	5. 날짜 동작
	public int cycleOfDate() {
		int[] dates = new int[31];
		for(int i = 0; i <= 30; i++) {
			dates[i] = i+1;
		}
		return 0;
	}
	
//	6-1. 시간 변경 (초)
	public int ChangeSecond(int setnumber) {
		return 0;
	}
//	6-2. 시간 변경 (분)
	public int ChangeMinute() {
		return 0;
	}
//	6-3. 시간 변경 (시)
	public int ChangeHour() {
		return 0;
	}
	
	
//	7. 날짜 변경
	public int ChangeDate() {
		return 0;
	}
	
	
}
