# esayShop
this dennis esayShop

项目结构如下  
┌─ src  
│   ├── main  
│   │   ├── java（java代码目录，包含com.web.easyshop包）  
│   │   │   ├── EasyShopApplication.java（入口运行文件）  
│   │   │   ├── admin（管理后台代码）  
│   │   │   └── api（客户端接口代码，业务层目录以api为例）  
│   │   │       ├── Controller（控制器）  
│   │   │       ├── Dao（数据库抽象接口，mapper，现在使用的mybatis直接写接口类即可，【过去Dao需要写抽象接口和实例类】）  
│   │   │       ├── Vo（客户端数据模型）  
│   │   │       ├── Entity（实体，数据库数据结构实体）  
│   │   │       ├── Model（模型，接口数据结构模型）  
│   │   │       ├── Service（务层）  
│   │   │       │   ├── impl（服务抽象层）  
│   │   │       │   │   └── *impl.java（服务抽象类）  
│   │   │       │   └── *service.java（服务实例类）  
│   │   │       ├── Util（工具、集成工具类）  
│   │   │       ├── Common（公共业务）  
│   │   │       └── domain（javabean）  
│   │   └── resources（静态资源目录）    
│   └── test（单元测试目录）  
├── pom.xml（maven依赖文件）  
└── target  
