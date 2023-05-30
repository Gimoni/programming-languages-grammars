package com.example.imple.city.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.imple.city.model.City;
import com.example.imple.dept.model.Dept;
import com.github.pagehelper.Page;

@Mapper
public interface CityMapper {
	
	@Select("select count(*) from city")
	int countAll();
	
	@Results({
		@Result(property = "countryCode", column= "country_code")
	})
	@Select("select * from city")
	List<City> selectAll();
	
	@Results({
		@Result(property="countryCode", column= "country_code")
	})
	@Select("select * from city")
	Page<City> selectPage();
	
	@Results({
		@Result(property = "countryCode", column = "country_code")
	})
	@Select("""
			select * 
			  from city
			 where id = #{id}
			""")
	City selectById(@Param("id") int id);
	
	
	@Results({
		@Result(property = "countryCode", column = "country_code")
	})	
	@Select("""
			select *
			  from city
			 where country_code =#{countryCode}
			""")

	List<City> selectByCountryCode(@Param("countryCode") String CountryCode);
	
	
	
//	@Insert("""
//			insert into dept
//			values
//			(#{deptno}, #{dname, jdbcType=VARCHAR}, #{loc, jdbcType=VARCHAR})
//			""")
//	int insert(@Param("deptno") int deptno, 
//			   @Param("dname")  String dname, 
//			   @Param("loc")	String loc);
//
//	@Insert("""
//			insert into dept 
//			values(
//				#{d.deptno},
//				#{d.dname,  jdbcType=VARCHAR},
//				#{d.loc,  	jdbcType=VARCHAR}
//			)
//			""")
//	int insertDept(@Param("d") Dept dept);
//	
//	
//	@Update ("""
//			update dept
//			   set dname  = #{dname, jdbcType=VARCHAR},
//			   		 loc  = #{loc,	jdbcType=VARCHAR}
//			 where deptno = #{deptno}
//			""")
//	
//	int update(@Param("deptno")   int deptno,
//			  @Param("dname") String dname, 
//			  @Param("loc")   String loc);
//	
//	@Update("""
//			update dept
//			   set dname  = #{d.dname, jdbcType=VARCHAR},
//			   		 loc  = #{d.loc,	jdbcType=VARCHAR}
//			 where deptno = #{d.deptno}			
//			
//			""")
//	int updateDept(@Param("d") Dept dept);
//	
//	
//	@Delete ("delete from dept where deptno=#{deptno}")
//	int delete(int deptno);
	
}