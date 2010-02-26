package kr.kosta.mall.memberentity;

import java.sql.SQLException;

import kr.kosta.mall.memberentity.bdt.Member;

/**
 *
 * @author �����
 *
 */
public interface MemberProvider {

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
