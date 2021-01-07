<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="templates/bedHomeHeader.jsp"%>

<b>Admission Form</b>

<form action="bedAdmission.form" method="post">
	<fieldset>
		<b class="boxHeader">1. Select a patient:</b>
		<div class="box">
			<table cellpadding="3" cellspacing="0">
				<tr>
					<th>Patient:</th>
					<td><openmrs:fieldGen type="org.openmrs.Patient"
							formFieldName="patientId" val="${patient}" /></td>
				</tr>
			</table>
		</div>
		<br /> <b class="boxHeader">2.Admission properties :</b>
		<div class="box">
			<table cellpadding="3" cellspacing="0">
				<tr>
					<th>Admitted by:</th>
					<td><input type="text" name="admittedBy" size="18" value=" " /></td>
				</tr>
				<tr>
					<th>Admission date:</th>
					<td><input type="text" name="admissionDate" size="18"
						value=" " onclick="showCalendar(this)" /></td>
				</tr>
				<tr>
					<th>Department:</th>
					<td><input type="text" name="serviceId" size="18" value="" /></td>
				</tr>
				<tr>
					<th>Ward:</th>
					<td><input type="text" name="wardId" size="18" value="" /></td>
				</tr>
				<tr>
					<th>Bed:</th>
					<td><input type="text" name="bedId" size="18" value="" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="save admission" /></td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>

</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>