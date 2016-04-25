package co.kr.doosam.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name ="HMC_MENU")
public class HmcMenu implements Serializable{
	
	private static final long serialVersionUID = -229390408376498561L;

	public HmcMenu(){};
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	
	@Column(length=8, nullable=false ,columnDefinition="varchar(8) comment '메뉴코드'")
	private String menuCode;
	
	@Column(length=100, nullable=false ,columnDefinition="varchar(100) comment '메뉴명'")
	private String menuName;
	
	
	@Column(length=100, nullable=false , columnDefinition=" varchar(100) comment '메뉴의 실행 url'")
	private String menuUrl;
	
	@Column(length=2, nullable=false , columnDefinition=" varchar(2) comment '메뉴 레벨  0 슈퍼유저 ,1 일반유저 '")
	private String menuLevel;
	
	@Column(length=2, nullable=false , columnDefinition=" varchar(2) comment '메뉴 레벨  0 관리자페이지 ,1 공급자페이지, 2창고 ,3구매자 '")
	private String menuUser;
	
	@Column(length=8, nullable=false , columnDefinition=" varchar(8) comment '상위 코드 '")
	private String upperCode;
	
	@Column(length=2, nullable=false , columnDefinition="varchar(2) comment '사용 여부'")
	private String useYn;
	
	@Column(length=20 , nullable=false ,columnDefinition="varchar(20)" )
	private String 	createUser;

	@Column(nullable=false ,columnDefinition="DATETIME" )
	private Date   	createDate;
	
	@Column(length=20 , nullable=true ,columnDefinition="varchar(20)" )
	private String 	modifyUser;
	
	@Column(nullable=true ,columnDefinition="DATETIME" )
	private Date   	modifyDate;

	

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getMenuUser() {
		return menuUser;
	}

	public void setMenuUser(String menuUser) {
		this.menuUser = menuUser;
	}

	public String getUpperCode() {
		return upperCode;
	}

	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
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

	@PrePersist
	public void prePersist(){
		createDate = new Date();
	}
	
	@Override
	public String toString() {
		return "Menu [oid=" + oid + ", menuCode=" + menuCode + ", menuName=" + menuName + ", menuUrl=" + menuUrl
				+ ", menuLevel=" + menuLevel + ", menuUser=" + menuUser + ", upperCode=" + upperCode + ", useYn="
				+ useYn + ", createUser=" + createUser + ", createDate=" + createDate + ", modifyUser=" + modifyUser
				+ ", modifyDate=" + modifyDate + "]";
	}
	
	
	

	
}
