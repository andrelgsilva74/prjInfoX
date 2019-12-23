create database dbinfox;
use dbinfox;

create table tbusuarios(
iduser int primary key auto_increment,
usuario varchar(70) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);

insert into tbusuarios(usuario, fone, login, senha) values ('André Luis', '(11)97068-3012', 'admin', '123456');

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(70) not null,
fonecli varchar(15) not null,
emailcli varchar(15),
logradouro varchar(70),
numero char(10),
complemento char(10),
CEP char(10),
bairro varchar(50),
cidade varchar(50),
uf char(2)
);

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);