package co.kr.doosam.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="HMC_BOARD")
public class HmcBoard implements Serializable {
	
	private static final long serialVersionUID = 4931474486972057522L;


	public HmcBoard(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
		
	@Column(length=10 , nullable=false ,columnDefinition="varchar(10) comment '게시판 종류'" )
	private String boardType;
	@Column(length=10 , nullable=false ,columnDefinition="varchar(10) comment '게시글 번호'" )
	private String BoardNumber;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '게시글 제목'" )
	private String title;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '게시글 내용'" )
	private String 	comm;
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

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getBoardNumber() {
		return BoardNumber;
	}

	public void setBoardNumber(String boardNumber) {
		BoardNumber = boardNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
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
