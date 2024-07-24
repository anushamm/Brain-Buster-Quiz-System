package Quizproject;

class Lifeline {
	public boolean fiftyfifty;
	public boolean auodience;
	public boolean callAfriend; 

	public void fiftyfifty(String Option) {
		if(!fiftyfifty) {
			System.out.println("50-50 life line : removes two incorrect options"+Option);
			fiftyfifty=true;
		}
		else {
			System.out.println("You have already used the lifeline");
		}
	}
	public void auodience(String option,String message) {
		if(!auodience) {
			System.out.println(option+message);
		}
		else {
			System.out.println("You have already used the lifeline");
		}
	}
	public void callAfriend(String option,String message) {
		if(!callAfriend) {
			System.out.println(option+message);
		}
		else {
			System.out.println("You have already used the lifeline");
		}
	}
}