package com.kh.semi.league.vo;

public class ReasonForMatch_vo {
	private String reasonForMatchNumber;		//경기 처리 사유 코드
	private String reasonForMatchDistinguish;	//경기 처리 사유 규뷴
	private int leagueMatchNumber;			//리그 경기 고유 번호(FK)

	public String getReasonForMatchNumber() {
		return reasonForMatchNumber;
	}

	public void setReasonForMatchNumber(String reasonForMatchNumber) {
		this.reasonForMatchNumber = reasonForMatchNumber;
	}

	public String getReasonForMatchDistinguish() {
		return reasonForMatchDistinguish;
	}

	public void setReasonForMatchDistinguish(String reasonForMatchDistinguish) {
		this.reasonForMatchDistinguish = reasonForMatchDistinguish;
	}

	public int getLeagueMatchNumber() {
		return leagueMatchNumber;
	}

	public void setLeagueMatchNumber(int leagueMatchNumber) {
		this.leagueMatchNumber = leagueMatchNumber;
	}

	@Override
	public String toString() {
		return "ReasonForMatch_vo [reasonForMatchNumber=" + reasonForMatchNumber + ", reasonForMatchDistinguish="
				+ reasonForMatchDistinguish + ", leagueMatchNumber=" + leagueMatchNumber + "]";
	}

	public ReasonForMatch_vo(String reasonForMatchNumber, String reasonForMatchDistinguish, int leagueMatchNumber) {
		super();
		this.reasonForMatchNumber = reasonForMatchNumber;
		this.reasonForMatchDistinguish = reasonForMatchDistinguish;
		this.leagueMatchNumber = leagueMatchNumber;
	}

	public ReasonForMatch_vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
