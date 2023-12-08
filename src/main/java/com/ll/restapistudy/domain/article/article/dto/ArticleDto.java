package com.ll.restapistudy.domain.article.article.dto;


import com.ll.restapistudy.domain.article.article.entity.Article;
import com.ll.restapistudy.domain.member.member.entity.Member;
import com.ll.restapistudy.global.jpa.BaseEntity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Getter
public class ArticleDto {
    private final Long id;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifyDate;
    private final Long authorId;
    private final String authorName;
    private final String title;
    private final String body;

    public ArticleDto(Article article){
        this.id = article.getId();
        this.createdDate = article.getCreateDate();
        this.modifyDate = article.getModifyDate();
        this.authorId = article.getAuthor().getId();
        this.authorName = article.getAuthor().getName();
        this.title = article.getTitle();
        this.body = article.getBody();
    }
}