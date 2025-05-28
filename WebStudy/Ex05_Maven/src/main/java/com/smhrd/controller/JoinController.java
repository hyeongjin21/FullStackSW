package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void service(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      System.out.println("[JoinController]");
      // post 타입을 다시 디코딩을 해줘야 한글을 읽을 수 있다.
      request.setCharacterEncoding("UTF-8");
      // 1. join.jsp에서 사용자가 입력한 id, pw, name 3가지 데이터 받아서
      // console창에 출력
      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
      String name = request.getParameter("name");
      System.out.println("ID : " + id);
      System.out.println("PW : " + pw);
      System.out.println("NAME : " + name);
      
      // 2. Member객체에 데이터 저장
      Member member = new Member(id, pw, name);
      
      // 3. DB에 저장하기 위해 DAO에 있는 join메소드 실행
      // insert하고나면 결과값이 실행된 행의 개수로 return(int)
      int row = new MemberDAO().join(member);
      
      // 4. 실행결과 확인
      if(row > 0) {
    	  System.out.println("회원가입 성공");
      }else {
    	  System.out.println("회원가입 실패");
      }
      
   }

}
