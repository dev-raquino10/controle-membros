package com.raquino.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.raquino.entity.Member;

public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List < Member > getMembers() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery < Member > cq = cb.createQuery(Member.class);
		Root < Member > root = cq.from(Member.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteMember(int id) {
		Session session = sessionFactory.getCurrentSession();
		Member book = session.byId(Member.class).load(id);
		session.delete(book);
	}

	@Override
	public void saveMember(Member theMember) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theMember);
	}

	@Override
	public Member getMember(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Member theMember = currentSession.get(Member.class, theId);
		return theMember;
	}
}

