package org.emftext.refactoring.languages.java.smell.android.test;

import java.util.LinkedList;
import java.util.List;

public class SlowForLoopTest {

	private class Foo {

		public int mSplat;
	};

	Foo[] mArray = new Foo[20];
	private LinkedList<String> classVariable;

	public static void main(String[] args) {
		SlowForLoopTest oSlowForLoop = new SlowForLoopTest();
		oSlowForLoop.zero();
		oSlowForLoop.one();
		oSlowForLoop.two();
	}

	public void zero() {
		int sum = 0;
		for (int i = 0; i < mArray.length; ++i) {
			sum += mArray[i].mSplat;
		}
	}

	public void one() {
		int sum = 0;
		Foo[] localArray = mArray;
		int len = localArray.length;

		for (int i = 0; i < len; ++i) {
			sum += localArray[i].mSplat;
		}
	}

	public void two() {
		int sum = 0;
		for (Foo a : mArray) {
			sum += a.mSplat;
		}
	}
	
	public void three() {
		List<Foo> test = new LinkedList<Foo>();
		int x;
		
		for(int i=0;i<=test.size()-1;i++){
			test.get(i);
		}
		
		for (x=0;x<test.size();x++){
			test.get(x);
		}
		
		//suffix updates
		for(int i=0;i<test.size();i++){
			System.out.println(test.get(i));
		}
		
		//prefix updates
		for(int i=0;i<test.size();++i){
			System.out.println(test.get(i));
		}
		
		//assignmentinit
		for(x=0;x<test.size();++x){
			System.out.println(test.get(x));
		}
		
	}
	
	public void four(){
		for(int y = 0; y<classVariable.size();y++)
			System.out.println(classVariable.get(y));
	}
	
	public void target(){
		List<Foo> test = new LinkedList<Foo>();
		
		for (Foo element : test){
			System.out.println(element);
		}
	}
}