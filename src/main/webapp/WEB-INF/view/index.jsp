<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Стандартный кредитный отчет. ИНН - [${user.inn}]</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />


</head>
<body>
	<div class="col-md-row green-line">
		<div class="green-line col-md-12">
			1. Идентификация Субъекта Кредитной Истории (СКИ)
			<div style="text-align: right">
				Блок истории идентификации<a href="#" onclick="openbox('box'); return false"><img
					src='<c:url value="/resources/images/man.png"></c:url>' /></a>
			</div>
		</div>
	</div>

	<div class="col-md-row">
		<div class="col-md-12">
			<table id="ch" class="hidden-table" border="0" cellspacing="1"
				cellpadding="0" width="100%">
				<tbody>
					<tr>
						<td class="lsmal" width="20%" align="right"
							style="font-size: 11px;">Ф.И.О. субьекта (рус):</td>
						<td class="lsmalb" width="27%">${user.surname} ${user.name}
							${user.middleName}</td>
						<td class="lsmal" width="20%" align="right"
							style="font-size: 11px;">Ф.И.О. субьекта (укр):</td>
						<td class="lsmalb" width="27%">${user.surname} ${user.name}
							${user.middleName}</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">ИНН
							субьекта :</td>
						<td class="lsmalb">${user.inn}</td>
						<td class="lsmal" align="right" style="font-size: 11px;">Семейное
							положение :</td>
						<td class="lsmalb">${user.familyStatus}</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">Дата
							рождения :</td>
						<td class="lsmalb">${user.birthday}</td>
						<td class="lsmal" align="right" style="font-size: 11px;">Серия
							и номер паспорта :</td>
						<td class="lsmalb">${document.seria}${document.number}</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">Пол
							субьекта :</td>
						<td class="lsmalb">${user.gender}</td>
						<td class="lsmal" align="right" style="font-size: 11px;">Дата
							выдачи паспорта :</td>
						<td class="lsmalb">${document.dateOfCreation}</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">Адрес
							регистрации :</td>
						<td class="lsmalb">${address.index}${address.country }
							${address.state } ${address.city } ${address.street }
							${address.homeNumber }</td>
						<td class="lsmal" align="right" style="font-size: 11px;">Дата
							обновления данных :</td>
						<td class="lsmalb">${user.lastModified }</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">Адрес
							почтовый :</td>
						<td class="lsmalb">${address.index}${address.country }
							${address.state } ${address.city } ${address.street }
							${address.homeNumber }</td>
						<td class="lsmal" align="right" style="font-size: 11px;">ЕГРПОУ
							места работы :</td>
						<td class="lsmalb">${work.EGRPOUofWork }</td>
					</tr>
					<tr>
						<td class="lsmal" align="right" style="font-size: 11px;">Адрес
							проживания :</td>
						<td class="lsmalb">${address.index}${address.country }
							${address.state } ${address.city } ${address.street }
							${address.homeNumber }</td>
						<td class="lsmal" align="right" style="font-size: 11px;">Место
							работы :</td>
						<td class="lsmalb">${work.work }</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div id="box" style="display: none;">
	<div  class="col-md-row green-line">
		<div class="green-line col-md-12">1.1. История идентификации СКИ</div>
	</div>
	<div  class="col-md-row">
		<div  class="col-md-12">
			<table border="0" cellspacing="1" cellpadding="0" width="100%">
				<th class="lsmal">Дата изм.</th>
				<th class="lsmal">Ф.И.О субьекта</th>
				<th class="lsmal">Семейное положение</th>
				<th class="lsmal">Дата рождения</th>
				<th class="lsmal">Пол субьекта</th>
				<th class="lsmal">ОКПО места работы</th>
				<c:forEach var="user" items="${userChanges}">
					<tr align="center">
						<td class="lsmal">${user.lastModified}</td>
						<td class="lsmal">${user.surname}${user.name}
							${user.middleName }</td>
						<td class="lsmal">${user.familyStatus}</td>
						<td class="lsmal">${user.birthday}</td>
						<td class="lsmal">${user.gender}</td>
						<td class="lsmal"></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

	<div class="col-md-row green-line">
		<div class="green-line col-md-12">1.2. История документов СКИ</div>
	</div>
	<div class="col-md-row">
		<div class="col-md-12">
			<table border="0" cellspacing="1" cellpadding="0" width="100%">
				<th class="lsmal">Дата изм.</th>
				<th class="lsmal">Серия и номер паспорта</th>
				<th class="lsmal">Кем выдан</th>
				<th class="lsmal">Дата выдачи</th>
				<c:forEach var="document" items="${documents}">
					<tr align="center">
						<td class="lsmal">${document.dateOfChange}</td>
						<td class="lsmal">${document.seria}${document.number}</td>
						<td class="lsmal">${document.whoGave}</td>
						<td class="lsmal">${document.dateOfCreation}</td>
						<td class="lsmal"></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>


	<div class="col-md-row green-line">
		<div class="green-line col-md-12">1.3. История адресов СКИ</div>
	</div>
	<div class="col-md-row">
		<div class="col-md-12">
			<table border="0" cellspacing="1" cellpadding="0" width="100%">
				<th class="lsmal">Тип адреса</th>
				<th class="lsmal">История изм</th>
				<c:forEach var="address" items="${addresses}">
					<tr align="center">
						<td class="lsmal">${address.typeRef}</td>
						<td class="lsmal">${address.dateOfChange}${address.index}
							${address.country } ${address.state } ${address.city }
							${address.street } ${address.homeNumber }</td>
						<td class="lsmal"></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>


	<div class="col-md-row green-line">
		<div class="green-line col-md-12">2. Контакты (new)</div>
	</div>
	<div class="col-md-row">
		<div class="col-md-12">
			<table border="0" cellspacing="1" cellpadding="0" width="100%">
				<th class="lsmal">Тип контакта</th>
				<th class="lsmal">Дата актуализации</th>
				<th class="lsmal">Контакт</th>
				<c:forEach var="contact" items="${phoneContact}">
					<tr align="center">
						<td class="lsmal"><c:if test="${contact.type ==1}"><img
					src='<c:url value="/resources/images/contact11.png"></c:url>' /></c:if>  <c:if test="${contact.type==2 }"><img
					src='<c:url value="/resources/images/contact22.png"></c:url>' /></c:if>  <c:if test="${contact.type==3}"><img
					src='<c:url value="/resources/images/contact44.png"></c:url>' /></c:if> <c:if test="${contact.type==4}"><img
					src='<c:url value="/resources/images/12633-200.png"></c:url>' width=32 height=34/></c:if></td>
						<td class="lsmal">${contact.dateOfContact }</td>
						<td class="lsmal">${contact.contact }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>


<table width="100%" cellspacing="0" cellpadding="0" border="0">
     <tbody><tr>
     <td class="lsmalb" width="1%" valign="top"><font style="font-size:24px;">*</font></td>
	 <td class="lsmal" width="99%">
     <font class="titlerus">BNK</font> - Банк<br><font class="titlerus">FIN</font> - Финансовая организация<br><font class="titlerus">OWN</font> - кредит Вашего банка/финансовой организации
	 </td>
     <td class="lsmal">&nbsp;
     
	 </td>	 <td class="lsmal">&nbsp;
     
	 </td>
	 </tr>
	 </tbody></table>
	 
	 
	<script>
	function openbox(id){
	    display = document.getElementById(id).style.display;
	 
	    if(display=='none'){
	       document.getElementById(id).style.display='block';
	    }else{
	       document.getElementById(id).style.display='none';
	    }
	}

	</script>
</body>
</html>
