
public class PhoneInfo {
	private String name;
	
	private String phoneNumber;
	
	private String birthday;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public PhoneInfo(String name , String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	public PhoneInfo(String name , String phoneNumber , String birthday ){
		this(name, phoneNumber);
		this.birthday = birthday;
	}
	
	
	public String toString(){
		return 
			"이름       : "+name+"\n"
		   +"전화번호 : "+phoneNumber+"\n"
		   +"생년월일 : "+birthday+"\n";
	}
	
	
	public static void main(String[] args) {
		PhoneInfo phoneInfo = new PhoneInfo("황성용", "011-1234-1234");
		System.out.println(phoneInfo);
		
		
		PhoneInfo phoneInfo1 = new PhoneInfo("김성훈" , "010-9178-2129", "8월01일");
		System.out.println(phoneInfo1);
		
		
	}
	
}
