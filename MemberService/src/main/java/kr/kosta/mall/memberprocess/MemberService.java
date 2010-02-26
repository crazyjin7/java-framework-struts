package kr.kosta.mall.memberprocess;

import java.sql.SQLException;

import kr.kosta.mall.memberentity.bdt.Member;

/**
 *
 * @author �����
 *
 */
public interface MemberService {

	/**
	 * ȸ�� ���̵� �̿��� ȸ�� ������ �����´�.
	 *
	 * @param id
	 * @return Member
	 * @throws SQLException
	 */
	public Member getMember(int id) throws SQLException;

	/**
	 * ȸ�������� ����ϰ� ���̵� ��ȯ�Ѵ�.
	 *
	 * @param statementId
	 * @param member
	 * @return
	 * @throws SQLException
	 */
	public int registMember(Member member) throws SQLException;
}