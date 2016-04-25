package co.kr.dataRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.doosam.data.HmcMember;

public interface HmcMemberRepository extends JpaRepository<HmcMember, String>{
	public Long countByUserId(String userId);

}
