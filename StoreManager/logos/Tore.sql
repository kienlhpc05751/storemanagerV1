Create database Tore
go 
use Tore
go
create table khachhang(
    MaKH  Int primary key,
 TenKH nvarchar(15) not null,
 Email nvarchar(50) not null,
 Phone nvarchar(20) not null,
 DiaChi nvarchar(100) not null,
);
create table nhanvien(
    MaNV  nvarchar(5)primary key not null,
 TenNV nvarchar(30) not null,
 Matkhau nvarchar(30) not null,
 NgaySinh date ,
 Email nvarchar(50) not null,
 Phone nvarchar(20) not null,
 vaiTro bit not null,
 Hinh nvarchar(50) not null,
);
create table hoadon(
    MaHD nvarchar(10) primary key ,
 MaKH int ,
 MaNV nvarchar(5),
 NgayTao Date,
 --Tong float ,
);
create table hoadonchitiet(
    MaHDCT nvarchar(10) primary key,
 MaHD nvarchar(10),
 MaSP nvarchar(10),
    SoLuong int,
 ghiChu nvarchar(100) not null,
 MaGG nvarchar(10),
 thanhTien float,
);
create table magiamgia(
    MaGG nvarchar(10) primary key,
 GiaGiam int,
);

create table sanpham(
    MaSP nvarchar(10) primary key,
 TenSP nvarchar(50) not null,
 MaLoai nvarchar(10) not null,
 MoTa nvarchar(100) not null,
 Soluong int ,
);

create table Loaisanpham(
    Maloai nvarchar(10) primary key,
 TenLoai  nvarchar(50) not null,
);
create table chitietsanpham(
    MaCT nvarchar(10) primary key,
 TenLoai nvarchar(30) not null,
 MauSP nvarchar(30) not null,
 GiaSP float ,
 HinhSP nvarchar(100) not null,
 MaSP  nvarchar(10),
);


use Tore
go

-- Adding foreign key relationship between khachhang and hoadon
alter table hoadon
add constraint FK_hoadon_khachhang
foreign key (MaKH) references khachhang(MaKH);

-- Adding foreign key relationship between nhanvien and hoadon
alter table hoadon
add constraint FK_hoadon_nhanvien
foreign key (MaNV) references nhanvien(MaNV);

-- Adding foreign key relationship between hoadonchitiet and hoadon
alter table hoadonchitiet
add constraint FK_hoadonchitiet_hoadon
foreign key (MaHD) references hoadon(MaHD);

-- Adding foreign key relationship between hoadonchitiet and sanpham
alter table hoadonchitiet
add constraint FK_hoadonchitiet_sanpham
foreign key (MaSP) references sanpham(MaSP);

-- Adding foreign key relationship between hoadonchitiet and magiamgia
alter table hoadonchitiet
add constraint FK_hoadonchitiet_magiamgia
foreign key (MaGG) references magiamgia(MaGG);

-- Adding foreign key relationship between sanpham and Loaisanpham
alter table sanpham
add constraint FK_sanpham_Loaisanpham
foreign key (MaLoai) references Loaisanpham(Maloai);

-- Adding foreign key relationship between chitietsanpham and sanpham
alter table chitietsanpham
add constraint FK_chitietsanpham_sanpham
foreign key (MaSP) references sanpham(MaSP);