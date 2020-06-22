package com.kosmo.k11spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import common.StudentDTO;

@Controller
public class RequestMappingController {

	@RequestMapping("/requestMapping/index.do")
	public String rmIndex() {
		
		return "02RequestMapping/index";
	}
	
	
	/*
	 단순히 요청명만 매핑하는 경우에는 value, method를 제외할 수 있으나
	 전송방식까지 명시해야 하는 경우에는 속성을 제거하면 에러가
	 발생된다.
	 */
	@RequestMapping(value="/requestMapping/getSearch.do",
			method=RequestMethod.GET)
	public String getSearch(HttpServletRequest req,
			Model model) {
		
			System.out.println("RequestMethod.GET방식으로 " + "폼값전송");
			
			//request객체를 통해 폼값을 받음
			String sColumn = req.getParameter("searchColumn");
			String sWord = req.getParameter("searchWord");
			
			//모델객체에 데이터 저장
			model.addAttribute("sColumn", sColumn);
			model.addAttribute("sWord", sWord);
			
			//뷰 호출1
			return "02RequestMapping/getSearch";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,
			value="/requestMapping/postLogin.do")
	public ModelAndView postLogin (
		
		@RequestParam("user_id") String id,
		@RequestParam("user_pw") String pw
		
		){
			//뷰 호출 2
			ModelAndView mv =new ModelAndView();
			
			mv.setViewName("02RequestMapping/postLogin");
			mv.addObject("id", id);
			mv.addObject("pw", pw);
		return mv;
	
	}
	
	/*
	 @ModelAttribute 어노테이션
	  	: 뷰로 전달되는 커멘드객체의 이름을 임의로 변경
	 
	 */
	
	@RequestMapping("/requestMapping/modelAttribute")
	public String studentInfo(
			@ModelAttribute("si")StudentDTO studentDTO) {
		
			return "02RequestMapping/modelAttribute";
	}
	
}
