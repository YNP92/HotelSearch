<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Display Hotels</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet" href="stylesheet.css">
</head>

<body>
	<table>
		<thead>
			<tr>
				<th class="city">Hotels in ${city}</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="hotel" items="${hotels}">
				<tr>
					<td class= "hotelname">${hotel.name}</td>
					<td class= "hotelprice">${hotel.pricePerNight}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/" class="button">Start new search</a>


</body>

</html>