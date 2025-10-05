# paicoding-lite

一个精简版的技术社区项目骨架，多模块结构，基于 Spring Boot 构建，包含最基本的首页与控制器，便于后续扩展业务。

## 模块
- paicoding-lite-api：数据对象与通用类型
- paicoding-lite-core：通用工具与组件
- paicoding-lite-service：业务服务层
- paicoding-lite-ui：Thymeleaf 模板与静态资源
- paicoding-lite-web：Web 层与应用入口

## 快速开始
```bash
mvn clean package -DskipTests
mvn -pl paicoding-lite-web -am spring-boot:run
```

访问：`http://localhost:8080/`