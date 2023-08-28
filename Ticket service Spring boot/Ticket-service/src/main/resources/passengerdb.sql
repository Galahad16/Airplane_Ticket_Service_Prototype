create database passangerdb;*

create user 'frank_supreme'@'%' identified by 'ABC*123';
grant all privileges on passangerdb.* to 'frank_supreme'@'%' with grant option;

create user 'frank_manager'@'%' identified by 'ABC*123';
grant alter on passangerdb.* to 'frank_manager'@'%';
grant create on passangerdb.* to 'frank_manager'@'%';
grant drop on passangerdb.* to 'frank_manager'@'%';
grant execute on passangerdb.* to 'frank_manager'@'%';

create user 'frank_user'@'%' identified by 'ABC*123';
grant insert on passangerdb.* to 'frank_user'@'%';
grant delete on passangerdb.* to 'frank_user'@'%';
grant select on passangerdb.* to 'frank_user'@'%';