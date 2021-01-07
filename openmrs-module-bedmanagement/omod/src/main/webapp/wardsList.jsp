<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="templates/bedHomeHeader.jsp"%>

<h2>Ward  management</h2>

<a href="ward.form " style="float: right;">Add a new ward</a>
<br/>
<br/>
<b class="boxHeader">Current wards</b>
<div class="box">
<table style="width:100%">
	<tr>
		<th style="width:3%">#.</th>
		<th style="width:10%">Name</th>
		<th style="width:10%">Description</th>		
	</tr>
	<c:forEach items="${wardsList}" var="ward" varStatus="status">
		<tr>
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${status.count}</td>
			<td class="rowValue ${(status.count%2!=0)?'even':''}"><a href="specialty.form?specialityId=#">${ward.wardName}</a></td>			
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${ward.description}</td>
		 </tr>		
	</c:forEach>
</table>
</div>


<%@ include file="/WEB-INF/template/footer.jsp"%>
