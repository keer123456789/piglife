//package com.sjcl.zrsy.filter;
//
//import com.sjcl.zrsy.domain.User;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//public class RoleFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//
//
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse resp = (HttpServletResponse) response;
//        HttpSession session = req.getSession();
//
//      //  User user = session.getAttribute("currentUser");
//
//        String url = req.getRequestURI();
//
////        if (keyi) {
////            chain.doFilter(request, response);
////        } else {
////            resp.sendRedirect("/asdfklj");
////        }
//    }
//
//    @Override
//    public void destroy() {
//
//
//    }
//}
