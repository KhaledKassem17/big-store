
<%@page import="com.software.team.BigStore.Controllers.QuestionController"%>
<%@page import="com.software.team.BigStore.model.Answer"%>
<%@page import="com.software.team.BigStore.model.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@include file="/pages/header.jsp" %>

<!-- //navigation -->
<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">FAQ</li>
			</ol>
		</div>
	</div>
<!-- //breadcrumbs -->
<!-- help-page -->
	<div class="faq-w3agile">
		<div class="container">

                   <!-- ابدئوااااااااااااااااااامن هنا -------------------------------------------------------------------->

			<h2 class="w3_agile_header">Frequently asked questions(FAQ)</h2> 
                        <br/><br/>
<%! User user = null ;%>
<% if (session.getAttribute("normal") != null) {
        user = (User) session.getAttribute("normal");
        request.setAttribute("user", user);
    } else if (session.getAttribute("company") != null) {
        user = (User) session.getAttribute("company");
        request.setAttribute("user", user);
    }
%>

                        <%if(user != null){%>
                        <form action="http://localhost:8080/SoftwareProject/QuestionServlet" method="POST">
                            <textarea class="form-control input-md" style = "width: 100%" name="question" placeholder="Type a Question!" cols="3"></textarea>
                            <input type="submit" style = "margin: 10px" class ="btn btn-primary" value="Ask Question"/>
                        </form>
                        <%}%>

                        <%
                            ArrayList<Question> questions ;
                            ArrayList<Answer> answers ;

                            QuestionController qc = new QuestionController();

                            questions = qc.getAllQuestions();

                            for(Question q : questions){
                                answers = qc.getAllAnswersForThatQuestion(q.getQuestionId());
%>

                        <ul class="faq">
				<li class="item<%=q.getQuestionId()%>">
                                    <% if(user.getUser_id() == q.getOwner().getUser_id()){ %>
                                        <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><img height="30" width="30" src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?userId=<%=q.getOwner().getUser_id()%>"  alt="<%=q.getOwner().getUser_name()%> photo"/><p style="color:#4286f4"><%=q.getOwner().getUser_name()%></p></a>
                                    <%} else {%>
                                        <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=q.getOwner().getUser_id()%>"><img height="30" width="30" src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?userId=<%=q.getOwner().getUser_id()%>"  alt="<%=q.getOwner().getUser_name()%> photo"/><p style="color:#4286f4"><%=q.getOwner().getUser_name()%></p> </a>
                                    <%}%>
                                        <a href="#" title="click here" style="color:#646a72"><p style="font-size: medium"><%=q.getQuestion_content()%></p><p><%=q.getQuestion_date()%></p></a>
                                    <ul>
                                        <% for(Answer a : answers){ %>
                                        <li class="subitem<%=a.getAnswer_id()%>">
                                        <% if(user.getUser_id() == a.getAnswerer().getUser_id()){ %>
                                            <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><img height="30" width="30" src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?userId=<%=a.getAnswerer().getUser_id()%>"  alt="<%=a.getAnswerer().getUser_name()%> photo"/><p style="color:#4286f4"><%=a.getAnswerer().getUser_name()%></p> </a>
                                        <%} else {%>
                                            <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=a.getAnswerer().getUser_id()%>"><img height="30" width="30" src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?userId=<%=a.getAnswerer().getUser_id()%>"  alt="<%=a.getAnswerer().getUser_name()%> photo"/><p style="color:#4286f4"><%=a.getAnswerer().getUser_name()%></p></a>
                                        <%}%>
                                            <a style="color:#646a72"><p style="font-size: small"><%=a.getAnswer_content()%></p><br/><%=a.getDate()%></a>
                                        <hr>
                                        </li>
                                        <%}%>
                                        <%if(user != null){%>
                                        <li>
                                            <form action="http://localhost:8080/SoftwareProject/AnswerServlet" method="POST">
                                                <input class="form-control input-md" style="width: 100%" type="text" name="answer" placeholder="Type your answer" />
                                                <input type="hidden" name="question_id" value="<%=q.getQuestionId()%>"/>
                                                <input type="submit" hidden=""/>
                                            </form>
                                        </li>
                                        <%}%>
                                    </ul>
				</li>
                                <%}%>
			</ul>
            <!-- الى هنا ---------------------------------------------------------------------------------.
			<!-- script for tabs -->
			<script type="text/javascript">
				$(function() {
				
					var menu_ul = $('.faq > li > ul'),
						   menu_a  = $('.faq > li > a');
					
					menu_ul.hide();
				
					menu_a.click(function(e) {
						e.preventDefault();
						if(!$(this).hasClass('active')) {
							menu_a.removeClass('active');
							menu_ul.filter(':visible').slideUp('normal');
							$(this).addClass('active').next().stop(true,true).slideDown('normal');
						} else {
							$(this).removeClass('active');
							$(this).next().stop(true,true).slideUp('normal');
						}
					});
				
				});
			</script>
			<!-- script for tabs -->   
		</div>
	</div>
<!-- //footer -->

<%@include file="/pages/footer.jsp" %>
