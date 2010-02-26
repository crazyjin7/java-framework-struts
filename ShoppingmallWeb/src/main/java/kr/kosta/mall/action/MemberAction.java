package kr.kosta.mall.action;

import kr.kosta.mall.memberentity.bdt.Member;
import kr.kosta.mall.memberprocess.MemberService;


public class MemberAction {

	private Member member;
	private MemberService memberService;
	private int memberId;
	private String resultString;

	public String registMember() throws Exception {

		memberId = 2;

		return "success";

	}

	public String findMember() throws Exception {

		member = new Member();
		member.setId(1);
		member.setName("√÷¿Œ«˝");
		member.setPassword("1234");
		member.setPhone("1111111111");


		return "success";
	}

	public String findMemberAjax() throws Exception {
		resultString = "√÷¿Œ«˝";

		return "ajax";
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setMemberService(MemberService memberService) {

		this.memberService = memberService;
	}

	public Member getMember() {
		return member;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getResultString() {
		return resultString;
	}

	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
}
