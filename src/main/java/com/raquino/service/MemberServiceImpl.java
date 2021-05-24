package com.raquino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raquino.dao.MemberDAO;
import com.raquino.entity.Member;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	
	@Override
	@Transactional
	public List < Member > getMembers() {
		return memberDAO.getMembers();
	}
	
	@Override
	@Transactional
	public void saveMember(Member theMember) {
		memberDAO.saveMember(theMember);
	}
	
    @Override
    @Transactional
    public Member getMember(int theId) {
        return memberDAO.getMember(theId);
    }

    @Override
    @Transactional
    public void deleteMember(int theId) {
        memberDAO.deleteMember(theId);
    }

}
