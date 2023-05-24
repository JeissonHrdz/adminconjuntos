-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2023 a las 00:53:43
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adminconjuntos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `personaId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areacomun`
--

CREATE TABLE `areacomun` (
  `areacomunID` int(10) NOT NULL,
  `nombre` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areacomun`
--

INSERT INTO `areacomun` (`areacomunID`, `nombre`) VALUES
(1, 'SALON DE EVENTOS'),
(2, 'CANCHA DE FUTBOL'),
(3, 'CANCHA DE BALONCESTO'),
(4, 'ZONA DE ASADOS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conjunto`
--

CREATE TABLE `conjunto` (
  `conjuntoID` int(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `direccion` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencia`
--

CREATE TABLE `incidencia` (
  `incidenciaID` int(10) NOT NULL,
  `personaID` int(10) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  `estado` varchar(20) NOT NULL,
  `conjuntoID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `pagoID` int(10) NOT NULL,
  `propiedadID` int(10) NOT NULL,
  `valor` float NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `estado` varchar(10) NOT NULL,
  `tipoPagoID` int(10) NOT NULL,
  `personaID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `personaID` int(10) NOT NULL,
  `numeroDocumento` varchar(10) NOT NULL,
  `primerNombre` varchar(15) NOT NULL,
  `segundoNombre` varchar(15) DEFAULT NULL,
  `primerApellido` varchar(15) NOT NULL,
  `segundoApellido` varchar(15) DEFAULT NULL,
  `password` varchar(30) NOT NULL,
  `conjuntoID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad`
--

CREATE TABLE `propiedad` (
  `propiedadID` int(10) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fechaConstruccion` varchar(30) NOT NULL,
  `tamaño` varchar(30) NOT NULL,
  `conjuntoId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedades`
--

CREATE TABLE `propiedades` (
  `personaID` int(10) NOT NULL,
  `propiedadID` int(10) NOT NULL,
  `residenteID` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `personaId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `reservaID` int(10) NOT NULL,
  `areacomunID` int(10) NOT NULL,
  `personaID` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `residente`
--

CREATE TABLE `residente` (
  `personaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopago`
--

CREATE TABLE `tipopago` (
  `tipoPagoID` int(10) NOT NULL,
  `nombre` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipopago`
--

INSERT INTO `tipopago` (`tipoPagoID`, `nombre`) VALUES
(1, 'Administración'),
(2, 'Mantenimiento'),
(3, 'Servicio Public'),
(4, 'Extraordinario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `personaID` int(10) NOT NULL,
  `cargo` varchar(10) NOT NULL,
  `sueldo` float NOT NULL,
  `horasTrabajo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitante`
--

CREATE TABLE `visitante` (
  `visitanteID` int(10) NOT NULL,
  `numeroDocumento` varchar(30) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaIngreso` timestamp NOT NULL DEFAULT current_timestamp(),
  `motivoIngreso` varchar(100) NOT NULL,
  `conjuntoID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`personaId`);

--
-- Indices de la tabla `areacomun`
--
ALTER TABLE `areacomun`
  ADD PRIMARY KEY (`areacomunID`);

--
-- Indices de la tabla `conjunto`
--
ALTER TABLE `conjunto`
  ADD PRIMARY KEY (`conjuntoID`);

--
-- Indices de la tabla `incidencia`
--
ALTER TABLE `incidencia`
  ADD PRIMARY KEY (`incidenciaID`),
  ADD KEY `personaID` (`personaID`),
  ADD KEY `conjuntoID` (`conjuntoID`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`pagoID`),
  ADD KEY `personaID` (`personaID`),
  ADD KEY `tipoPagoID` (`tipoPagoID`),
  ADD KEY `propiedadID` (`propiedadID`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`personaID`),
  ADD KEY `conjuntoID_2` (`conjuntoID`);

--
-- Indices de la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD PRIMARY KEY (`propiedadID`,`conjuntoId`),
  ADD KEY `conjuntoId` (`conjuntoId`);

--
-- Indices de la tabla `propiedades`
--
ALTER TABLE `propiedades`
  ADD PRIMARY KEY (`personaID`,`propiedadID`),
  ADD KEY `propiedadID` (`propiedadID`),
  ADD KEY `residenteID` (`residenteID`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`personaId`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`reservaID`),
  ADD KEY `areacomunID` (`areacomunID`,`personaID`),
  ADD KEY `personaID` (`personaID`);

--
-- Indices de la tabla `residente`
--
ALTER TABLE `residente`
  ADD PRIMARY KEY (`personaID`),
  ADD KEY `personaID` (`personaID`);

--
-- Indices de la tabla `tipopago`
--
ALTER TABLE `tipopago`
  ADD PRIMARY KEY (`tipoPagoID`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`personaID`);

--
-- Indices de la tabla `visitante`
--
ALTER TABLE `visitante`
  ADD PRIMARY KEY (`visitanteID`),
  ADD KEY `conjuntoID` (`conjuntoID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `areacomun`
--
ALTER TABLE `areacomun`
  MODIFY `areacomunID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `conjunto`
--
ALTER TABLE `conjunto`
  MODIFY `conjuntoID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `incidencia`
--
ALTER TABLE `incidencia`
  MODIFY `incidenciaID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `pagoID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `personaID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `propiedad`
--
ALTER TABLE `propiedad`
  MODIFY `propiedadID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `reservaID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `tipopago`
--
ALTER TABLE `tipopago`
  MODIFY `tipoPagoID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `visitante`
--
ALTER TABLE `visitante`
  MODIFY `visitanteID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`personaId`) REFERENCES `persona` (`personaID`);

--
-- Filtros para la tabla `incidencia`
--
ALTER TABLE `incidencia`
  ADD CONSTRAINT `incidencia_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `persona` (`personaID`),
  ADD CONSTRAINT `incidencia_ibfk_2` FOREIGN KEY (`conjuntoID`) REFERENCES `conjunto` (`conjuntoID`);

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `propietario` (`personaId`),
  ADD CONSTRAINT `pago_ibfk_2` FOREIGN KEY (`tipoPagoID`) REFERENCES `tipopago` (`tipoPagoID`),
  ADD CONSTRAINT `pago_ibfk_3` FOREIGN KEY (`propiedadID`) REFERENCES `propiedad` (`propiedadID`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`conjuntoID`) REFERENCES `conjunto` (`conjuntoID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD CONSTRAINT `propiedad_ibfk_1` FOREIGN KEY (`conjuntoId`) REFERENCES `conjunto` (`conjuntoID`) ON DELETE CASCADE;

--
-- Filtros para la tabla `propiedades`
--
ALTER TABLE `propiedades`
  ADD CONSTRAINT `propiedades_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `propietario` (`personaId`),
  ADD CONSTRAINT `propiedades_ibfk_2` FOREIGN KEY (`propiedadID`) REFERENCES `propiedad` (`propiedadID`),
  ADD CONSTRAINT `propiedades_ibfk_3` FOREIGN KEY (`residenteID`) REFERENCES `residente` (`personaID`);

--
-- Filtros para la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD CONSTRAINT `propietario_ibfk_1` FOREIGN KEY (`personaId`) REFERENCES `persona` (`personaID`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `persona` (`personaID`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`areacomunID`) REFERENCES `areacomun` (`areacomunID`);

--
-- Filtros para la tabla `residente`
--
ALTER TABLE `residente`
  ADD CONSTRAINT `residente_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `persona` (`personaID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `trabajador_ibfk_1` FOREIGN KEY (`personaID`) REFERENCES `persona` (`personaID`);

--
-- Filtros para la tabla `visitante`
--
ALTER TABLE `visitante`
  ADD CONSTRAINT `visitante_ibfk_1` FOREIGN KEY (`conjuntoID`) REFERENCES `conjunto` (`conjuntoID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
