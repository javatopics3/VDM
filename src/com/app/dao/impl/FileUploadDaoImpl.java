package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.dao.IFileUploadDao;
import com.app.model.UploadFile;
@Repository
public class FileUploadDaoImpl implements IFileUploadDao{
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveFileObj(UploadFile uf) {
		return (Integer)ht.save(uf);
	}
	@Override
	public List<Object[]> getFileIdAndNames() {
		String hql="select fileId,fileName from "+UploadFile.class.getName();
		return (List<Object[]>)ht.find(hql);
	}
	
	@Override
	public UploadFile getObjById(int fileId) {
		return ht.get(UploadFile.class, fileId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
