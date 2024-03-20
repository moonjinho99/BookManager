<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<style>
*{
	margin:0;
	padding:0;
}

span,input,select{
	margin:5px;
	font-size: 20px;
}

.InfoDiv{
	margin:0 auto;
	width:1000px;
	height: auto;
}


.head{
	width:1000px;
	height:300px;
	border: 1px solid black;
  	border-collapse: collapse;
  	font-size:20px;
}

tr{
	border: 1px solid black;
  	border-collapse: collapse;
}

.content_div{
    width: 1000px;
    height: 500px;
    text-align:center;
}
textarea{
	margin-top:50px;
	font-size:20px;
	width:100%;
	height:80%;
}

h2{
	margin:30px;
	text-align:center;
}

.BtnDiv{
	
	text-align:center;
}

.footerBtn{
	width:100px;
	height:60px;
}

img{
	width:100%; height:100%;
}

.imgDeleteBtn{
	    position: absolute;
	    top: 8%;
	    right: 52%;
	    background-color: #ef7d7d;
	    color: wheat;
	    width: 30px;
	    height: 30px;
	    border-radius: 50%;
	    text-align: center;
	    border: none;
	    display: block;
	    cursor: pointer;	
	}
</style>

<body>
<div class="InfoDiv">
	<h2>책 상세 페이지</h2>
	<table class="head">
		<tr>
			<td rowspan="6" style="width:500px;border: 1px solid black; border-collapse: collapse;">
			<div id="#imgArea" class="imgArea" style="margin:0 auto;width:60%; height:90%;">
				<img id="detailBookImg" src="/book/display?fileName=${img}">
			</div>		
			</td>
		</tr>
		<tr>
			<td><span>제목</span><input type="text" id="book_title" value="${bookDTO.book_title}" readonly></td>	
		</tr>
		<tr>
			<td><span>저자</span><input type="text" id="book_author" value="${bookDTO.book_author}" readonly></td>
		</tr>
		<tr>
			<td>
				<span>장르</span>
				<select id="book_category" disabled>
					<option value="소설">소설</option>
					<option value="시">시</option>
					<option value="수필">수필</option>
				</select></td>
		</tr>
		<tr>
			<td><span>재고</span><input type="text" id="book_quantity" value="${bookDTO.book_quantity}" readonly></td>
		</tr>
		<tr>
			<td><span>가격</span><input type="text" id="book_price" value="${bookDTO.book_price}" readonly></td>
		</tr>
	</table>
	
	<div class="content_div">
		<textarea id="book_content" rows="20" cols="30" readonly>${bookDTO.book_content}</textarea>
	</div>	
	<div class="BtnDiv">
		<input type="button" class="footerBtn" id="cancelBtn" value="취소" onclick="javascript:history.back()">
		<input type="button" class="footerBtn" id="updateBtn" value="수정" onclick="EditMode()">
		<input type="button" class="footerBtn" id="deleteBtn" value="삭제" onclick="DeleteBook()">	
	</div>
</div>
<input type="hidden" id="selectedCategory" value="${bookDTO.book_category}">
<input type="hidden" id="book_code" value="${bookDTO.book_code}">
</body>
 <script type="text/javascript" src="../resources/js/book/bookDetail.js"></script>
</html>