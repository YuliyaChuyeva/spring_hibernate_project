<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Create overview</h2>
<br>

<form:form action="saveOverview" modelAttribute="overview">

    <form:hidden path="id"/>

    Title <form:input path="title"/>
    <form:errors path="title"/>
    <br><br>
    Section <form:select path="section">
    <form:option value="Films" label="Films"/>
    <form:option value="Multfilms" label="Multfilms"/>
    </form:select>
    <br><br>
    Tags <form:input path="tags"/>
    <br><br>
    Text <form:input path="text"/>
    <br><br>
    AuthorMark <form:select path="authorMark">
    <form:option value="1" label="1"/>
    <form:option value="2" label="2"/>
    <form:option value="3" label="3"/>
    <form:option value="4" label="4"/>
    <form:option value="5" label="5"/>
    <form:option value="6" label="6"/>
    <form:option value="7" label="7"/>
    <form:option value="8" label="8"/>
    <form:option value="9" label="9"/>
    <form:option value="10" label="10"/>
    </form:select>
    <br><br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>