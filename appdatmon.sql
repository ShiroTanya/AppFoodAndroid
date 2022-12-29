-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 26, 2022 lúc 02:37 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `appdatmon`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietdonhang`
--

CREATE TABLE `chitietdonhang` (
  `id` int(10) NOT NULL,
  `madonhang` int(10) NOT NULL,
  `mamon` int(10) NOT NULL,
  `tenmon` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `gia` double NOT NULL,
  `soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietdonhang`
--

INSERT INTO `chitietdonhang` (`id`, `madonhang`, `mamon`, `tenmon`, `gia`, `soluong`) VALUES
(12, 29, 10, 'Bún bò Huế chay', 25000, 2),
(13, 29, 4, 'Cơm tấm đặc biệt', 35000, 11),
(14, 30, 7, 'Nước ép cam', 15000, 1),
(15, 31, 9, 'Cơm gà xối mỡ', 30000, 1),
(16, 32, 2, 'Cơm tấm sườn trứng', 27000, 3),
(17, 32, 7, 'Nước ép cam', 15000, 1),
(18, 33, 8, 'Nước ép chanh', 15000, 1),
(19, 34, 5, 'Khoai tây chiên', 15000, 184),
(20, 35, 7, 'Nước ép cam', 15000, 2),
(21, 36, 9, 'Cơm gà xối mỡ', 30000, 10),
(22, 36, 8, 'Nước ép chanh', 15000, 10),
(23, 37, 1, 'Cơm tấm sườn', 25000, 10),
(24, 37, 6, 'Phô mai que', 15000, 1),
(25, 39, 11, 'Chả giò chay', 20000, 5),
(26, 40, 2, 'Cơm tấm sườn trứng', 27000, 1),
(27, 41, 11, 'Chả giò chay', 20000, 14),
(28, 42, 12, 'Gà rán', 30000, 15),
(29, 42, 7, 'Nước ép cam', 15000, 10),
(30, 42, 8, 'Nước ép chanh', 15000, 5),
(31, 43, 10, 'Bún bò Huế chay', 25000, 10),
(32, 44, 12, 'Gà rán', 30000, 6),
(33, 45, 9, 'Cơm gà xối mỡ', 30000, 20),
(34, 46, 53, 'Tré trộn', 25000, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhmuc`
--

