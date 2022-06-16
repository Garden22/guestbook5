package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GuestBookService;
import com.javaex.vo.GuestBookVo;

@Controller
public class GuestBookController {
	
	@Autowired
	private GuestBookService gbService;
	
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("controller > list");
		
		List<GuestBookVo> gbList = gbService.getList();
		model.addAttribute("gbList", gbList);
		
		return "addList";
	}
	
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute GuestBookVo visit) {
		System.out.println("controller > add");
		
		gbService.add(visit);
		
		return "redirect: ./list";
	}
	
	@RequestMapping(value="/deleteForm/{no}", method={RequestMethod.GET, RequestMethod.POST})
	public String deleteForm(@PathVariable("no") int no, Model model) {
		System.out.println("controller > deleteForm");
		
		model.addAttribute("no", no);
		
		return "deleteForm";
	}
	
	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@ModelAttribute GuestBookVo visit) {
		System.out.println("controller > delete");
		
		int no = gbService.find(visit);
		if (no != -1) gbService.delete(visit.getNo());
		
		return "redirect: ./list";
	}
}
