package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;
@Service
public class LocationServiceImpl implements ILocationService{
	@Autowired
	private ILocationDao dao;
	
	@Override
	public int saveLocation(Location loc) {
		return dao.saveLocation(loc);
	}
	@Override
	public List<Location> getAllLocations() {
		return dao.getAllLocations();
	}
	@Override
	public void deleteLocationById(int locId) {
		dao.deleteLocationById(locId);
	}
	
	@Override
	public Location getLocationById(int locId) {
		return dao.getLocationById(locId);
	}
	@Override
	public void updateLoc(Location loc) {
		dao.updateLoc(loc);
	}

	@Override
	public List<Object[]> getLocationwiseCount() {
		return dao.getLocationwiseCount();
	}
	
	
}




