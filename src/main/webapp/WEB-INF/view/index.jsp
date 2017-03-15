<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Стандартный кредитный отчет. ИНН - [${user.inn}]</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />"/>
</head>
<body>
	<div class="col-md-row green-line">
		<div class="col-md-12">1. Идентификация Субъекта Кредитной Истории (СКИ)</div>
	</div>
	
	<div class="col-md-row">
		<div class="col-md-12">
		<table border="0" cellspacing="1" cellpadding="0" width="100%"><tbody>
                <tr>  
                    <td class="lsmal" width="20%" align="right" style="font-size:11px;">Ф.И.О. субьекта (рус):</td>  
                    <td class="lsmalb" width="27%">${user.surname} ${user.name} ${user.middleName}</td>  
                    <td class="lsmal" width="20%" align="right" style="font-size:11px;">Ф.И.О. субьекта (укр):</td>  
                    <td class="lsmalb" width="27%">${user.surname} ${user.name} ${user.middleName}</td></tr>
                <tr> <td class="lsmal" align="right" style="font-size:11px;">ИНН субьекта :</td> 
                    <td class="lsmalb">${user.inn}</td> 
                    <td class="lsmal" align="right" style="font-size:11px;">Семейное положение :</td> 
                    <td class="lsmalb">&nbsp;Женат</td></tr><tr>
                    <td class="lsmal" align="right" style="font-size:11px;">Дата рождения :</td> 
                    <td class="lsmalb">${user.birthday}</td> 
                    <td class="lsmal" align="right" style="font-size:11px;">Серия и номер паспорта :</td> 
                    <td class="lsmalb">&nbsp;АК 459678</td></tr><tr> 
                    <td class="lsmal" align="right" style="font-size:11px;">Пол субьекта :</td> 
                    <td class="lsmalb">&nbsp;мужской</td> <td class="lsmal" align="right" style="font-size:11px;">Дата выдачи паспорта :</td> 
                    <td class="lsmalb">&nbsp;11.05.2008</td></tr><tr> 
                    <td class="lsmal" align="right" style="font-size:11px;">Адрес регистрации :</td> 
                    <td class="lsmalb">&nbsp; 49024 UA ДНЕПРОПЕТРОВСКАЯ  ДНЕПРОПЕТРОВСК      ЛЕНИНА  11             </td> 
                    <td class="lsmal" align="right" style="font-size:11px;">Дата обновления данных :</td> 
                    <td class="lsmalb">&nbsp;26.11.2011</td></tr><tr> 
                    <td class="lsmal" align="right" style="font-size:11px;">Адрес почтовый :</td> 
                    <td class="lsmalb">&nbsp; 49024 UA ДНЕПРОПЕТРОВСКАЯ  ДНЕПРОПЕТРОВСК      ЛЕНИНА  11             </td> 
                    <td class="lsmal" align="right" style="font-size:11px;">ЕГРПОУ места работы :</td> <td class="lsmalb">&nbsp;33546706 </td>
                </tr><tr> <td class="lsmal" align="right" style="font-size:11px;">Адрес проживания :</td> <td class="lsmalb">&nbsp;49024 UA ДНЕПРОПЕТРОВСКАЯ  ДНЕПРОПЕТРОВСК      ЛЕНИНА  11</td>
                <td class="lsmal" align="right" style="font-size:11px;">Место работы :</td><td class="lsmalb">&nbsp;ООО "Украинское бюро кредитных историй" </td></tr></tbody>
                </table><br>
		</div>
	</div>
</body>
</html>
