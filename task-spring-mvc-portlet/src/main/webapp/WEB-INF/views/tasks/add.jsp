<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL var="addTaskActionURL" windowState="normal" name="addTask" />

<h1>Tasks Form</h1>

<form action="<%=addTaskActionURL%>" name="taskForm"  method="POST">

<b>Task Name</b><br/>

	<input  type="text" name="<portlet:namespace/>taskName" id="<portlet:namespace/>taskName"/><br/>

	<input type="submit" name="addTask" id="addTask" value="Add Task"/>
</form>

<br/>

<portlet:renderURL var="viewTaskUrl" windowState="normal" 
	 	portletMode="view">
	<portlet:param name="mvcPath" value="/html/tasks/view.jsp" />	 
</portlet:renderURL>

<br /><br />
 
<a href="${viewTaskUrl}">Back to tasks</a>