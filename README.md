# 项目生成模版


## 技术选型

- Spring Boot
- MyBatis Plus
- Dubbo
- Druid
- slf4j+log4j2
- Jedis



## 使用

###  从项目生成 archetype

1. 进入项目根路径
2. 执行命令从项目生成 archetype:   `mvn archetype:create-from-project`
3. 进入生成的结构中：`cd target/generated-sources/archetype/`
4. 将 archetype安装到本地：`mvn install`
5. 进入要创建新项目的文件夹中
6. 执行名称：`mvn archetype:generate -DarchetypeCatalog=local`
7. 选择要使用的本地的 `archetype`，输入信息后完成项目的创建
8. 参考文档 [https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html](https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html)

