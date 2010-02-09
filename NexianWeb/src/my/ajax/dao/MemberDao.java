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
		Member member = new Member("jhheo", "허장회", "허군", "1111", "jhheo@nextree.com");
		member.setNote("가끔 정신줄을 놓고 다니는 인물, 가끔 제정신일때만 보통사람과 유사해 보인다고함.");
		db.put(member.getId(), member);
		
		member = new Member("ggapkwon", "조권", "22세짐승", "2222", "abcde@abc.com");
		member.setNote("JYP 에 대한 반밥로 깝권이 되었다고 알려지는 22세 순딩 신랑");
		db.put(member.getId(), member);
		
		member = new Member("gain", "가인", "한가인아님", "3333", "eee@ddd.com");
		member.setNote("쌍꺼풀 없어도 이뻐질수 있다는 것을 몸소 보여주고 계신 열혈 아이돌(?), 어른돌(?)");
		db.put(member.getId(), member);
		
		member = new Member("daesung", "강대성", "대성", "1234", "a1b2c3@yg.com");
		member.setNote("트로트가 가장 잘 어울리는 아이돌, 순박한 사투리와 구수한 입답이 걸작");
		db.put(member.getId(), member);
		
		member = new Member("sun", "동영배", "태양", "4321", "a1b2c3@yg.com");
		member.setNote("팀동료가 강심장에서 폭로해 이성의 전화번호를 딸수있는 초능력이 있음이 밝혀짐!");
		db.put(member.getId(), member);
		
	}

}
