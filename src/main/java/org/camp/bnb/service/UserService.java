package org.camp.bnb.service;

import java.awt.List;
import java.util.Optional;

import org.camp.bnb.repository.UserDAO;
import org.camp.bnb.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.util.StringUtils;

/*
 * 실질적인 로직구현
 * */
@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;

	public int insertUser(UserVO userVo) {
		
		// TODO 여기서 중복회원 체크 등등
		// userId 가져와서 있으면 false 없으면 true
		userVo.getUserId();
		
//		if (StringUtils.isNullOrEmpty() {
//			
//		}
		 
		return userDAO.insertUser(userVo);
	}
	
//	public boolean existUser() {
//		// TODO ..
//	}
	
	// TODO CRUD
}
