<?php
	include "connect.php";
	$query = "SELECT * FROM `mon`";
	$data = mysqli_query($conn, $query);
	$result = array();

	//tra ve 1 dong ket qua
	while ($row = mysqli_fetch_assoc($data)) {
		$result[] = ($row);
		//code...
	}
	if (!empty($result)) {
		$arr = [
			'success' => true,
			'message' => "Thành công",
			'result' => $result
		];
	} else {
		$arr = [
			'success' => false,
			'message' => "Thất bại!",
			'result' => $result
		];
	}
	print_r(json_encode($arr));
?>