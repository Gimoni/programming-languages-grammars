package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import util.Alpha;

public class SetExample2 {
	/*
	 * set은 기존에 같은 데이터를 중복할 수 없기에 1개의 원소만 출력이 됨.
	 * list는 중복으로 저장이 가능하기 때문에 인덱스에 원소 중복저장이 됨. 
	 * 
	 */
	public static void main(String[] args) {
		
		// set
		HashSet<Alpha> set1 = new HashSet<>();
		var set2 = new HashSet<Alpha>();
		Set<Alpha> set3 = new HashSet<>();
		
		// list
		var list = new ArrayList<Alpha>();
		
		//Random 생성 list, set
		Random r = new Random(); 
		
		for(int i=0; i<5000; i++) {
			Alpha a = new Alpha();
			set1.add(a);
			list.add(a);
		}
		
		
		System.out.println(set1.size());	// 
		System.out.println(list.size());	// 100개의 랜덤 수 저장 (1~5). 
		
	}
	
	
	
	
	
	public static void main1(String[] args) {
		
		// set
		HashSet<Integer> set1 = new HashSet<>();
		var set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<>();
		
		// list
		var list = new ArrayList<Integer>();
		
		//Random 생성 list, set
		Random r = new Random(); 
		
		for(int i=0; i<100; i++) {
			int num = r.nextInt(1,5);
			
			set1.add(num);
			list.add(num);
		}
		
		
		System.out.println(set1);	// 
		System.out.println(list);	// 100개의 랜덤 수 저장 (1~5). 
		
	}
}
