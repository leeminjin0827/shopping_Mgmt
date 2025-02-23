package shop.controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import shop.model.dao.MemberDao;
import shop.model.dto.MemberDto;

@WebServlet("/shop")
public class MemberController extends HttpServlet{
	
	// 회원등록
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("shop dopost!!");
		ObjectMapper mapper = new ObjectMapper();
		MemberDto memberDto = mapper.readValue(req.getReader(),MemberDto.class);
		System.out.println( "memberDto = " + memberDto );
		boolean writetest = false;
		if( memberDto.getCustname() == null ) {
			System.out.println("회원성명이 입력되지 않았습니다.");
			
		}
		boolean result = MemberDao.getInstance().write( memberDto );
		resp.setContentType("application/json");
		resp.getWriter().print( result );
	} // f end
	
	// 회원조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("shop doget!!");
		ObjectMapper mapper = new ObjectMapper();
		String jsonResult = mapper.writeValueAsString(mapper);
		resp.setContentType("application/json");
		resp.getWriter().print(jsonResult);
	} // f end
	
	// 회원정보수정
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("shop doput!!");
	} // f end

} // c end
