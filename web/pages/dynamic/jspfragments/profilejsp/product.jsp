<%-- 
    Document   : product
    Created on : Apr 25, 2017, 2:36:11 PM
    Author     : tito
--%>

<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.SubCategory"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<head>

    <style>
        .mergen{
            height: 10px;
            clear: both;
        }

        .addedit-div{
                        width: 60%;
                        margin: 10px auto;
                        border: 2px solid #acacac;
                        padding:10px;
                        top:50px;
        }

    </style>

</head>

<!--========================= Add or update product===========================-->

<%

    ProductController pc = new ProductController();

    User user = (User) request.getAttribute("user");

    // id of prouduct  to be edited
    int prdct_id = 0;
    if (request.getParameter("edit") != null) {
        prdct_id = Integer.parseInt(request.getParameter("edit"));

    }

%>

<div class="addedit-div row" style="width: 60%;margin: 0 auto;">
    <div style="background: #FFF;width: 60%;margin: 0 auto;" class="row" >
        <label class=" label label-info col-xs-12" style="font-size: 30px;padding:10px;">
            <% if (prdct_id == 0) {%>
            Add New Product
            <%} else {
                out.print("Edit Product");
                }%>
        </label>
    </div>
    <div class="mergen" ></div>

    <div class="col-md-12" style="background-color: #FFF;" >
        <form method="POST" enctype="multipart/form-data">

            <fieldset>
                <%  Product prd = new Product(); %>
                <%
                    if (prdct_id != 0) {
                        prd = pc.getProudct(prdct_id);
                    }
                %>



                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product-name">product name</label>  
                    <div class="col-md-6">
                        <input id="name" name="product-name" type="text" placeholder="product name" class="form-control input-md" required="true"
                               value="
                               <%
                                   if (prdct_id != 0) {
                                       out.print(prd.getProduct_name());
                                   }
                               %>"
                               />

                    </div>
                </div>

                <div class="mergen" ></div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product-desc">Description</label>  
                    <div class="col-md-6">
                        <input id="email" name="product-desc" type="text" placeholder="write particular description for item" class="form-control input-md" required="true"
                               value="<%
                                   if (prdct_id != 0) {
                                       out.print(prd.getProduct_details());
                                   }
                               %>"
                               />

                    </div>
                </div>

                <div class="mergen" ></div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product-price">price - unit</label>  
                    <div class="col-md-6">
                        <input id="company" name="product-price" type="number" placeholder=" 10 LE" class="form-control input-md" required="true"
                               value="<%
                                   if (prdct_id != 0) {
                                       out.print(prd.getProduct_price());
                                   }
                               %>"
                               />

                    </div>
                </div>
                <div class="mergen" ></div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="category">category</label>
                    <div class="col-md-6">

                        <% String prdct_cat = "";
                            if (prdct_id != 0) {
                                prdct_cat = prd.getProduct_category().getCat_name();
                            } %>
                        <select id="selectbasic" name="category" class="form-control">
                            <% ArrayList<SubCategory> prs = pc.getSubCategories(); %>

                            <% for (SubCategory sub : prs) {%>
                            <option 
                                <%     if (prdct_id != 0) {
                                        if (prdct_cat.equals(sub.getCat_name())) {
                                            out.print("selected");
                                        }
                                    }%>

                                value="<%=sub.getSub_cat_id()%>"><%=sub.getCat_name()%></option>
                            <%}%>
                        </select>
                    </div>

                </div>
                <div class="mergen" ></div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="textinput">Expired date</label>  
                    <div class="col-md-6">
                        <input id="textinput" name="expire-date" type="date" placeholder="Expiry Date" class="form-control input-md" value="<%=prd.getExpiry_date()%>" />

                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="mergen" ></div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="imgbutton">Product Image </label>
                    <div class="col-md-6" >
                        <input id="filebutton" name="imgbutton" class="input-file" type="file" accept="image/gif , image/png , image/jpeg"  onchange="readUrl(this)" />
                        <img id="pr-img" style="width: 350px;height: 350px" class="center-block img-thumbnail" alt="image" 
                             src="<%
                                 if (prdct_id != 0) {
                                     out.print("../jspfragments/retrive_image.jsp?imgId=" + prd.getProduct_id());
                                 } %>" />
                    </div>
                </div>

                <div class="mergen" ></div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="singlebutton"></label>
                    <div class="col-md-4">

                        <%-- if the user request page not edit product --%>
                        <%  if (prdct_id == 0) { %>
                        <center>  <input style = "margin: 10px" class ="btn btn-primary" type="submit" value="Save product" onclick="form.action = 'http://localhost:8080/SoftwareProject/SaveProduct'"></center>
                            <%-- if the user request page to edit product --%>
                            <% } else {
                            %>
                        <input type="hidden" name="edit_id" value="<%=prdct_id%>" />
                        <center>  <input style = "margin: 10px" class ="btn btn-primary" type="submit" value="Update product" onclick="form.action = 'http://localhost:8080/SoftwareProject/UpdateProduct'"></center>

                        <% }%>

                    </div>
                </div>
                <input name="userIdHidden" type="hidden" value="<%= user.getUser_id()%>" />


            </fieldset>
        </form>

    </div>
</div>