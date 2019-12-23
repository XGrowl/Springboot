package com.itheime.generator;

import com.itheime.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AirticleMapper {
    Article findById(@Param("id")Long id);
    List<Article> findAll();
    int deleteById(@Param("id")Long id);
    int insert(Article article);
    int updatebyId(Article article);

}
