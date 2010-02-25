package kr.kosta.struts.actionsample;

import com.opensymphony.xwork2.Action;

/**
 * 실습예제2
 *
 * 액션 execute() 이외의 메소드 및 와일드 카드 사용하여 메소드매핑
 */
public class HelloAction {

	private String name;

	private String world;

	public String helloStruts() {

		System.out.println("helloStruts : 방문자명 " + name);

		world = "helloStruts";

		return Action.SUCCESS;
	}

	public String helloSpring() {

		System.out.println("helloSpring : 방문자명 " + name);

		world = "helloSpring";

		return Action.SUCCESS;
	}

	public String helloTest() {

		System.out.println("helloTest : 방문자명 " + name);

		world = "helloTest";

		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

}
