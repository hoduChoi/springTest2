package second.sample.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//������̼�. ���� Ŭ������ controller��
@Controller
public class SampleController {
	//Log4j �α� ����.
	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/sample/openSampleList.do")
	public ModelAndView openSampleList(Map<String, Object> commandMap) throws Exception{
		System.out.println("ddd");
		ModelAndView mv = new ModelAndView("");
		log.debug("���ͼ��� �׽�Ʈ");
		return mv;
	}
}
