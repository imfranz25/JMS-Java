-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: May 19, 2019 at 09:12 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `userid` varchar(200) NOT NULL,
  `usertype` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `userid`, `usertype`, `bmon`, `bdate`, `byear`, `username`, `password`) VALUES
(6, 'Francis Ong', '12312521', 'Admin', 'May', '13', '2000', 'francis25', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `cell1`
--

DROP TABLE IF EXISTS `cell1`;
CREATE TABLE IF NOT EXISTS `cell1` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob NOT NULL,
  `cell` varchar(25) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cell2`
--

DROP TABLE IF EXISTS `cell2`;
CREATE TABLE IF NOT EXISTS `cell2` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob,
  `cell` varchar(25) NOT NULL DEFAULT '2',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cell3`
--

DROP TABLE IF EXISTS `cell3`;
CREATE TABLE IF NOT EXISTS `cell3` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob,
  `cell` varchar(25) NOT NULL DEFAULT '3',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cell4`
--

DROP TABLE IF EXISTS `cell4`;
CREATE TABLE IF NOT EXISTS `cell4` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob,
  `cell` varchar(25) NOT NULL DEFAULT '4',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cell5`
--

DROP TABLE IF EXISTS `cell5`;
CREATE TABLE IF NOT EXISTS `cell5` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob,
  `cell` varchar(25) NOT NULL DEFAULT '5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `retrieve`
--

DROP TABLE IF EXISTS `retrieve`;
CREATE TABLE IF NOT EXISTS `retrieve` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `bmon` varchar(200) NOT NULL,
  `bdate` varchar(200) NOT NULL,
  `byear` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `sex` varchar(200) NOT NULL,
  `emon` varchar(200) NOT NULL,
  `edate` varchar(200) NOT NULL,
  `eyear` varchar(200) NOT NULL,
  `rmon` varchar(200) NOT NULL,
  `rdate` varchar(200) NOT NULL,
  `ryear` varchar(200) NOT NULL,
  `level` varchar(200) NOT NULL,
  `cases` varchar(200) NOT NULL,
  `dura` varchar(200) NOT NULL,
  `stat` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `atty` varchar(200) NOT NULL,
  `photo` longblob,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `warden`
--

DROP TABLE IF EXISTS `warden`;
CREATE TABLE IF NOT EXISTS `warden` (
  `id` int(25) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warden`
--

INSERT INTO `warden` (`id`, `username`, `password`) VALUES
(1, 'warden', '12345');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
