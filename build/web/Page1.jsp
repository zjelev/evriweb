<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : 2008-6-27, 21:10:20
    Author     : ZJelev
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{Page1.form1}" id="form1" virtualFormsConfig="emp | username | username , save | table1:tableRowGroup1:tableColumn1:textField1 table1:tableRowGroup1:tableColumn2:textField2 table1:tableRowGroup1:tableColumn3:dropDown1 table1:tableRowGroup1:tableColumn4:textField3 table1:tableRowGroup1:tableColumn5:textField4 table1:tableRowGroup1:tableColumn6:textField5 table1:tableRowGroup1:tableColumn7:textField6 table1:tableRowGroup1:tableColumn8:textField7 table1:tableRowGroup1:tableColumn9:textField8 table1:tableRowGroup1:tableColumn10:textField9 table1:tableRowGroup1:tableColumn11:textField10 table1:tableRowGroup1:tableColumn12:textField11 mainGridPanel:table1:tableRowGroup1:tableColumn13:checkbox1 | save , add/revert | | buttonGridPanel:add buttonGridPanel:revert">
                        <webuijsf:dropDown binding="#{Page1.username}" converter="#{Page1.usernameConverter}" id="username"
                            items="#{Page1.empDataProvider.options['emp.nom,emp.name']}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'username');" style="left: 15px; top: 30px; position: absolute" valueChangeListenerExpression="#{Page1.username_processValueChange}"/>
                        <h:panelGrid columns="3" id="buttonGridPanel" style="height: 32px; left: 264px; top: 24px; position: absolute" width="384">
                            <webuijsf:button actionExpression="#{Page1.add_action}" id="add" text="Add Contact"/>
                            <webuijsf:button actionExpression="#{Page1.save_action}" binding="#{Page1.save}" id="save" text="Save Changes"/>
                            <webuijsf:button actionExpression="#{Page1.revert_action}" id="revert" text="Revert Changes"/>
                        </h:panelGrid>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 840px; top: 24px; position: absolute"/>
                        <h:panelGrid id="mainGridPanel" style="height: 96px; left: 0px; top: 72px; position: absolute" width="1104">
                            <webuijsf:table binding="#{Page1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1" paginateButton="true"
                                paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true" style="width: 69px" title="Активни Контакти" width="208">
                                <webuijsf:tableRowGroup binding="#{Page1.tableRowGroup1}" id="tableRowGroup1" rows="20"
                                    sourceData="#{Page1.contactsDataProvider}" sourceVar="currentRow">
                                    <webuijsf:tableColumn id="tableRowGroup1SelectionColumn"
                                        onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="tableRowGroup1SelectionChild">
                                        <webuijsf:checkbox id="tableRowGroup1SelectionChild" selected=""/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Кореспон- денция" id="tableColumn14" width="30">
                                        <webuijsf:button actionExpression="#{Page1.selectRow_action}" binding="#{Page1.selectRow}" id="selectRow" text="Покажи"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="№" id="tableColumn1" sort="contacts.nom" width="25">
                                        <webuijsf:textField columns="6" id="textField1" text="#{currentRow.value['contacts.nom']}"/>
                                        <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="company" id="tableColumn2" sort="contacts.company" width="151">
                                        <webuijsf:textField id="textField2" text="#{currentRow.value['contacts.company']}"/>
                                        <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="relation" id="tableColumn3" sort="contacts.relation">
                                        <webuijsf:dropDown converter="#{Page1.dropDown1Converter}" id="dropDown1"
                                            items="#{Page1.relationDataProvider.options['relation.nom,relation.otnoshenie']}" selected="#{currentRow.value['contacts.relation']}"/>
                                        <webuijsf:message for="dropDown1" id="message3" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="representative" id="tableColumn4" sort="contacts.representative">
                                        <webuijsf:textField id="textField3" text="#{currentRow.value['contacts.representative']}"/>
                                        <webuijsf:message for="textField3" id="message4" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="position" id="tableColumn5">
                                        <webuijsf:textField id="textField4" text="#{currentRow.value['contacts.position']}"/>
                                        <webuijsf:message for="textField4" id="message5" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="address" id="tableColumn6">
                                        <webuijsf:textField id="textField5" text="#{currentRow.value['contacts.address']}"/>
                                        <webuijsf:message for="textField5" id="message6" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="town" id="tableColumn7">
                                        <webuijsf:textField id="textField6" text="#{currentRow.value['contacts.town']}"/>
                                        <webuijsf:message for="textField6" id="message7" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="country" id="tableColumn8" sort="contacts.country">
                                        <webuijsf:textField id="textField7" text="#{currentRow.value['contacts.country']}"/>
                                        <webuijsf:message for="textField7" id="message8" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="phone" id="tableColumn9">
                                        <webuijsf:textField id="textField8" text="#{currentRow.value['contacts.phone']}"/>
                                        <webuijsf:message for="textField8" id="message9" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="GSM" id="tableColumn10">
                                        <webuijsf:textField id="textField9" text="#{currentRow.value['contacts.GSM']}"/>
                                        <webuijsf:message for="textField9" id="message12" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="fax" id="tableColumn11">
                                        <webuijsf:textField id="textField10" text="#{currentRow.value['contacts.fax']}"/>
                                        <webuijsf:message for="textField10" id="message11" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="email" id="tableColumn12" sort="contacts.email">
                                        <webuijsf:textField id="textField11" text="#{currentRow.value['contacts.email']}"/>
                                        <webuijsf:message for="textField11" id="message10" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="inactive" id="tableColumn13" sort="contacts.inactive">
                                        <webuijsf:checkbox id="checkbox1" selected="#{currentRow.value['contacts.inactive']}"/>
                                        <webuijsf:message for="checkbox1" id="message13" showDetail="false" showSummary="true"/>
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                        </h:panelGrid>
                        <h:panelGrid id="gridPanel1" style="height: 96px; left: 48px; top: 1296px; position: absolute" width="288"/>
                        <h:panelGrid id="gridPanel2" style="height: 96px; left: 384px; top: 1296px; position: absolute" width="408"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
