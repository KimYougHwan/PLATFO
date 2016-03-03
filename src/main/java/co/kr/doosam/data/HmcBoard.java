package co.kr.doosam.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="HMC_MEMBER")
public class HmcBoard implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 825799215724547523L;
	
	public HmcBoard(){}
	
	@Id
	@Column(length=10 , nullable=false ,columnDefinition="varchar(10) comment '게시판 종류'" )
	private String BoardType;
	@Column(length=10 , nullable=false ,columnDefinition="varchar(10) comment '게시글 번호'" )
	private String BoardNumber;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '게시글 제목'" )
	private String BoardTitle;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '게시글 내용'" )
	private String 	BoardComm;
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20)  comment '작성자'" )
	private String	userId;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50)  " )
	private String 	createUser;
	@Column(nullable=false ,columnDefinition="DATETIME " )
	private Date   	createDate;
	@Column(length=50 , nullable=true ,columnDefinition="varchar(50) " )
	private String 	modifyUser;
	@Column(nullable=true ,columnDefinition="DATETIME" )
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


	@Override
	public String toString() {
		return "HmcMember [BoardType=" + BoardType + ", BoardNumber=" + BoardNumber + "]";
	}

}
