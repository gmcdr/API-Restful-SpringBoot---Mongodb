package com.gabriel.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.project.domain.User;
import com.gabriel.project.dto.UserDTO;
import com.gabriel.project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	/*
	public User update(User obj) {
		User newObj = repository.findOne(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	*/
	
	private void updateData(User newObj, User obj) {
		newObj.setEmail(obj.getEmail());
		newObj.setEmail(obj.getEmail());
	}

	public void delete(String id) {
		repository.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDTO){
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
}
