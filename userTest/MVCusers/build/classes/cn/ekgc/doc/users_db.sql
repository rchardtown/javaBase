--	�������ݿ�
drop database if exists users_db;


create database users_db character set 'utf8mb4';
use users_db;
create table sys_user(
	user_id int(10)  not null comment '�û����',
	username varchar(30) not null comment '�û�����',
	cellphone varchar(30) not null comment '�ֻ�',
	primary key(user_id)
	

)ENGINE ='INNODB'  charset ='utf8mb4' comment '�û���Ϣ��';
