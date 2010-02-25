package kr.kosta.struts.resultsample;

import java.util.HashMap;

import com.opensymphony.xwork2.Action;

/**
 * �ǽ�����3
 *
 * @author �����
 *
 */
public class FindUserAction {

	private String name;
	private String id;
	protected static final HashMap<String, String> userMap = new HashMap<String, String>();
	static {
		userMap.put("hskim", "�����");
		userMap.put("jina", "������");
	}

	public String execute() {

		System.out.println("ID :" + id);

		if (id.equals(""))
			return "init";
		else if (!userMap.containsKey(id))
			return "noMember";
		else
			name = userMap.get(id);

		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
