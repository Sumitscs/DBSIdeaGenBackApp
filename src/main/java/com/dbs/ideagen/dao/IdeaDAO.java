package com.dbs.ideagen.dao;
import java.util.ArrayList;
import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.dbs.ideagen.entity.Idea;
//@Transactional
@Repository
public class IdeaDAO implements IIdeaDAO {
	//@PersistenceContext	
	//private EntityManager entityManager;	
	//@Override
	public Idea getIdeaById(int ideaId) {
		//return entityManager.find(Idea.class, ideaId);
		Idea art = new Idea();
		art.setIdeaId(ideaId);
		art.setSolutionProposed("Sollution Proposed"+ideaId);
		art.setProblemStatement("Problem Statement"+ideaId);
		return art;
	}
	@SuppressWarnings("unchecked")
	//@Override
	public List<Idea> getAllIdeas() {
		//String hql = "FROM Idea as atcl ORDER BY atcl.ideaId DESC";
		//return (List<Idea>) entityManager.createQuery(hql).getResultList();
		return getListOfIdea();
	}
	
	public List<Idea> getListOfIdea(){
		List<Idea> list = new ArrayList<Idea>();
		Idea art1 = new Idea();
		art1.setIdeaId(1);
		art1.setSolutionProposed("Sollution Proposed1");
		art1.setProblemStatement("Problem Statement1");		
		Idea art2 = new Idea();
		art2.setIdeaId(2);
		art2.setSolutionProposed("Sollution Proposed2");
		art2.setProblemStatement("Problem Statement2");
		list.add(art1);
		list.add(art2);
		return list;
	}
	
	//@Override
	public void createIdea(Idea idea) {
		//entityManager.persist(idea);
	}
	//@Override
	public void updateIdea(Idea idea) {
		Idea artcl = getIdeaById(idea.getIdeaId());
		artcl.setProblemStatement(idea.getProblemStatement());
		artcl.setSolutionProposed(idea.getSolutionProposed());
		//entityManager.flush();
	}
	//@Override
	public void deleteIdea(int ideaId) {
		//entityManager.remove(getIdeaById(ideaId));
	}
	//@Override
	public boolean ideaExists(int id) {
		/*String hql = "FROM Idea as idea WHERE idea.id = ?";
		int count = entityManager.createQuery(hql).setParameter(1, id).getResultList().size();
		return count > 0 ? true : false;*/
		return true;
	}
}
