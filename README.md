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

## 应用分层
> 参考阿里巴巴Java开发手册

![arc-level](/doc/arc-level.jpg)

- 开放接口层:可直接封装 Service 方法暴露成 RPC 接口;通过 Web 封装成 http 接口;进行 网关安全控制、流量控制等。 
- 终端显示层:各个端的模板渲染并执行显示的层。当前主要是 velocity 渲染，JS 渲染， JSP 渲染，移动端展示等。 
- Web 层:主要是对访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等。 
- Service 层:相对具体的业务逻辑服务层。 
- Manager 层:通用业务处理层，它有如下特征:
   1) 对第三方平台封装的层，预处理返回结果及转化异常信息;
   2) 对Service层通用能力的下沉，如缓存方案、中间件通用处理; 3) 与DAO层交互，对多个DAO的组合复用。 
- DAO 层:数据访问层，与底层 MySQL、Oracle、Hbase 等进行数据交互。 
- 外部接口或第三方平台:包括其它部门RPC开放接口，基础平台，其它公司的HTTP接口。 