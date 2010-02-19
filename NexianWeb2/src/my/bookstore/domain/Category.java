package my.bookstore.domain;

public class Category {
	private String id;
	private String name;
	private String parentId;
	
	public Category(){
	}
	
	public Category(String id, String name, String parentId){
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[id:").append(id).append(", name:").append(name).append("]");
		return sb.toString();
	}
}
