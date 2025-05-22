create database myclinica;
create user 'myuser'@'%' identified by 'clinica123';
grant all on myclinica.* to 'myuser'@'%';