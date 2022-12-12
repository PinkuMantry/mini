package org.abc.restController;

import java.util.List;

import org.abc.Entity.contact;
import org.abc.IService.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class contactController {
@Autowired
private Iservice service;

@GetMapping("/add")
public ResponseEntity<String> add(@RequestBody contact c)
{
	return new ResponseEntity<String>(service.addContact(c),HttpStatus.CREATED);
}
@GetMapping("/all")
public ResponseEntity<List<contact>> all()
{
	 return new ResponseEntity<List<contact>>(service.viewAll(),HttpStatus.OK);
}
@GetMapping("/update")
public String update(@RequestBody contact c)
{
	 return service.updateContact(c);
}
@GetMapping("/delete/{id}")
public String delete(@PathVariable Integer id)
{
	 return service.deleteContact(id);
}
@GetMapping("/one/{id}")
public contact one(@PathVariable Integer id)
{
	 return service.getOne(id);
}
}
