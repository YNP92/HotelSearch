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
	<h1>Hotels in ${city}</h1>
	<table>
		<thead>
			<tr>
				<th style="text-align:left"class="city">Hotel name</th>
				<th style="text-align:right"class="city">Price per night</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="hotel" items="${matchedSearch}">
				<tr>
					<td style="text-align:right" class= "hotelname">${hotel.hotelName}</td><br>
					<td style="text-align:right" class= "hotelprice">${hotel.pricePerNight}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/" class="button">Start new search</a>


</body>

</html>