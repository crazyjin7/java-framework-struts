package kr.kosta.mall.memberentity;

import java.sql.SQLException;

import kr.kosta.mall.memberentity.bdt.Member;

/**
 *
 * @author 김희숙
 *
 */
public interface MemberProvider {

	/**
	 * 회원 아이디를 이용해 회원 정보를 가져온다.
	 *
	 * @param id
	 * @return Member
	 * @throws SQLException
	 */
	public Member getMember(int id) throws SQLException;

	/**
	 * 회원정보를 등록하고 아이디를 반환한다.
	 *
	 * @param statementId
	 * @param member
	 * @return
	 * @throws SQLException
	 */
	public int registMember(Member member) throws SQLException;

}
