package com.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.account.util.DBManager;
import com.account.vo.AccountVO;

public class AccountDAO {
	
	private AccountDAO() {}
	
	private static AccountDAO instance = new AccountDAO();
	
	public static AccountDAO getInstance() {
		return instance;
	}
	
	public AccountVO selectByEmail(String email) {
		String sql = "select * from project where email=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AccountVO avo = new AccountVO();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				avo.setEmail(rs.getString("email"));
				avo.setPwd(rs.getString("pwd"));
				avo.setFname(rs.getString("fname"));
				avo.setLname(rs.getString("lname"));
				avo.setBirthy(rs.getInt("birthy"));
				avo.setBirthm(rs.getInt("birthm"));
				avo.setBirthd(rs.getInt("birthd"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(rs, pstmt, conn);
		}
		return avo;
	}
	
	public AccountVO selectByPhone(String phone) {
		String sql = "select * from project where phone=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AccountVO avo = new AccountVO();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				avo.setPhone(rs.getString("phone"));
				avo.setPwd(rs.getString("pwd"));
				avo.setFname(rs.getString("fname"));
				avo.setLname(rs.getString("lname"));
				avo.setBirthy(rs.getInt("birthy"));
				avo.setBirthm(rs.getInt("birthm"));
				avo.setBirthd(rs.getInt("birthd"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(rs, pstmt, conn);
		}
		return avo;
	}
	
	public AccountVO insertByEmail(AccountVO avo) {
		String sql = "insert into project values(?,?,?,?,null,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, avo.getEmail());
			pstmt.setString(2, avo.getPwd());
			pstmt.setString(3, avo.getFname());
			pstmt.setString(4, avo.getLname());
			pstmt.setInt(5, avo.getBirthy());
			pstmt.setInt(6, avo.getBirthm());
			pstmt.setInt(7, avo.getBirthd());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(pstmt, conn);
		}
		return avo;
	}
	
	public AccountVO insertByPhone(AccountVO avo) {
		String sql = "insert into project values(null,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, avo.getPwd());
			pstmt.setString(2, avo.getFname());
			pstmt.setString(3, avo.getLname());
			pstmt.setString(4, avo.getPhone());
			pstmt.setInt(5, avo.getBirthy());
			pstmt.setInt(6, avo.getBirthm());
			pstmt.setInt(7, avo.getBirthd());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(pstmt, conn);
		}
		return avo;
	}
	
	public int selectAccountByEmail(String pwd, String email) {
		int result = 2;
		String sql = "select email, pwd from project where email=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(email.equals(rs.getString("email")) && pwd.equals(rs.getString("pwd"))) {	// 이메일과 비밀번호 일치
					result = 1;
				} else if(email.equals(rs.getString("email")) && !pwd.equals(rs.getString("pwd"))) {	// 비밀번호 불일치
					result = 0;
				} else if(!email.equals(rs.getString("email"))) {	// 이메일 불일치
					result = -1;
				}
			} else {	// 이메일 불일치
				result = -1;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(rs, pstmt, conn);
		}
		return result;
	}
	
	public int selectAccountByPhone(String pwd, String phone) {
		int result = 2;
		String sql = "select phone, pwd from project where phone=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(phone.equals(rs.getString("phone")) && pwd.equals(rs.getString("pwd"))) {	// 전화번호와 비밀번호 일치
					result = 1;
				} else if(phone.equals(rs.getString("phone")) && !pwd.equals(rs.getString("pwd"))) {	// 비밀번호 불일치
					result = 0;
				} else if(!phone.equals(rs.getString("phone"))) {	// 전화번호 불일치
					result = -1;
				}
			} else {	// 전화번호 불일치
				result = -1;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(rs, pstmt, conn);
		}
		return result;
	}
}
