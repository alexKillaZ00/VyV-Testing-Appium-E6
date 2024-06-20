-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 23, 2023 at 06:16 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistemadnj`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `configuracion`
--

DROP TABLE IF EXISTS `configuracion`;
CREATE TABLE IF NOT EXISTS `configuracion` (
  `idConfiguracion` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEstablecimiento` varchar(40) NOT NULL,
  `Mensaje` varchar(30) NOT NULL,
  PRIMARY KEY (`idConfiguracion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `configuracion`
--

INSERT INTO `configuracion` (`idConfiguracion`, `nombreEstablecimiento`, `Mensaje`) VALUES
(1, 'Nombre establecimiento', 'Gracias por su preferencia!!');

-- --------------------------------------------------------

--
-- Table structure for table `detalleventasaux`
--

DROP TABLE IF EXISTS `detalleventasaux`;
CREATE TABLE IF NOT EXISTS `detalleventasaux` (
  `idDetalleVentasAux` int(11) NOT NULL AUTO_INCREMENT,
  `codigoBarra` varchar(30) NOT NULL,
  `nombreProducto` varchar(45) NOT NULL,
  `cantidadProducto` int(11) NOT NULL,
  `precioCosto` float NOT NULL,
  `precioVenta` float NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) DEFAULT NULL,
  PRIMARY KEY (`idDetalleVentasAux`),
  KEY `idVenta_FOREINGKey` (`idVenta`),
  KEY `idProducto_FOREINGKey` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigoBarra` varchar(30) NOT NULL,
  `nombreProducto` varchar(45) NOT NULL,
  `descripcion` tinytext,
  `cantidadInv` int(11) NOT NULL,
  `cantidadMin` int(11) NOT NULL,
  `precioCosto` float NOT NULL,
  `precioVenta` float NOT NULL,
  `idCategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  UNIQUE KEY `codigoBarra_UNIQUE` (`codigoBarra`),
  KEY `idCategoria_FOREINGKey` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `tipo` enum('Administrador','Empleado') NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `UQ_NombreUsuario` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `contraseña`, `tipo`) VALUES
(1, 'admin', '1', 'Administrador');

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `idVentas` int(11) NOT NULL AUTO_INCREMENT,
  `numeroVenta` int(11) NOT NULL,
  `fechaVenta` date NOT NULL,
  `horaVenta` time NOT NULL,
  `pagoVenta` float NOT NULL,
  `montoVenta` float NOT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVentas`),
  UNIQUE KEY `NumeroVenta_UNIQUE` (`numeroVenta`),
  KEY `idUsuario_FOREINGKey` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detalleventasaux`
--
ALTER TABLE `detalleventasaux`
  ADD CONSTRAINT `idProducto_FOREINGKey` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE SET NULL,
  ADD CONSTRAINT `idVenta_FOREINGKey` FOREIGN KEY (`idVenta`) REFERENCES `ventas` (`idVentas`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `idCategoria_FOREINGKey` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Constraints for table `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `idUsuario_FOREINGKey` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
