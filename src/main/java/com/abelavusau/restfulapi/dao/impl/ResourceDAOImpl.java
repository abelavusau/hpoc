package com.abelavusau.restfulapi.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.abelavusau.restfulapi.dao.ResourceDAO;
import com.abelavusau.restfulapi.model.Resource;

@Repository
public class ResourceDAOImpl implements ResourceDAO {

	@Override
	public <S extends Resource> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resource> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resource> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Resource> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Resource> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Resource> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Resource> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Resource> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Resource entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Resource> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
