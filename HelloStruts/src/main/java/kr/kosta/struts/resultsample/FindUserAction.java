package kr.kosta.struts.resultsample;

import java.util.HashMap;

import com.opensymphony.xwork2.Action;

/**
 * ½Ç½À¿¹Á¦3
 *
 * @author ±èÈñ¼÷
 *
 */
public class FindUserAction {

	private String name;
	private String id;
	protected static final HashMap<String, String> userMap = new HashMap<String, String>();
	static {
		userMap.put("hskim", "±èÈñ¼÷");
		userMap.put("jina", "¼ÕÁø¾Æ");
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