CREATE TABLE `danhmuc` (
  `id` int(10) NOT NULL,
  `tendanhmuc` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `hinhdanhmuc` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `danhmuc`
--

INSERT INTO `danhmuc` (`id`, `tendanhmuc`, `hinhdanhmuc`) VALUES
(1, 'Món chính', 'https://cdn.daynauan.info.vn/wp-content/uploads/2019/05/com-tam-la-mon-an-binh-dan.jpg'),
(2, 'Ăn nhẹ', 'https://media.mia.vn/uploads/blog-du-lich/diem-danh-nhung-quan-an-vat-ngon-o-hai-phong-phan-1-1648654960.jpg'),
(3, 'Thức uống', 'https://bacsi.ai/uploads/news/06_2019/17/vitamin-va-khoang-chat-trong-do-uong.jpg'),
(4, 'Món quốc tế', 'https://wiki-travel.com.vn/uploads/picture/qiongru-192917032923-Mi-Quang.jpg'),
(5, 'Món Tết', 'https://image.thanhnien.vn/w1024/Uploaded/2022/puqgfdmzs-co/2021_12_31/2-1363.png'),
(6, 'Các món hải sản', 'https://nhahang37hungvuong.com/wp-content/uploads/2020/10/hai-san-hau-nuong-mo-hanh.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donhang`
--

CREATE TABLE `donhang` (
  `id` int(10) NOT NULL,
  `tenkhachhang` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `sodienthoai` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `tongtien` double NOT NULL,
  `ghichu` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `donhang`
--

INSERT INTO `donhang` (`id`, `tenkhachhang`, `email`, `sodienthoai`, `tongtien`, `ghichu`) VALUES
(29, 'phong', 'phong@gmail.com', '909563642', 435000, ''),
(30, 'Long', 'long@gmail.com', '961247427', 15000, ''),
(31, 'Long', 'long@gmail.com', '961247427', 30000, ''),
(32, 'Long', 'long@gmail.com', '961247427', 96000, 'nước cam ít đá ít đường nha bếp ơi :3'),
(33, 'Long', 'long@gmail.com', '961247427', 15000, 'nhanh lên !! '),
(34, 'Tri', 'tri@gmail.com', '5555555', 2760000, 'ít cay nha anh bếp :3'),
(35, 'phong', 'phong@example.com', '909563642', 30000, 'ngon lắm'),
(45, 'Pham Hoang Long', 'longpham@gmail.com', '0961247427', 600000, 'OK'),
(46, 'Pham Hoang Long', 'hutech@gmail.com', '0128412990', 250000, 'Khong Co');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mon`
--

CREATE TABLE `mon` (
  `id` int(10) NOT NULL,
  `madanhmuc` int(10) NOT NULL,
  `tenmon` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `hinhmon` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gia` double NOT NULL,
  `mota` varchar(1000) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `mon`
--

INSERT INTO `mon` (`id`, `madanhmuc`, `tenmon`, `hinhmon`, `gia`, `mota`) VALUES
(1, 1, 'Cơm ba rọi chiên sả', 'https://bloganchoi.com/wp-content/uploads/2021/07/thanh-pham.jpg', 42000, 'Cơm ba rọi chiên ướp cùng với sả cực kỳ thơm ngon'),
(2, 1, 'Cơm gà kho xả ớt', 'https://img-global.cpcdn.com/recipes/9f2a4c3814e0489a/680x482cq70/h%E1%BB%99p-c%C6%A1m-vui-v%E1%BA%BB-4-ga-rang-s%E1%BA%A3-%E1%BB%9Bt-c%E1%BA%A3i-th%E1%BA%A3o-xao-t%E1%BB%8Fi-c%C6%A1m-tr%E1%BA%AFng-recipe-main-photo.jpg', 37000, 'Gà kho nóng hổi cùng những hạt cơm thơm ngậy sẽ lấp đầy một cái bụng đói'),
(3, 1, 'Cơm tấm sườn bì chả', 'https://cdn.daynauan.info.vn/wp-content/uploads/2019/05/com-tam-la-mon-an-binh-dan.jpg', 45000, 'Một đĩa cơm tấm tiêu chuẩn với miếng sườn siêu to khổng lồ'),
(4, 1, 'Mì xào hải sản', 'https://cdn.tgdd.vn/Files/2019/06/08/1171838/cach-lam-mi-xao-hai-san-ai-an-cung-khen-ngon-202209081512198775.jpg', 40000, 'Mì hải sản cực ngon, sợi mì dai đi kèm với tôm, cá,thịt và rau'),
(5, 2, 'Cá viên chiên giòn', 'http://cdn.tgdd.vn/Files/2021/04/05/1340926/cach-lam-ca-vien-chien-nuoc-mam-an-vat-an-com-deu-ngon-202201051649517330.jpg', 35000, 'Một đĩa cá viên thập cẩm sử dụng dầu chiên sạch cực an toàn'),
(6, 2, 'Khoai tây lắc phô mai (M)', 'https://mediamart.vn/images/uploads/2021/7053cee8-28f8-4a18-836b-763860bfd2da.jpg', 25000, 'Khoai tây chiên giòn rụm ướp kèm phô mai'),
(7, 3, 'Pepsi size L', 'https://hd1.hotdeal.vn/images/uploads/2016/Thang%2010/21/301391-2/301391-body-%282%29.jpg', 15000, 'Pepsi cỡ lớn, mát lạnh'),
(8, 3, 'Coca size L', 'https://thuviendohoa.vn/upload/images/items/hinh-anh-ly-coc-nhua-dung-coca-cola-png-349.jpg', 15000, 'Có Pepsi thì không thể thiếu thằng này'),
(9, 1, 'Cơm gà xối mỡ', 'https://bazantravel.com/cdn/medias/uploads/78/78876-60791265_144936746636954_6153101288902582280_n.jpg', 30000, 'Đĩa cơm gà bày ra đĩa trông bắt mắt với phần cơm vừa đủ ăn lưng bụng, thịt gà trộn bày lên trên, trang trí thêm ít rau răm và hành tây thái mỏng cùng muối tiêu bột. Cơm gà ăn kèm với ớt tương làm tại nhà, cay đậm đà thì quả thực là đáo khẩu. Chén canh cải nấu với gừng tươi và gỏi đu đủ, cà rốt thái sợi mỏng là những thành phần hỗ trợ tuyệt vời làm tôn thêm hương vị đĩa cơm gà.\r\nNhịp sống phố cổ khiến ta muốn thưởng thức buổi trưa thong thả và khoan thai. Gắp miếng thịt gà được trộn vừa miệng và cảm nhận hạt cơm mềm dẻo đang tan dần trong miệng thì quả thực ấn tượng khó phai.'),
(10, 4, 'Pizza thập cẩm (L)', 'http://cdn.tgdd.vn/Files/2021/08/24/1377468/cach-lam-pizza-pho-mai-bap-ngot-beo-ngay-don-gian-tai-nha-202108241444001705.jpg', 55000, 'Một chiếc Pizza thập cẩm cực ngon và rẻ'),
(11, 4, 'Spaghetti sốt bò bằm', 'https://cdn.daynauan.info.vn/wp-content/uploads/2018/03/mi-y-chay.jpg', 30000, 'Mì ý kèm sốt cà chua với bò bằm nhuyễn cực kỳ ngon\nChả giò chay là một trong các món ăn vừa ngon miệng, vừa bổ dưỡng giúp gia đình bạn thay đổi khẩu vị trong những ngày ăn chay thanh tịnh. Với cách làm chả giò chay, bạn có thể chế biến thành món ăn nhẹ hoặc ăn kèm với bún như bữa ăn chính, cuốn với rau sống, chấm kèm với nước tương cay hay nước mắm chua ngọt cũng rất cuốn hút.'),
(12, 2, 'Gà rán sốt chua ngọt', 'https://img-global.cpcdn.com/recipes/28c7648f9ea75b81/1200x630cq70/photo.jpg', 30000, 'KFC xuất hiện lần đầu ở Việt Nam vào năm 1997, khi mà khái niệm “fast food\" - thức ăn nhanh còn vô cùng xa lạ ở nước mình. Từ việc thua lỗ liên tục suốt 7 năm đầu tiên đặt chân khai phá thị trường, hiện nay KFC đã vươn vai trở thành 1 trong 2 ông lớn giữ thị phần cao nhất trong ngành kinh doanh đồ ăn nhanh ở xứ sở hơn 90 triệu dân này.\r\n\r\nCó thể nói, KFC không chỉ mang đến một lựa chọn thực phẩm mới cho người Việt, nó còn góp phần tạo nên một thói quen ăn uống mới cho chúng ta. Không quá khi nói, đối với một bộ phận giới trẻ hiện nay, fast food không còn đơn thuần chỉ là thức ăn, mà hơn thế, nó dường như đã trở thành thị hiếu, thành nếp sống của một thế hệ kế thừa năng động.'),
(13, 2, 'Gà viên lắc phô mai', 'https://cdn.tgdd.vn/Files/2020/04/23/1251243/cach-lam-ga-vien-chien-pho-mai-thom-ngon-beo-ngay-6-760x367.jpg', 30000, 'Gà viên đi kèm với phô mai béo ngậy'),
(14, 3, 'Trà sữa trân châu', 'https://cdn.daotaobeptruong.vn/wp-content/uploads/2021/02/cach-nau-tra-sua-socola.jpg', 25000, 'Dành riêng cho các tín đồ trà sữa.'),
(15, 3, 'Trà tắc ly khổng lồ', 'https://cdn.tgdd.vn/2021/12/CookDish/cach-lam-tra-tac-thao-moc-thanh-mat-tot-cho-suc-khoe-avt-1200x676.jpg', 12000, 'Trà tắc siêu to khổng lồ'),
(16, 4, 'Apfelstrudel táo', 'https://blueskytravel.com.vn/UserFiles/Image/2110863-img-recept-jidlo-jablecny-zavin-strudl-v0.jpg', 55000, 'Đây là một món khá giống với món bánh táo của Mỹ nhưng bên ngoài lại là lớp bánh thơm và giòn, phủ lên trên là một lớp bột đường ngon mắt. Người Áo thường dùng món này vào những buổi café chiều.'),
(17, 4, 'Squeaky Cheese ', 'https://blueskytravel.com.vn/UserFiles/Image/visit-rovaniemi-love-local-food-web-opt-8.jpg', 30000, 'có hương vị hết sức đặc biệt! Phô mai với hương vị nhẹ nhàng được áp chảo và dùng cùng mứt dâu. Món tráng miệng này cực kỳ phổ biến thường được uống kèm với cà phê.Chả giò chay là một trong các món ăn vừa ngon miệng, vừa bổ dưỡng giúp gia đình bạn thay đổi khẩu vị trong những ngày ăn chay thanh tịnh. Với cách làm chả giò chay, bạn có thể chế biến thành món ăn nhẹ hoặc ăn kèm với bún như bữa ăn chính, cuốn với rau sống, chấm kèm với nước tương cay hay nước mắm chua ngọt cũng rất cuốn hút.'),
(51, 5, 'Bánh chưng', 'https://cdn.tgdd.vn/2020/08/CookProduct/37-1200x676.jpg', 30000, 'Bánh chưng là một món ăn truyền thống đã có từ thời xa xưa và đến nay nó vẫn được coi là biểu trưng cho ngày Tết. Món ăn tượng trưng cho sự hòa quyện của trời đất, là một nét văn hóa lâu đời của dân tộc ta.'),
(52, 5, 'Nem rán', 'https://cdn.tgdd.vn/2022/10/CookDish/cach-lam-mon-nem-ran-thom-ngon-chuan-vi-don-gian-tai-nha-avt-1200x676.jpg', 30000, 'Món nem rán mang đến vị ngon và giòn rụm khiến nhiều người rất ưa thích. Món ăn không chỉ được sử dụng trong mâm cỗ ngày Tết mà còn được sử dụng trong những bữa ăn hàng ngày của gia đình Việt.'),
(53, 5, 'Tré trộn', 'https://cdn.tgdd.vn/Files/2020/03/15/1242336/cach-lam-tre-dac-san-doc-dao-cua-binh-dinh-2-760x367.jpg', 25000, 'Tré là 1 món ăn đặc sản của người Bình Định, tuy nhiên lại được nhiều gia đình ở mọi vùng miền thêm vào mâm cỗ ngày Tết. Món này có đa dạng cách chế biến, đặc biệt là làm nguyên liệu chính cho các món gỏi hoặc có thể ăn không cũng rất ngon.\r\n\r\n'),
(54, 6, 'Mực nướng ngũ vị\r\n', 'https://muabantomhum.com/upload/files/muc-nuong-tuong-hot.jpg', 120000, 'Màu sắc hấp dẫn, hương thơm hấp dẫn từ món mực nướng ngũ vị, sẽ thay đổi món mực xào thường thấy'),
(55, 6, 'Cua lột chiên giòn', 'https://cdn.tgdd.vn/2021/01/CookProduct/thum1-1200x676-4.jpg', 155000, 'Cua lột món ăn rất nhiều dinh dưỡng, tốt cho sức khỏe.'),
(56, 6, 'Cua sốt me Singapore\r\n', 'https://ngonaz.com/wp-content/uploads/2021/09/cua-sot-singapore-1.jpg', 130000, 'Trong quá trình chế biến, món cua sốt me quen thuộc được cho thêm vào một quả trứng gà đem lại vị beo béo, thơm ngon rất hấp dẫn. ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `email` varchar(60) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `email`, `password`) VALUES
(1, 'test@gmail.com', '098f6bcd4621d373cade4e832627b4f6'),
(2, 'phong@hutech.com', '9f48495bb4b98ac37a1a72c7e6490c7a'),
(3, 'batri@gmail.com', '7f35ea3ce0a3fc40e8e526977b10b407');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `danhmuc`
--
ALTER TABLE `danhmuc`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `mon`
--
ALTER TABLE `mon`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT cho bảng `danhmuc`
--
ALTER TABLE `danhmuc`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT cho bảng `donhang`
--
ALTER TABLE `donhang`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT cho bảng `mon`
--
ALTER TABLE `mon`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1000;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
