package second.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter{
	//log4j의 log
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	//클라이언트 -> 콘트롤러로 요청할 때 요청 처리.]
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		//System.out.println("adaaa");
		if(log.isDebugEnabled()) {
			log.debug("====================ss========= START ============================");
			log.debug(" Request URI \t:  " + request.getRequestURI());
		}
		
		return super.preHandle(request, response, handler);
	}
	
	//콘트롤러 -> 클라이언트 응답 할 때 (콘트롤러 실행 후)
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		if(log.isDebugEnabled()) {
			log.debug("=============================  END  =============================");
		}
	}
}
