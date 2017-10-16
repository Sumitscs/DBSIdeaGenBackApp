package com.dbs.ideagen.dao;
import java.util.List;
import com.dbs.ideagen.entity.Idea;
public interface IIdeaDAO {
    List<Idea> getAllIdeas();
    Idea getIdeaById(int ideaId);
    void createIdea(Idea idea);
    void updateIdea(Idea idea);
    void deleteIdea(int ideaId);
    boolean ideaExists(int ideaId);
}
 