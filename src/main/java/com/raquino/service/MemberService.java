package com.raquino.service;

import java.util.List;

import com.raquino.entity.Member;

public interface MemberService {

	public List < Member > getMembers();

	public void saveMember(Member theMember);

	public Member getMember(int theId);

	public void deleteMember(int theId);	

}
