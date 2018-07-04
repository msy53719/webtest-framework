use test_db;
create table server_info(
service_id BIGINT NOT NULL AUTO_INCREMENT,
service_ip varchar(255) NOT NULL,
service_port INT DEFAULT NULL,
service_base_path varchar(255),
create_time  DATE,
modify_time DATE,
PRIMARY KEY (service_id)
);

create table interface_info(
interface_id BIGINT NOT NULL AUTO_INCREMENT,
service_id BIGINT NOT NULL,
interface_name varchar(255) NOT NULL,
intercase_des varchar(255) DEFAULT NULL,
create_time  DATE,
modify_time DATE,
PRIMARY KEY (interface_id)
);

create table test_case_info(
case_id BIGINT NOT NULL AUTO_INCREMENT,
interface_id BIGINT NOT NULL,
case_name varchar(255) NOT NULL,
case_des varchar(255) DEFAULT NULL,
case_status varchar(255) DEFAULT NULL,
create_time  DATE,
modify_time DATE,
PRIMARY KEY (case_id) 
);

create table request_data(
id BIGINT NOT NULL AUTO_INCREMENT,
case_id BIGINT NOT NULL,
requset_key varchar(255) NOT NULL,
requset_value varchar(255) DEFAULT NULL,
create_time  DATE,
modify_time DATE,
PRIMARY KEY (id) 
);

create table expected_data(
id BIGINT NOT NULL AUTO_INCREMENT,
case_id BIGINT NOT NULL,
response_jsonpath varchar(255) NOT NULL,
expected_value varchar(255) DEFAULT NULL,
create_time  DATE,
modify_time DATE,
PRIMARY KEY (id)
);