<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

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
		<label class="">일련번호 : 부품갯수 : 총금액 : D-1 주문 상세보기 </label>
		<div class="form-group">
			<label class="control-label" for="">이동수단: </label>
			<select class="bg-primary">
					<option>1123</option>
					<option>2123</option>
					<option>3123</option>
					<option>4123</option>
					<option>5123</option>
			</select>
			 &emsp; 
			<label class="control-label" for="">주문방식: </label>
			<select class="bg-primary">
					<option>1123</option>
					<option>2123</option>
					<option>3123</option>
					<option>4123</option>
					<option>5123</option>
			</select>		
		</div>
		<br />
		<br />
		<div class="form-group">
			<label class="control-label" for="">부품 총액 가격 &nbsp; : &nbsp;</label>
			<input type="text" id="title"> +
		</div>
		<div class="form-group">
			<label class="control-label" for="">이동 수단 &emsp;&emsp;&emsp;:&nbsp;</label>
			<input type="text" id="title"> +
		</div>
		<div class="form-group">
			<label class="control-label" for="">주문 방식 &emsp;&emsp;&emsp;:&nbsp;</label>
			<input type="text" id="title"> +
		</div>
		<div class="form-group">
			<label class="control-label" for="">이용 수수료 &emsp;&emsp;:&nbsp;</label>
			<input type="text" id="title">&nbsp;=&nbsp;<input type="text" id="title">
			<button type="button" class="btn btn-primary" onclick="order()">주문</button>
		</div>
		<div class="form-group">
			<label class="control-label" for="">선수금&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;:&nbsp;</label>
			총액&nbsp;*&nbsp; 
			<select class="bg-primary">
				<option>1123</option>
				<option>2123</option>
				<option>3123</option>
				<option>4123</option>
				<option>5123</option>
			</select>&nbsp;=&nbsp;
			<input type="text" id="title">
		</div> 
	</div>
</body>
</html>


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>
<script>
	function order(){
		alert("alert로 선수금을 지급하는 방식 고지");
		
		location.href = "selectAdvancePaymentList.do"	
	}
</script>