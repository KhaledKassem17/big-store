<%-- 
    Document   : search
    Created on : Apr 14, 2017, 7:40:03 PM
    Author     : Saad
--%>

<%@include file="/pages/header.jsp"%>
<style>
    /* Style the tab */
    div.tab {
        overflow: hidden;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f1f1f1;
        margin-left: 40px;
        margin-right: 50px;
        margin-bottom: 20px;
    }

    /* Style the buttons inside the tab */
    div.tab button {
        background-color: inherit;
        float: left;
        border: none;
        outline: none;
        cursor: pointer;
        padding: 14px 16px;
        transition: 0.3s;
        font-size: 17px;
    }

    /* Change background color of buttons on hover */
    div.tab button:hover {
        background-color: #ddd;
    }

    /* Create an active/current tablink class */
    div.tab button.active {
        background-color: #ccc;
    }

    /* Style the tab content */
    .tabcontent {
        display: none;
        padding: 6px 12px;
        border: 1px solid #ccc;
        border-top: none;
        margin-left: 40px;
        margin-right: 50px;
    }

    div.search {
        overflow: hidden;
        width: 800px;
        height: 50px;
        padding-top: 20px;

        margin-left:570px;
        margin-bottom: 30px;
        margin-top: 25px;
    }
</style>

<br/>
<%
    String keyword = request.getParameter("keyword");
%>
<div class="tab">
    <button class="tablinks" onclick="openCity(event, 'companies')">Companies</button>
    <button class="tablinks" onclick="openCity(event, 'normaluser')">Normal users</button>
    <button class="tablinks" onclick="openCity(event, 'product')">Product</button>
    <button class="tablinks" onclick="openCity(event, 'categories')">Categories</button>
</div>
<div id="companies" class="tabcontent">
    <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
        <jsp:include page="/pages/dynamic/searches/companytab.jsp">
            <jsp:param name="keyword" value="<%=keyword%>" />
        </jsp:include>
    </div>
</div>

<div id="normaluser" class="tabcontent">
    <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
        <jsp:include page="/pages/dynamic/searches/normalusertab.jsp">
            <jsp:param name="keyword" value="<%=keyword%>"/>
        </jsp:include>
    </div>
</div>

<div id="product" class="tabcontent">
    <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
        <jsp:include page="/pages/dynamic/searches/producttab.jsp">
            <jsp:param name="keyword" value="<%=keyword%>"/>
        </jsp:include>
    </div>
</div>

<div id="categories" class="tabcontent">
    <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
        <jsp:include page="/pages/dynamic/searches/categorytab.jsp">
            <jsp:param name="keyword" value="<%=keyword%>"/>
        </jsp:include>
    </div>
</div>
<br/><br/>

<script>
    function openCity(evt, cityName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(cityName).style.display = "block";
        evt.currentTarget.className += " active";
    }
</script>
<%@include file="/pages/footer.jsp" %>
