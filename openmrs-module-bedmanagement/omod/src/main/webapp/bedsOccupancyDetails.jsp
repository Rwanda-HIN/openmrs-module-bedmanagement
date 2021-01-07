<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="templates/bedHomeHeader.jsp"%>

<form action="#" method="post">
	<fieldset style="clear: both">
		<legend>Choose properties</legend>
		<div style="margin: 0.5em 0;">
			<table>
				<tr>
					<td>Ward :</td>
					<td><select name="wardId">

							<option value="">General ward</option>
							<option value="">Pediatric ward</option>
							<option value="">Internal Medecine ward</option>

					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Search admission" /></td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</form>
<br />
<br />
<br />
<b class="boxHeader">Beds availablity</b>
<div class="box">
	<table style="width: 100%">
		<tr>
			<th style="width: 5%">#.</th>
			<th style="width: 8%">Bed Number</th>
			<th style="width: 8%">Status</th>
			<th style="width: 8%">Action</th>
		</tr>		
		<c:forEach items="${bedsList}" var="bed" varStatus="status">
		<tr>
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${status.count}</td>
			<td class="rowValue ${(status.count%2!=0)?'even':''}">${bed.bedNumber}</td>	
			<td class="rowValue ${(status.count%2!=0)?'even':''}">Available</td>		
				
			<td class="rowValue ${(status.count%2!=0)?'even':''}"><a href="">Admit Patient</a></td>
		 </tr>		
	</c:forEach>
				
		
	</table>
</div>





<%@ include file="/WEB-INF/template/footer.jsp"%>