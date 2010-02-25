package kr.kosta.struts.actionsample;

import com.opensymphony.xwork2.Action;

/**
 * �ǽ�����2
 *
 * �׼� execute() �̿��� �޼ҵ� �� ���ϵ� ī�� ����Ͽ� �޼ҵ����
 */
public class HelloAction {

	private String name;

	private String world;

	public String helloStruts() {

		System.out.println("helloStruts : �湮�ڸ� " + name);

		world = "helloStruts";

		return Action.SUCCESS;
	}

	public String helloSpring() {

		System.out.println("helloSpring : �湮�ڸ� " + name);

		world = "helloSpring";

		return Action.SUCCESS;
	}

	public String helloTest() {

		System.out.println("helloTest : �湮�ڸ� " + name);

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
