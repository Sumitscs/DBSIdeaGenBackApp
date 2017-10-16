package com.dbs.ideagen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.ideagen.dao.IIdeaDAO;
import com.dbs.ideagen.entity.Idea;
@Service
public class IdeaService implements IIdeaService {
	@Autowired
	private IIdeaDAO ideaDAO;
	//@Override
	public Idea getIdeaById(int ideaId) {
		Idea obj = ideaDAO.getIdeaById(ideaId);
		return obj;
	}	
	//@Override
	public List<Idea> getAllIdeas(){
		return ideaDAO.getAllIdeas();
	}
	//@Override
	public synchronized boolean createIdea(Idea idea){
       if (ideaDAO.ideaExists(idea.getIdeaId())) {
    	   return false;
       } else {
    	   ideaDAO.createIdea(idea);
    	   return true;
       }
	}
	//@Override
	public void updateIdea(Idea idea) {
		ideaDAO.updateIdea(idea);
	}
	//@Override
	public void deleteIdea(int ideaId) {
		ideaDAO.deleteIdea(ideaId);
	}	
}
