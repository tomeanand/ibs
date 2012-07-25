<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>

    <title><decorator:title default="Personal budget management system"/></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    	<title>EasyFiling .:. Home</title>   
	<link href="http://fonts.googleapis.com/css?family=Telex" media="screen" rel="stylesheet" type="text/css" >
	<link href="http://fonts.googleapis.com/css?family=Droid+Sans" media="screen" rel="stylesheet" type="text/css" > 
	<link href="assets/css/bootstrap.min.css" media="screen" rel="stylesheet" type="text/css" >
	<link href="assets/css/app.css" media="screen" rel="stylesheet" type="text/css" >

  <meta name="Keywords" content="12"/>
  <meta name="Description" content="12"/>
	<script src="assets/js/jquery.min.js">	</script>
	<script src="assets/js/bootstrap-tooltip.js">	</script>
	<script src="assets/js/bootstrap-dropdown.js">	</script>
	<script src="assets/js/ibs-client.js"></script>
	<script src="assets/js/ibs-clienTESTt.js"></script>
    <decorator:head/>
</head>

 <body>
	<div class="container">
	<div class="content">
		
		<!-- Content starts -->


<div class="fl cent innerContainer">
	<div class="fl titleBar">Login</div>
	<div class="fl">
		<div class="fl" id="contentHolder" style="width:700px;">
			<p>Plase provide user id and password to enter into our system to process your Income Tax related queries.<br>
			Or click here to Sign up as a <a href="/efile/createprofile.action">New User</a>
</p>
			<br/><br/>


<div class="login-box rounded_corners">
	<div class="title rounded_corners"><h4 style="color:#fff;">Login</h4></div>
	<div class="loginholder">
	

	
	<form id="loginForm" action="/efile/login.action">
		 	 <label>PAN No.</label><input type="text" placeholder="Userid" id="pan" name="pan" required="" value="30">
		 	 <label>Password</label><input type="password" placeholder="Password" id="pswd" name="pswd"  required="" value="hello"> 
		 	
		 	 <br><br> <br> <INPUT TYPE="SUBMIT" NAME="submit" VALUE="submit">
	 </form>
	 




	
	</div>
	</div>



			 <br/><br/> 
		</div>


<script src="../assets/js/bootstrap-modal.js">	</script>
<script src="../assets/js/encriptjs.js">	</script>
<script>




var pswdsign = "";
 jQuery(document).ready(function($){
 $('#infoBox').modal({backdrop:true})
 $("#closeBtn").click(function(){ 
 $('#infoBox').modal('hide');



 })
 });


</script>

	<div class="modal fade in" id="infoBox" style="display: none;" >
            <div class="modal-header">
              <a class="close" href="#" >×</a>
              <h4 id="infoHead">Login error.</h3>
            </div>
            <div class="modal-body">
              <p id="infoContent">Could not login because the userid or password you entered was wrong!</p>
            </div>
            <div class="modal-footer">
             
              <a class="btn danger" href="#" id="closeBtn">Close</a>
            </div>
          </div>
		
		
	</div>		
		
		<!-- Content ends -->

	</div>
	</div>
 </body>
</html>













