package org.camp.bnb.service;

import java.awt.List;
import java.util.Optional;

import org.camp.bnb.repository.UserDAO;
import org.camp.bnb.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.util.StringUtils;

/*
 * �������� ��������
 * */
@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;

	public int insertUser(UserVO userVo) {
		
		// TODO ���⼭ �ߺ�ȸ�� üũ ���
		// userId �����ͼ� ������ false ������ true
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
