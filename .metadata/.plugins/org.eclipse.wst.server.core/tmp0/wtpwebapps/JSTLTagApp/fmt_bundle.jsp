<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<c:if test="${not empty param.language}">
  <c:set var="language" value="${param.language}" scope="session"/>
</c:if>
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="bundles.MyBundle" />
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>fmt:bundle example</title>
  </head>
  <body>
  	 <p><a href="fmt_bundle.jsp?language=kh">KH</a></p>
  	 <p><a href="fmt_bundle.jsp?language=en">ENG</a></p>
     <h2><fmt:message key="login.label.login"/></h2>
     <form action="">
        <table>
           <tr>
              <td>
                 <fmt:message key="login.label.userName"/>
              </td>
              <td>
                 <input type="text" name="userName" />
              </td>
           </tr>
           <tr>
              <td>
                 <fmt:message key="login.label.password"/>
              </td>
              <td><input type="password" name="password" /></td>
           </tr>
        </table>
        <input type="submit"  value="Submit"/>
     </form>
  </body>
</html>