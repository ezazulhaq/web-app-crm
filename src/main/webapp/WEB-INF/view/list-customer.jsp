<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRM Application</title>

    <link type="text/css" rel="stylesheet" href="/css/style.css">

</head>

<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>

    <div id="container">
        <div id="content">

            <input type="button" value="Add Customer" class="add-button"
                onclick="window.location.href='showFormForAdd'; return false;" />

            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>

                <c:forEach var="tempCustomer" items="${customers}">

                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerId" value="${tempCustomer.id}"></c:param>
                    </c:url>

                    <c:url var="deleteLink" value="/customer/deleteCustomer">
                        <c:param name="customerId" value="${tempCustomer.id}"></c:param>
                    </c:url>

                    <tr>
                        <td>
                            ${tempCustomer.firstName}
                        </td>
                        <td>
                            ${tempCustomer.lastName}
                        </td>
                        <td>
                            ${tempCustomer.email}
                        </td>
                        <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}"
                                onclick="if(!confirm('Are you sure you wanted to Delete this Customer?')) return false;">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>

</html>