

      
function MovieRegister(){

	var url='/Dacorations/MovieRegister';
	      window.name="parentForm";
	      window.open(url, "childForm","toolbar=no, location=no,status=no,menubar=no, scrollbars=no,resizable=no,width=600, height=800");  
	     
	      self.close();
}
 
	function area(area) {
		var kind = $("#TheaterKind").val();
		$.ajax({
			type : "POST",
			url : "TheaterList",
			data : "area=" + area + "&kind=" + kind,
			datatype : "html",
			success : function(data) {
				$("#movieAjax").html(data);
			}
		});
	}
	
	function theaterChoice(num) {
		var num=num.split(".")
		var num=num[0]
		$.ajax({
			type : "POST",
			url : "TheaterScreenList",
			data : "num=" + num,
			datatype : "html",
			success : function(data) {
				$("#movieScreen").html(data);
			}
		});
	}
 