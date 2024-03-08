var book_code;
var book_title;
var book_author;
var book_cnt;
var price;
var book_content;
var book_category;


$(document).ready(function(){
	book_category = $("#selectedCategory").val();
	
	$("#book_category").val(book_category).prop("selected",true);
	
});


function DeleteBook()
{
	book_code = $("#book_code").val();
	book_title = $("#book_title").val();
	
	$.ajax({
		url:  '/book/deleteBook',
		data: {"book_code" : book_code},
		type: "POST",
		success : function(){
			alert(book_title+"이(가) 삭제되었습니다.");
			location.href="list";
		}
	});

}


function EditMode()
{
	//수정부분 활성화
	$('#book_title').attr('readonly',false);
	$('#book_author').attr('readonly',false);
	$('#book_quantity').attr('readonly',false);
	$('#book_price').attr('readonly',false);
	$('#book_content').attr('readonly',false);
	$('#book_category').attr('disabled',false);
	
	//하단의 버튼 변경
	$(".footerBtn").detach();
	
	$('.BtnDiv').append("<input class='footerBtn' type='button' value='돌아가기' onclick='rePage()'/>")
	$('.BtnDiv').append("<input class='footerBtn' type='button' value='수정하기' onclick='update()'/>")
	
	//이미지 삭제와 파일 선택 버튼 추가
	$('#imgArea').append("<input type='file'>")
}


function update()
{
	book_code = $("#book_code").val();
	book_title = $("#book_title").val();
	book_author = $("#book_author").val();
	book_category = $("#book_category").val();
	book_quantity = $("#book_quantity").val();
	book_price = $("#book_price").val();
	book_content = $("#book_content").val();
	
	$.ajax({
		url: "/book/updateBook",
		type: "POST",
		data: {
			"book_code":book_code,
			"book_title":book_title,
			"book_author":book_author,
			"book_category":book_category,
			"book_quantity":book_quantity,
			"book_price":book_price,
			"book_content":book_content
		},
		success: function()
		{
			alert("수정 성공");
			location.href="list";
		}
	});
	
}

function rePage()
{
	location.reload(true);
}