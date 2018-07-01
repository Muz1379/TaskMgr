package utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.6.9
 * @decription:
 */
public class SessionUtil
    {
        /**
         * 获取当前请求的session对象
         *
         * @return
         */
        public static HttpSession getSession()
            {
                return getServletReqAttris().getRequest().getSession();
            }
        
        /**
         * 当前的请求对象
         *
         * @return
         */
        public static HttpServletRequest getRequest()
            {
                return (HttpServletRequest) getServletReqAttris().getRequest();
            }
        
        /**
         * 获取响应对象
         *
         * @return
         */
        public static HttpServletResponse getResponse()
            {
                return (HttpServletResponse) getServletReqAttris().getResponse();
            }
        
        /**
         * 销毁session
         *
         * @return
         */
        public static boolean destroySession()
            {
                HttpSession session = getSession();
                if (session != null)
                {
                    // System.out.println("The session " + session.getId() + " is invalidate at " + new Date());
                    session.invalidate();
                    return true;
                }
                return false;
            }
        
        /**
         * 获取当前请求的所有属性
         *
         * @return
         */
        public static ServletRequestAttributes getServletReqAttris()
            {
                return (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            }
    }
