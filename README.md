# technology-blog
技术博客


# 技术栈清单

## 一、构建工具
- **后端构建工具**：Maven、Gradle
- **前端构建工具**：Webpack、Vite

## 二、测试与开发框架
- **单元测试**：Junit
- **开发框架**：SpringMVC、Spring、Spring Boot
- **Web 服务器**：Tomcat、Caddy、Nginx
- **微服务框架**：Spring Cloud
- **分布式 RPC 框架**：Dubbo

## 三、数据存储与处理

### 3.1 数据层框架
- JPA、MyBatis、MyBatis-Plus
- **模板引擎**：thymeleaf

### 3.2 数据库相关
- **关系型数据库**：MySQL
  - 数据库中间件 Gaea
  - 同步数据 canal
  - 数据库迁移工具 Flyway
- **非关系型数据库（NoSQL）**：MongoDB
- **缓存**：Redis
  - 增强模块 RedisMod
  - ORM 框架 RedisOM
- **对象存储服务**：minio

## 四、消息与任务调度
- **消息队列**：Kafka（图形化工具 Eagle）、RocketMQ、RabbitMQ、Pulsar
- **任务调度框架**：Spring Task、Quartz、PowerJob、XXL-Job

## 五、容器与部署
- **容器工具**：Docker
  - 镜像仓库服务 Harbor
  - 图形化工具 Portainer
- k8s、Podman
- **持续集成**：Jenkins、Drone
- **Git 服务**：Gogs

## 六、监控与日志

### 6.1 日志相关
- **日志框架**：Log4j、Logback、SF4J、Log4j2
- **日志收集**：
  - ELK（日志采集器 Filebeat）
  - EFK（Fluentd）
  - LPG（Loki+Promtail+Grafana）
- **搜索引擎**：ES（用于日志检索等场景）

### 6.2 监控与诊断
- **应用监控**：SpringBoot Admin、Grafana、SkyWalking、Elastic APM
- **诊断工具**：arthas
- **压力测试**：Jmeter

## 七、安全与权限
- **安全框架**：Shiro、SpringSecurity
- **权限框架**：Keycloak、Sa-Token
- **Token 管理**：jwt（nimbus-jose-jwt）

## 八、工具与组件

### 8.1 开发辅助工具
- **注解工具**：lombok
- **Java 工具包**：hutool、Guava
- **数据检查**：hibernate validator
- **属性映射**：mapStruct
- **代码生成器**：Mybatis generator
- **Java 硬件信息库**：oshi
- **Java 连接 SSH 服务器**：ganymed

### 8.2 接口与文档
- **API 网关**：Gateway、Zuul、apisix
- **接口文档**：Swagger-ui、Knife4j、Spring Doc、Torna、YApi
- **HTTP 客户端工具**：Retrofit
- **Web 自动化测试**：selenium

### 8.3 文档与可视化
- **项目文档工具**：Hexo、VuePress
- **数据可视化（BI）**：DataEase、Metabase
- **文件操作**：
  - **office 文档操作**：EasyPoi、EasyExcel
  - **文件预览**：kkFileView

### 8.4 其他工具
- **分布式应用程序协调**：Zookeeper
- **低代码平台**：LowCodeEngine、Yao、Erupt、magic-api
- **脚手架**：sa-plus
- **JDBC 连接池**：Druid
- **JSON 处理**：fastjson2、Jackson、Gson

## 九、大数据技术
Spark、Hadoop、HBase、Hive、Storm、Flink
