<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
  
    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="/resources/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/resources/assets/js/ie-emulation-modes-warning.js"></script>
</head>
<body>
<div class="container">
	<DIV class="table" >
		<TABLE class="table table-striped">
			<THEAD>
				<TR class="bg-primary">
					<TH>No</TH>
					<!-- <TH><input type="checkbox" id="" /></TH>  -->
					<TH>제목</TH>
					<TH>내용</TH>
					<TH>작성자</TH>
					<TH>작성일자</TH>
				</TR>
			</THEAD>
			<TBODY>
				<c:forEach var="noticeList" items="${noticeList}">
					<TR>
						<Td>${noticeList.oid}</Td>
						<!-- <Td><input type="checkbox" id="${noticeList.oid}" /></Td> -->
						<Td>${noticeList.title}</Td>
						<Td>${noticeList.comm}</Td>
						<Td>${noticeList.createUser}</Td>
						<Td>${noticeList.createDate}</Td>
					</TR>
				</c:forEach>
			</TBODY>
		</TABLE>
	</DIV>
</div>
</body>
</html>




<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>