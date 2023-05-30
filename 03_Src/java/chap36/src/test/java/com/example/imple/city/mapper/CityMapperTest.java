
package com.example.imple.city.mapper;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.example.imple.city.mapper.CityMapper;
import com.example.imple.dept.model.Dept;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@SpringBootTest
public class CityMapperTest {
	
	@Autowired
	CityMapper cityMapper;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	void selectAll() throws IOException {
		var list = cityMapper.selectAll();
		System.out.println(list);
		assertThat(list.size()).isEqualTo(4079);
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(list);
	}
	
	@Test
	void selectPage() throws IOException {
		//50번째 페이지(startpage) 페이지당 데이터 개수5개 (size)
		PageHelper.startPage(50, 5);
		var list = cityMapper.selectPage();
		System.out.println(list.size());
		assertThat(list.size()).isEqualTo(5);
		
		// 화면에 보여지는 페이지 리스트 개수. 
		var paging = PageInfo.of(list, 15);
		System.out.println(paging);
		paging.getTotal();
		paging.getList();
		paging.getPageNum();
		paging.getSize();
		paging.getStartRow();
		paging.getEndRow();
		paging.getPages();
		paging.getPrePage();
		paging.getNextPage();
		paging.isIsFirstPage();
		paging.isIsLastPage();
		paging.isHasPreviousPage();
		paging.isHasNextPage();

		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(paging);
	}
	
	@Test 
	void selectById() throws IOException {
		var city = cityMapper.selectById(10);
		System.out.println(city);
		assertEquals(10, city.getId());
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(city);
	}
	
	@Test
	void selectByCountryCode() throws IOException {
		var city = cityMapper.selectByCountryCode("KOR");
		System.out.println(city);
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(city);
	}
	
//	@Test
//	void selectByDeptno() {
//		var dept = deptMapper.selectByDeptno(10);
//		System.out.println(dept);
//		assertSame(10, dept.getDeptno());
//		
//		dept = deptMapper.selectByDeptno(90);
//		System.out.println(dept);
//		assertNull(dept);
//	}
//	
//	@Test
//	@Transactional
////	@Rollback(false)
//	void insert() {
//		deptMapper.insert(50, "개발부", "부산");
//		System.out.println(deptMapper.selectByDeptno(50));
//		
//		deptMapper.insert(60, "개발2부", null);
//		System.out.println(deptMapper.selectByDeptno(60));
//		
//		try {
//			deptMapper.insert(50, "개발3부", "서울");
//		} catch (DuplicateKeyException e) {
//			System.out.println("50번 부서는 사용할 수 없습니다.");
//		}
//		
//		try {
//			deptMapper.insert(70, null, null);
//		} catch (DataIntegrityViolationException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		assertThrows(DataIntegrityViolationException.class, () -> {
//			deptMapper.insert(100, "총무부", null);
//		});
//		
//	}
//	
//	
////	@Test
////	@Transactional
////	void insertDapt() throws IOException {
////		var dept = new Dept(50, "개발1부", "경기");
////		deptMapper.insertDept(dept);
////		
////		objectMapper.createGenerator(System.out)
////		.useDefaultPrettyPrinter()
////		.writeObject(deptMapper.selectByDeptno(50));
////
////	}	
//	
//
////	@Test
////	@Transactional
////	void insertDapt() throws IOException {
////		var dept = new Dept(50, "개발1부", "경기");
////		deptMapper.insertDept(dept);
////		
////		dept = new Dept(60, "개발2부", null);
////		deptMapper.insertDept(dept);
////		
////		objectMapper.createGenerator(System.out)
////					.useDefaultPrettyPrinter()
////					.writeObject(deptMapper.selectAll());
////		
////	}	
//	
//	
//	@Test
//	@Transactional
//	void insertDapt() throws IOException {
//		var dept = new Dept(50, "개발1부", "경기");
//		int cnt = deptMapper.insertDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		dept = new Dept(60, "개발2부", null);
//		cnt = deptMapper.insertDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		assertThrows(DuplicateKeyException.class, () -> {
//			deptMapper.insertDept(new Dept(60, "개발3부", null));
//		}); // DuplicateKeyException error를 확신하는 테스트 60번은 이미 존재함. 
//		
//		assertThrows(DataIntegrityViolationException.class, ()-> {
//			deptMapper.insertDept(new Dept(60, null, null));
//		}); // DataIntegrityViolationException error를 확신하는 테스트 dename에는 null이 올 수 없다
//		
//		assertThrows(DataIntegrityViolationException.class, ()->{
//			deptMapper.insertDept(new Dept(100, "개발4부", null));
//		});	// DataIntegrityViolationException을 error를 확신하는 테스트 dename에는 null이 올 수 없다
//		
//		objectMapper.createGenerator(System.out)
//		.useDefaultPrettyPrinter()
//		.writeObject(deptMapper.selectAll());
//	}	
//	
//	@Test
//	@Transactional
//	void update() throws IOException {
//		int cnt = deptMapper.update(10, "xxx", "yyy");
//		assertThat(cnt).isEqualTo(1);
//		
//		cnt = deptMapper.update(50, "xxx", "yyy");
//		assertThat(cnt).isEqualTo(0);
//		
//		assertThrows(DataIntegrityViolationException.class, () ->{
//			try {
//				deptMapper.update(20, null, "서울");
//			} catch (UncategorizedSQLException e) {
//				throw new DataIntegrityViolationException(e.getMessage());
//			}
//		});
//		
//		
//		cnt = deptMapper.update(100, "개발4부", "부산");
//		assertThat(cnt).isEqualTo(0);
//		
//		cnt = deptMapper.update(30, "개발4부", null);
//		assertThat(cnt).isEqualTo(1);
//		
//		objectMapper.createGenerator(System.out)
//					.useDefaultPrettyPrinter()
//					.writeObject(deptMapper.selectAll());
//	}
//	
//	@Test
//	@Transactional
//	void updateDept() throws IOException {
//		var dept = new Dept(50, "개발1부", "경기");
//		int cnt = deptMapper.updateDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		dept = new Dept(60, "개발2부", null);
//		cnt = deptMapper.updateDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		assertThrows(DuplicateKeyException.class, () -> {
//			deptMapper.updateDept(new Dept(60, "개발3부", null));
//		}); // DuplicateKeyException error를 확신하는 테스트 60번은 이미 존재함. 
//		
//		assertThrows(DataIntegrityViolationException.class, ()-> {
//			deptMapper.updateDept(new Dept(60, null, null));
//		}); // DataIntegrityViolationException error를 확신하는 테스트 dename에는 null이 올 수 없다
//		
//		assertThrows(DataIntegrityViolationException.class, ()->{
//			deptMapper.updateDept(new Dept(100, "개발4부", null));
//		});	// DataIntegrityViolationException을 error를 확신하는 테스트 dename에는 null이 올 수 없다
//		
//		objectMapper.createGenerator(System.out)
//		.useDefaultPrettyPrinter()
//		.writeObject(deptMapper.selectAll());
//	}
//	
//	@Test
//	@Transactional
//	void delete() throws IOException {
//		int cnt = deptMapper.delete(90);
//		assertThat(cnt).isEqualTo(0);
//		
//		cnt = deptMapper.delete(40);
//		assertThat(cnt).isEqualTo(1);
//		
//		assertThrows(DataIntegrityViolationException.class, ()-> {
//			deptMapper.delete(10);
//		});
//		
//		objectMapper.createGenerator(System.out)
//		.useDefaultPrettyPrinter()
//		.writeObject(deptMapper.selectAll());		
//		
//	}

}