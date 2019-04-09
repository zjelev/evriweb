<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Korespond
    Created on : 2008-6-29, 2:00:23
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
                    <webuijsf:form id="form1">
                        <h:panelGrid columns="2" id="gridPanel1" style="left: 24px; top: 24px; position: absolute" width="1896">
                            <webuijsf:table augmentTitle="false" id="table1" title="Table" width="0">
                                <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{Korespond.incomingDataProvider}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="nom" id="tableColumn1" sort="incoming.nom">
                                        <webuijsf:staticText id="staticText1" text="#{currentRow.value['incoming.nom']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="dat" id="tableColumn2" sort="incoming.dat">
                                        <webuijsf:staticText id="staticText2" text="#{currentRow.value['incoming.dat']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="company" id="tableColumn3" sort="incoming.company">
                                        <webuijsf:staticText id="staticText3" text="#{currentRow.value['incoming.company']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="type" id="tableColumn7" sort="incoming.type">
                                        <webuijsf:staticText id="staticText7" text="#{currentRow.value['incoming.type']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="empl" id="tableColumn8" sort="incoming.empl">
                                        <webuijsf:staticText id="staticText8" text="#{currentRow.value['incoming.empl']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="content" id="tableColumn9" sort="incoming.content">
                                        <webuijsf:staticText id="staticText9" text="#{currentRow.value['incoming.content']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="requestfor" id="tableColumn10" sort="incoming.requestfor">
                                        <webuijsf:staticText id="staticText10" text="#{currentRow.value['incoming.requestfor']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="orderto" id="tableColumn11" sort="incoming.orderto">
                                        <webuijsf:checkbox id="checkbox1" selected="#{currentRow.value['incoming.orderto']}"/>
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                            <webuijsf:table augmentTitle="false" id="table2" title="Table" visible="false" width="0">
                                <webuijsf:tableRowGroup id="tableRowGroup2" rows="10" sourceData="#{Korespond.outgoingDataProvider}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="nom" id="tableColumn4" sort="outgoing.nom">
                                        <webuijsf:staticText id="staticText4" text="#{currentRow.value['outgoing.nom']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="dat" id="tableColumn5" sort="outgoing.dat">
                                        <webuijsf:staticText id="staticText5" text="#{currentRow.value['outgoing.dat']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="company" id="tableColumn6" sort="outgoing.company">
                                        <webuijsf:staticText id="staticText6" text="#{currentRow.value['outgoing.company']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="type" id="tableColumn12" sort="outgoing.type">
                                        <webuijsf:staticText id="staticText11" text="#{currentRow.value['outgoing.type']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="empl" id="tableColumn13" sort="outgoing.empl">
                                        <webuijsf:staticText id="staticText12" text="#{currentRow.value['outgoing.empl']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="content" id="tableColumn14" sort="outgoing.content">
                                        <webuijsf:staticText id="staticText13" text="#{currentRow.value['outgoing.content']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="requestfor" id="tableColumn15" sort="outgoing.requestfor">
                                        <webuijsf:staticText id="staticText14" text="#{currentRow.value['outgoing.requestfor']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="orderto" id="tableColumn16" sort="outgoing.orderto">
                                        <webuijsf:checkbox id="checkbox2" selected="#{currentRow.value['outgoing.orderto']}"/>
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                        </h:panelGrid>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
