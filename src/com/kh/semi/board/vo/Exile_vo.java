package com.kh.semi.board.vo;

import java.sql.Date;

public class Exile_vo implements java.io.Serializable {
	private int exileId;				//사용자탈퇴 및 추방 번
	private Date exileDate;				//등록일자
	private String exileReason;			//사유
	private String exileType;			//탈퇴구분
	private int pfId;					//사용자 고유 번호
	private String exileStatus;			//탈퇴여부
	
	public Exile_vo () {}

	public Exile_vo(int exileId, Date exileDate, String exileReason, String exileType, int pfId, String exileStatus) {
		super();
		this.exileId = exileId;
		this.exileDate = exileDate;
		this.exileReason = exileReason;
		this.exileType = exileType;
		this.pfId = pfId;
		this.exileStatus = exileStatus;
	}

	public int getExileId() {
		return exileId;
	}

	public void setExileId(int exileId) {
		this.exileId = exileId;
	}

	public Date getExileDate() {
		return exileDate;
	}

	public void setExileDate(Date exileDate) {
		this.exileDate = exileDate;
	}

	public String getExileReason() {
		return exileReason;
	}

	public void setExileReason(String exileReason) {
		this.exileReason = exileReason;
	}

	public String getExileType() {
		return exileType;
	}

	public void setExileType(String exileType) {
		this.exileType = exileType;
	}

	public int getPfId() {
		return pfId;
	}

	public void setPfId(int pfId) {
		this.pfId = pfId;
	}

	public String getExileStatus() {
		return exileStatus;
	}

	public void setExileStatus(String exileStatus) {
		this.exileStatus = exileStatus;
	}

	@Override
	public String toString() {
		return "Exile_vo [exileId=" + exileId + ", exileDate=" + exileDate + ", exileReason=" + exileReason
				+ ", exileType=" + exileType + ", pfId=" + pfId + ", exileStatus=" + exileStatus + "]";
	};
	
	
}
