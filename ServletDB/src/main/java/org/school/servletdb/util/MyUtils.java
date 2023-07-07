package org.school.servletdb.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.school.servletdb.bean.UserAccount;

public class MyUtils {
	private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_CONNECTION";

	// Store user info in session
	public static void storeLoginedUser(HttpSession session, UserAccount loginedUser) {
		// On the JSP can access via ${loginedUser}
		session.setAttribute("loginedUser", loginedUser);
	}
	
	// Store info in Cookie
	public static void storeUserCookie(HttpServletResponse response, UserAccount user) {
		System.out.println("Store user cookie");
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getUserName());
		// 1 day (Converted to seconds)
		cookieUserName.setMaxAge(24 * 60 * 60);
		response.addCookie(cookieUserName);
	}
	// Delete cookie.
	public static void deleteUserCookie(HttpServletResponse response) {
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
		// 0 seconds (This cookie will expire immediately)
		cookieUserName.setMaxAge(0);
		response.addCookie(cookieUserName);
	}
	// Get the user information stored in the session.
	public static UserAccount getLoginedUser(HttpSession session) {
		UserAccount loginedUser = (UserAccount) session.getAttribute("loginedUser");
		return loginedUser;
	}
}
