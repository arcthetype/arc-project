# 从项目生成 archetype

进入项目根路径

```shell script
mvn archetype:create-from-project

cd target/generated-sources/archetype/

mvn install

进入要创建项目的路径

mvn archetype:generate -DarchetypeCatalog=local

选择要使用的 archetype 后创建完成

```

参考文档 [https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html](https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html)