<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
         <s:actionerror />
         <s:actionmessage />
         <s:form id="upload" name="upload" action="UploadMyFile" enctype="multipart/form-data" method="POST">
            <label>Year</label>
						<select name="year" id="year">
             <%
             for( int i = 1952; i<2010 ; i++){
             %>
              <option value="<%= i%>"><%=i %></option>
              <%} %>
             </select>
            <s:file name="uploadFile" label="Please select a file to upload"></s:file>
            <s:file name="uploadFile" label="Please select a file to upload"></s:file>
            <s:file name="uploadFile" label="Please select a file to upload"></s:file>
            <s:file name="uploadFile" label="Please select a file to upload"></s:file>
            <s:file name="uploadFile" label="Please select a file to upload"></s:file>
           <sj:submit value="uploadFile" targets="tthree" />
        </s:form>
			
