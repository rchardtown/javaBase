--	创建数据库
drop database if exists users_db;


create database users_db character set 'utf8mb4';
use users_db;
create table sys_user(
	user_id int(10)  not null comment '用户编号',
	username varchar(30) not null comment '用户姓名',
	cellphone varchar(30) not null comment '手机',
	primary key(user_id)
	

)ENGINE ='INNODB'  charset ='utf8mb4' comment '用户信息表';
