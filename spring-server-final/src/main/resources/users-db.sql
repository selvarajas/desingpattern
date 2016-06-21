-- Dumping database structure for userdb
CREATE DATABASE IF NOT EXISTS `integration` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `integration`;

-- Dumping structure for table userdb.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` varchar(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
