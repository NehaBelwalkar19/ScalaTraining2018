$(document).ready(function(){
    alert("In js");

    $("#addBog").click(function(){
        var text = $("#textBog").val();
        $("#blogPara").append("<br/>" +text);
        $("#blogPara").append("<br/>" + new Date($.now())+ "<br/><br/>");
        $("#textBog").val('');
    });
});