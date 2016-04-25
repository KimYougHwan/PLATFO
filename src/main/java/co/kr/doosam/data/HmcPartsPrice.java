package co.kr.doosam.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HMC_PARTS_PRICE")
public class HmcPartsPrice implements Serializable{

	private static final long serialVersionUID = 5487471955291337567L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	
	@Column(length=15, nullable=false ,columnDefinition="varchar(15) comment '부품번호'")
	private String partsNumber;
	
	@Column(length=1, nullable=false ,columnDefinition="varchar(1) comment '가격 종류 w 도매가 s 소매가'")
	private String type;
	
	@Column(nullable=false ,columnDefinition="int comment '가격'")
	private int price;
	
	@Column(length=8, columnDefinition="varchar(8) comment '변경일자'")
	private String hModifyDate;
	
	@Column(nullable=false ,columnDefinition="varchar(50) comment '만든사람'")
	private int createUser;
	
	@Column(nullable=false ,columnDefinition="DATETIME comment '만든일자'")
	private int createDate;
}
