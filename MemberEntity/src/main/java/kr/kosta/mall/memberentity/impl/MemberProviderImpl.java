package kr.kosta.mall.memberentity.impl;

import java.sql.SQLException;

import kr.kosta.mall.memberentity.MemberProvider;
import kr.kosta.mall.memberentity.bdt.Member;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 *
 * @author ±èÈñ¼÷
 *
 */
public class MemberProviderImpl implements MemberProvider {

	private SqlMapClient sqlMapClient;

	public Member getMember(int id) throws SQLException {

		Member foundMember = (Member) getSqlMapClient().queryForObject(
				"findMember", id);

		return foundMember;
	}

	public int registMember(Member member) throws SQLException {

		Member registedMember = (Member) getSqlMapClient().insert(
				"registMember", member);

		return registedMember.getId();
	}

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

}
