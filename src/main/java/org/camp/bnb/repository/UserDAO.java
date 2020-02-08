package org.camp.bnb.repository;

import org.apache.ibatis.session.SqlSession;
import org.camp.bnb.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * DB ¶û ¸ÅÇÎ
 * */
@Repository
public class UserDAO {
	
	@Autowired
	SqlSession session;
	
	public int insertUser(UserVO vo) {
		return session.insert("user.insertUser", vo);
	}

}
