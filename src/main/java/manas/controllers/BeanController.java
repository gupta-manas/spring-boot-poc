package manas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import manas.models.DemoBean;
import manas.services.DemoBeanService;

@RestController
public class BeanController {

	@Autowired
	private DemoBeanService demoBeanService;

	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public String greet(){
		return "Hi";
	}

	@RequestMapping(method=RequestMethod.GET, path="/beans")
	public List<DemoBean> getDemoBeans(){
		return demoBeanService.getBeans();
	}

	@RequestMapping(method=RequestMethod.GET, path="/beans/{beanID}")
	public DemoBean getBeanWithBeanID(@PathVariable("beanID") long beanID){
		return demoBeanService.getBean(beanID);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/beans")
	public void createDemoBean(@RequestBody DemoBean demoBean){
		demoBeanService.createBean(demoBean);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/beans/{beanID}")
	public void updateDemoBean(@PathVariable("beanID") long beanID, @RequestBody DemoBean demoBean){
		demoBeanService.updateBean(beanID, demoBean);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/beans/{beanID}")
	public void deleteDemoBean(@PathVariable("beanID") long beanID){
		demoBeanService.deleteBean(beanID);
	}
}
