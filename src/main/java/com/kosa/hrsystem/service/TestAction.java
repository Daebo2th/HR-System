package com.kosa.hrsystem.service;



import com.kosa.hrsystem.action.Action;
import com.kosa.hrsystem.action.ActionForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//회원가입 처리를 목적으로 하는 서비스 구현 .... Action 구현
//강제사항 ActionForward execute 구현해야 한다
public class TestAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		// 1. request 요청으로부터 데이터 입력 받기
//		String 받아서 사용할 값 = request.getParameter("key");

		// 2. db에서 데이터를 받기위해 dao객체를 생성하고 받아오려는 메소드 호출
//		RegisterDao dao = new dao객체();
//		int result = dao.메소드(파라미터);
		

		
	    // 3. 뷰(프론트)한테 다시 보내줄 데이터 저장
//		request.setAttribute("key", value);
	   
		// 4. 뷰설정하기
//	    ActionForward forward = new ActionForward();
//	    forward.setRedirect(false); //True 클라이언트가 새로운 페이지를 요청하게 할 거예요
//		forward.setPath("/WEB-INF/views/...");
//		return forward;
		return null;
	}

}
