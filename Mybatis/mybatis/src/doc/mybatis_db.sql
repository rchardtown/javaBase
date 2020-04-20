drop database if exists mybatis_db;
create database mybatis_db character set 'utf8mb4';
use mybatis_db;

drop table if exists sys_user;
create table sys_user(
	user_id int(10) not null auto_increment comment '用户编号',
	username varchar(100) not null comment '用户名',
	cellphone varchar(100) not null comment '用户密码',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp comment '更新时间',
	primary key (user_id)

)ENGINE=Innodb charset ='utf8mb4' comment'用户信息表';
