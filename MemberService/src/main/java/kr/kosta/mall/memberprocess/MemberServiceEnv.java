/*
 * COPYRIGHT National Election Commission 2008
 * This software is the proprietary information of
 * National Election Commission.
 */
package kr.kosta.mall.memberprocess;

import kr.kosta.mall.memberentity.MemberProvider;

/**
 * ������Ʈ�� ȯ�� �������̽�.
 *
 * @author �����
 *
 */
public class MemberServiceEnv {

	/**
	 * SystemProcessEnv �̱��� �ν��Ͻ�
	 */
	private static MemberServiceEnv instance = new MemberServiceEnv();

	/**
	 * SystemProcessEnv �̱��� �ν��Ͻ� ����
	 *
	 * @return {@link MemberServiceEnv}
	 */
	public static MemberServiceEnv getInstance() {
		if (instance == null) {
			instance = new MemberServiceEnv();
		}
		return instance;
	}

	/**
	 * ȸ�� �������̽�
	 */
	private MemberProvider memberProvider;

	private MemberServiceEnv() {
	}

	public MemberProvider getMemberProvider() {
		return memberProvider;
	}

	public void setMemberProvider(MemberProvider memberProvider) {
		this.memberProvider = memberProvider;
	}

}
