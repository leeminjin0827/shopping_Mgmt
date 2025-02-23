<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="write">
	
		<jsp:include page="/shop/header.jsp"></jsp:include>
		
		<h1>홈쇼핑 회원 등록</h1>
		<table class="table">
			<tbody>
				<tr>
					<th>
						<label for="custno"> 회원번호(자동발생) </label>
					</th>
					<td>
						<input id="custno" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="custname"> 회원성명 </label>
					</th>
					<td>
						<input id="custname" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="phone"> 회원전화 </label>
					</th>
					<td>
						<input id="phone" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="address"> 회원주소 </label>
					</th>
					<td>
						<input id="address" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="joindate"> 가입일자 </label>
					</th>
					<td>
						<input id="joindate" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="grade"> 고객등급[A:VIP,B:일반,C:직원] </label>
					</th>
					<td>
						<input id="grade" type="text" />	
					</td>
				</tr>
				<tr>
					<th>
						<label for="city"> 도시코드 </label>
					</th>
					<td>
						<input id="city" type="text" />	
					</td>
				</tr>
				<tr class="btn_tr">
					<td class="btn_box">
						<button type="button">등록</button>
						<button type="button" onclick="window.location.href='/shopping_Mgmt/shop/jsp/update.jsp'">조회</button>
					</td>
				</tr>
			</tbody>
		</table>
		
	</div>

</body>
</html>