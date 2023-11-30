package com.ll.restapistudy.domain.article.article.repository;

import com.ll.restapistudy.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}