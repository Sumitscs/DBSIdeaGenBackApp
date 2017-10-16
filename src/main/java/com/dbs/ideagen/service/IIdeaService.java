package com.dbs.ideagen.service;

import java.util.List;

import com.dbs.ideagen.entity.Idea;

public interface IIdeaService {
     List<Idea> getAllIdeas();
     Idea getIdeaById(int ideaId);
     boolean createIdea(Idea idea);
     void updateIdea(Idea idea);
     void deleteIdea(int ideaId);
}
