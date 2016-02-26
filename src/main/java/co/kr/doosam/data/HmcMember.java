package co.kr.doosam.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="HMC_MEMBER")
public class HmcMember implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 825799215724547523L;
	
	public HmcMember(){}
	
	@Id
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20)  comment '유저 아이디'" )
	private String	userId;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '유저 비밀번호'" )
	private String 	userPw;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50) comment '유저 이름'" )
	private String 	userName;
	@Column(length=2 , nullable=false ,columnDefinition="varchar(2) comment '유저 권한( 0 관리자, 1 구매자 ,2  공급자)'" )
	private String 	userLevelCd;
	@Column(length=2 , nullable=false ,columnDefinition="varchar(2) comment '국가 번호( 0한국 , 1 러시아 , 2 미국)'" )
	private String 	userNationCd;
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20) ")
	private String 	userPhoneNumber;
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20)  " )
	private String 	userMobilePhoneNumber;
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20)  " )
	private String 	userFaxNumber;
	@Column(length=70 , nullable=false ,columnDefinition="varchar(70) " )
	private String 	userMailAddress;
	@Column(length=50 , nullable=false ,columnDefinition="varchar(50)  " )
	private String 	createUser;
	@Column(nullable=false ,columnDefinition="DATETIME " )
	private Date   	createDate;
	@Column(length=50 , nullable=true ,columnDefinition="varchar(50) " )
	private String 	modifyUser;
	@Column(nullable=true ,columnDefinition="DATETIME" )
	private Date   	modifyDate;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLevelCd() {
		return userLevelCd;
	}
	public void setUserLevelCd(String userLevelCd) {
		this.userLevelCd = userLevelCd;
	}
	public String getUserNationCd() {
		return userNationCd;
	}
	public void setUserNationCd(String userNationCd) {
		this.userNationCd = userNationCd;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserMobilePhoneNumber() {
		return userMobilePhoneNumber;
	}
	public void setUserMobilePhoneNumber(String userMobilePhoneNumber) {
		this.userMobilePhoneNumber = userMobilePhoneNumber;
	}
	public String getUserFaxNumber() {
		return userFaxNumber;
	}
	public void setUserFaxNumber(String userFaxNumber) {
		this.userFaxNumber = userFaxNumber;
	}
	public String getUserMailAddress() {
		return userMailAddress;
	}
	public void setUserMailAddress(String userMailAddress) {
		this.userMailAddress = userMailAddress;
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
		return "HmcMember [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userLevelCd="
				+ userLevelCd + ", userNationCd=" + userNationCd + ", userPhoneNumber=" + userPhoneNumber
				+ ", userMobilePhoneNumber=" + userMobilePhoneNumber + ", userFaxNumber=" + userFaxNumber
				+ ", userMailAddress=" + userMailAddress + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", modifyUser=" + modifyUser + ", modifyDate=" + modifyDate + "]";
	}
	

}
