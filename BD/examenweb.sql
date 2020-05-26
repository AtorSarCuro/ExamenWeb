-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2020 a las 17:15:55
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examenweb`
--
CREATE DATABASE IF NOT EXISTS `examenweb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `examenweb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `username` varchar(20) COLLATE utf8_bin NOT NULL,
  `password` varchar(600) COLLATE utf8_bin NOT NULL,
  `name` varchar(80) COLLATE utf8_bin NOT NULL,
  `email` varchar(80) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`username`, `password`, `name`, `email`) VALUES
('0', '$2a$10$330Ce1rmWygbuw1xzEOV5.cd5zDdZtJKr22RrGGrjADA1LfCArJqu', 'ator', 'ator2@mail.com'),
('ator', '$2a$10$X5A6NZrQ8V/v8epE6DW9h.KFnskBZK/yg3QX5rfNJXuAuh6RFmEW2', 'oscar arturo cruz simon', 'hoscaracsh@gmail.com'),
('sofi', '$2a$10$LpZSgtB.GWDsIwpQAdFMn.Pj7QRlO7B5RkeVv/kH/kaFzXNVMYlii', 'Sofia Isabel', 'sofiaisabel@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
