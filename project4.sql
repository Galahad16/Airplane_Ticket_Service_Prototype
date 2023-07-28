-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2022 at 10:37 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project4`
--

-- --------------------------------------------------------

--
-- Table structure for table `cancellation`
--

CREATE TABLE `cancellation` (
  `pnr_no` varchar(15) NOT NULL,
  `cancellation_no` varchar(15) NOT NULL,
  `cancellation_date` varchar(30) NOT NULL,
  `flight_code` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flight_code` varchar(15) NOT NULL,
  `flight_name` varchar(30) NOT NULL,
  `departure` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flight_code`, `flight_name`, `departure`, `destination`) VALUES
                     ('f1005', 'flight 1005', 'Philippines', 'United States');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `email` varchar(128) NOT NULL,
  `password` v(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`email`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `pnr_no` varchar(30) NOT NULL,
  `address` varchar(512) NOT NULL,
  `nationality` varchar(2) NOT NULL,
  `name` varchar(128) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `passport_no` varchar(15) NOT NULL,
  `flight_code` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`pnr_no`, `address`, `nationality`, `name`, `gender`, `phone`, `passport_no`, `fl_code`)
VALUES                  ('11', 'Negros Occidental, Philippines', 'Filipino', '', 'male', '09272777334', 'SAR081119', 'f1005');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `pnr_no` varchar(30) NOT NULL,
  `phone_no` varchar(30) NOT NULL,
  `cheque_no` varchar(30) NOT NULL,
  `card_no` varchar(30) NOT NULL,
  `paid_amt` varchar(30) NOT NULL,
  `pay_date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`pnr_no`, `ph_no`, `cheque_no`, `card_no`, `paid_amt`, `pay_date`)
 VALUES               ('11', '09272777334', '1222', '121-121', '1000', '2022-05-05');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `pnr_no` varchar(30) NOT NULL,
  `ticket_id` varchar(30) NOT NULL,
  `flight_code` varchar(30) NOT NULL,
  `dep_date` varchar(30) NOT NULL,
  `dep_time` varchar(30) NOT NULL,
  `departure` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`pnr_no`, `ticket_id`, `flight_code`, `dep_date`, `dep_time`, `departure`, `destination`)
VALUES                        ('11', '111', 'f1005', '2022-05-05', '1:00 PM', 'Philippines', 'United States');

-- --------------------------------------------------------

--
-- Table structure for table `sector`
--

CREATE TABLE `sector` (
  `flight_code` varchar(30) NOT NULL,
  `capacity` varchar(30) NOT NULL,
  `class_code` varchar(30) NOT NULL,
  `class_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sector`
--

INSERT INTO `sector` (`flight_code`, `capacity`, `class_code`, `class_name`) VALUES
('f1005', '500', 'A', 'FIRST CLASS'),
('f1005', '500', 'B', 'BUSINESS CLASS'),
('f1005', '500', 'C', 'ECONOMY');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
