
package com.example.model;

import java.time.LocalDate;

import com.example.util.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	int 		empno;
	String 		ename;
	Gender 		gender;
	String 		job;
	Integer		mgr;
	LocalDate 	hiredate;
	Double 		sal;
	Double 		comm;
	Integer		deptno;
}


// Null 도 저장할 수 있는 Integer Mapper type 사용 ---> mgr 
// LocalDate 날짜만 저장하는 타입 