package com.Narga.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Narga.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{
	  Article findById(int id);
}