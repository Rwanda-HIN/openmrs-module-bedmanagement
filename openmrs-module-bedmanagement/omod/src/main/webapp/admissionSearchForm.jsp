<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="templates/bedHomeHeader.jsp"%>



<openmrs:portlet id="findPatient" url="findPatient" parameters="size=full|postURL=bedAdmission.form|showIncludeVoided=false|viewType=shortEdit|hideAddNewPatient=true" />

<!-- 
1.search patient take us to admission form
-Display wards list  with first page as default ward +beds status
2.Admission form has patient summary(Insurance policy details)+Beds list status
3.Check the beds the patient might be  admiited 
4.Submit the admission

 -->
<c:if test="${patient!= null}">

bed list

</c:if>


<%@ include file="/WEB-INF/template/footer.jsp"%>