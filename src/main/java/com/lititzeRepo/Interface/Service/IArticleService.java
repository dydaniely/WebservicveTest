package com.lititzeRepo.Interface.Service;

import com.lititzeRepo.Interface.Domain.Article;

import java.util.List;



public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
