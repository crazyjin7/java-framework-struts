/*
 * COPYRIGHT National Election Commission 2008
 * This software is the proprietary information of
 * National Election Commission.
 */
package kr.kosta.mall.memberprocess;

import kr.kosta.mall.memberentity.MemberProvider;

/**
 * 컴포넌트의 환경 인터페이스.
 *
 * @author 김희숙
 *
 */
public class MemberServiceEnv {

	/**
	 * SystemProcessEnv 싱글톤 인스턴스
	 */
	private static MemberServiceEnv instance = new MemberServiceEnv();

	/**
	 * SystemProcessEnv 싱글톤 인스턴스 리턴
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
	 * 회원 인터페이스
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
