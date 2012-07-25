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
	<div class="fl titleBar">Create your profile</div>
	<div class="fl">
		<div class="fl" id="contentHolder" style="width:700px;">
			<p>Please provide proper information in the form to add you information in to our system to 
			<br>ease your Income Tax / Service Tax related issues.</p>
			<br/><br/>
<form id="profileForm" action="/efile/createprofileSave.action">
<div style="width:345px;" class="fl">

		 	 <label>PAN:</label><input type="text" id="pan" name="pan" required>
		 	 <label>Password:</label><input type="password" id="pswd" name="pswd" required> 
		 	 <label>Confirm Password:</label><input type="password" id="cpswd" name="cpswd" required> 
		 	 <label>First Name:</label><input type="text" id="fname" name="fname" required> 
		 	 <label>Middle Name:</label><input type="text" id="mname"  name="mname" required> <br/>
		 	 <label>Last Name:</label><input type="text" id="lname" name="lname" required> <br/>
		 	 <label>Fathers Name:</label><input type="text" id="frname" name="frname" required> <br/>
		 	
		 	 
</div>

<div style="width:345px;" class="fl">
		 	  <label>Date of Birth:</label><input type="text" id="dob" required> <br/><label></label><span>DD/MM/YYYY</span> <br/>
		 	 
		 	 <label>Gender:</label><br/>
		 	 <label style="width:70px;margin-top:-10px"><input type="radio" value="male" name="optionsRadios" checked="" ><span>Male</span></label>
			<label style="width:70px;margin-top:-10px"><input type="radio" value="female" name="optionsRadios"><span>Female</span></label>
                  
		 	 <!-- <div class="input">
              <ul class="inputs-list fl">
                <li>
                  <label>
                    <input type="radio" value="option1" name="optionsRadios" checked="">
                    <span>Male</span>
                  </label>
                </li>
                <li>
                  <label>
                    <input type="radio" value="option2" name="optionsRadios">
                    <span>Female</span>
                  </label>
                </li>
              </ul>
            </div> -->
		 	 
		 	 <label>Email:</label><input type="text" id="email" name= "email" required> <br/>
		 	 <label>Phone:</label><input type="text" id="phone" name= "phone" required> <br/>
		 	 <label>Residential Address:</label><textarea  id="addr"  name="addr" required></textarea><br/>
		 	 <label>Pin:</label><input type="text" id="pin" name="pin" required> <br/>
		 	 <label>Residential Status</label>
						<select name="residenceStatus" id="residenceStatus">
                        <option value="Resident">Resident</option>
				  		<option value="Non_Resident">Non Resident</option>
                        <option value="Not_Ordinarily_Resident">Not Ordinarily Resident</option>
						</select>
		 	 <label></label><INPUT TYPE="SUBMIT" NAME="submit" VALUE="submit">
			
			 

</div>
 </form>
			 <br/><br/> 
		</div>


<script src="/assets/js/bootstrap-modal.js">	</script>
<script>

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
              <h4 id="infoHead"></h3>
            </div>
            <div class="modal-body">
              <p id="infoContent"></p>
            </div>
            <div class="modal-footer">
             
              <a class="btn danger" href="#" id="closeBtn">Close</a>
            </div>
          </div>
		
		
	</div>
		<!-- Content ends -->
		
</div></div>
 </body>
</html>
