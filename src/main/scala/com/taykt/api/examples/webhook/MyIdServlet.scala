package com.taykt.api.examples.webhook

import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

/**
 * A Taykt API web hook to allow consumers to retrieve the Unqiue ID assigned to their phone number. 
 * This would be useful if you have an existing database of customers and would 
 * like to switch to using taykt as your SMS gateway.
 * 
 * See: http://api.taykt.com/ for details.
 */
class MyIdServlet extends HttpServlet {
	
	override def doPost(req:HttpServletRequest, resp:HttpServletResponse) {
  
    	// Compose and send the response:
    	resp.setContentType("text/plain")
    	resp.setCharacterEncoding("utf-8");
    	resp.getWriter().println( "Your Taykt id is " + req.getParameter("pid"))
    }
  
}
