# DubboSpringMybatisDemo
Spring+Mybatis+Dubbo实现REST接口（provider部分），提供了数据库的增加、删除、更新、查询四个接口；


构建工具Maven,IDE为IntelliJ IDEA。


笔记：


Maven:即使知道了jar包的名字，还是要去搜索groupId、artifactId的名字。知道groupId、artifactId的命名规则似乎没什么用，似乎并没有减轻工作量。


IntelliJ IDEA：虽然之前用过一次，也用过反编译工具，但这次发现IDEA的调试能在框架源码里面逐步执行，似乎是自动调用了反编译工具。找到合适的工具很重要
。


dao:把面向对象形式的请求转化为对数据库的操作，把数据库的操作的结果以面向对象的形式返回，方式是对象方法与数据库操作语句的映射（ORM）。


service：分为接口与实现类两部分，接口供调用，与实现分离。
