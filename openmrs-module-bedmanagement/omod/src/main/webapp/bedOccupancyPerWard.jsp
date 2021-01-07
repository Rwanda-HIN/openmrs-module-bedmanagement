<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="templates/bedHomeHeader.jsp"%>
<%@ include file="templates/admissionHeader.jsp"%>

<c:if test="${bedsList!=null}">
	<br /> <b class="boxHeader">Beds occupancy in #  </b>
	<div class="box">
		<table>
			<tr>
				<th style="width: 3%">#.</th>
				<th style="width: 10%">Ward</th>
				<th style="width: 10%">Bed Number</th>
				<th style="width: 10%">Status</th>
				<th style="width: 10%">Patient</th>
				<th style="width: 10%">Admission date</th>				
				<th style="width: 10%">Action</th>
			</tr>
			<c:forEach items="${bedsList}" var="bed" varStatus="status">
				<tr>
					<td class="rowValue ${(status.count%2!=0)?'even':''}">${status.count}</td>
					<td class="rowValue ${(status.count%2!=0)?'even':''}"><a
						href="#">${bed.ward.wardName}</a></td>
					<td class="rowValue ${(status.count%2!=0)?'even':''}">${bed.bedNumber}</td>
					<td class="rowValue ${(status.count%2!=0)?'even':''}">Free</td>
					<td class="rowValue ${(status.count%2!=0)?'even':''}">-- </td>
						<td class="rowValue ${(status.count%2!=0)?'even':''}">---</td>
					<td class="rowValue ${(status.count%2!=0)?'even':''}"><a
						href="bedAdmission.form?bedId=100">Admit</a>|<a href="discharge.form?patientId=10987">Discharge</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</c:if>
<%@ include file="/WEB-INF/template/footer.jsp"%>