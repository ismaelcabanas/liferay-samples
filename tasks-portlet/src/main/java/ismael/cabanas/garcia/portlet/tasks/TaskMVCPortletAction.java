package ismael.cabanas.garcia.portlet.tasks;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class TaskMVCPortletAction extends MVCPortlet {

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskMVCPortletAction.class);
	
	public void addTask(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException{
		
		// get parameters
		String taskName = ParamUtil.getString(actionRequest, "taskName");
		
		LOGGER.info("Task name parameter: " + taskName);
		
		// prepare Map object to send data to jSP 
		Map<String, String> taskMapObject = new HashMap<String, String>();
		taskMapObject.put("taskName", taskName);
		
		// send Map object to JSP using setAttribute method on actionRequest object
		actionRequest.setAttribute("taskMap", taskMapObject);
				
		// navigate to JSP to display data
		actionResponse.setRenderParameter("mvcPath", "/html/tasks/display.jsp");
		
	}
}
