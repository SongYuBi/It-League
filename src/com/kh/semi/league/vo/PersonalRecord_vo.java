package com.kh.semi.league.vo;

public class PersonalRecord_vo {

	private int personalRecordNumber;				 // 개인 기록 고유 번호
	private int matchGoal; 							// 골 수
	private int assist;								 // 어시스트
	private String recordApprovalStatus;			 // 입력 승인 상태
	private int profileNumber; 						// 사용자 고유 번호
	private int matchResultNumber; 					// 경기 결과 고유번호

	public int getPersonalRecordNumber() {
		return personalRecordNumber;
	}

	public void setPersonalRecordNumber(int personalRecordNumber) {
		this.personalRecordNumber = personalRecordNumber;
	}

	public int getMatchGoal() {
		return matchGoal;
	}

	public void setMatchGoal(int matchGoal) {
		this.matchGoal = matchGoal;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public String getRecordApprovalStatus() {
		return recordApprovalStatus;
	}

	public void setRecordApprovalStatus(String recordApprovalStatus) {
		this.recordApprovalStatus = recordApprovalStatus;
	}

	public int getProfileNumber() {
		return profileNumber;
	}

	public void setProfileNumber(int profileNumber) {
		this.profileNumber = profileNumber;
	}

	public int getMatchResultNumber() {
		return matchResultNumber;
	}

	public void setMatchResultNumber(int matchResultNumber) {
		this.matchResultNumber = matchResultNumber;
	}

	@Override
	public String toString() {
		return "PersonalRecord_vo [personalRecordNumber=" + personalRecordNumber + ", matchGoal=" + matchGoal
				+ ", assist=" + assist + ", recordApprovalStatus=" + recordApprovalStatus + ", profileNumber="
				+ profileNumber + ", matchResultNumber=" + matchResultNumber + "]";
	}

	public PersonalRecord_vo(int personalRecordNumber, int matchGoal, int assist, String recordApprovalStatus,
			int profileNumber, int matchResultNumber) {
		super();
		this.personalRecordNumber = personalRecordNumber;
		this.matchGoal = matchGoal;
		this.assist = assist;
		this.recordApprovalStatus = recordApprovalStatus;
		this.profileNumber = profileNumber;
		this.matchResultNumber = matchResultNumber;
	}

	public PersonalRecord_vo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
