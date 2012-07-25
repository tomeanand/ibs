<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="com.efile.common.Constants" %>
<%@ page import="com.efile.model.UploadData" %>
<%@ page import="com.efile.model.User" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<sj:head jqueryui="true" jquerytheme="redmond"/>

</head>

 <body>
 <%
  User user = (User)request.getAttribute(Constants.USER_SESSION_ATTRIBUTE);
  List<UploadData> uploadDataList = (List<UploadData>)request.getAttribute(Constants.UPLOAD_SESSION_ATTRIBUTE);
 %>

		<div class="fl cent innerContainer">
			<div class="fl titleBar">My Page</div>
				<div class="fl">
					<div class="fl" id="contentHolder" style="width:860px;">

  <sj:tabbedpanel id="mytabs" animate="true" collapsible="true" selectedTab="0">
      <sj:tab id="tab1" target="tone" label="Profile"/>
      <sj:tab id="tab2"  target="ttwo" label="Filing History"/>
      <sj:tab id="tab3"  target="tthree" label="Upload new Docs"/>
      <sj:tab id="tab4"  target="tfour" label="Settings"/>
      <div id="tone"> 
         <table class='bordered-table zebra-striped'>
			<tr><td>Name</td><td><%= user.getFirstName()%>&nbsp;&nbsp;<%= user.getMiddleName()%>&nbsp;&nbsp;<%= user.getLastName()%></td></tr>
			<tr><td>PAN</td><td><%= user.getPan()%></td></tr>
			<tr><td>Father's Name</td><td><%= user.getFathersName()%></td></tr>
			<tr><td>DOB</td><td><%= user.getDob()%></td></tr>
			<tr><td>Email</td><td><%= user.getEmail()%></td></tr>
			<tr><td>Phone</td><td><%= user.getPhone()%></td></tr> 
			<tr><td>Address</td><td><%= user.getAddress()%><br/>Pin <%= user.getPin()%></td></tr>
			<tr><td>Residential status</td><td><%= user.getResidenceStatus()%></td></tr>
		</table>
      </div>
      <div id="ttwo"> 
       <table class='bordered-table zebra-striped'>
       	<tr>
    		<th>Year</th>
    		<th>FileName</th>
    		<th>FilePath</th>
  		</tr>
  		
      	<%
      	 for(UploadData uploadData : uploadDataList){%>
      	   <tr> <td><%= uploadData.getYear()%></td>	
      		<td><%= uploadData.getFileName()%></td>	 
      		<td><%= uploadData.getFilePath()%></td>	</tr>
      	 <%}
      	%>
      	
      	</table>
      </div>
      <div id="tthree">
       <%@ include file="upload.jsp" %>
      </div>
      <div id="tfour">
       		Test 4 
      </div>
  </sj:tabbedpanel>

  					 </div>
  				 </div>
   			</div>

 
 </body>
</html>














