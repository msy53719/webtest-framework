use testdb;
create table teset_time(
service_ip varchar(255) NOT NULL COMMENT '服务器地址',
create_time  DATETIME   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time  DATETIME  DEFAULT NULL  COMMENT '修改时间'
)ENGINE=INNODB CHARSET=UTF8;

insert into teset_time values('123243',now(),'2018-09-01 21:12:32');
commit;


select * from teset_time;



drop table teset_time;


create table server_info(
service_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '服务器id',
service_ip varchar(255) NOT NULL COMMENT '服务器地址',
service_port INT DEFAULT NULL COMMENT '端口',
service_base_path varchar(255)  COMMENT 'url地址',
create_time  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time DATETIME  DEFAULT NULL  COMMENT  '修改时间',
PRIMARY KEY (service_id)
)ENGINE=INNODB CHARSET=UTF8;



create table interface_info(
interface_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '接口id',
service_id BIGINT NOT NULL COMMENT '服务id',
interface_name varchar(255) NOT NULL COMMENT '接口名称',
intercase_des varchar(255) DEFAULT NULL COMMENT '接口描述',
create_time  DATETIME NOT  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time DATETIME DEFAULT NULL  COMMENT  '修改时间',
PRIMARY KEY (interface_id)
)ENGINE=INNODB CHARSET=UTF8;

create table test_case_info(
case_id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID',
interface_id BIGINT NOT NULL COMMENT 'ID',
case_name varchar(255) NOT NULL COMMENT '名称',
case_des varchar(255) DEFAULT NULL COMMENT '描述',
case_status varchar(255) DEFAULT '0' COMMENT '状态 0 -初始,1-失败 2-成功 ' ,
create_time  DATETIME NOT NULL  DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time DATETIME DEFAULT NULL  COMMENT  '修改时间',
PRIMARY KEY (case_id) 
)ENGINE=INNODB CHARSET=UTF8;

create table request_data(
id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
case_id BIGINT NOT NULL COMMENT '测试用例id',
requset_key varchar(255) NOT NULL COMMENT '请求数据的key',
requset_value varchar(255) DEFAULT NULL COMMENT '请求数据的value',
create_time  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time DATETIME DEFAULT NULL  COMMENT  '修改时间',
PRIMARY KEY (id) 
)ENGINE=INNODB CHARSET=UTF8;

create table expected_data(
id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
case_id BIGINT NOT NULL COMMENT '用例id',
response_jsonpath varchar(255) NOT NULL COMMENT '返回结果的jsonpath',
expected_value varchar(255) DEFAULT NULL COMMENT '预期结果值',
create_time  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time DATETIME DEFAULT NULL  COMMENT  '修改时间',
PRIMARY KEY (id)
)ENGINE=INNODB CHARSET=UTF8;

--DROP TABLE IF EXISTS tablename;
--use testdb;--删除数据库
--drop table server_info;
--drop table interface_info;
--drop table  test_case_info;
--drop table request_data;
--drop table expected_data;
--
--select * from server_info;
--
--INSERT INTO server_info values('','','','');
--alert table