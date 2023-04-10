package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Set;

import oracle.net.aso.b;
import util.Color;
import util.VT100;

public class AlphaSelectExample6 {

	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "scott";
	static String password = "tiger";

	static Connection conn;
	
	static void print1() throws SQLException {

		var stmt = conn.createStatement();

		var rs = stmt.executeQuery(
				"""
				    with  tmp as ( 
				    select max(no) as no
				      from alpha
				     group by line, col
				     order by line, col
				     )
				select * 
				  from alpha
				 where no in (select no from tmp)
				 order by no asc
				""");
		

		while (rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			Color fg = Color.valueOf(rs.getString("fg"));
			Color bg = Color.valueOf(rs.getString("bg"));
			char ch = rs.getString("ch").charAt(0);

			
			VT100.cursorMove(line, column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}

		rs.close();
		stmt.close();

	}

	static void print2() throws SQLException, InterruptedException {

		var stmt = conn.createStatement();

		var rs = stmt.executeQuery(
				"""	
				    with  tmp as ( 
				    select max(no) as no
				      from alpha
				     group by line, col
				     order by line, col
				     )
				select * 
				  from alpha
				 where no in (select no from tmp)
				 order by line asc, col asc, fg asc, bg asc
				""");

		while (rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			Color fg = Color.valueOf(rs.getString("fg"));
			Color bg = Color.valueOf(rs.getString("bg"));
			char ch = rs.getString("ch").charAt(0);

			VT100.cursorMove(line, column + 42);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
			
			Thread.sleep(1);
		}

		rs.close();
		stmt.close();

	}
	
	static void print3() throws SQLException, InterruptedException {
		
		var stmt = conn.createStatement();
		
		var rs = stmt.executeQuery(
				"""
				    with  tmp as ( 
				    select max(no) as no
				      from alpha
				     group by line, col
				     order by line, col
				     )
				select * 
				  from alpha
				 where no in (select no from tmp)
				 order by line asc, col desc, fg asc, bg asc
				""");
		
		while (rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			Color fg = Color.valueOf(rs.getString("fg"));
			Color bg = Color.valueOf(rs.getString("bg"));
			char ch = rs.getString("ch").charAt(0);
			
			VT100.cursorMove(line + 21, column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
			
			Thread.sleep(1);
		}
		
		rs.close();
		stmt.close();
		
	}
	
	static void print4() throws SQLException, InterruptedException {
		
		var stmt = conn.createStatement();
		
		var rs = stmt.executeQuery(
				"""
			    with  tmp as ( 
			    select max(no) as no
			      from alpha
			     group by line, col
			     order by line, col
			     )
				select * 
				  from alpha
				 where no in (select no from tmp)
				 order by line asc,
				 		   decode(bg,'Black',  30,
				                     'Red',    31,
				                     'Green',  32,
				                     'Yellow', 33,
				                     'Blue',   34,
				                     'Magenta',35,
				                     'Cyan',   36,
				                     'White',  37,99) asc
				""");
		
		while (rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			Color fg = Color.valueOf(rs.getString("fg"));
			Color bg = Color.valueOf(rs.getString("bg"));
			char ch = rs.getString("ch").charAt(0);
			
			VT100.cursorMove(line + 21, column + 42);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
			
			Thread.sleep(1);
		}
		
		rs.close();
		stmt.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws SQLException, InterruptedException {
		VT100.reset();
		VT100.clearScreen();
		conn = DriverManager.getConnection(url, user, password);

		
		print1();
		print2();
		print3();
		print4();

		conn.close();

		VT100.reset();
		VT100.cursorMove(42, 1);
		System.out.println("Program End...");
	}

}