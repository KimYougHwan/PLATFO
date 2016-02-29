<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <!-- Bootstrap core CSS -->
    <link href="../resources/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="../resources/bootstrap/dist/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
		<div>브랜드</div>
		<div><select>선택</select></div>
		<div><button class="btn btn-primary" type="submit">조회</button></div>
		<div><button class="btn btn-primary" type="submit">저장</button></div>
	</div>
	<div class="row">
		<div></div>
		<div><input type="text"></div>
		<div>%</div>
		<div><button class="btn btn-primary" type="submit">일괄적용</button></div>
	</div>
	<table>
		<thead>
			<tr class="bg-primary">
				<td>품목명</td>
				<td>마진율(%)</td>
				<td>품목명</td>
				<td>마진율(%)</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>test</td>
				<td>20</td>
				<td>test2</td>
				<td>40</td>
			</tr>
		</tbody>
	</table>
</div>
</body>
