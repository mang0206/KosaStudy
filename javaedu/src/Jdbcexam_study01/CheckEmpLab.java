package Jdbcexam_study01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CheckEmpLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);){
			Scanner sc;
			String name;
			Statement stmt;
			ResultSet rs;
			String query;
			sc = new Scanner(System.in);
			while(true) {
				System.out.print("검색할 이름 입력 : ");
				name = sc.next();
				stmt = conn.createStatement();
				query = String.format("select hiredate, deptno from emp where ename = '%s'", name);
				rs = stmt.executeQuery(query);
				
				if (rs.next()) {
					System.out.printf("%s 직원은 근무중입니다.\n", name);
					System.out.printf("%1$tY년 %1$tm월에 입사했고 현재 %2$d 번부서에서 근무하고 있습니다.\n", 
							rs.getDate("hiredate"), rs.getInt("deptno")); 
				} else {
					System.out.printf("%s 직원은 근무하지 않습니다.\n", name);
				}
				
				System.out.print("계속 검색하려면 1 종료하려면 -1를 입력 : ");
				if(sc.nextInt() == -1) {
					sc.close();
					rs.close();
					stmt.close();
					break;
				}
			}
			
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

	}

}
