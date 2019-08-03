package com.spring.junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test(){
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);		
		assertEquals(30, res, 0); // 단정함수 : assertEquals(p1, p2,p3)  
								  // p1: 기대값(예상값), p2: 결과값변수(실제값), p3: 오차범위(허용오차)  -> 오차범위는 시간으로도 줄 수 있음				
		
//		if(res != 30){
//			System.err.println("err :"+ res);
//		}
		
		res = c.sum(1.1, 2);
		assertEquals(3.1, res, 0);
		
//		if(res !=3.1){
//			System.err.println("err :"+res);
//		}
		
		res = c.sum(1.1, -2);
		assertEquals(-0.9, res, 0.1);
//		if(res !=-0.9){
//			System.err.println("err :"+res);
//		}		
		// if문으로 체크하니 이전과는 달리 JunitTest로 잘 안잡힘 - 오차범위 안이라는 얘기.. ㄷㄷ
		
	}
	
	
// 일반적으로 수행하려면 main() 이 있어야 하는데 Junit은 main 없이도 수행할 수 있도록 해줌 : @Test	
//	public static void main(String[] args){
//		CalculatorTest cTest = new CalculatorTest();		
//		cTest.jUnitTest();
//	}

//	@Test
//	public static void jUnitTest(){
//		
//	}
	 
/*	
 *    @Test 어노테이션이 선언된 메소드는 - static이 들어가면 안된다.
			                   - 파라미터가 있어서는 안된다.
*/	
	
	

}
