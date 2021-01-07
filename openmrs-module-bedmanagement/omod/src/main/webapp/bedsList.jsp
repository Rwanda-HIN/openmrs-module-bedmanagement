<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="templates/bedHomeHeader.jsp"%>

<h2>Bed  management</h2>

<a href="bed.form " style="float: right;">Add  new bed</a>
<br/>
<b class="boxHeader">Current beds</b>
<div class="box">
<table style="width:100%">
	<tr>
		<th style="width:3%">#.</th>
		<th style="width:10%">Ward</th>
		<th style="width:10%">Bed Number</th>	
		<th style="width:10%">created date</th>	
		<th style="width:10%">Action</th>		
	</tr>
	<c:forEach items="${bedsList}" var="bed" varStatus="status">
		<tr>
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${status.count}</td>
			<td class="rowValue ${(status.count%2!=0)?'even':''}"><a href="#">${bed.ward.wardName}</a></td>	
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${bed.bedNumber}</td>	
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${bed.createdDate}</td>	
			<td class="rowValue ${(status.count%2!=0)?'even':''}"><a href="">Edit</a>|<a href="">Delete</a></td>
		 </tr>		
	</c:forEach>
</table>
</div>


<%@ include file="/WEB-INF/template/footer.jsp"%>
