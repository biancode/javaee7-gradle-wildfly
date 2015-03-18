-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 16. März 2015
-- Server Version: 5.0.51
-- PHP-Version: 5.3.3-7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `wildflytest`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `security`
--

CREATE TABLE IF NOT EXISTS `security` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) default NULL,
  `tenantid` int(11) default '0',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Daten für Tabelle `security`
--

INSERT INTO `security` (`id`, `name`, `password`, `role`, `tenantid`) VALUES
(1, 'admin', 'admin', 'admin', 0),
(2, 'sudo', 'sudoadmin', 'superuser', 0),
(3, 'user', 'user', 'user', 0);
