<%@ page import="com.efile.model.User" %>
<%@ page import="com.efile.common.Constants" %>

 <div class="searchTopBox">
<div style="width:100%">

	<div class="userstatus"><a href="index.html"><img style="margin-top: -4px;padding-right: 8px;" class="homeIcon" src="assets/images/home_icon.png"></a>You've loggined as &nbsp;&nbsp;</div>
	<div class="userBtn fl">
	<ul class="nav nav-pills">
				<li class="dropdown">
				 <%
				 String name = Constants.EMPTY_STRING;
  if(null != (request.getSession().getAttribute(Constants.USER_SESSION_ATTRIBUTE))){
	  User u = (User) request.getSession().getAttribute(Constants.USER_SESSION_ATTRIBUTE) ;
	  name = u.getFirstName();
  }
 %>
				  <a href="#" data-toggle="dropdown" class="dropdown-toggle"><%=name %><b class="caret"></b></a>
				  <ul class="dropdown-menu" id="menu3">
					<li><a href="mypage.html">My Page</a></li>
					<li><a href="logout.html">Logout</a></li>
				  </ul>
				</li>
			  </ul>
	</div>
</div>
<!-- logins ends -->

<div class="fr">
		 <div class="searchBoxContainer"><input type="search" class="searchBox" placeholder="Search"></div>
		 <div class="fl"><img src="assets/images/search_btn.png" alt="Search"></div>
		 </div>
		 <div class="clr"></div>
	 </div> 

		
	 
	 <div class="clr cent fl" style="padding-bottom:25px;"> 
	
	 <div class="logoHolder fl"><a href="index.html"><img src="assets/images/logo_identity.png"/></a></div>
	 <div class="menuContainer fr">
		<ul class="nav" style="padding-left:6px;">
		<li><a href="<s:url action='about'/>">ABOUT US</a></li>
		<li><a href="<s:url action='services'/>">SERVICES</a></li>
		<li><a href="<s:url action='account'/>">ACCOUNTING</a></li>
		<li><a href="<s:url action='clients'/>">CLIENTS</a></li>
		<li><a href="<s:url action='contact'/>">CONTACT</a></li>
		</ul>
	</div>
	</div>
