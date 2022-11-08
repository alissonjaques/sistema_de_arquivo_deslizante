CREATE SCHEMA arquivo_deslizante;
CREATE TABLE `caixa` (
import React from 'react';function ListaDeRepositorios() {  return (   <ul>    <li>Curso da Alura - HTML e CSS</li>    <li>Curso da Alura - React</li>    <li>Curso da Alura - Manipulando DOM com JS</li>   </ul>  );}export default ListaDeRepositorios;
  `id_caixa` int(11) NOT NULL,
  `rua` int(11) NOT NULL,
  `avenida` int(11) NOT NULL,
  `predio` int(11) NOT NULL,
  `andar` int(11) NOT NULL,
  `apartamento` int(11) NOT NULL,
  PRIMARY KEY (`id_caixa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `documento` (
  `id_documento` int(11) NOT NULL AUTO_INCREMENT,
  `ordem` int(11) NOT NULL,
  `id_nome_dos_campos` int(11) NOT NULL,
  `id_valores_dos_campos` int(11) NOT NULL,
  `id_caixa` int(11) NOT NULL,
  `data_ultima_alteracao` datetime NOT NULL,
  `usuario_ultima_alteracao` varchar(450) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id_documento`),
  KEY `id_caixa_idx` (`id_caixa`),
  KEY `id_valores_dos_campos_idx` (`id_valores_dos_campos`),
  KEY `id_nome_dos_campos_idx` (`id_nome_dos_campos`),
  CONSTRAINT `id_caixa` FOREIGN KEY (`id_caixa`) REFERENCES `caixa` (`id_caixa`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_nome_dos_campos` FOREIGN KEY (`id_nome_dos_campos`) REFERENCES `nome_dos_campos` (`id_nome_dos_campos`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_valores_dos_campos` FOREIGN KEY (`id_valores_dos_campos`) REFERENCES `valores_dos_campos` (`id_valores_dos_campos`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4

CREATE TABLE `nome_dos_campos` (
  `id_nome_dos_campos` int(11) NOT NULL AUTO_INCREMENT,
  `numero_identificacao` int(11) NOT NULL,
  `nome` varchar(450) NOT NULL,
  `nome1` varchar(450) NOT NULL DEFAULT 'Informação Complementar 1',
  `nome2` varchar(450) NOT NULL DEFAULT 'Informação Complementar 2',
  `nome3` varchar(450) NOT NULL DEFAULT 'Informação Complementar 3',
  `nome4` varchar(450) NOT NULL DEFAULT 'Informação Complementar 4',
  `nome5` varchar(450) NOT NULL DEFAULT 'Informação Complementar 5',
  `nome6` varchar(450) NOT NULL DEFAULT 'Informação Complementar 6',
  `nome7` varchar(450) NOT NULL DEFAULT 'Informação Complementar 7',
  PRIMARY KEY (`id_nome_dos_campos`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(450) NOT NULL,
  `nome_de_usuario` varchar(450) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `perfil` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4

CREATE TABLE `valores_dos_campos` (
  `id_valores_dos_campos` int(11) NOT NULL AUTO_INCREMENT,
  `valor1` varchar(450) NOT NULL,
  `valor2` varchar(450) NOT NULL,
  `valor3` varchar(450) NOT NULL,
  `valor4` varchar(450) NOT NULL,
  `valor5` varchar(450) NOT NULL,
  `valor6` varchar(450) NOT NULL,
  `valor7` varchar(450) NOT NULL,
  PRIMARY KEY (`id_valores_dos_campos`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4

CREATE DEFINER=`root`@`%` PROCEDURE `consulta_documentos_pr`(tipo_documental varchar(450), valor int, conteudo varchar(450))
BEGIN
	IF valor = 1 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor1 like conteudo;
	ELSEIF valor = 2 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor2 like conteudo;
	ELSEIF valor = 3 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor3 like conteudo;
	ELSEIF valor = 4 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor4 like conteudo;
	ELSEIF valor = 5 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor5 like conteudo;
	ELSEIF valor = 6 THEN
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor6 like conteudo;
	ELSE
		select documento.ordem,
		documento.data_ultima_alteracao,
		documento.usuario_ultima_alteracao,
		documento.status,
		caixa.id_caixa,
		caixa.rua,
		caixa.avenida,
		caixa.predio,
		caixa.andar,
		caixa.apartamento,
		nome_dos_campos.nome,
		nome_dos_campos.nome1,
		nome_dos_campos.nome2,
		nome_dos_campos.nome3,
		nome_dos_campos.nome4,
		nome_dos_campos.nome5,
		nome_dos_campos.nome6,
		nome_dos_campos.nome7,
		valores_dos_campos.valor1,
		valores_dos_campos.valor2,
		valores_dos_campos.valor3,
		valores_dos_campos.valor4,
		valores_dos_campos.valor5,
		valores_dos_campos.valor6,
		valores_dos_campos.valor7
		from documento inner join nome_dos_campos
		on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
		inner join valores_dos_campos
		on documento.id_valores_dos_campos = valores_dos_campos.id_valores_dos_campos
		inner join caixa
		on documento.id_caixa = caixa.id_caixa
		where nome_dos_campos.nome = tipo_documental 
		and valores_dos_campos.valor7 like conteudo;
	END IF;	
END

CREATE DEFINER=`root`@`%` PROCEDURE `is_registros_pr`(nome_tipo_documental varchar(450))
BEGIN
	select count(*) from documento
	inner join nome_dos_campos
	on documento.id_nome_dos_campos = nome_dos_campos.id_nome_dos_campos
	where nome_dos_campos.nome = nome_tipo_documental;
END