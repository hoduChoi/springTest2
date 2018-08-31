package second.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter{
	//log4j�� log
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	//Ŭ���̾�Ʈ -> ��Ʈ�ѷ��� ��û�� �� ��û ó��.]
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		//System.out.println("adaaa");
		if(log.isDebugEnabled()) {
			log.debug("====================ss========= START ============================");
			log.debug(" Request URI \t:  " + request.getRequestURI());
		}
		
		return super.preHandle(request, response, handler);
	}
	
	//��Ʈ�ѷ� -> Ŭ���̾�Ʈ ���� �� �� (��Ʈ�ѷ� ���� ��)
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		if(log.isDebugEnabled()) {
			log.debug("=============================  END  =============================");
		}
	}
}
