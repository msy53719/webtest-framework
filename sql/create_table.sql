use testdb;
create table test_time(
create_time TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
--modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
)

create table server_info(
service_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '服务器id',
service_ip varchar(255) NOT NULL COMMENT '服务器地址',
service_port INT DEFAULT NULL COMMENT '端口',
service_base_path varchar(255)  COMMENT 'url地址',
create_time  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
PRIMARY KEY (service_id)
);



create table interface_info(
interface_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '接口id',
service_id BIGINT NOT NULL COMMENT '服务id',
interface_name varchar(255) NOT NULL COMMENT '接口名称',
intercase_des varchar(255) DEFAULT NULL COMMENT '接口描述',
create_time  timestamp NOT  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
PRIMARY KEY (interface_id)
);

create table test_case_info(
case_id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID',
interface_id BIGINT NOT NULL COMMENT 'ID',
case_name varchar(255) NOT NULL COMMENT '名称',
case_des varchar(255) DEFAULT NULL COMMENT '描述',
case_status varchar(255) DEFAULT '0' COMMENT '状态 0 -初始,1-失败 2-成功 ' ,
create_time  timestamp NOT NULL  DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time timestamp NOT  NULL  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
PRIMARY KEY (case_id) 
);

create table request_data(
id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
case_id BIGINT NOT NULL COMMENT '测试用例id',
requset_key varchar(255) NOT NULL COMMENT '请求数据的key',
requset_value varchar(255) DEFAULT NULL COMMENT '请求数据的value',
create_time  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
PRIMARY KEY (id) 
);

create table expected_data(
id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
case_id BIGINT NOT NULL COMMENT '用例id',
response_jsonpath varchar(255) NOT NULL COMMENT '返回结果的jsonpath',
expected_value varchar(255) DEFAULT NULL COMMENT '预期结果值',
create_time  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
modify_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP '修改时间',
PRIMARY KEY (id)
);

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