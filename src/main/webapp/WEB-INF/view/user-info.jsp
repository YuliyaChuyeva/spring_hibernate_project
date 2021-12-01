<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Create user</h2>
<br>

<form:form action="saveUser" modelAttribute="user">

    <form:hidden path="id"/>

    userName <form:input path="userName"/>
    <form:errors path="userName"/>
    <br><br>
    password <form:input path="password"/>
    <br><br>
    email <form:input path="email"/>
    <br><br>

    <br><br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>