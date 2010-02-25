package kr.kosta.struts.sample;

import com.opensymphony.xwork2.Action;

/**
 * 실습예제1
 *
 * @author 김희숙
 *
 */
public class HelloWorldAction {

	private String name;

	private String world;

	public String execute() {

		System.out.println("HelloWorld 방문자명 :  " + name);

		world = "helloWorld";

		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** Struts2   액션클래스의 필드명은  world 이나  실제 setter/getter로   매핑된다. */
	public String getHelloWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

}
