package org.abc.serviceImpl;

import java.util.List;

import org.abc.Entity.contact;
import org.abc.IService.Iservice;
import org.abc.Repo.contactrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements Iservice {
	@Autowired
	private contactrepo repo;
	public String addContact(contact c){
		return "contact " +repo.save(c).getCId()+" saved";
	}
	public  List<contact> viewAll(){
		return repo.findAll();
	}
	public contact getOne(Integer id) {
		return repo.findById(id).get();
	}
	public String updateContact(contact c) {
		return "contact "+repo.save(c).getCId()+" updated";
	}
	public String deleteContact(Integer id) {
		repo.deleteById(id);
		return "contact "+id+" deleted";
	}
}
