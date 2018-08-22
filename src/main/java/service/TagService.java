package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cupom;
import model.Tag;
import repository.EventoRepository;
import repository.TagRepository;

@Service
public class TagService {
	
	 @Autowired
	 private TagRepository tagRepository;
	
	 public Tag criarTag(Tag tag) {
		 return tagRepository.save(tag);
	 }
	 
	 public List<Tag> findAll() {
		 return tagRepository.findAll();
	 }
	    
	 public Optional<Tag> getTag(Long id) {
		 return tagRepository.findById(id);
	 }
}
