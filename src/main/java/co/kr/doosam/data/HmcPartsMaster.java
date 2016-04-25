package co.kr.doosam.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HMC_PARTS_MASTER")
public class HmcPartsMaster implements Serializable {

	private static final long serialVersionUID = -4665651754723308801L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	
	@Column(length=15, nullable=false ,columnDefinition="varchar(15) comment '부품번호'")
	private String partsNumber;
	
	@Column(length=15, columnDefinition="varchar(15) comment '이전부품번호'")
	private String beforePartsNumber;
	
	@Column(length=15, columnDefinition="varchar(15) comment '바뀔 부품번호'")
	private String afterPartsNumber;
	
	@Column(length=15, nullable=false ,columnDefinition="varchar(15) comment '부품명(영문)'")
	private String partsNameEn;
	
	@Column(length=15, nullable=false ,columnDefinition="varchar(15) comment '부품명(한글)'")
	private String partsNameKo;
	
	@Column(length=15, nullable=false ,columnDefinition="varchar(15) comment '수출파트 또는 국내 파트'")
	private String type;
	
	@Column(length=2, nullable=false ,columnDefinition="varchar(2) comment '부품구분 코드'")
	private String code;
	
	@Column(length=8, nullable=false ,columnDefinition="varchar(2) comment '브랜드 코드'")
	private String brandCode;
	
	@Column(nullable=false ,columnDefinition="int comment '부품단위'")
	private int unitOid;
	
	@Column(nullable=false ,columnDefinition="int comment '가격종류(통화)'")
	private int currencyOid;
	
	//@Column(nullable=false ,columnDefinition="int comment '원가(생가)'")
	//private int cost;
	
	@Column(length=10, nullable=false ,columnDefinition="varchar(10) comment '연결 차종 코드'")
	private String modelCode;
	
	@Column(length=5, columnDefinition="varchar(5) comment '품목코드 코드'")
	private String itemCode;
	
	@Column(length=1, columnDefinition="varchar(1) comment '주문중지여부'")
	private String noMoreOrder;
	
	@Column(nullable=true ,columnDefinition="int comment '차량한대당 소요량'")
	private int usageCnt;
	
	@Column(length=3, nullable=false ,columnDefinition="varchar(3) comment '완성차 그룹코드'")
	private String cbu;

	@Column(length=1, nullable=false ,columnDefinition="varchar(1) comment '부품 브룹사 코드 C-공통,K-기아,H-현대'")
	private String lep;
	
	@Column(nullable=false ,columnDefinition="int comment '박스 단위 -대'")
	private int packingUnitBoxBig;
	
	@Column(nullable=false ,columnDefinition="int comment '박스 단위 -중'")
	private int packingUnitBoxMiddle;
	
	@Column(nullable=false ,columnDefinition="int comment '박스 단위 -소'")
	private int packingUnitBoxSmall;
	
	//@Column(nullable=false ,columnDefinition="int comment '박스 단위 -비닐'")
	//private int packingUnitBoxVinyl;
	
	@Column(nullable=false ,columnDefinition="int comment '박스 적용 단위'")
	private int packingUnitBoxCnt;
	
	@Column(nullable=false ,columnDefinition="int comment '비닐 적용 단위'")
	private int packingUnitVinylCnt;
	
	@Column(nullable=false ,columnDefinition="int comment '중량(g)'")
	private int weight;
	
	@Column(nullable=false ,columnDefinition="int comment '가로(mm)'")
	private int width;
	
	@Column(nullable=false ,columnDefinition="int comment '세로(mm)'")
	private int vertical;
	
	@Column(nullable=false ,columnDefinition="int comment '높이(mm)'")
	private int height;
	
	@Column(nullable=false ,columnDefinition="int comment '체적(mm3)'")
	private int bulk;
	
	@Column(nullable=false ,columnDefinition="varchar(50) comment '만든사람'")
	private int createUser;
	
	@Column(nullable=false ,columnDefinition="DATETIME comment '만든일자'")
	private int createDate;
	
	@Column(nullable=false ,columnDefinition="varchar(50) comment '수정자'")
	private int modifyUser;
	
	@Column(nullable=false ,columnDefinition="DATETIME comment '수정일자'")
	private int modifyDate;
}

