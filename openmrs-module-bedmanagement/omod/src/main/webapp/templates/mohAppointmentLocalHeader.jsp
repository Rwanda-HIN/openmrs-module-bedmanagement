<ul id="menu">
	<openmrs:hasPrivilege
		privilege="Appointment Configuration - View Appointment Admin">
		<li
			class="<c:if test='<%=request.getRequestURI().contains("appointmentHome")%>'> active</c:if>">
			<a href="specialities.list">Appointment Admin</a>
		</li>
	</openmrs:hasPrivilege>
	<openmrs:hasPrivilege privilege="Manage Provider scheduling">
		<li
			class="<c:if test='<%=request.getRequestURI().contains("searchProviderSchedule")%>'> active</c:if>">
			<a href="searchProviderSchedule.form">Manage Provider Scheduling</a>
		</li>
	</openmrs:hasPrivilege>

	<openmrs:hasPrivilege privilege="Manage appointment">
		<li
			class="<c:if test='<%=request.getRequestURI().contains("appointmentsList")%>'> active</c:if>">
			<a href="appointments.list">Manage appointments</a>
		</li>
	</openmrs:hasPrivilege>

	<openmrs:hasPrivilege privilege="View Appointments reports">
		<li
			class="<c:if test='<%=request.getRequestURI().contains("appointmentReport")%>'> active</c:if>">
			<a href="appointmentReport.form">Appointments Report</a>
		</li>
	</openmrs:hasPrivilege>

</ul>

<!-- Here I would like to set the totals at the bottom -->
<style>
.columnHeader {
	background: none repeat scroll 0 0 #E6E6E6;
	border: 1px solid #D3D3D3;
	color: #555555;
	cursor: pointer;
	font-size: 0.8em;
	font-weight: normal;
	margin: 0;
	padding: 3px 0 3px 5px;
	text-align: left;
}

.rowValue {
	font-size: 0.8em;
	font-weight: normal;
	margin: 0;
	padding: 5px;
	vertical-align: top;
	border-top: 1px solid cadetblue;
}

.rowAmountValue {
	font-size: 0.8em;
	font-weight: normal;
	margin: 0;
	padding: 5px;
	/* Here I would like to set the totals at the bottom*/
	vertical-align: bottom;
	border-top: 1px solid cadetblue;
	border-right: 1px solid cadetblue;
	border-left: 1px solid cadetblue;
}

.rowTotalValue {
	font-size: 0.8em;
	font-weight: normal;
	margin: 0;
	padding: 5px;
	vertical-align: top;
	border-top: 1px solid cadetblue;
	border-right: 1px solid cadetblue;
	border-bottom: 1px solid cadetblue;
	border-left: 1px solid cadetblue;
}

.even {
	background-color: whitesmoke;
}

.numbers {
	text-align: right;
	background-color: whitesmoke;
}

.amount {
	text-align: right;
	background-color: #C9DAFF;
	border: 2px solid #000000;
	font-weight: bold;
}

.right {
	text-align: right;
}

.center {
	text-align: center;
}

.searchRow:hover {
	background: #F0E68C;
	cursor: pointer;
}
</style>