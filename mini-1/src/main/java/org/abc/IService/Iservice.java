package org.abc.IService;

import java.util.List;

import org.abc.Entity.contact;

public interface Iservice {
public String addContact(contact c);
public  List<contact> viewAll();
public contact getOne(Integer id);
public String updateContact(contact c);
public String deleteContact(Integer id);
}
