package com.loya.springjpaoracledemo.dao;

import com.loya.springjpaoracledemo.entity.Complition;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ComplitionDao  extends JpaRepository<Complition, Integer> {
    List<Complition> findComplitionByOriginalName(String originalName);
    List<Complition> findComplitionByDisplayName(String displayName);
    void deleteComplitionByOriginalName(String originalName);
}
