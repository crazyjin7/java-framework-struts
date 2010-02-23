package my.struts2;

public class HelloWorldAction {
	
	private String name;
	private String greeting;

	public String execute() {
		System.out.println("name : " + name);
		
		if (name != null && false == "".equals(name)) {
			greeting = name + "님, 환영합니다.";
		}
		
		return "success";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
