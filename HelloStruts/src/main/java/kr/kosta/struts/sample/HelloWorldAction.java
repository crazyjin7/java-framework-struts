package kr.kosta.struts.sample;

import com.opensymphony.xwork2.Action;

/**
 * �ǽ�����1
 *
 * @author �����
 *
 */
public class HelloWorldAction {

	private String name;

	private String world;

	public String execute() {

		System.out.println("HelloWorld �湮�ڸ� :  " + name);

		world = "helloWorld";

		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** Struts2   �׼�Ŭ������ �ʵ����  world �̳�  ���� setter/getter��   ���εȴ�. */
	public String getHelloWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

}
