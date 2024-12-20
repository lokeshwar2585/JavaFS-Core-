package com.lokesh.java;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class Q1 extends Q2{
	Scanner s=new Scanner(System.in);
	boolean q1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : 3");
		System.out.println("d : 2");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		System.out.println(c);
		if(c.equals("d")) {
			b=true;
		}
		else if(!(c.equals("a")) && !(c.equals("b")) && !(c.equals("c")) && !(c.equals("ff")) && !(c.equals("ap"))) {
			System.out.println("\n  Enter valid input!!\n");
			q1();
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf1();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q1();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa1();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q1();
			}
		}
		else if(!(c.equals("a")) && !(c.equals("b")) && !(c.equals("c"))) {
			b=false;
		}
		return b;
	}
	boolean q2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4");
		System.out.println("b : 6");
		System.out.println("c : 5");
		System.out.println("d : 8");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("a")&&c.equals("c")&&c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf2();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q2();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa2();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q2();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q2();
		}
		return b;
	}
	boolean q3(){
		System.out.println("3) What is 50/25 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : 2");
		System.out.println("d : 3");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("c")) {
			b=true;
		}
		else if(c.equals("a")||c.equals("b")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf3();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q3();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa3();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q3();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q3();
		}
		return b;
	}
	static q4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("a : 1");
		System.out.println("b : 1/2");
		System.out.println("c : 1/4");
		System.out.println("d : 2");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("a")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf4();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q4();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa4();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q4();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q4();
		}
		return b;
	}
	boolean q5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : -1");
		System.out.println("d : 2");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("b")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf5();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q5();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa5();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q5();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q5();
		}
		return b;
	}
	boolean q6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : 3");
		System.out.println("d : 2");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("b")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf6();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q6();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa6();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q6();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q6();
		}
		return b;
	}
	boolean q7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2");
		System.out.println("b : 4");
		System.out.println("c : 6");
		System.out.println("d : 8");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("a")||c.equals("b")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf7();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q7();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa7();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q7();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q7();
		}
		return b;
	}
	boolean q8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : 2");
		System.out.println("d : 3");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("b")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf8();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q8();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa8();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q8();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q8();
		}
		return b;
	}
	boolean q9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1");
		System.out.println("b : 2");
		System.out.println("c : 3");
		System.out.println("d : 4");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("b")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf9();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q9();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa9();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q9();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q9();
		}
		return b;
	}
	boolean q10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("c : -1");
		System.out.println("d : 2");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("a")||c.equals("c")||c.equals("d")) {
			b=false;
		}
		else if(c.equals("ff")) {
			if(f==0) {
				boolean f1=qf10();
				b=f1;
				f=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q10();
			}
		}
		else if(c.equals("ap")) {
			if(aud==0) {
				boolean f1=qa10();
				b=f1;
				aud=1;
			}
			else {
				System.out.println("Lifeline not available!");
				q10();
			}
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			q10();
		}
		return b;
	}
}

class Q2 extends Q3{
		Scanner s=new Scanner(System.in);
		boolean qf1(){
			System.out.println("1) What is 1+1 ?");
			System.out.println("c : 3");
			System.out.println("d : 2");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("d")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa1();
				aud=1;
			}
			else {
				System.out.println("Enter a valid input!!");
				qf1();
			}
			return b;
		}
		boolean qf2(){
			System.out.println("2) what is 2*3 ?");
			System.out.println("a : 4");
			System.out.println("b : 6");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("b")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa2();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf2();
			}
			return b;
		}
		boolean qf3(){
			System.out.println("3) What is 50/25 ?");
			System.out.println("c : 2");
			System.out.println("d : 3");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("c")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa3();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf3();
			}
			return b;
		}
		boolean qf4(){
			System.out.println("4) What is sin(30) ?");
			System.out.println("b : 1/2");
			System.out.println("c : 1/4");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("b")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa4();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf4();
			}
			return b;
		}
		boolean qf5(){
			System.out.println("5) What is cos(90) ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("a")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa5();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf5();
			}
			return b;
		}
		boolean qf6(){
			System.out.println("6) What is 1-1 ?");
			System.out.println("a : 0");
			System.out.println("d : 2");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("a")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa6();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf6();
			}
			return b;
		}
		boolean qf7(){
			System.out.println("7) what is 2**3 ?");
			System.out.println("a : 2");
			System.out.println("d : 8");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("d")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa7();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf7();
			}
			return b;
		}
		boolean qf8(){
			System.out.println("8) What is 5-5 ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("a")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa8();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf8();
			}
			return b;
		}
		boolean qf9(){
			System.out.println("9) What is sin(90) ?");
			System.out.println("a : 1");
			System.out.println("b : 2");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("a")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa9();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf9();
			}
			return b;
		}
		boolean qf10(){
			System.out.println("10) What is 3-2 ?");
			System.out.println("b : 1");
			System.out.println("d : 2");
			System.out.println("Enter your option:");
			boolean b=false;
			String c=s.next();
			if(c.equals("b")) {
				b=true;
			}
			else if(c.equals("ap")) {
				b=qfa10();
				aud=1;
			}
			else {
				System.out.println("\n   Enter a valid input!! \n");
				qf10();
			}
			return b;
		}
}

