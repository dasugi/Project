package com.account.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.account.dao.AccountDAO;
import com.account.vo.AccountVO;

public class LoginSuccessAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lgf = request.getParameter("lgf");
		AccountDAO adao = AccountDAO.getInstance();
		AccountVO avo = new AccountVO();
		String url = "main.jsp";
		if(lgf.equals("email")) {
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			avo.setEmail(email);
			avo.setPwd(pwd);
			int result = adao.selectAccountByEmail(pwd, email);
			if(result == 1) {
				avo = adao.selectByEmail(email);
				HttpSession session = request.getSession();
				session.setAttribute("user", avo);
				session.setAttribute("result", result);
			} else if(result == 0 || result == -1) {
				System.out.println("실패");
				request.setAttribute("message", "이메일이나 비밀번호가 틀렸습니다");
				url = "AccountServlet?command=email_login_form";
			}
		} else if(lgf.equals("phone")) {
			String phone = request.getParameter("phone");
			String pwd = request.getParameter("pwd");
			avo.setPhone(phone);
			avo.setPwd(pwd);
			int result = adao.selectAccountByPhone(pwd, phone);
			if(result == 1) {
				avo = adao.selectByPhone(phone);
				HttpSession session = request.getSession();
				session.setAttribute("user", avo);
				session.setAttribute("result", result);
			} else if(result == 0 || result == -1) {
				System.out.println("실패");
				request.setAttribute("message", "전화번호나 비밀번호가 틀렸습니다");
				url = "AccountServlet?command=phone_login_form";
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
