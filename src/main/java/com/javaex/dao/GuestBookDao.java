package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestBookVo;

@Repository
public class GuestBookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<GuestBookVo> getList() {	
		List<GuestBookVo> gbList = sqlSession.selectList("guestbook.getList");
		
		return gbList;
	}
	
	public void add(GuestBookVo visit) {
		int count = -1;
		count = sqlSession.insert("guestbook.add", visit);
		
		if (count > 0) System.out.println("[" + count + "건 등록되었습니다.]");
		else System.out.println("[등록되지 않았습니다.]");
	}
	
	public int find(GuestBookVo find) {
		int no = sqlSession.selectOne("guestbook.find", find);
		
		if (no != -1) System.out.println("[비밀번호가 일치합니다.]");
		else System.out.println("[비밀번호가 일치하지 않습니다.]");
		
		return no;
	}
	
	public void delete(int no) {
		int count = sqlSession.delete("guestbook.delete", no);
		
		if (count != -1) System.out.println("[" + count + "건 삭제되었습니다.]");
		else System.out.println("[삭제되지 않았습니다.]");
	}

}
