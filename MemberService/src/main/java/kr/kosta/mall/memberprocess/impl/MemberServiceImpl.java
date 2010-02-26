package kr.kosta.mall.memberprocess.impl;

import java.sql.SQLException;

import kr.kosta.mall.memberentity.MemberProvider;
import kr.kosta.mall.memberentity.bdt.Member;
import kr.kosta.mall.memberprocess.MemberService;
import kr.kosta.mall.memberprocess.MemberServiceEnv;

/**
 *
 * @author ±èÈñ¼÷
 *
 */
public class MemberServiceImpl implements MemberService {

	public MemberProvider getMemberProvider() {
		return MemberServiceEnv.getInstance().getMemberProvider();
	}

	public Member getMember(int id) throws SQLException {
		Member member = getMemberProvider().getMember(id);
		return member;
	}

	public int registMember(Member member) throws SQLException {
		int id = getMemberProvider().registMember(member);
		return id;
	}

}
