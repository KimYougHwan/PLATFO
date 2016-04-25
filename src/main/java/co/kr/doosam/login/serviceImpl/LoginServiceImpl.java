package co.kr.doosam.login.serviceImpl;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.doosam.data.HmcMember;
import co.kr.dataRepository.HmcMemberRepository;
import co.kr.doosam.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource
	private HmcMemberRepository hmcMemberRepository;
	
	private HmcMember hmcMember;
	
	public void selectCountHmcMember(){
		String userId = "test";
		HmcMember findMember = hmcMemberRepository.findOne(userId);
		Object test = hmcMemberRepository.countByUserId(userId);
		
		System.out.println(findMember);
		System.out.println(test);
		
	}
	
}
