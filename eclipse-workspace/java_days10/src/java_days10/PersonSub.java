package java_days10;
// this 연습
public class PersonSub {

	String name;
	String job;
	int age;
	String gender;
	String blood;
	
	Person1(){
		this("이름없음", 0, "", "", "직업없음");
	}
	
	Person1(String name, int age){
		this(name, age, "", "", "직업없음");
	}
	
	Person1(String name, int age, String gd, String bl, String j){
		this.name = name;
		this.age = age;
		this.gender = gd;
		this.blood = bl;
		this.job = j;
	}
	
	public void play() {
		String play = "";
		if(this.job.equals("의사")) {
	}
	
}
