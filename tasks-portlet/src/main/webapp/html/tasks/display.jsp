<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<h2>Display task details</h2>

<portlet:renderURL var="addTaskUrl" windowState="normal" 
	 	portletMode="view">
	<portlet:param name="jspPage" value="/html/tasks/add.jsp" />	 
</portlet:renderURL>

<b>Task name: </b> ${taskMap['taskName']}

<br /><br />

<a href="${addTaskUrl}">Add task</a>

