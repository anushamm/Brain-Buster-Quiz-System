package Quizproject;

import java.util.Scanner;
class oneQuestion extends Exception{
	public String getMessage() {
		return "the first question is wrong try next time"+"exit";
	}
}
class twoQuestion extends Exception{
	public String getMessage() {
		return "the second question is wrong try next time"+"exit";
	}
}
class threeQuestion extends Exception{
	public String getMessage() {
		return "the third question is wrong try next time"+"exit";
	}
}
class fourQuestion extends Exception{
	public String getMessage() {
		return "the four question is wrong try next time"+"exit";
	}
}
class fiveQuestion extends Exception{
	public String getMessage() {
		return "the five question is wrong try next time"+"exit";
	}
}
class sixQuestion extends Exception{
	public String getMessage() {
		return "the six question is wrong try next time"+"exit";
	}
}
class sevenQuestion extends Exception{
	public String getMessage() {
		return "the seven question is wrong try next time"+"exit";
	}
}
class EightQuestion extends Exception{
	public String getMessage() {
		return "the Eight question is wrong try next time"+"exit";
	}
}
class NineQuestion extends Exception{
	public String getMessage() {
		return "the Nine question is wrong try next time"+"exit";
	}
}
class TenQuestion extends Exception{
	public String getMessage() {
		return "the Ten question is wrong try next time"+"exit";
	}
}
public class Mainclass {
	public static void main(String[] args) {
		personclass p1=new personclass("anusha",1233);
		oneQuestion i1=new oneQuestion();
		twoQuestion i2=new twoQuestion();
		threeQuestion i3=new threeQuestion();
		fourQuestion i4=new fourQuestion();
		fiveQuestion i5=new fiveQuestion();
		sixQuestion i6=new sixQuestion();
		sevenQuestion i7=new sevenQuestion();
		EightQuestion i8=new EightQuestion();
		NineQuestion i9=new NineQuestion();
		TenQuestion i10=new TenQuestion();
		Lifeline l=new Lifeline();
		lifelinewantsornot l1=new lifelinewantsornot();
		int lifeline=3;
		System.out.println("this question is for"+  " "+p1.name);
		System.out.println("1. What is a correct syntax to output \"Hello World\" in Java?");
		System.out.println();
		System.out.println("A]echo hello world"+"		           "+"B]System.out.println(hello world)");
		System.out.println("C]hello world "+"                    "+"D]error world");
		char res1='B';
		Scanner sc=new Scanner(System.in);
		int lifelinechoice=l1.askForLifeline();
		if(lifeline>0) {
			if(lifelinechoice==1) {
				l.fiftyfifty("A]  ,C]");
				lifeline--;
			}
			else if(lifelinechoice==2) {
				l.auodience("B]","the many aoudience have choosen 80%");
				lifeline--;
			}
			else if(lifelinechoice==3) {
				l.callAfriend("B]","your friend has choosen the option");
				lifeline--;
			}
		}
		System.out.println("enter the correct option(A,B,C,D)");
		char res=sc.next().charAt(0);
		try {
			if(res!=res1) {
				throw i1;
			}
			else {
				System.out.println("correct answer");
				System.out.println("the amount anusha win is 100000 is credited to this account number"+" "+p1.acc);
				System.out.println("this question is for"+  " "+p1.name);
				System.out.println("2. How do you insert COMMENTS in Java code?");
				System.out.println();
				System.out.println("A]// this is comment"+"		              "+"B]? this is comment");
				System.out.println("C]# this is comment"+"                    "+"D]+ this is comment");
				char res2='A';
				Scanner sc1=new Scanner(System.in);
				int lifelinechoice1=l1.askForLifeline();
				if(lifeline>0) {
					if(lifelinechoice1==1) {
						l.fiftyfifty("B]  ,C]");
						lifeline--;
					}
					else if(lifelinechoice1==2) {
						l.auodience("A]","the many aoudience have choosen 80%");
						lifeline--;
					}
					else if(lifelinechoice1==3) {
						l.callAfriend("A]","your friend has choosen the option");
						lifeline--;
					}
				}
				System.out.println("enter the correct option(A,B,C,D)");
				char res3=sc1.next().charAt(0);
				if(res2!=res3) {
					throw i2;
				}
				else {
					System.out.println("correct answer");
					System.out.println("the amount anusha win is 200000 is credited to this account number"+" "+p1.acc);
					System.out.println("this question is for"+  " "+p1.name);
					System.out.println("3. Which data type is used to create a variable that should store text?");
					System.out.println();
					System.out.println("A]String"+"		              "+"B] string");
					System.out.println("C] myString"+"                    "+"D] txt");
					char res4='A';
					Scanner sc2=new Scanner(System.in);
					int lifelinechoice11=l1.askForLifeline();
					if(lifeline>0) {
						if(lifelinechoice11==1) {
							l.fiftyfifty("A]  ,B]");
							lifeline--;
						}
						else if(lifelinechoice11==2) {
							l.auodience("A]","the many aoudience have choosen 80%");
							lifeline--;
						}
						else if(lifelinechoice11==3) {
							l.callAfriend("A]","your friend has choosen the option");
							lifeline--;
						}
					}
					System.out.println("enter the correct option(A,B,C,D)");
					char res5=sc2.next().charAt(0);
					if(res4!=res5) {
						throw i3;
					}
					else {
						System.out.println("correct answer");
						System.out.println("the amount anusha win is 300000 is credited to this account number"+" "+p1.acc);
						System.out.println("this question is for"+  " "+p1.name);
						System.out.println("4. How do you create a variable with the numeric value 5?");
						System.out.println();
						System.out.println("A]num x=5"+"		              "+"B] float num=5;");
						System.out.println("C] int x=5;"+"                    "+"D] x=5;");
						char res6='C';
						Scanner sc3=new Scanner(System.in);
						int lifelinechoice111=l1.askForLifeline();
						if(lifeline>0) {
							if(lifelinechoice111==1) {
								l.fiftyfifty("A]  ,B]");
								lifeline--;
							}
							else if(lifelinechoice111==2) {
								l.auodience("C]","the many aoudience have choosen 80%");
								lifeline--;
							}
							else if(lifelinechoice111==3) {
								l.callAfriend("A]","your friend has choosen the option");
								lifeline--;
							}
						}

						System.out.println("enter the correct option(A,B,C,D)");
						char res7=sc3.next().charAt(0);
						if(res6!=res7) {
							throw i4;
						}
						else {
							System.out.println("correct answer");
							System.out.println("the amount anusha win is 400000 is credited to this account number"+" "+p1.acc);
							System.out.println("this question is for"+  " "+p1.name);
							System.out.println("5. Which method can be used to find the length of a string?");
							System.out.println();
							System.out.println("A] length()"+"		              "+"B] len()");
							System.out.println("C] getSize()"+"                    "+"D] getLength()");
							char res8='A';
							Scanner sc4=new Scanner(System.in);
							int lifelinechoice112=l1.askForLifeline();
							if(lifeline>0) {
								if(lifelinechoice112==1) {
									l.fiftyfifty("A]  ,B]");
									lifeline--;
								}
								else if(lifelinechoice112==2) {
									l.auodience("C]","the many aoudience have choosen 80%");
									lifeline--;
								}
								else if(lifelinechoice112==3) {
									l.callAfriend("A]","your friend has choosen the option");
									lifeline--;
								}
							}
							System.out.println("enter the correct option(A,B,C,D)");
							char res9=sc4.next().charAt(0);
							if(res8!=res9) {
								throw i5;
							}
							else {
								System.out.println("correct answer");
								System.out.println("the amount anusha win is 500000 is credited to this account number"+" "+p1.acc);
								System.out.println("this question is for"+  " "+p1.name);
								System.out.println("6. Which method can be used to find the length of a string?");
								System.out.println();
								System.out.println("A] length()"+"		              "+"B] len()");
								System.out.println("C] getSize()"+"                    "+"D] getLength()");
								char res10='A';
								Scanner sc5=new Scanner(System.in);
								int lifelinechoice113=l1.askForLifeline();
								if(lifeline>0) {
									if(lifelinechoice113==1) {
										l.fiftyfifty("A]  ,B]");
										lifeline--;
									}
									else if(lifelinechoice113==2) {
										l.auodience("C]","the many aoudience have choosen 80%");
										lifeline--;
									}
									else if(lifelinechoice113==3) {
										l.callAfriend("A]","your friend has choosen the option");
										lifeline--;
									}
								}
								System.out.println("enter the correct option(A,B,C,D)");
								char res11=sc5.next().charAt(0);
								if(res10!=res11) {
									throw i6;
								}
								else {
									System.out.println("correct answer");
									System.out.println("the amount anusha win is 600000 is credited to this account number"+" "+p1.acc);
									System.out.println("this question is for"+  " "+p1.name);
									System.out.println("7. Which operator is used to add together two values?");
									System.out.println();
									System.out.println("A] The & Sign"+"		              "+"B] The ? Sign");
									System.out.println("C] The + Sign"+"                    "+"D] The * Sign");
									char res12='C';
									Scanner sc6=new Scanner(System.in);
									int lifelinechoice117=l1.askForLifeline();
									if(lifeline>0) {
										if(lifelinechoice117==1) {
											l.fiftyfifty("A]  ,B]");
											lifeline--;
										}
										else if(lifelinechoice117==2) {
											l.auodience("C]","the many aoudience have choosen 80%");
											lifeline--;
										}
										else if(lifelinechoice117==3) {
											l.callAfriend("A]","your friend has choosen the option");
											lifeline--;
										}
									}
									System.out.println("enter the correct option(A,B,C,D)");
									char res13=sc6.next().charAt(0);
									if(res12!=res13) {
										throw i7;
									}
									else {
										System.out.println("correct answer");
										System.out.println("the amount anusha win is 700000 is credited to this account number"+" "+p1.acc);
										System.out.println("this question is for"+  " "+p1.name);
										System.out.println("8. Which method can be used to return a string in upper case letters?");
										System.out.println();
										System.out.println("A] upperCase()"+"		              "+"B] tuc");
										System.out.println("C] toUpperCase()"+"                    "+"D] tolowercase()");
										char res14='C';
										Scanner sc7=new Scanner(System.in);
										int lifelinechoice115=l1.askForLifeline();
										if(lifeline>0) {
											if(lifelinechoice115==1) {
												l.fiftyfifty("A]  ,B]");
												lifeline--;
											}
											else if(lifelinechoice115==2) {
												l.auodience("C]","the many aoudience have choosen 80%");
												lifeline--;
											}
											else if(lifelinechoice115==3) {
												l.callAfriend("A]","your friend has choosen the option");
												lifeline--;
											}
										}
										System.out.println("enter the correct option(A,B,C,D)");
										char res15=sc7.next().charAt(0);
										if(res14!=res15) {
											throw i8;
										}
										else {
											System.out.println("correct answer");
											System.out.println("the amount anusha win is 800000 is credited to this account number"+" "+p1.acc);
											System.out.println("this question is for"+  " "+p1.name);
											System.out.println("9. Which operator can be used to compare two values?");
											System.out.println();
											System.out.println("A] <>"+"		              "+"B] ><");
											System.out.println("C] =="+"                    "+"D] =");
											char res16='C';
											Scanner sc8=new Scanner(System.in);
											int lifelinechoice116=l1.askForLifeline();
											if(lifeline>0) {
												if(lifelinechoice116==1) {
													l.fiftyfifty("A]  ,B]");
													lifeline--;
												}
												else if(lifelinechoice116==2) {
													l.auodience("C]","the many aoudience have choosen 80%");
													lifeline--;
												}
												else if(lifelinechoice116==3) {
													l.callAfriend("A]","your friend has choosen the option");
													lifeline--;
												}
											}
											System.out.println("enter the correct option(A,B,C,D)");
											char res17=sc8.next().charAt(0);
											if(res16!=res17) {
												throw i9;
											}
											else {
												System.out.println("correct answer");
												System.out.println("the amount anusha win is 900000 is credited to this account number"+" "+p1.acc);
												System.out.println("this question is for"+  " "+p1.name);
												System.out.println("10. To declare an array in Java, define the variable type with:");
												System.out.println();
												System.out.println("A] ()"+"		              "+"B] {}");
												System.out.println("C] []"+"                    "+"D] \\");
												char res18='C';
												Scanner sc9=new Scanner(System.in);
												int lifelinechoice114=l1.askForLifeline();
												if(lifeline>0) {
													if(lifelinechoice114==1) {
														l.fiftyfifty("A]  ,B]");
														lifeline--;
													}
													else if(lifelinechoice114==2) {
														l.auodience("C]","the many aoudience have choosen 80%");
														lifeline--;
													}
													else if(lifelinechoice114==3) {
														l.callAfriend("A]","your friend has choosen the option");
														lifeline--;
													}
												}
												System.out.println("enter the correct option(A,B,C,D)");
												char res19=sc9.next().charAt(0);
												if(res18!=res19) {
													throw i10;
												}
												else {
													System.out.println("correct answer");
													System.out.println("the amount anusha win is 1000000 is credited to this account number"+" "+p1.acc);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

											catch(oneQuestion e){
												System.out.println(i1.getMessage());

											}
											catch(twoQuestion e){
												System.out.println(i2.getMessage());
											}
											catch(threeQuestion e){
												System.out.println(i3.getMessage());
											}
											catch(fourQuestion e){
												System.out.println(i4.getMessage());

											}
											catch(fiveQuestion e){
												System.out.println(i5.getMessage());
											}
											catch(sixQuestion e){
												System.out.println(i6.getMessage());
											}
											catch(sevenQuestion e){
												System.out.println(i7.getMessage());
											}
											catch(EightQuestion e){
												System.out.println(i8.getMessage());
											}
											catch(NineQuestion e){
												System.out.println(i9.getMessage());
											}
											catch(TenQuestion e){
												System.out.println(i10.getMessage());
											}

										}
									}
