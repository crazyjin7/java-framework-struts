package my.ajax.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import my.ajax.domain.Member;

public class MemberDao {
	
	private static MemberDao instance;
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	

	
	private Map<String, Member> db;
	
	private MemberDao(){
		db = new HashMap<String, Member>();
		initialize();
	}


	public void regist(Member member) {
		db.put(member.getId(), member);
	}

	public void delete(String id) {
		db.remove(id);
	}

	public void update(Member member) {
		Member found = db.get(member.getId());
		found.setName(member.getName());
		found.setNick(member.getNick());
		found.setEmail(member.getEmail());
	}

	public List<Member> findall() {
		List<Member> list = new ArrayList<Member>();
		for(Member member : db.values()){
			list.add(member);
		}
		return list;
	}

	public Member find(String id) {
		Member member = db.get(id);
		return member;
	}
	
	public List<Member> searchByName(String name){
		List<Member> list = new ArrayList<Member>();
		for(Member member : db.values()){
			if(member.getName().contains(name)){
				list.add(member);
			}
		}
		return list;
	}
	
	public List<Member> searchById(String id){
		List<Member> list = new ArrayList<Member>();
		for(Member member : db.values()){
			if(member.getId().contains(id)){
				list.add(member);
			}
		}
		return list;
	}
	
	public List<Member> searchByNick(String nick){
		List<Member> list = new ArrayList<Member>();
		for(Member member : db.values()){
			if(member.getNick().contains(nick)){
				list.add(member);
			}
		}
		return list;
	}	
	
	
	public boolean checkDuplicateId(String id) {
		Member member = db.get(id);
		
		if(member == null){
			return false;
		} else {
			return true;
		}
	}

	public boolean checkDuplicateNick(String nick) {
		for(Member member : db.values()){
			if(nick.equals(member.getNick())){
				return true;
			}
		}
		return false;
	}


	
	
	private void initialize() {
		Member member = new Member("jhheo", "����ȸ", "�㱺", "1111", "jhheo@nextree.com");
		member.setNote("���� �������� ���� �ٴϴ� �ι�, ���� �������϶��� �������� ������ ���δٰ���.");
		db.put(member.getId(), member);
		
		member = new Member("ggapkwon", "����", "22������", "2222", "abcde@abc.com");
		member.setNote("JYP �� ���� �ݹ�� ������ �Ǿ��ٰ� �˷����� 22�� ���� �Ŷ�");
		db.put(member.getId(), member);
		
		member = new Member("gain", "����", "�Ѱ��ξƴ�", "3333", "eee@ddd.com");
		member.setNote("�ֲ�Ǯ ��� �̻����� �ִٴ� ���� ���� �����ְ� ��� ���� ���̵�(?), ���(?)");
		db.put(member.getId(), member);
		
		member = new Member("daesung", "���뼺", "�뼺", "1234", "a1b2c3@yg.com");
		member.setNote("Ʈ��Ʈ�� ���� �� ��︮�� ���̵�, ������ �������� ������ �Դ��� ����");
		db.put(member.getId(), member);
		
		member = new Member("sun", "������", "�¾�", "4321", "a1b2c3@yg.com");
		member.setNote("�����ᰡ �����忡�� ������ �̼��� ��ȭ��ȣ�� �����ִ� �ʴɷ��� ������ ������!");
		db.put(member.getId(), member);
		
	}

}
