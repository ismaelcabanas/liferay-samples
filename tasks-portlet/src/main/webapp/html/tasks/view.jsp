<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>tasks-portlet</b>.<br/>

<portlet:renderURL var="addTaskUrl" windowState="normal" 
	 	portletMode="view">
	<portlet:param name="mvcPath" value="/html/tasks/add.jsp" />	 
</portlet:renderURL>
 
<a href="${addTaskUrl}">Add task</a>

