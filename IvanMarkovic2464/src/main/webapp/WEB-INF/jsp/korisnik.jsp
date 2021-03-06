<%-- 
    Document   : korisnik
    Created on : Jun 8, 2017, 6:48:32 PM
    Author     : Ivan
--%>

<%@taglib prefix="sec"
 uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp"%>
<h1>Zdravo, korisnice!</h1>
 <h1> ${message}</h1>
 
 <sec:authorize access="hasRole('ROLE_USER')">
 <c:url value="/j_spring_security_logout" var="logoutUrl" />
 
 <form action="${logoutUrl}" method="post" id="logoutForm">
     
 <input type="hidden" name="${_csrf.parameterName}"
 value="${_csrf.token}" />
 
 </form>
 
 <script>
 function formSubmit() {
 document.getElementById("logoutForm").submit();
 }
 </script>
 
 <c:if test="${pageContext.request.userPrincipal.name != null}">
 <h2>
 Vase korisnicko ime je : ${pageContext.request.userPrincipal.name} | 
 <a href="javascript:formSubmit()"> Logout</a>
 </h2>
 </c:if>
 
 
 </sec:authorize>

 <%@include file="footer.jsp"%>
