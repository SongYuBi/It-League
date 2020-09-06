package com.kh.semi.league.vo;

import java.io.Serializable;

public class MatchResult_vo implements Serializable {

	private int matchResultNumber; 						// 경기 결과 고유 번호
	private String matchWin; 							// 승 - Y or N
	private String matchDefiat; 						// 패 - Y or N
	private String matchDraw; 							// 무승부 - Y or N
	private String leagueMathNumber; 					// 리그 경기 고유 번호
	private int score; 									// 득점
	private int lossPoint; 								// 실점
	private int matchRecordNumber; 						// 경기기록 고유번호 (ID)
	private int clubNumber; 							// 구단 고유 번호(ID)

	public int getMatchResultNumber() {
		return matchResultNumber;
	}

	public void setMatchResultNumber(int matchResultNumber) {
		this.matchResultNumber = matchResultNumber;
	}

	public String getMatchWin() {
		return matchWin;
	}

	public void setMatchWin(String matchWin) {
		this.matchWin = matchWin;
	}

	public String getMatchDefiat() {
		return matchDefiat;
	}

	public void setMatchDefiat(String matchDefiat) {
		this.matchDefiat = matchDefiat;
	}

	public String getMatchDraw() {
		return matchDraw;
	}

	public void setMatchDraw(String matchDraw) {
		this.matchDraw = matchDraw;
	}

	public String getLeagueMathNumber() {
		return leagueMathNumber;
	}

	public void setLeagueMathNumber(String leagueMathNumber) {
		this.leagueMathNumber = leagueMathNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLossPoint() {
		return lossPoint;
	}

	public void setLossPoint(int lossPoint) {
		this.lossPoint = lossPoint;
	}

	public int getMatchRecordNumber() {
		return matchRecordNumber;
	}

	public void setMatchRecordNumber(int matchRecordNumber) {
		this.matchRecordNumber = matchRecordNumber;
	}

	public int getClubNumber() {
		return clubNumber;
	}

	public void setClubNumber(int clubNumber) {
		this.clubNumber = clubNumber;
	}

	@Override
	public String toString() {
		return "MatchResult_vo [matchResultNumber=" + matchResultNumber + ", matchWin=" + matchWin + ", matchDefiat="
				+ matchDefiat + ", matchDraw=" + matchDraw + ", leagueMathNumber=" + leagueMathNumber + ", score="
				+ score + ", lossPoint=" + lossPoint + ", matchRecordNumber=" + matchRecordNumber + ", club_number="
				+ clubNumber + "]";
	}

	public MatchResult_vo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatchResult_vo(int matchResultNumber, String matchWin, String matchDefiat, String matchDraw,
			String leagueMathNumber, int score, int lossPoint, int matchRecordNumber, int clubNumber) {
		super();
		this.matchResultNumber = matchResultNumber;
		this.matchWin = matchWin;
		this.matchDefiat = matchDefiat;
		this.matchDraw = matchDraw;
		this.leagueMathNumber = leagueMathNumber;
		this.score = score;
		this.lossPoint = lossPoint;
		this.matchRecordNumber = matchRecordNumber;
		this.clubNumber = clubNumber;
	}

	
	
	
	
}
