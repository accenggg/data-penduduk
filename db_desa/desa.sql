-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Nov 2022 pada 15.36
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `desa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_penduduk`
--

CREATE TABLE `data_penduduk` (
  `nik` char(13) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `gender` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_penduduk`
--

INSERT INTO `data_penduduk` (`nik`, `nama`, `tgl_lahir`, `gender`) VALUES
('0000000000001', 'Michael Arselius R', '2004-09-02', 'L'),
('0000000000002', 'Muhammad Putra W', '2003-09-09', 'L'),
('0000000000003', 'Rezky Putra Kurniawan', '2002-07-16', 'L'),
('0000000000004', 'Christina Febrianti T', '2003-03-03', 'P'),
('0000000000006', 'Kevin Sanjaya Louis', '2003-04-05', 'L'),
('0000000000007', 'Riyandi', '2003-06-26', 'L'),
('0000000000008', 'Muhammad Aisyar Dafin', '2003-05-23', 'L'),
('0000000000010', 'Muhammad Raza Dafa', '2003-11-03', 'L'),
('0000000000011', 'Bang Richan', '1945-08-17', 'L'),
('0000000000013', 'Eggy Brilian', '2003-09-23', 'L');

-- --------------------------------------------------------

--
-- Struktur dari tabel `info_desa`
--

CREATE TABLE `info_desa` (
  `id_kegiatan` varchar(10) NOT NULL,
  `nama_kegiatan` varchar(50) NOT NULL,
  `desk_singkat` varchar(150) NOT NULL,
  `tgl_upload` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `info_desa`
--

INSERT INTO `info_desa` (`id_kegiatan`, `nama_kegiatan`, `desk_singkat`, `tgl_upload`) VALUES
('KGT1', 'Bantuan Subsidi Upah', 'Bantuan ini untuk pekerja/buruh sebesar Rp.600.000', '2022-10-25'),
('KGT2', 'Program Keluarga Harapan', 'Bantuan sosial ini diperuntukkan untuk Keluarga Miskin (KM)', '2022-10-13'),
('KGT3', 'BLT Masyarakat', 'Bantuan ini untuk warga miskin yang terdampak covid-19', '2022-01-10'),
('KGT4', 'Sosialisasi Covid-19', 'Kegiatan ini membahas cara bertahan hidup di era pandemi', '2022-10-23'),
('KGT5', 'Kartu Prakerja', 'program bantuan pelatihan untuk meningkatkan kompetensi angkatan kerja', '2022-04-10'),
('KGT6', 'Bantuan Pokok Nontunai', 'Bantuan ini berupa voucher belanja atau sembako', '2022-08-10'),
('KGT7', 'BLT BBM', 'Bantuan ini untuk melindungi daya beli karena kenaikan BBM', '2022-07-10'),
('KGT8', 'BLT Dana Desa', 'Bantuan ini untuk warga yang kurang mampu dan belum tersentuh bantuan dari pusat', '2022-11-11'),
('KGT9', 'BLT Dana Desa', 'Bantuan ini untuk warga yang kurang mampu dan belum tersentuh bantuan dari pusat', '2022-11-16');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_penduduk`
--
ALTER TABLE `data_penduduk`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `info_desa`
--
ALTER TABLE `info_desa`
  ADD PRIMARY KEY (`id_kegiatan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
