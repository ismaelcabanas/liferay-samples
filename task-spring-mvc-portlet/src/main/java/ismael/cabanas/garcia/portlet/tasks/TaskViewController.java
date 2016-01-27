package ismael.cabanas.garcia.portlet.tasks;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class TaskViewController {

	
	@RenderMapping
	public String handleRenderRequest(RenderRequest request,RenderResponse response,Model model){
	  
		return "/tasks/view";
	  
	}
}
