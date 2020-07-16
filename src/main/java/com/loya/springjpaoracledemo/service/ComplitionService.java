package com.loya.springjpaoracledemo.service;

import com.loya.springjpaoracledemo.dao.ComplitionDao;
import com.loya.springjpaoracledemo.entity.Complition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplitionService {
    @Autowired
    ComplitionDao complitionDao;


    public List<Complition> getAllComplitions() {
        return this.complitionDao.findAll();
    }

    public Complition addComplition(Complition complition) {
        return this.complitionDao.save(complition);
    }

    //other methods go here


    public List<Complition> findComplitionByOriginalName(String originalName) {
        return this.complitionDao.findComplitionByOriginalName(originalName);
    }

    public List<Complition> findComplitionByDisplayName(String displayName) {
        return this.complitionDao.findComplitionByDisplayName(displayName);
    }

    public Complition updateComplition(Complition complition) {
        return this.complitionDao.save(complition);
    }

    public void deleteComplitionByOriginalName(String originalName) {
        this.complitionDao.deleteComplitionByOriginalName(originalName);
    }

    public void deleteAllComplitions() {
        this.complitionDao.deleteAll();
    }


}
