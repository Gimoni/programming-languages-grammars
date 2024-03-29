
package com.example.imple.emp.model;

import java.time.LocalDate;

import com.example.imple.dept.model.Dept;
import com.example.standard.util.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class Emp {
	@NonNull Integer		empno;
	@NonNull String 		ename;
		     Gender 		gender;
			 String 		job;
			 Integer		mgr;
		   	 LocalDate 	hiredate;
			 Double 		sal;
			 Double 		comm;
			 Integer		deptno;
			 Dept			dept;
			 
}


// Null 도 저장할 수 있는 Integer Mapper type 사용 ---> mgr 
// LocalDate 날짜만 저장하는 타입 