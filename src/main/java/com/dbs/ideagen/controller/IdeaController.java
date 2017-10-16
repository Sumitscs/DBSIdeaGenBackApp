package com.dbs.ideagen.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.dbs.ideagen.entity.Idea;
import com.dbs.ideagen.service.IIdeaService;

@Controller
@RequestMapping("dbs")
@CrossOrigin(origins = {"http://localhost:4200"})
public class IdeaController {
	@Autowired
	private IIdeaService ideaService;
	@GetMapping("idea")
	public ResponseEntity<Idea> getIdeaById(@RequestParam("id") String id) {
		Idea idea = ideaService.getIdeaById(Integer.parseInt(id));
		return new ResponseEntity<Idea>(idea, HttpStatus.OK);
	}
	@GetMapping("all-ideas")
	public ResponseEntity<List<Idea>> getAllIdeas() {
		List<Idea> list = ideaService.getAllIdeas();
		return new ResponseEntity<List<Idea>>(list, HttpStatus.OK);
	}
	@PostMapping("idea")
	public ResponseEntity<Void> createIdea(@RequestBody Idea idea, UriComponentsBuilder builder) {
        boolean flag = ideaService.createIdea(idea);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/idea?id={id}").buildAndExpand(idea.getIdeaId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("idea")
	public ResponseEntity<Idea> updateIdea(@RequestBody Idea idea) {
		ideaService.updateIdea(idea);
		return new ResponseEntity<Idea>(idea, HttpStatus.OK);
	}
	@DeleteMapping("idea")
	public ResponseEntity<Void> deleteIdea(@RequestParam("id") String id) {
		ideaService.deleteIdea(Integer.parseInt(id));
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
} 