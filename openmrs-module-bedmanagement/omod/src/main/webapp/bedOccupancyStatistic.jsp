<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="templates/bedHomeHeader.jsp"%>

<%@ include file="templates/bedsreportHeader.jsp"%>




<b class="boxHeader">Beds occupancy statistics</b>
<div class="box">
	<table style="width: 100%">
		<tr>
			<th style="width: 5%">#</th>
			<th style="width: 8%">Ward Name</th>
			<th style="width: 8%">Free beds</th>
			<th style="width: 8%">Occupied beds</th>
			<th style="width: 8%">Total beds</th>
		</tr>
		<c:forEach items="${bedOccupancies}" var="bedOccupancy"
			varStatus="status">
			<tr>				
				<td class="rowValue ${(status.count%2!=0)?'even':''}">${status.count}</td>
				<td class="rowValue ${(status.count%2!=0)?'even':''}">${bedOccupancy.ward.wardName}</td>
				<td class="rowValue ${(status.count%2!=0)?'even':''}">${bedOccupancy.countFreeBeds}</td>
				<td class="rowValue ${(status.count%2!=0)?'even':''}">${bedOccupancy.countBusyBeds}</td>
				<td class="rowValue ${(status.count%2!=0)?'even':''}">${bedOccupancy.totalBeds}</td>


			</tr>
		</c:forEach>

	</table>
</div>

<%@ include file="/WEB-INF/template/footer.jsp"%>