class Q3 extends Q4{
	Scanner s=new Scanner(System.in);
	boolean qa1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("a : 0 -- 25%");
		System.out.println("b : 1 -- 20%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 2 -- 40%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf1();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa1();
		}
		return b;
	}
	boolean qa2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4 -- 30%");
		System.out.println("b : 6 -- 45%");
		System.out.println("c : 5 -- 15%");
		System.out.println("d : 8 -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf2();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa2();
		}
		return b;
	}
	boolean qa3(){
		System.out.println("3) What is 50/25 ?");
		System.out.println("a : 0 -- 20%");
		System.out.println("b : 1 -- 30%");
		System.out.println("c : 2 -- 40%");
		System.out.println("d : 3 -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("c")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf3();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa3();
		}
		return b;
	}
	boolean qa4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("a : 1   -- 30%");
		System.out.println("b : 1/2 -- 50%");
		System.out.println("c : 1/4 -- 10%");
		System.out.println("d : 2   -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf4();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa4();
		}
		return b;
	}
	boolean qa5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0  -- 40%");
		System.out.println("b : 1  -- 20%");
		System.out.println("c : -1 -- 25%");
		System.out.println("d : 2  -- 15%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf5();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa5();
		}
		return b;
	}
	boolean qa6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0 -- 50%");
		System.out.println("b : 1 -- 20%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 2 -- 15%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf6();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa6();
		}
		return b;
	}
	boolean qa7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2 -- 22%");
		System.out.println("b : 4 -- 20%");
		System.out.println("c : 6 -- 48%");
		System.out.println("d : 8 -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf7();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa7();
		}
		return b;
	}
	boolean qa8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0 -- 60%");
		System.out.println("b : 1 -- 25%");
		System.out.println("c : 2 -- 10%");
		System.out.println("d : 3 -- 5%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf8();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa8();
		}
		return b;
	}
	boolean qa9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1 -- 35%");
		System.out.println("b : 2 -- 30%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 4 -- 20%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf9();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa9();
		}
		return b;
	}
	boolean qa10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("a : 0  -- 20%");
		System.out.println("b : 1  -- 40%");
		System.out.println("c : -1 -- 30%");
		System.out.println("d : 2  -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ff")) {
			b=qaf10();
			f=1;
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qa10();
		}
		return b;
	}
}

class Q4 extends Q5{
	Scanner s=new Scanner(System.in);
	boolean qfa1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("c : 3 -- 35%");
		System.out.println("d : 2 -- 65%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa1();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa1();
		}
		return b;
	}
	boolean qfa2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4 -- 30%");
		System.out.println("b : 6 -- 70%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa2();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa2();
		}
		return b;
	}
	boolean qfa3(){
		System.out.println("3) What is 50/25 ?");
		System.out.println("c : 2 -- 74%");
		System.out.println("d : 3 -- 26%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("c")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa3();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa3();
		}
		return b;
	}
	boolean qfa4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("b : 1/2 -- 55%");
		System.out.println("c : 1/4 -- 45%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa4();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa4();
		}
		return b;
	}
	boolean qfa5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0 -- 60%");
		System.out.println("b : 1 -- 40%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa5();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa5();
		}
		return b;
	}
	boolean qfa6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0 -- 80%");
		System.out.println("d : 2 -- 20%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa6();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa6();
		}
		return b;
	}
	boolean qfa7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2 -- 40%");
		System.out.println("d : 8 -- 60%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa7();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa7();
		}
		return b;
	}
	boolean qfa8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0 -- 87%");
		System.out.println("b : 1 -- 13%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa8();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa8();
		}
		return b;
	}
	boolean qfa9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1 -- 65%");
		System.out.println("b : 2 -- 35%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa9();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa9();
		}
		return b;
	}
	boolean qfa10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("b : 1 -- 80%");
		System.out.println("d : 2 -- 20%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qfa10();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qfa10();
		}
		return b;
	}
}

