drop table if exists `user`;
create table user (
  id bigint(20) not null auto_increment,
  username varchar(40) not null,
  name varchar(20) not null,
  age int(3) not null,
  balance decimal(10,2),
  create_time datetime,
  primary key(id)
);
