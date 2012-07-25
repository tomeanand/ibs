  /*var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-30328464-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
    
    var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
    po.src = 'https://apis.google.com/js/plusone.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
    
  })();*/

 

function signinSystem() {
	var queryString = "username="+ $("#pan").val()+"&password="+Base64.encode($("#pswd").val())
	var request = $.ajax({url: "../handlers/profile/dbhandler/signin?"+(queryString),type: "GET",dataType: "json"});
	
	request.done(function(msg)	{
	
		userInfo = msg;	
		if(userInfo != null){
			location.href = "../index/mypage?eusr="+Base64.encode(userInfo.uid+"||"+userInfo.firstName);
		}
		else{
			$("#pan").val("")
			$("#pswd").val("")
			$('#infoBox').modal('show');
		}
				
				
			})
		
	return false;
}


function contactbusiness(){
		 
		  var requestData = {
			  mailMessage : $("#mailMessage").val(),
			  personName : $("#personName").val(),
			  fromEmail : $("#fromEmail").val(),
			  company : $("#company").val(),
			  phone : $("#phone").val()

			  }

			var request = $.ajax({url: "../sendmail.php",type: "POST",data: requestData,dataType: "html"});
			request.done(function(msg)	{
				alert(msg)
				resetForm()
			})
		return false;

	  }

function createProfile()	{
	var resStatus = $("#residenceStatus").find(':selected').val();
	var queryString = "username="+ $("#pan").val()+"&password="+$("#pswd").val()+"&firstName="+$("#fname").val()+"&lastName="+$("#lname").val()+"&middleName="+$("#mname").val()+"&frname="+$("#frname").val()+"&email="+$("#email").val()+"&phone="+$("#phone").val()+"&address="+$("#addr").val()+"&pin="+$("#pin").val()+"&resStatus="+resStatus+"&gender="+$("input:radio:checked").val()+"&dob="+$("#dob").val();
	if($("#pan").val() != "" && $("#pswd").val() != "" && $("#fname").val() !="" && $("#lname").val() !="" && $("#mname").val() != "" && $("#frname").val() != "" && $("#email").val() != "" && $("#phone").val() != "" && $("#addr").val() != ""){
	    var request = $.ajax({url: "../handlers/profile/dbhandler/adduser?"+(queryString),type: "GET",dataType: "html"});
    
	
	
	request.done(function(msg)	{
		if(msg>0){
			$("#infoHead").html('Succesfully saved.');
			$("#infoContent").html('Thank you for registering with us. Your information has been successfully saved.<br>Please check your mail to know about your login and password.<br>Go to <a href="../index/login">Login page</a> ')
			$("#profileForm")[0].reset();
		}
		else{
			$("#infoHead").html('User exists.');
			$("#infoContent").html('Then PAN number you entered is already found in our database.<br>If this is your PAN number please <a href="#">click here</a> to retrieve your information.<br>Or try again with proper information. ');
			//$("#profileForm").reset();
		}
		
	})
	$('#infoBox').modal('show')
	}
	
}

	  function resetForm()	{
		$("#mailMessage").val("");
		$("#personName").val("");
		$("#fromEmail").val("");
		$("#company").val("");
		$("#phone").val("")

	  }




  var ibsClient = {

	  
  
  searchsite:function(){

	  jQuery(document).ready(function($){
		  
		  	var toolTips = $("a[rel=tooltip]");
		  	toolTips.tooltip()
		  	//toolTips.mouseover(function(e) {toolTips.tooltip('show'); e.stopPropagation();console.log(e)});
		   // toolTips.mouseout(function(e) {toolTips.tooltip('hide');e.stopPropagation()});
		  	
			$('.dropdown-toggle').dropdown();
		    $("#sendform").bind("submit",contactbusiness);
		  	$("#sumbitBtn").bind("click",createProfile);
			$("#loginBtn").bind("click",signinSystem);


		



	   	/*$('.searchBtn').click(function(){
		var query = $('.searchBox').val();
		location.href = "http://search.atomz.com/search/?sp_a=sp1004cc2d&sp_q="+query+"&sp_p=all&sp_f=UTF-8&sp_g=1";
		//$.get("http://search.atomz.com/search/", { sp_a: "sp10049f98", sp_p: "all",sp_f:"UTF-8",sp_q:query } );
		});
	$('.searchBox').keydown(
		function(event){
		if(event.keyCode == 13){
			var query = $('.searchBox').val();
			location.href = "http://search.atomz.com/search/?sp_a=sp1004cc2d&sp_q="+query+"&sp_p=all&sp_f=UTF-8&sp_g=1";
		}
		})*/

	  });
	}

	


  }

  ibsClient.searchsite();