package co.kr.doosam.board.vo;

import java.sql.Date;

public class BoardListVo {
	private String  BoardType;
	private String  BoardNumber;
	private String  BoardTitle;
	private String 	BoardComm;
	private String	userId;
	private String 	createUser;
	private Date   	createDate;
	private String 	modifyUser;
	private Date   	modifyDate;
	
	public String getBoardType() {
		return BoardType;
	}
	public void setBoardType(String boardType) {
		BoardType = boardType;
	}
	public String getBoardNumber() {
		return BoardNumber;
	}
	public void setBoardNumber(String boardNumber) {
		BoardNumber = boardNumber;
	}
	public String getBoardTitle() {
		return BoardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}
	public String getBoardComm() {
		return BoardComm;
	}
	public void setBoardComm(String boardComm) {
		BoardComm = boardComm;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
