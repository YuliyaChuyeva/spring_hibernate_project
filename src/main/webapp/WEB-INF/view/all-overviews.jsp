<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        h2 {
            color: red;
        }
    </style>
</head>
<body>
<h2>Main page</h2>
<br>


<input type="button"  value="Add overview"
       onclick="window.location.href = 'addNewOverview'"/>

<br><br>
<input type="button"  value="Add user"
       onclick="window.location.href = 'addNewUser'"/>

</body>
</html>