package com.kh.semi.league.vo;

public class MatchRecord_vo {

	private int matchRecordNumber;			//경기기록 고유번호 (ID)
	private int leagueMatchNumber;			//리그 경기 고유 번호(FK)
	private int firstClubNumber;			//첫번쨰 구단 고유번호 (FK)
	private int secondClubNumber;			// 두 번째 구단 고유번호(FK)
	private String 	matchApprovalStatus;	//경기 승인 여부 

	public int getMatchRecordNumber() {
		return matchRecordNumber;
	}

	public void setMatchRecordNumber(int matchRecordNumber) {
		this.matchRecordNumber = matchRecordNumber;
	}

	public int getLeagueMatchNumber() {
		return leagueMatchNumber;
	}

	public void setLeagueMatchNumber(int leagueMatchNumber) {
		this.leagueMatchNumber = leagueMatchNumber;
	}

	public int getFirstClubNumber() {
		return firstClubNumber;
	}

	public void setFirstClubNumber(int firstClubNumber) {
		this.firstClubNumber = firstClubNumber;
	}

	public int getSecondClubNumber() {
		return secondClubNumber;
	}

	public void setSecondClubNumber(int secondClubNumber) {
		this.secondClubNumber = secondClubNumber;
	}

	public String getMatchApprovalStatus() {
		return matchApprovalStatus;
	}

	public void setMatchApprovalStatus(String matchApprovalStatus) {
		this.matchApprovalStatus = matchApprovalStatus;
	}

	@Override
	public String toString() {
		return "MatchRecord_vo [matchRecordNumber=" + matchRecordNumber + ", leagueMatchNumber=" + leagueMatchNumber
				+ ", firstClubNumber=" + firstClubNumber + ", secondClubNumber=" + secondClubNumber
				+ ", matchApprovalStatus=" + matchApprovalStatus + "]";
	}

	public MatchRecord_vo(int matchRecordNumber, int leagueMatchNumber, int firstClubNumber, int secondClubNumber,
			String matchApprovalStatus) {
		super();
		this.matchRecordNumber = matchRecordNumber;
		this.leagueMatchNumber = leagueMatchNumber;
		this.firstClubNumber = firstClubNumber;
		this.secondClubNumber = secondClubNumber;
		this.matchApprovalStatus = matchApprovalStatus;
	}

	public MatchRecord_vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
