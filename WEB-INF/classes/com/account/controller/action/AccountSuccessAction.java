package com.account.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.account.dao.AccountDAO;
import com.account.vo.AccountVO;

public class AccountSuccessAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acf = request.getParameter("acf");
		String url = "account/accountSuccess.jsp";
		int result = 0;
		AccountDAO adao = AccountDAO.getInstance();
		AccountVO avo = new AccountVO();
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phone = request.getParameter("phone");
		int birthy = Integer.parseInt(request.getParameter("birthy"));
		int birthm = Integer.parseInt(request.getParameter("birthm"));
		int birthd = Integer.parseInt(request.getParameter("birthd"));
		avo.setEmail(email);
		avo.setPwd(pwd);
		avo.setFname(fname);
		avo.setLname(lname);
		avo.setPhone(phone);
		avo.setBirthy(birthy);
		avo.setBirthm(birthm);
		avo.setBirthd(birthd);
		System.out.println(avo);
		if(acf.equals("email")) {
			/* adao.insertByEmail(avo); */
			result = adao.selectAccountByEmail(pwd, email);
			if(result == -1) {
				adao.insertByEmail(avo);
				url = "account/accountSuccess.jsp";
			} else {
				request.setAttribute("message", "이미 존재하는 이메일입니다");
				url = "AccountServlet?command=account_form";
			}
			
		} else if(acf.equals("phone")) {
			/* adao.insertByPhone(avo); */
			result = adao.selectAccountByPhone(pwd, phone);
			if(result == -1) {
				adao.insertByPhone(avo);
				request.setAttribute("message", null);
				url = "account/accountSuccess.jsp";
			} else {
				request.setAttribute("message", "이미 존재하는 전화번호입니다");
				url = "AccountServlet?command=account_form2";
			}
		
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
