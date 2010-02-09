package my.ajax.service;

import java.util.List;

import my.ajax.dao.MemberDao;
import my.ajax.domain.Member;

public class MemberService {
	
	private MemberDao dao = MemberDao.getInstance();
	
	public void regist(Member member){
		dao.regist(member);
	}
	
	public void delete(String id){
		dao.delete(id);
	}
	
	public void updateMember(Member member){
		dao.update(member);
	}
	
	public List<Member> findAll(){
		return dao.findall();
	}
	
	public Member find(String id){
		return dao.find(id);
	}
	
	public List<Member> searchById(String id){
		return dao.searchById(id);
	}
	public List<Member> searchByName(String name){
		return dao.searchByName(name);
	}
	public List<Member> searchByNick(String nick){
		return dao.searchByNick(nick);
	}
	
	public boolean checkDuplicateId(String id){
		return dao.checkDuplicateId(id);
	}
	
	public boolean checkDuplicateNick(String nick){
		return dao.checkDuplicateNick(nick);
	}
	
	
}
