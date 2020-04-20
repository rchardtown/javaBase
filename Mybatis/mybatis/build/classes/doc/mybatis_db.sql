drop database if exists mybatis_db;
create database mybatis_db character set 'utf8mb4';
use mybatis_db;

drop table if exists sys_user;
create table sys_user(
	user_id int(10) not null auto_increment comment '�û����',
	username varchar(100) not null comment '�û���',
	cellphone varchar(100) not null comment '�û�����',
	create_time timestamp not null default current_timestamp comment '����ʱ��',
	update_time timestamp not null default current_timestamp comment '����ʱ��',
	primary key (user_id)

)ENGINE=Innodb charset ='utf8mb4' comment'�û���Ϣ��';
