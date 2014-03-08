
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
			"�̸�       : "+name+"\n"
		   +"��ȭ��ȣ : "+phoneNumber+"\n"
		   +"������� : "+birthday+"\n";
	}
	
	
	public static void main(String[] args) {
		PhoneInfo phoneInfo = new PhoneInfo("Ȳ����", "011-1234-1234");
		System.out.println(phoneInfo);
		
		
		PhoneInfo phoneInfo1 = new PhoneInfo("�輺��" , "010-9178-2129", "8��01��");
		System.out.println(phoneInfo1);
		
		
	}
	
}