class Q5{
	
	int aud=0;
	int f=0;
	
	Scanner s=new Scanner(System.in);
	boolean qaf1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("a : 0 -- 25%");
		System.out.println("d : 2 -- 40%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf1();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf1();
		}
		return b;
	}
	boolean qaf2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4 -- 30%");
		System.out.println("b : 6 -- 45%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf2();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf2();
		}
		return b;
	}
	boolean qaf3(){
		System.out.println("3) What is 50/25 ?");
		System.out.println("c : 2 -- 40%");
		System.out.println("d : 3 -- 10%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("c")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf3();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf3();
		}
		return b;
	}
	boolean qaf4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("a : 1   -- 30%");
		System.out.println("b : 1/2 -- 50%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf4();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf4();
		}
		return b;
	}
	boolean qaf5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0  -- 40%");
		System.out.println("d : 2  -- 15%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf5();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf5();
		}
		return b;
	}
	boolean qaf6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0 -- 50%");
		System.out.println("b : 1 -- 20%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf6();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf6();
		}
		return b;
	}
	boolean qaf7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2 -- 22%");
		System.out.println("d : 8 -- 48%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("d")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf7();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf7();
		}
		return b;
	}
	boolean qaf8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0 -- 60%");
		System.out.println("d : 3 -- 5%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf8();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf8();
		}
		return b;
	}
	boolean qaf9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1 -- 35%");
		System.out.println("b : 2 -- 30%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("a")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf9();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf9();
		}
		return b;
	}
	boolean qaf10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("b : 1  -- 40%");
		System.out.println("c : -1 -- 30%");
		System.out.println("Enter your option:");
		boolean b=false;
		String c=s.next();
		if(c.equals("b")) {
			b=true;
		}
		else if(c.equals("ap") || c.equals("ff")) {
			System.out.println("Lifeline not available!!");
			qaf10();
		}
		else {
			System.out.println("\n   Enter a valid input!! \n");
			qaf10();
		}
		return b;
	}
}

public class Quiz {
	
	public static void main(String args[]) {
		int p=0;
		Q1 q=new Q1();
		boolean a=q.q1();
		System.out.println(a);
		if(a==true)
		{
			p++;
			a=q.q2();
			if(a==true) {
				p++;
				a=q.q3();
				if(a==true) {
					p++;
					a=q.q4();
					if(a==true) {
						p++;
						a=q.q5();
						if(a==true) {
							p++;
							a=q.q6();
							if(a==true) {
								p++;
								a=q.q7();
								if(a==true) {
									p++;
									a=q.q8();
									if(a==true) {
										p++;
										a=q.q9();
										if(a==true) {
											p++;
											a=q.q10();
											if(a==true) {
												p++;
												System.out.println("Congragulations! You won");
												System.out.println(p);
											}
											else {
												System.out.println("you lose!");
												System.out.println("points: "+p);
											}
										}
										else {
											System.out.println("you lose!");
											System.out.println("points: "+p);
										}
									}
									else {
										System.out.println("you lose!");
										System.out.println("points: "+p);
									}
									
								}
								else {
									System.out.println("you lose!");
									System.out.println("points: "+p);
								}
							}
							else {
								System.out.println("you lose!");
								System.out.println("points: "+p);
							}
						}
						else {
							System.out.println("you lose!");
							System.out.println("points: "+p);
						}
					}
					else {
						System.out.println("you lose!");
						System.out.println("points: "+p);
					}
				}
				else {
					System.out.println("you lose!");
					System.out.println("points: "+p);
				}
			}
			else {
				System.out.println("you lose");
				System.out.println("points: "+p);
			}
		}
	}
}
