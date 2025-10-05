package com.paicoding.lite.service;

import com.paicoding.lite.api.dto.ArticleDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {
    public List<ArticleDto> listLatest() {
        return Arrays.asList(
                new ArticleDto(1L, "Hello 技术派 Lite", "一个精简版社区项目骨架"),
                new ArticleDto(2L, "快速开始", "构建并运行，访问首页即可预览"));
    }
}