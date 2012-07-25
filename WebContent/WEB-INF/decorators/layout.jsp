<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>


<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
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
    <decorator:head/>
</head>

<body>
   <div class="container">
	<div class="content">
	     
			<%@ include file="/jsp/header.jsp"%>
	        <div class="fl cent innerContainer">
			<decorator:body/>
	
			<%@ include file="/jsp/footer.jsp"%>
			
	   </div>
	</div>
</body>
</html>

