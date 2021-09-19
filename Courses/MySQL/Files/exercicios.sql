-- 1 - Uma lista com o nome de todas as mulheres
select nome
from gafanhotos
where sexo = 'F';

-- 2 - Uma lista com os dados de todos aqueles que nasceram entre 01-01-2000 e 31-12-2015
select *
from gafanhotos
where nascimento between '2000-01-01' and '2015-12-31'
order by nascimento;

-- 3 - Uma lista com o nome de todos os homens que trabalham como Programadores
select *
from gafanhotos
where sexo = 'M'
  and profissao = 'Programador';

-- 4 - Uma lista com todos os dados de todas as mulheres que nasceram no Brasil e que têm seu nome iniciando com a letra J
select *
from gafanhotos
where sexo = 'F'
  and nacionalidade = 'Brasil'
  and nome like 'J%';

-- 5 - Uma lista com o nome e nacionalidade de todos os homens que têm Silva no nome, não nasceram no Brasil e pesam menos de 100 Kg
select nome, nacionalidade
from gafanhotos
where nome like '%silva%'
  and nacionalidade <> 'Brasil'
  and peso < '100';

-- 6 - Qual é a maior altura entre gafanhotos homens que moram no Brasil?
select max(altura)
from gafanhotos
where sexo = 'M'
  and nacionalidade = 'Brasil';

-- 7 - Qual é a média de peso das pessoas cadastradas?
select avg(peso)
from gafanhotos;

-- 8 - Qual é o menor peso entre as mulheres que nasceram fora do Brasil e entre 01-01-1990 e 31-12-2000?
select min(peso)
from gafanhotos
where sexo = 'F'
  and nacionalidade <> 'Brasil'
  and nascimento between '1990-01-01' and '2000-12-31';

-- 9 - Quantas mulheres têm mais de 1.90m de altura?
select count(id)
from gafanhotos
where sexo = 'F'
  and altura > '1.90';

-- 10 - Uma lista com as profissões das pessoas e seus respectivos quantitativos
select profissao, count(id)
from gafanhotos
group by profissao;

-- 11 - Quantos homens e quantas mulheres nasceram depois de 01-01-2005?
select count(id), sexo
from gafanhotos
where nascimento > '2005-01-01'
group by sexo;

/* 12 - Uma lista com as pessoas que nasceram fora do Brasil, mostrando o país de origem
   e o total de pessoas nascidas lá. Só nos interessam os países que tiverem mais de
   3 pessoas com essa nacionalidade */
select nacionalidade, count(id)
from gafanhotos
where nacionalidade <> 'Brasil'
group by nacionalidade
having count(id) > 3;

/* 13 - Uma lista agrupada pela altura das pessoas, mostrando quantas pessoas pesam
   mais de 100Kg e que estão acima da média de altura de todos os cadastrados */
select altura, count(*)
from gafanhotos
where peso > '100'
group by altura
having altura > (select avg(altura) from gafanhotos);