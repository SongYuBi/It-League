package com.kh.semi.league.vo;

import java.util.Date;

public class League_vo {
	private int leagueMatchNumber;			//리그 경기 고유 번호(PK)
	private int leagueInfoNumber;			//리그 고유번호(FK)
	
	//뺄지 말지 결정해야할꺼같다.
	private int firstClubNumber;			//첫번쨰 구단 고유번호 (FK)
	private int secondClubNumber;			// 두 번째 구단 고유번호(FK)
	
	private int stadiumNumber;				//구장 고유번호 (FK)
	private String matchProcessing;			//경기 처리 
	private Date matchDate;					//경기 날짜
	private String AreaCode;				// 지역코드 (FK) 이것까지 시퀀스로 하면 매우 햇갈릴꺼같은데 잘 모르겠음
	private int refereeNumber;				//심판 고유 번호(FK)

	public int getLeagueMatchNumber() {
		return leagueMatchNumber;
	}

	public void setLeagueMatchNumber(int leagueMatchNumber) {
		this.leagueMatchNumber = leagueMatchNumber;
	}

	public int getLeagueInfoNumber() {
		return leagueInfoNumber;
	}

	public void setLeagueInfoNumber(int leagueInfoNumber) {
		this.leagueInfoNumber = leagueInfoNumber;
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

	public int getStadiumNumber() {
		return stadiumNumber;
	}

	public void setStadiumNumber(int stadiumNumber) {
		this.stadiumNumber = stadiumNumber;
	}

	public String getMatchProcessing() {
		return matchProcessing;
	}

	public void setMatchProcessing(String matchProcessing) {
		this.matchProcessing = matchProcessing;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}

	public int getRefereeNumber() {
		return refereeNumber;
	}

	public void setRefereeNumber(int refereeNumber) {
		this.refereeNumber = refereeNumber;
	}

	@Override
	public String toString() {
		return "League_vo [leagueMatchNumber=" + leagueMatchNumber + ", leagueInfoNumber=" + leagueInfoNumber
				+ ", firstClubNumber=" + firstClubNumber + ", secondClubNumber=" + secondClubNumber + ", stadiumNumber="
				+ stadiumNumber + ", matchProcessing=" + matchProcessing + ", matchDate=" + matchDate + ", AreaCode="
				+ AreaCode + ", refereeNumber=" + refereeNumber + "]";
	}

	public League_vo(int leagueMatchNumber, int leagueInfoNumber, int firstClubNumber, int secondClubNumber,
			int stadiumNumber, String matchProcessing, Date matchDate, String areaCode, int refereeNumber) {
		super();
		this.leagueMatchNumber = leagueMatchNumber;
		this.leagueInfoNumber = leagueInfoNumber;
		this.firstClubNumber = firstClubNumber;
		this.secondClubNumber = secondClubNumber;
		this.stadiumNumber = stadiumNumber;
		this.matchProcessing = matchProcessing;
		this.matchDate = matchDate;
		AreaCode = areaCode;
		this.refereeNumber = refereeNumber;
	}

	public League_vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
