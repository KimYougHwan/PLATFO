package co.kr.doosam.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="HMC_PARTS_BRAND_CODE")
public class HmcPartsBrandCode implements Serializable{

	private static final long serialVersionUID = -2209220845615842311L;
	
	@Id
	@Column(length=10 , nullable=false ,columnDefinition="varchar(10) comment '브랜드코드'" )
	private String brandCode;
	
	@Column(length=30 , nullable=false ,columnDefinition="varchar(30) comment '브랜드명'" )
	private String brandNm;
	
	@Column(length=5 , nullable=false ,columnDefinition="varchar(5) comment '부품코드구분 G 순정부품,  O OEM, N NON_GENUINE,"
			+ ", R REBULT, P 재제조'" )
	private String code;
}
