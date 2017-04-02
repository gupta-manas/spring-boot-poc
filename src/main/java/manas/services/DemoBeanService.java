package manas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import manas.models.DemoBean;

@Service
public class DemoBeanService {
	private List<DemoBean> demoBeans= new ArrayList<>();

	public List<DemoBean> getBeans(){
		return demoBeans;
	}

	public void createBean(DemoBean demoBean){
		demoBeans.add(demoBean);
	}

	public DemoBean getBean(long beanID){
		return demoBeans.stream().
				filter(t -> t.getBeanID()==beanID).
				findFirst().
				get();
	}

	public void updateBean(long beanID, DemoBean demoBean) {
		for(DemoBean bean: demoBeans){
			if(bean.getBeanID()== beanID){
				demoBeans.set(demoBeans.indexOf(bean), demoBean);
			}
		}
	}

	public void deleteBean(long beanID) {
		/*for(DemoBean bean: demoBeans){
			if(bean.getBeanID()== beanID){
				demoBeans.remove(demoBeans.indexOf(bean));
			}
		}*/
		demoBeans.removeIf(t -> t.getBeanID()==beanID);
	}

}
