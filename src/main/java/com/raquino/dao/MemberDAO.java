package com.raquino.dao;

import java.util.List;

import com.raquino.entity.Member;

public interface MemberDAO {
	
    public List < Member > getMembers();

    public void saveMember(Member theMember);

    public Member getMember(int theId);

    public void deleteMember(int theId);

}
