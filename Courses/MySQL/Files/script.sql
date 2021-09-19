create table pessoas -- <- DDL = Data Definition Language
(
    id            int         not null auto_increment,
    nome          varchar(30) not null,
    nascimento    date,
    sexo          enum ('M', 'F'),
    peso          decimal(5, 2), -- (Qntd de Dígitos), (Qntd de Nºs dps da vírgula)
    altura        decimal(3, 2),
    nacionalidade varchar(20) default 'Brasil',
    primary key (id)
) default char set = utf8;

insert into pessoas -- <- DML = Data Manipulation Language
values (default, 'Cláudio', '1975-4-22', 'M', '99.0', '2.15', 'Brasil'),
       (default, 'Pedro', '1999-12-3', 'M', '87', '2', default),
       (default, 'Janaina', '1987-11-12', 'F', '75.4', '1.66', 'EUA');

SELECT *
FROM pessoas;

/* ----------------------------------------------- */

/* Adicionar Coluna */
alter table pessoas
    add column profissao varchar(10) after nome;

/* Remover Coluna */
alter table pessoas
    drop column profissao;

/* Modificar Coluna */
alter table pessoas
    modify column profissao varchar(20) not null default '';

/* Mudar nome da Coluna */
alter table pessoas
    change column profissao prof varchar(20);

/* Mudar nome da Tabela */
alter table pessoas
    rename to people;

/* Deletar Tabela */
drop table pessoas;

/* ----------------------------------------------- */

create table if not exists cursos
(
    nome      varchar(30) not null unique,
    descricao text,
    carga     int unsigned,
    totaulas  int unsigned,
    ano       year default '2021'
) default charset = utf8;

alter table cursos
    add column idcurso int first;

alter table cursos
    add primary key (idcurso);

insert into cursos
values ('1', 'HTML4', 'Curso de HTML5', '40', '37', '2014'),
       ('2', 'Algoritmos', 'Lógica de Programação', '20', '15', '2014'),
       ('3', 'Photoshop', 'Dicas de Photoshop CC', '10', '8', '2014'),
       ('4', 'PGP', 'Curso de PHP para iniciantes', '40', '8', '2010'),
       ('5', 'Jarva', 'Introdução à Linguagem Java', '10', '29', '2000'),
       ('6', 'MySQL', 'Bancos de Dados MySQL', '30', '15', '2016'),
       ('7', 'Word', 'Curso completo de Word', '40', '30', '2016'),
       ('8', 'Sapateado', 'Danças Rítmicas', '40', '30', '2018'),
       ('9', 'Cozinha Árabe', 'Aprende a fazer Kibe', '40', '30', '2018'),
       ('10', 'Youtuber', 'Gerar polêmica a ganhar inscritos', '5', '2', '2018');

select *
from cursos;

/* Manipulando Linhas */
update cursos
set nome = 'HTML5'
where idcurso = '1';

update cursos
set nome = 'PHP',
    ano  = '2015'
where idcurso = '4';

update cursos
set nome  = 'Java',
    carga = '40',
    ano   = '2015'
where idcurso = '5'
limit 1;

/* Apagar Linhas */
delete
from cursos
where ano = '2018'
limit 3;

/* Apagar Todas as Linhas */
truncate cursos;

/* Comando Select */
select ano, nome, carga
from cursos
order by ano, nome;

select nome, descricao, ano
from cursos
where ano <= 2016
order by ano, nome;

select nome, ano
from cursos
where ano between 2014 and 2016
order by ano desc, totaulas;

select nome, descricao, ano
from cursos
where ano in (2014, 2016, 2020)
order by ano;

select nome, carga, totaulas
from cursos
where carga > 35
  and totaulas < 30;

select distinct nacionalidade
from gafanhotos
order by nacionalidade;

-- Utilizando Like
select *
from cursos
where nome like 'P%';

select *
from cursos
where nome like '%A';

select *
from cursos
where nome not like '%A%';

select *
from cursos
where nome like 'ph%p';

select *
from cursos
where nome like 'p__t%';

select *
from gafanhotos
where nome like '%silva%';

-- Usando Funções de Agregação
select count(*) quantidade
from cursos
where carga > 40;

select max(totaulas) maxAulas
from cursos
where ano = '2016';

select min(totaulas) minAulas
from cursos
where ano = '2016';

select sum(totaulas) somaAulas
from cursos
where ano = '2016';

select avg(totaulas) mediaAulas
from cursos
where ano = '2016';

select carga, count(nome)
from cursos
group by carga;

select distinct carga
from cursos
order by carga;

select ano, count(*)
from cursos
where totaulas > 30
group by ano
having ano > 2013
order by count(*) desc;

select avg(carga)
from cursos;

select carga, count(*)
from cursos
where ano > 2015
group by carga
having carga > (select avg(carga) from cursos);

-- Adicionando Foreign Keys
describe gafanhotos;
alter table gafanhotos
    add cursopreferido int;

alter table gafanhotos
    add foreign key (cursopreferido)
        references cursos (idcurso);

update gafanhotos
set gafanhotos.cursopreferido = '6'
where id = '1';

-- Utilizando Join
select g.nome, c.nome, c.ano
from gafanhotos as g
         inner join cursos as c on g.cursopreferido = c.idcurso
order by g.nome;

select g.nome, c.nome, c.ano
from gafanhotos as g
         left join cursos c on g.cursopreferido = c.idcurso;

select g.nome, c.nome, c.ano
from gafanhotos as g
         right join cursos c on c.idcurso = g.cursopreferido;

-- Criando Tabela Extra
create table gafanhoto_assiste_curso
(
    id      int not null auto_increment,
    data    date,
    idgaf   int,
    idcurso int,
    primary key (id),
    foreign key (idgaf) references gafanhotos (id),
    foreign key (idcurso) references cursos (idcurso)
) default charset = utf8;

insert into gafanhoto_assiste_curso
values (default, '2014-03-01', '1', '2'),
       (default, '2015-12-22', '3', '6');

select *
from gafanhoto_assiste_curso;

-- Junções
select g.nome, c.nome
from gafanhotos g
         join gafanhoto_assiste_curso a
              on g.id = a.idgaf
         join cursos c
              on c.idcurso = a.idcurso
order by g.nome;