package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestBookVo;

@Service 
public class GuestBookService {

	@Autowired
	private GuestBookDao gbDao;
	
	public List<GuestBookVo> getList() {
		List<GuestBookVo> gbList = gbDao.getList();
		return gbList;
	}
	
	public void add(GuestBookVo visit) {
		gbDao.add(visit);
	}
	
	public int find(GuestBookVo visit) {
		int no = gbDao.find(visit);
		
		return no;
	}
	
	public void delete(int no) {
		gbDao.delete(no);
		
	}
	
	
}
