CREATE DATABASE QuanLyNhanVien;
USE QuanLyNhanVien;
CREATE TABLE hoadon (
    `Mã hóa đơn` INT AUTO_INCREMENT NOT NULL,
    `Tên khách hàng` VARCHAR(50) NULL,
    `Địa chỉ` VARCHAR(50) NULL,
    `Số điện thoại` VARCHAR(50) NULL,
    `Ngày đặt` VARCHAR(50) NULL,
    `Thành tiền` INT NULL,
    PRIMARY KEY (`Mã hóa đơn`)
);
CREATE TABLE tbinhnhanvien (
    `Id` INT AUTO_INCREMENT NOT NULL,
    `Mã nhân viên` VARCHAR(50) NULL,
    `Name` VARCHAR(50) NULL,
    `Chức vụ` VARCHAR(50) NULL,
    `Ngày sinh` VARCHAR(50) NULL,
    `Giới tính` VARCHAR(50) NULL,
    `Địa chỉ` VARCHAR(50) NULL,
    `Số điện thoại` VARCHAR(50) NULL,
    `Lương` INT NULL,
    PRIMARY KEY (`Id`)
);
CREATE TABLE tbsanpham (
    `Id` INT AUTO_INCREMENT NOT NULL,
    `Mã sản phẩm` VARCHAR(50) NULL,
    `Tên sản phẩm` VARCHAR(50) NULL,
    `Loại` VARCHAR(50) NULL,
    `Số lượng` INT NULL,
    `Giá` INT NULL,
    PRIMARY KEY (`Id`)
);
CREATE TABLE tbsanphamct (
    `Id` INT AUTO_INCREMENT NOT NULL,
    `Mã sản phẩm` VARCHAR(50) NULL,
    `Số lượng` INT NULL,
    `Giá` INT NULL,
    PRIMARY KEY (`Id`)
);
INSERT INTO hoadon (`Tên khách hàng`, `Địa chỉ`, `Số điện thoại`, `Ngày đặt`, `Thành tiền`) 
VALUES
('Nguyễn Văn A', 'Hà Nội', '0123456789', '2024-12-19', 1000000),
('Trần Thị B', 'TP.HCM', '0987654321', '2024-12-18', 2000000);

INSERT INTO tbinhnhanvien (`Mã nhân viên`, `Name`, `Chức vụ`, `Ngày sinh`, `Giới tính`, `Địa chỉ`, `Số điện thoại`, `Lương`) 
VALUES
('NV001', 'Nguyễn Văn A', 'Quản lý', '12/05/1998', 'Nam', 'Hà Nội', '0123456789', 15000000),
('NV002', 'Trần Thị B', 'Nhân viên', '12/12/2000', 'Nữ', 'TP.HCM', '0987654321', 12000000);

INSERT INTO tbsanpham (`Mã sản phẩm`, `Tên sản phẩm`, `Loại`, `Số lượng`, `Giá`) 
VALUES
('SP001', 'Laptop', 'Điện tử', 10, 15000000),
('SP002', 'Điện thoại', 'Điện tử', 20, 8000000);

INSERT INTO tbsanphamct (`Mã sản phẩm`, `Số lượng`, `Giá`) 
VALUES
('SP001', 5, 15000000),
('SP002', 10, 8000000);






