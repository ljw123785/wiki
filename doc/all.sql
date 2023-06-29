drop table if exists `test`;
create table `test`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='测试';

insert into `test` (id,name,password) values (1,'测试','password');

drop table if exists `demo`;
create table `demo`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    primary key (id)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into `demo` (id,name) values (1,'测试');

#电子书表
drop table if exists `ebook`;
create table `ebook` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读量',
    `vote_count` int comment '点赞量',
    primary key (`id`)
)engine=innodb default charset=utf8mb4 comment='电子书';

insert into `ebook` (id,name,description) values (1,'Spring boot 入门教程','零基础入门Java开发,企业级开发应用开发最佳首选框架');
insert into `ebook` (id,name,description) values (2,'vue 入门教程','零基础入门vue开发,企业级开发应用开发最佳首选框架');
insert into `ebook` (id,name,description) values (3,'python 入门教程','零基础入门python开发,企业级开发应用开发最佳首选框架');
insert into `ebook` (id,name,description) values (4,'Mysql 入门教程','零基础入门Mysql开发,企业级开发应用开发最佳首选框架');
insert into `ebook` (id,name,description) values (5,'Oracle 入门教程','零基础入门Oracle开发,企业级开发应用开发最佳首选框架');