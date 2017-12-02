{
 "Header": {
	 "name": "${headerData.headerDetailName}",
	 "AnotherObject": {
		 "ClassName": "${headerData.getObj().getSomeClassName()}",
		 }
	 }
 },
 "RequestData": {
 	 <#list requestList as requestListItems>
	 "requestDataItems": {
		 "id": "${requestListItems.id}",
		 "population": ${requestListItems.population},
		 "name": "${requestListItems.name}",
	 }<#if requestListItems_has_next>,</#if>
	 </#list>
 }