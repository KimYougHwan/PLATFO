<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
  

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">

	<button type="button" class="btn btn-primary pull-right">조회목록 저장</button>
	<button type="button" class="btn btn-primary pull-right">장바구니 담기</button>	
	<button type="button" class="btn btn-primary pull-right">엑셀다운</button>
	<button type="button" class="btn btn-primary pull-right">선택삭제</button>	
      <table class="table table-bordered">
		<tr class="info alt">
			<td>No</td>
			<td><input type="checkbox" id="checkAll"/></td>
			<td>브랜드</td>
			<td>카테고리</td>
			<td>부품번호</td>
			<td>부품명</td>
			<td>생가</td>
			<td>수량</td>
			<td>총액</td>
		</tr>
		<tr>
			<td>1</td>
			<td><input type="checkbox" /></td>
			<td>샘숭</td>
			<td>테레비</td>
			<td>2313</td>
			<td>테레비2313</td>
			<td>만원</td>
			<td>2</td>
			<td>2만원</td>
		</tr>
		<tr>
			<td colspan="9" align="right"> 총액 서머리금액</td>
		</tr>
	  </table>

      
      
    </div> <!-- /container -->


</body>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
<script src="bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>