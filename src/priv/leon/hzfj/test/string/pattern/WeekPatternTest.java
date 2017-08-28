package priv.leon.hzfj.test.string.pattern;

import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.string.pattern.WeekPattern;

import java.util.ArrayList;

public class WeekPatternTest {
    public static void main(String[] args){
        String s="\n" +
                "\n" +
                "\n" +
                "\n" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "\t<head>\n" +
                "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "\t\t<title>资讯列表-资讯中心-透明售房网</title>\n" +
                "\t\t<meta name=\"keywords\" content=\"房产,杭州房产,房地产,杭州房价,杭州买房,杭州租房,新房,二手房,写字楼,商铺,房产新闻,一房一价,透明点评,房价走势\" />\n" +
                "\t\t<meta name=\"description\" content=\"透明售房网(www.tmsf.com)成立于2004年，网站提供权威、即时、准确的商品房、二手房交易数据，发布房产资讯、房产政策等内容，是老百姓买房、卖房的重要参考网站。\" />\n" +
                "\t\t<link href=\"/hzweb/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\t\t<link href=\"/hzweb/css/newslist_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\t\t<script type=\"text/javascript\" src=\"/hzweb/js/jquery-1.7.2.min.js\"></script>\n" +
                "\t\t\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\t\t$(document).ready(function(){\n" +
                "\t\t\t\tif($('#keywords').val() != ''){\n" +
                "\t\t\t\t\t$('#searchword2').val(unescape($('#keywords').val()));\n" +
                "\t\t\t\t}\n" +
                "\t\t\t});\n" +
                "\t\t\n" +
                "\t\t\tfunction doPage(a) {\n" +
                "\t\t\t\t$('#page').val(a);\n" +
                "\t\t\t\t$('#search').submit();\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\tfunction saveKeyword(){\n" +
                "\t\t\t\tif($('.page_search #searchword2').val() == '' || $('.page_search #searchword2').val() == '热门资讯搜索'){\n" +
                "\t\t\t\t\t$('#search #keywords').val('');\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\telse {\n" +
                "\t\t\t\t\tvar txt = escape($.trim($('.page_search #searchword2').val()));\n" +
                "\t\t\t\t\t$('#search #keywords').val(txt);\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t$('#search').submit();\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t</script>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<div class=\"page_topbar\">\n" +
                "\t<div class=\"pagebar_main\">\n" +
                "\t\t<div class=\"login\">\n" +
                "\t\t\t\n" +
                "\t\t\t<span id=\"mem_enter_info\"></span>\n" +
                "\t\t</div>\n" +
                "\t\t<div class=\"subsite\">\n" +
                "\t\t\t<a href=\"/\">网站首页</a> |\n" +
                "\t\t\t<a href=\"/hzweb/newhouse/\" target=\"_blank\" >新房</a> |\n" +
                "\t\t\t<a href=\"/hzweb/esf/\" target=\"_blank\">二手房</a> |\n" +
                "\t\t\t<a href=\"/hzweb/info/\" target=\"_blank\">资讯</a> <a href=\"/hzweb/info/indexcreate.jsp\" target=\"_blank\">原创</a> <a href=\"/hzweb/info/specialIndex.jsp\" target=\"_blank\">专题</a> |\n" +
                "\t\t\t<a href=\"/hzweb/cityarea/\" target=\"_blank\">城区板块</a> |\n" +
                "\t\t\t<a href=\"/hzweb/housetype/\" target=\"_blank\">房屋类别</a> |\n" +
                "\t\t\t<a href=\"/info/search_338_33.htm\" target=\"_blank\">透明点评</a> |\n" +
                "\t\t\t<a href=\"/info/tools_33.htm\" target=\"_blank\">购房工具</a> |\n" +
                "\t\t\t<a href=\"http://map.tmsf.com/map.html?locationtype=city&locationid=33\" target=\"_blank\">地图</a>\n" +
                "\t\t\t\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<script type=text/javascript src=\"/js/jquery.cookie.js\"></script>\n" +
                "<script type=\"text/javascript\">\n" +
                "\tfunction isITBEnter(){\n" +
                "\t\t$('#mem_enter_info').html('');\n" +
                "\t\t$.ajax({\n" +
                "\t\t\turl:'/mem/WebMemLoginAction_isEnter.jspx?logintoken='+$.cookie('hzfc365_login_token'),\n" +
                "\t\t\ttype: 'get', dataType:'html', cache: false, async:false,\n" +
                "\t\t\terror: function(xhr){\n" +
                "\t\t\t\tshowAlertPopup(\"系统错误，请重新登陆\");\n" +
                "\t\t\t},\n" +
                "\t\t\tsuccess: function(data){\n" +
                "\t\t\t\tvar mem = eval('(' + data + ')');\n" +
                "\t\t\t\tif(mem.flag==false){\n" +
                "\t\t\t\t\t$('#mem_enter_info').append('您好，欢迎来到透明售房网！ [<a href=\"/mem/login.jsp\" target=\"_blank\">请登录</a>][<a href=\"/mem/register_man.jsp\" target=\"_blank\">免费注册</a>]');\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\telse{\n" +
                "\t\t\t\t\tvar showName = (mem.niname==''? mem.username:mem.niname);//如果有昵称就优先显示昵称\n" +
                "\t\t\t\t\t$('#mem_enter_info').append('您好  <a href=\"/mem/main.htm\"  target=\"_blank\" >'+showName+'</a>，欢迎来到透明售房网！[<a href=\"/mem/main.htm\" target=\"_blank\">会员中心</a>] [<a href=\"javaScript:toITBExit();\">退出</a>]');\n" +
                "\t\t\t\t\tif(typeof(loginflag) != 'undefined') {\n" +
                "\t\t\t\t\t\tloginflag = true;\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t});\n" +
                "\t}\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t//会员退出\n" +
                "\tfunction toITBExit(){\n" +
                "\t\t$.cookie('istiped', '', {expires: 1,path: '/'});//重置是否看到提醒信息\n" +
                "\t\t$.ajax({\n" +
                "\t\t\turl:'/mem/WebMemLoginAction_toExit.jspx',\n" +
                "\t\t\ttype: 'get', dataType:'html', cache: false, async:false,\n" +
                "\t\t\terror: function(xhr){\n" +
                "\t\t\t},\n" +
                "\t\t\tsuccess: function(data){\n" +
                "\t\t\t\t$.cookie('hzfc365_login_token', \"\", {expires: 1, path: '/'});\n" +
                "\t\t\t\tisITBEnter();\n" +
                "\t\t\t}\n" +
                "\t\t});\n" +
                "\t\n" +
                "\t}\n" +
                "\t\n" +
                "\tisITBEnter();\n" +
                "</script>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<div class=\"ht35_none\"></div>\n" +
                "\t\t\n" +
                "\t\t        \t<div class=\"ad950\" style=\"position: relative;\">\n" +
                "            \t<embed wmode=\"transparent\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" quality=\"high\"  width=\"950\" height=\"65\" src=\"/upload/webad/20170627/14985355401800=.swf\" type=\"application/x-shockwave-flash\"><param name=\"wmode\" value=\"transparent\">\n" +
                "            \t<span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/closenew.png);position:absolute;right: 0;top:0;cursor: pointer;\" onclick=\"javascirpt:$(this).parent().remove();\"></span><span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/advertnew.png);position:absolute;right: 0;bottom:0;\"></span>\n" +
                "       \t\t</div>\n" +
                "        \t<div class=\"ad950\" style=\"position: relative;\">\n" +
                "            \t<embed wmode=\"transparent\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" quality=\"high\"  width=\"950\" height=\"65\" src=\"/upload/webad/20170801/15015549429370=.swf\" type=\"application/x-shockwave-flash\"><param name=\"wmode\" value=\"transparent\">\n" +
                "            \t<span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/closenew.png);position:absolute;right: 0;top:0;cursor: pointer;\" onclick=\"javascirpt:$(this).parent().remove();\"></span><span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/advertnew.png);position:absolute;right: 0;bottom:0;\"></span>\n" +
                "       \t\t</div>\n" +
                "        \t<div class=\"ad950\" style=\"position: relative;\">\n" +
                "            \t<embed wmode=\"transparent\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" quality=\"high\"  width=\"950\" height=\"65\" src=\"/upload/webad/20170627/14985348392950=.swf\" type=\"application/x-shockwave-flash\"><param name=\"wmode\" value=\"transparent\">\n" +
                "            \t<span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/closenew.png);position:absolute;right: 0;top:0;cursor: pointer;\" onclick=\"javascirpt:$(this).parent().remove();\"></span><span style=\"display: block;width:27px;height:16px;background: url(/hzweb/images/advertnew.png);position:absolute;right: 0;bottom:0;\"></span>\n" +
                "       \t\t</div>\n" +
                "\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<div class=\"page_bar\">\n" +
                "\t\t\t<div class=\"page_where\">\n" +
                "\t\t\t\t<a href=\"/\" target=\"_blank\">网站首页</a> >\n" +
                "\t\t\t\t<a href=\"/hzweb/info/\" target=\"_blank\">资讯中心</a> >\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<a title=\"周数据\">周数据</a>\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"page_search\">\n" +
                "\t\t\t\t\t<span class=\"pagesearch_main\">\n" +
                "\t\t\t\t\t\t<input type=\"text\" name=\"searword\" id=\"searchword2\" value=\"热门资讯搜索\"\n" +
                "\t\t\t\t\t\t\tonfocus=\"javascript:if(this.value=='热门资讯搜索'){this.value='';this.style.color='#000'}\"\n" +
                "\t\t\t\t\t\t\tonblur=\"javascript:if(this.value==''){this.value='热门资讯搜索';this.style.color='#e6e6e6'}\" \n" +
                "\t\t\t\t\t\t\tonkeydown=\"javascript:if(event.keyCode==13) saveKeyword();\"/>\n" +
                "\t\t\t\t\t</span>\n" +
                "\t\t\t\t\t<span class=\"pagesearch_sub\">\n" +
                "\t\t\t\t\t\t<input type=\"button\" name=\"subup\" value=\"搜 索\" id=\"searchsub\"  onclick=\"saveKeyword();\"/>\n" +
                "\t\t\t\t\t</span>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t\t<form action=\"/info/search_infolist.htm\" method=\"post\" id=\"search\" name=\"search\">\n" +
                "\t\t\t<input type=\"hidden\" name=\"page\" value=\"1\" id=\"page\"/>\n" +
                "\t\t\t<input type=\"hidden\" name=\"keywords\" value=\"\" id=\"keywords\"/>\n" +
                "\t\t\t<input type=\"hidden\" name=\"cid\" value=\"25163444\" id=\"cid\"/>\n" +
                "\t\t\t<input type=\"hidden\" name=\"sid\" value=\"33\" id=\"sid\"/>\n" +
                "\t\t\t<input type=\"hidden\" value=\"\" id=\"pid\" name=\"pid\" />\n" +
                "\t\t\t<input type=\"hidden\" value=\"\" id=\"type\" name=\"type\" />\n" +
                "\t\t</form>\n" +
                "\t\t\n" +
                "\t\t<div class=\"news_page\">\n" +
                "\t\t\t<div class=\"newslist_main\">\n" +
                "\t\t\t\t<div class=\"pagenext\">\n" +
                "\t\t\t\t\t<a class=\"e\">上一页</a><a href=\"javascript:void(0);\" onclick=\"doPage(1);return false;\" class=\"d\" >1</a><a href=\"javascript:void(0);\" onclick=\"doPage(2);return false;\" class=\"c\" >2</a><a href=\"javascript:void(0);\" onclick=\"doPage(3);return false;\" class=\"c\" >3</a><a href=\"javascript:void(0);\" onclick=\"doPage(4);return false;\" class=\"c\" >4</a><a href=\"javascript:void(0);\" onclick=\"doPage(5);return false;\" class=\"c\" >5</a><a href=\"javascript:void(0);\" onclick=\"doPage(6);return false;\" class=\"c\" >6</a><a href=\"javascript:void(0);\" onclick=\"doPage(7);return false;\" class=\"c\" >7</a><a href=\"javascript:void(0);\" onclick=\"doPage(8);return false;\" class=\"c\" >8</a><a href=\"javascript:void(0);\" onclick=\"doPage(9);return false;\" class=\"c\" >9</a><a href=\"javascript:void(0)\" class=\"c\" onclick=\"doPage(2);return false;\">下一页</a><a href=\"javascript:void(0)\" class=\"c\" onclick=\"doPage(44);return false;\">尾页</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"h20\"></div>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-08-14 16:29</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_493330931_33_1.htm\"  title=\"[08.07-08.13]杭州市区二手房签约2119套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[08.07-08.13]杭州市区二手房签约2119套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-08-07 15:43</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_491630425_33_1.htm\"  title=\"[07.31-08.06]杭州市区二手房签约2022套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[07.31-08.06]杭州市区二手房签约2022套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-07-31 17:26</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_489930612_33_1.htm\"  title=\"[07.24-07.30]杭州市区二手房签约2360套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[07.24-07.30]杭州市区二手房签约2360套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-07-24 15:36</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_488213726_33_1.htm\"  title=\"[07.17-07.23]杭州市区二手房签约2127套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[07.17-07.23]杭州市区二手房签约2127套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-07-17 15:38</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_486589330_33_1.htm\"  title=\"[07.10-07.16]杭州市区二手房签约2127套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[07.10-07.16]杭州市区二手房签约2127套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-07-10 15:14</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_484773295_33_1.htm\"  title=\"[07.03-07.09]杭州市区二手房签约2117套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[07.03-07.09]杭州市区二手房签约2117套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-07-03 15:15</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_482915476_33_1.htm\"  title=\"[06.26-07.02]杭州市区二手房签约2866套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[06.26-07.02]杭州市区二手房签约2866套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-06-26 16:09</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_480999003_33_1.htm\"  title=\"[06.19-06.25]杭州市区二手房签约2637套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[06.19-06.25]杭州市区二手房签约2637套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-06-19 15:18</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_478848678_33_1.htm\"  title=\"[06.12-06.18]杭州市区二手房签约2358套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[06.12-06.18]杭州市区二手房签约2358套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-06-12 15:23</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_476601705_33_1.htm\"  title=\"[06.05-06.11]杭州市区二手房签约2358套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[06.05-06.11]杭州市区二手房签约2358套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-06-05 15:08</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_474184014_33_1.htm\"  title=\"[5.29-6.04]杭州市区二手房签约1624套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[5.29-6.04]杭州市区二手房签约1624套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-05-31 17:37</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_472405148_33_1.htm\"  title=\"[5.22-5.28]杭州市区二手房签约2781套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[5.22-5.28]杭州市区二手房签约2781套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-04-05 15:01</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_436471514_33_1.htm\"  title=\"[3.27-4.2]杭州市区新房签约4650套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[3.27-4.2]杭州市区新房签约4650套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-03-27 10:09</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_430600444_33_1.htm\"  title=\"[3.20-3.26]杭州市区新房签约4399套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[3.20-3.26]杭州市区新房签约4399套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-03-20 10:14</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_426640368_33_1.htm\"  title=\"[3.13-3.19]杭州市区新房签约5037套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[3.13-3.19]杭州市区新房签约5037套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-03-13 10:39</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_422423151_33_1.htm\"  title=\"[3.6-3.12]杭州市区新房签约2728套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[3.6-3.12]杭州市区新房签约2728套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-03-06 10:30</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_418244195_33_1.htm\"  title=\"[2.27-3.5]杭州市区新房签约4381套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[2.27-3.5]杭州市区新房签约4381套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-02-27 11:15</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_413507413_33_1.htm\"  title=\"[2.20-2.26]杭州市区新房签约2687套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[2.20-2.26]杭州市区新房签约2687套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-02-20 11:25</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_409237986_33_1.htm\"  title=\"[2.13-2.19]杭州市区新房签约2034套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[2.13-2.19]杭州市区新房签约2034套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-02-13 11:50</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_405021028_33_1.htm\"  title=\"[2.6-2.12]杭州市区新房签约1327套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[2.6-2.12]杭州市区新房签约1327套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div class=\"h20\"></div>\n" +
                "\t\t\t\t<div class=\"pagenext\">\n" +
                "\t\t\t\t\t<a class=\"e\">上一页</a><a href=\"javascript:void(0);\" onclick=\"doPage(1);return false;\" class=\"d\" >1</a><a href=\"javascript:void(0);\" onclick=\"doPage(2);return false;\" class=\"c\" >2</a><a href=\"javascript:void(0);\" onclick=\"doPage(3);return false;\" class=\"c\" >3</a><a href=\"javascript:void(0);\" onclick=\"doPage(4);return false;\" class=\"c\" >4</a><a href=\"javascript:void(0);\" onclick=\"doPage(5);return false;\" class=\"c\" >5</a><a href=\"javascript:void(0);\" onclick=\"doPage(6);return false;\" class=\"c\" >6</a><a href=\"javascript:void(0);\" onclick=\"doPage(7);return false;\" class=\"c\" >7</a><a href=\"javascript:void(0);\" onclick=\"doPage(8);return false;\" class=\"c\" >8</a><a href=\"javascript:void(0);\" onclick=\"doPage(9);return false;\" class=\"c\" >9</a><a href=\"javascript:void(0)\" class=\"c\" onclick=\"doPage(2);return false;\">下一页</a><a href=\"javascript:void(0)\" class=\"c\" onclick=\"doPage(44);return false;\">尾页</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"datapage_right\">\n" +
                "\t\t\t\t\n" +
                "<div class=\"datapageright_list\">\n" +
                "\t<div class=\"datapageright_title\" id=\"myTop1\">\n" +
                "\t\t<ul class=\"hotnews_type\">\n" +
                "\t\t\t<li class=\"onhover\">\n" +
                "\t\t\t\t热点新闻排行\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t即时新闻\n" +
                "\t\t\t</li>\n" +
                "\t\t</ul>\n" +
                "\t</div>\n" +
                "\t<div class=\"datapageright_contant\" id=\"myCont1\">\n" +
                "\t\t<div>\n" +
                "\t\t\t<ul class=\"dotbg\">\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496159158_33_1.htm\" target=\"_blank\" title=\"拼了!这座城市能以低于市场价20%买到房!\">\n" +
                "\t\t\t\t\t\t\t拼了!这座城市能以低于市场价20%买到…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496158491_33_1.htm\" target=\"_blank\" title=\"杭州单身地图出炉：高校和软件园成重灾区\">\n" +
                "\t\t\t\t\t\t\t杭州单身地图出炉：高校和软件园成重灾区…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495772150_33_1.htm\" target=\"_blank\" title=\"北京市住建委：开发商违法设置隔离将暂停网签\">\n" +
                "\t\t\t\t\t\t\t北京市住建委：开发商违法设置隔离将暂停…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495458260_33_1.htm\" target=\"_blank\" title=\"浙A车牌上月破5万 今天竞价还会涨吗？\">\n" +
                "\t\t\t\t\t\t\t浙A车牌上月破5万 今天竞价还会涨吗？…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495324970_33_1.htm\" target=\"_blank\" title=\"重磅：杭州市企业自持商品房屋租赁管理实施细则出台\">\n" +
                "\t\t\t\t\t\t\t重磅：杭州市企业自持商品房屋租赁管理实…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495080460_33_1.htm\" target=\"_blank\" title=\"验房不要想当然 避免误区谨防“李鬼”\">\n" +
                "\t\t\t\t\t\t\t验房不要想当然 避免误区谨防“李鬼”\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495009317_33_1.htm\" target=\"_blank\" title=\"杭州哪个小区能装上老小区第一部电梯？\">\n" +
                "\t\t\t\t\t\t\t杭州哪个小区能装上老小区第一部电梯？\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495008074_33_1.htm\" target=\"_blank\" title=\"楼市又一信号！有城市首套房贷款利率上调30%\">\n" +
                "\t\t\t\t\t\t\t楼市又一信号！有城市首套房贷款利率上调…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t\t<div style=\"display: none;\">\n" +
                "\t\t\t<ul class=\"dotbg\">\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496217871_33_1.htm\" target=\"_blank\" title=\"[中南君奥时代]在这里，看到杭州的黄金时代\">\n" +
                "\t\t\t\t\t\t\t[中南君奥时代]在这里，看到杭州的黄金…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496216985_33_1.htm\" target=\"_blank\" title=\"[和昌]杭州“无人”浪潮的下一站，地产？\">\n" +
                "\t\t\t\t\t\t\t[和昌]杭州“无人”浪潮的下一站，地产…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496216968_33_1.htm\" target=\"_blank\" title=\"莫干溪谷的当代村落哲学\">\n" +
                "\t\t\t\t\t\t\t莫干溪谷的当代村落哲学\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496181126_33_1.htm\" target=\"_blank\" title=\"[导购] 细数1-9号线 杭城单价2万的地铁盘\">\n" +
                "\t\t\t\t\t\t\t[导购] 细数1-9号线 杭城单价2万…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496180928_33_1.htm\" target=\"_blank\" title=\"[挂牌] 10月前主城区最后一批土地出让\">\n" +
                "\t\t\t\t\t\t\t[挂牌] 10月前主城区最后一批土地出…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496180885_33_1.htm\" target=\"_blank\" title=\"[文件解读] 9月主城区首批出让地块有何要求？\">\n" +
                "\t\t\t\t\t\t\t[文件解读] 9月主城区首批出让地块有…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496159158_33_1.htm\" target=\"_blank\" title=\"拼了!这座城市能以低于市场价20%买到房!\">\n" +
                "\t\t\t\t\t\t\t拼了!这座城市能以低于市场价20%买到…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496159043_33_1.htm\" target=\"_blank\" title=\"好消息！后天起杭州彻底告别“高温季”\">\n" +
                "\t\t\t\t\t\t\t好消息！后天起杭州彻底告别“高温季”\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"datapageright_list\">\n" +
                "\t<div class=\"datapageright_title\">\n" +
                "\t\t<span class=\"flotright ash1\">\n" +
                "\t\t\t<a href=\"/info/special_33_flag.htm\" target=\"_blank\">更多&gt;&gt;</a>\n" +
                "\t\t</span>推荐专题\n" +
                "\t</div>\n" +
                "\t<div class=\"datapageright_contant\">\n" +
                "\t\t<ul class=\"newslist_pic\">\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/upload/info/subjectspecial/15036560933870/index.html\" target=\"_blank\">\n" +
                "\t\t\t\t\t<img src=\"/upload/info/specialsubject/20170825/15036527128070=.jpg\" title=\"租赁时代来临， 你最关心的杭州主城各区租金水平如何？\"/>\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t\t<p>\n" +
                "\t\t\t\t\t<a href=\"/upload/info/subjectspecial/15036560933870/index.html\" target=\"_blank\" title=\"租赁时代来临， 你最关心的杭州主城各区租金水平如何？\">\n" +
                "\t\t\t\t\t\t\t\t租赁时代来临， \n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</p>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/upload/info/subjectspecial/15037091917750/index.html\" target=\"_blank\">\n" +
                "\t\t\t\t\t<img src=\"/upload/info/specialsubject/20170826/15037091783350=.jpg\" title=\"直击：奥体东价值高峰论坛 暨碧秀名庭售展中心开放盛典\"/>\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t\t<p>\n" +
                "\t\t\t\t\t<a href=\"/upload/info/subjectspecial/15037091917750/index.html\" target=\"_blank\" title=\"直击：奥体东价值高峰论坛 暨碧秀名庭售展中心开放盛典\">\n" +
                "\t\t\t\t\t\t\t\t直击：奥体东价值\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</p>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/upload/info/subjectspecial/15036658317320/index.html\" target=\"_blank\">\n" +
                "\t\t\t\t\t<img src=\"/upload/info/specialsubject/20170825/15036656632410=.jpg\" title=\"2017年杭州金牌经纪人颁奖典礼\"/>\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t\t<p>\n" +
                "\t\t\t\t\t<a href=\"/upload/info/subjectspecial/15036658317320/index.html\" target=\"_blank\" title=\"2017年杭州金牌经纪人颁奖典礼\">\n" +
                "\t\t\t\t\t\t\t\t2017年杭州金\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</p>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/upload/info/subjectspecial/15036393076670/index.html\" target=\"_blank\">\n" +
                "\t\t\t\t\t<img src=\"/upload/info/specialsubject/20170825/15036390342230=.jpg\" title=\"七夕节，邂逅一个中意的ta！\"/>\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t\t<p>\n" +
                "\t\t\t\t\t<a href=\"/upload/info/subjectspecial/15036393076670/index.html\" target=\"_blank\" title=\"七夕节，邂逅一个中意的ta！\">\n" +
                "\t\t\t\t\t\t\t\t七夕节，邂逅一个\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</p>\n" +
                "\t\t\t</li>\n" +
                "\t\t</ul>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"datapageright_list\">\n" +
                "\t<div class=\"datapageright_title\">\n" +
                "\t\t<span class=\"flotright ash1\"><a href=\"/info/search_8277277_33.htm\" target=\"_blank\">更多&gt;&gt;</a>\n" +
                "\t\t</span>推荐新闻\n" +
                "\t</div>\n" +
                "\t<div class=\"datapageright_contant\">\n" +
                "\t\t<ul class=\"dotbg\">\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496159015_33_1.htm\" target=\"_blank\" title=\"浙江省再出政策全力推进装配式建筑和住宅全装修\">\n" +
                "\t\t\t\t\t\t\t浙江省再出政策全力推进装配式建筑和住宅…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496158733_33_1.htm\" target=\"_blank\" title=\"购租并举，你还买房吗\">\n" +
                "\t\t\t\t\t\t\t购租并举，你还买房吗\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_496158643_33_1.htm\" target=\"_blank\" title=\"咸鱼翻身！杭城“老破小”房成网红\">\n" +
                "\t\t\t\t\t\t\t咸鱼翻身！杭城“老破小”房成网红\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495564434_33_1.htm\" target=\"_blank\" title=\"杭州小区电梯大起底：你家的是什么档次？\">\n" +
                "\t\t\t\t\t\t\t杭州小区电梯大起底：你家的是什么档次？…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495998209_33_1.htm\" target=\"_blank\" title=\"本周供应量井喷！刚需福利！19个项目3809套，仅余杭就新增2565套\">\n" +
                "\t\t\t\t\t\t\t本周供应量井喷！刚需福利！19个项目3…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495975432_33_1.htm\" target=\"_blank\" title=\"房企内生逻辑之辩： 利润率引发的洗牌与负债率烦恼\">\n" +
                "\t\t\t\t\t\t\t房企内生逻辑之辩： 利润率引发的洗牌与…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495775077_33_1.htm\" target=\"_blank\" title=\"52751元！8月浙A车牌均价再创新高\">\n" +
                "\t\t\t\t\t\t\t52751元！8月浙A车牌均价再创新高…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t\t\t<li>\n" +
                "\t\t\t\t\t<a href=\"/info/news_newsinfo_495772244_33_1.htm\" target=\"_blank\" title=\"租售并举的楼市 长效机制如何“落地”？\">\n" +
                "\t\t\t\t\t\t\t租售并举的楼市 长效机制如何“落地”？…\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</li>\n" +
                "\t\t</ul>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"datapageright_list\">\n" +
                "\t<div class=\"datapageright_title\">\n" +
                "\t\t<span class=\"flotright ash1\"><a href=\"/bbt/\" target=\"_blank\">在线咨询</a>\n" +
                "\t\t</span>购房帮帮团\n" +
                "\t</div>\n" +
                "\t<div class=\"datapageright_contant\">\n" +
                "\t\t<ul class=\"dotbg\">\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_495364570_33_1.htm\" target=\"_blank\" title=\"[咨询]越秀亲爱里的房子值得购买吗？\">\n" +
                "\t\t\t\t\t\t[咨询]越秀亲爱里的房子值得购买吗？\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_495364567_33_1.htm\" target=\"_blank\" title=\"[咨询]雍和府、武林郡、上塘宸章，自住哪个好？\">\n" +
                "\t\t\t\t\t\t[咨询]雍和府、武林郡、上塘宸章，自住…\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_495364564_33_1.htm\" target=\"_blank\" title=\"[咨询]想入手绿城桃源小镇，未来这块发展会怎么样？\">\n" +
                "\t\t\t\t\t\t[咨询]想入手绿城桃源小镇，未来这块发…\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_494685562_33_1.htm\" target=\"_blank\" title=\"[咨询]离婚后房产归对方，再购房是否属首套？\">\n" +
                "\t\t\t\t\t\t[咨询]离婚后房产归对方，再购房是否属…\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_494685560_33_1.htm\" target=\"_blank\" title=\"[咨询]首付30-40万还有什么楼盘推荐？\">\n" +
                "\t\t\t\t\t\t[咨询]首付30-40万还有什么楼盘推…\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_494685559_33_1.htm\" target=\"_blank\" title=\"[咨询]现在杭州的房价走势，是涨是跌？\">\n" +
                "\t\t\t\t\t\t[咨询]现在杭州的房价走势，是涨是跌？…\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_493250631_33_1.htm\" target=\"_blank\" title=\"[咨询]广厦天都城天漾滨沁公寓\">\n" +
                "\t\t\t\t\t\t[咨询]广厦天都城天漾滨沁公寓\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t\t<li>\n" +
                "\t\t\t\t<a href=\"/info/news_newsinfo_493250417_33_1.htm\" target=\"_blank\" title=\"[咨询]农民房算有房还是无房户？\">\n" +
                "\t\t\t\t\t\t[咨询]农民房算有房还是无房户？\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</li>\n" +
                "\t\t</ul>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"clear\"></div>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\tfunction finderror() {\n" +
                "\t\twindow.open(\"/rjz/WebAllCorrectAction_findError.jspx?url=\"\n" +
                "\t\t\t\t+ window.location.href);\n" +
                "\t}\n" +
                "</script>\n" +
                "<div class=\"copyright\">\n" +
                "\t<div class=\"copy_inline\">\n" +
                "\t\t<a href=\"http://www.hzzfxx.com\" target=\"_blank\">公司介绍</a>\n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index01.html\" target=\"_blank\">关于我们</a>  \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index03.html\" target=\"_blank\">联系方式</a> \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index04.html\" target=\"_blank\">网站地图</a> \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index05.html\" target=\"_blank\">诚聘精英</a> \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index06.html\" target=\"_blank\">免责声明</a> \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index08.html\" target=\"_blank\">责任编辑</a> \n" +
                "\t\t| <a href=\"http://tmsf.com/cp2013/index09.html\" target=\"_blank\">合作伙伴</a> \n" +
                "\t\t| <a href=\"/mem/mem_correct_advise.jsp\" target=\"_blank\" title=\"意见反馈\">意见反馈</a>\n" +
                "\t\t| <a href=\"/info/search_32669670_33.htm\" title=\"网站动态\" target=\"_blank\">网站动态</a>\n" +
                "\t</div>\n" +
                "\t<div class=\"copy_inline\">\n" +
                "\t\t经营许可证：<a href=\"http://www.miitbeian.gov.cn\" target=\"_blank\">浙B2-20100020</a> 网络实名：<a href=\"/\">透明售房网</a> 版权所有：<a href=\"http://www.hzzfxx.com/\" target=\"_blank\">杭州中房信息科技有限公司</a>\n" +
                "\t</div>\n" +
                "\t<div class=\"copy_inline\">\n" +
                "\t\t声明：本网站房产市场信息数据来源于杭州市住保房管网\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<a href=\"/mem/mem_correct_advise.jsp\" target=\"_blank\" style=\"padding: 4px 2px;color: white !important;width: 1.8em;line-height: 14px;text-align: center;position: fixed;_position: absolute;bottom: 170px;left: 50%;margin-left: 476px;background-color:#4b8ad8; background-image:url(/hzweb/esf/images/fk.gif); background-repeat:no-repeat; background-position:center 0px; cursor:pointer; padding-top:24px; padding-bottom:5px; text-decoration:none;\">意见反馈</a>\n" +
                "<script type=\"text/javascript\">var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \"https://\" : \"http://\");document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3Fbbb8b9db5fbc7576fd868d7931c80ee1' type='text/javascript'%3E%3C/script%3E\"));</script>\n" +
                "\t\t\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\t\t/*tab切换*/\n" +
                "\t\t\tvar n = 5;\n" +
                "\t\t\tfor ( var i = 1; i <= n; i++) {\n" +
                "\t\t\t\tswitchtag(i);\n" +
                "\t\t\t}\n" +
                "\t\t\n" +
                "\t\t\tfunction switchtag(x) {\n" +
                "\t\t\t\t$(document).ready(function() {\n" +
                "\t\t\t\t\t$(\"#myCont\" + x + \" > div:not(:first)\").hide();\n" +
                "\t\t\t\t\tvar myLi = $(\"#myTop\" + x + \" > ul > li\");\n" +
                "\t\t\t\t\tvar myDiv = $(\"#myCont\" + x + \" > div\");\n" +
                "\t\t\t\t\tmyLi.each(function(i) {\n" +
                "\t\t\t\t\t\t$(this).mouseover(function() {\n" +
                "\t\t\t\t\t\t\tmyLi.removeClass(\"onhover\");\n" +
                "\t\t\t\t\t\t\t$(this).addClass(\"onhover\");\n" +
                "\t\t\t\t\t\t\tmyDiv.hide();\n" +
                "\t\t\t\t\t\t\tmyDiv.eq(i).show();\n" +
                "\t\t\t\t\t\t})\n" +
                "\t\t\t\t\t})\n" +
                "\t\t\t\t})\n" +
                "\t\t\t}\n" +
                "\t\t\n" +
                "\t\t\t/*子站*/\n" +
                "\t\t\tjQuery(function() {\n" +
                "\t\t\t\tjQuery(\"#siteother\").mouseover(function() {\n" +
                "\t\t\t\t\tvar divcity = jQuery(\"#siteother\");\n" +
                "\t\t\t\t\tvar divcityoffset = divcity.offset();\n" +
                "\t\t\t\t\tjQuery(\"#siteotheron\").show();\n" +
                "\t\t\t\t})\n" +
                "\t\t\t\tjQuery(\"#siteother\").mouseout(function() {\n" +
                "\t\t\t\t\tjQuery(\"#siteotheron\").hide();\n" +
                "\t\t\n" +
                "\t\t\t\t});\n" +
                "\t\t\t});\n" +
                "\t\t\t \n" +
                "\t\t\t//字号大小\n" +
                "\t\t\tfunction ChgFontSize(n) {\n" +
                "\t\t\t\tvar styTxt = document.all('control_fontsize');\n" +
                "\t\t\t\tif (styTxt) {\n" +
                "\t\t\t\t\tstyTxt.className = n;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t/*-----浮动层------*/\n" +
                "\t\t\t$(function() {\n" +
                "\t\t\t\t$(window).scroll(function() {\n" +
                "\t\t\t\t\tif ($(window).scrollTop() >= 100) {\n" +
                "\t\t\t\t\t\t$('#go-top').fadeIn(300);\n" +
                "\t\t\t\t\t} else {\n" +
                "\t\t\t\t\t\t$('#go-top').fadeOut(300);\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t});\n" +
                "\t\t\t\t$('#go-top').click(function() {\n" +
                "\t\t\t\t\t$('html,body').animate( {\n" +
                "\t\t\t\t\t\tscrollTop : '0px'\n" +
                "\t\t\t\t\t}, 0);\n" +
                "\t\t\t\t});\n" +
                "\t\t\t});\n" +
                "\t\t</script>\n" +
                "\t\t<a href=\"javascript:void(0);\" class=\"go-top\" style=\"display: none; text-decoration: none;\" id=\"go-top\">返回顶部</a>\n" +
                "\t</body>\n" +
                "</html>";
        WeekPattern week=new WeekPattern();
        ArrayList<Week> list=new ArrayList<>();
        list=week.matcher(s);
        System.out.print("end");

    }
}
