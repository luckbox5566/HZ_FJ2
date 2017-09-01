package priv.leon.hzfj.test.string.pattern;

import priv.leon.hzfj.app.bean.NewHouseCanSell;
import priv.leon.hzfj.app.bean.NewHouseSign;
import priv.leon.hzfj.string.pattern.NewHouseCallSellPattern;
import priv.leon.hzfj.string.pattern.NewHouseSignPattern;

import java.util.ArrayList;

public class NewHouseCallSellPatternTest {
    public static void main(String[] args){
        String s="\n" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<title>新房数据播报_每日行情播报_楼市行情播报_资讯中心_透明售房网</title>\n" +
                "<link href=\"/report/css/tmdp.css\" rel=\"stylesheet\" type=\"text/css\"  />\n" +
                "<link href=\"/css/tmsfw.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "<script type=\"text/javascript\">\n" +
                "var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\n" +
                "document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3F11c43163b811cfa6d588907a58aa0d90' type='text/javascript'%3E%3C/script%3E\"));\n" +
                "</script>\n" +
                "</head>\n" +
                "\n" +
                "\n" +
                "<body>\n" +
                "\t\t<div id=\"j_spf_login\">\n" +
                "\t\t<ul>\n" +
                "\t\t    <li></li>\n" +
                "\t\t<li class=\"a\" style=\"float:right;\">政务网：<a href=\"http://www.hzfc.gov.cn\" target=\"_blank\">杭州市住保房管网</a> 子站：<a href=\"http://yh.tmsf.com/\" target=\"_blank\">余杭</a><a href=\"http://xs.tmsf.com/\" target=\"_blank\">萧山</a><a href=\"http://tl.tmsf.com/\" target=\"_blank\">桐庐</a><a href=\"http://ca.tmsf.com/\" target=\"_blank\">淳安</a>　分站：<a href=\"http://gd.tmsf.com\" target=\"_blank\">广德</a></li>\n" +
                "\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t\t<div class=\"hg\"></div>\n" +
                "\t\t<div class=\"indextop \"><div class=\"logo2\"><a href=\"/\" target=\"_blank\"><img src=\"/images/logo.jpg\" /></a></div>\n" +
                "   \n" +
                "\t\t</div>\n" +
                "<div class=\"tmdp_nav\">\n" +
                "\t\t\t<div class=\"l\"></div>\n" +
                "\t\t\t<div class=\"c\">\n" +
                "\t\t\t\t<a>每日行情播报</a>|\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"r\"></div>\n" +
                "\t\t</div>\n" +
                "</div>\n" +
                "<div class=\"title\">\n" +
                "<h2>[2013-01-08]全市签约375套 其中住宅223套</h2>\n" +
                "\n" +
                "<div class=\"ll\"><dl>\n" +
                "  <dt><span style=\"color:#F00\">http://www.tmsf.com</span>    2013-01-08    来源：透明售房网　</dt>\n" +
                "</dl></div>\n" +
                "</div>\n" +
                "<div class=\"nr\">\n" +
                "<ul>\n" +
                "<dt>　　摘要:全市新房签约375套。其中，杭州主城区新房签约223套；萧山 25 套，签约均价15964.67元/平方米；余杭 68 套，签约均价9905.25元/平方米；富阳 5 套，签约均价12428.99元/平方米；桐庐 8 套，签约均价7896.11元/平方米；建德 12 套，签约均价4263.5元/平方米；淳安 3 套，签约均价10795.77元/平方米；临安 31 套，签约均价8468.34元/平方米</dt>\n" +
                "<dd>\n" +
                "<p><img src=\"xfbar.png\"/></p>\n" +
                "  　　全市新房签约375套。其中，杭州主城区新房签约223套；萧山 25 套，签约均价15964.67元/平方米；余杭 68 套，签约均价9905.25元/平方米；富阳 5 套，签约均价12428.99元/平方米；桐庐 8 套，签约均价7896.11元/平方米；建德 12 套，签约均价4263.5元/平方米；淳安 3 套，签约均价10795.77元/平方米；临安 31 套，签约均价8468.34元/平方米<br />\n" +
                "\t杭州市区可售房源为104122套。可售面积为13868492万平方米其中，住宅可售房源为72081套。可售面积为9833039万平方米\n" +
                "<br/>\n" +
                "<p><b>新房可售信息</b>\n" +
                "<br/>\n" +
                "<table width=\"560\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"background:#000;\">\n" +
                "          <tr style=\"color:#fff; font-weight:bold;\">\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">类别</td>\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">可售套数（套）</td>\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">可售面积（平方米）</td>\n" +
                "          </tr>\n" +
                "          \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">住宅</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">72,081</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">9,833,039</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">商业</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">8,762</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,391,325</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">办公楼</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">16,836</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,877,129</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">其他</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">6,443</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">767,003</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">合计</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">104,122</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">13,868,496</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "</table>\n" +
                "</p>\n" +
                "<br/>\n" +
                "\t签约新房中，住宅签约202套。签约面积为23298万平方米；商业签约13套。签约面积为1494万平方米；办公楼签约137套。签约面积为13509万平方米。\n" +
                "  \n" +
                "<p><b>新房分类型（住宅、商业、办公楼）交易信息</b>\n" +
                "<br/>\n" +
                "<table width=\"560\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"background:#000;\">\n" +
                "          <tr style=\"color:#fff; font-weight:bold;\">\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">类别</td>\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">签约套数（套）</td>\n" +
                "            <td align=\"center\" bgcolor=\"#3366FF\" width=\"33%\">签约面积（平方米）</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">住宅</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">202</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">23,298</td>\n" +
                "          </tr>\n" +
                "        \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">商业</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">13</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,494</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">办公楼</td>\n" +
                "             <td bgcolor=\"#ffffff\" align=\"center\">137</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">13,509</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">其他</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">15</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">748</td>\n" +
                "          </tr>\n" +
                "        \n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">合计</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">367</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">39,049</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "</table>\n" +
                "</p>\n" +
                "<br/>\n" +
                "\t从分城区数据分析，上城区区签约量最大。今日签约0套，签约面积为0万平方米;其次是下城区区签约量最大。今日签约10套，签约面积为1148万平方米\n" +
                "  　　<p><b>分城区交易信息</b>\n" +
                "<br/>\n" +
                "<table width=\"560\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"background:#000;\">\n" +
                "          <tr style=\"color:#fff; font-weight:bold;\">\n" +
                "            <td height=\"30\" align=\"center\" bgcolor=\"#3366FF\" width=\"25%\">区域</td>\n" +
                "            <td height=\"30\" align=\"center\" bgcolor=\"#3366FF\" width=\"25%\">可售套数（套）</td>\n" +
                "            <td height=\"30\" align=\"center\" bgcolor=\"#3366FF\" width=\"25%\">签约套数（套）</td>\n" +
                "            <td height=\"30\" align=\"center\" bgcolor=\"#3366FF\" width=\"25%\">签约面积（平方米）</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">上城区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">888</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">0</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">0</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">下城区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">4,636</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">10</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,148</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">江干区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">8,287</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">138</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">14,161</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">拱墅区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">8,748</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">19</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,850</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">西湖区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">6,622</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">14</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,684</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">滨江区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">4,572</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">25</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">2,484</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">之江区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,938</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">3</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">363</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">萧山区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">13,858</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">25</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">2,130</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">余杭区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">26,722</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">68</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">6,404</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">下沙区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">7,072</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">14</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,665</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">富阳区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">3,117</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">5</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">863</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">桐庐区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">4,564</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">8</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,145</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">建德区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">1,993</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">12</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">413</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">淳安区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">3,792</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">3</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">309</td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">临安区</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">7,313</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">31</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">4,424</td>\n" +
                "          </tr>\n" +
                "         \n" +
                "          <tr>\n" +
                "          \t<td bgcolor=\"#ffffff\" align=\"center\">合计</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">104,122</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">375</td>\n" +
                "            <td bgcolor=\"#ffffff\" align=\"center\">39,043</td>\n" +
                "          </tr>\n" +
                "          \n" +
                " </table>\n" +
                "</p>\n" +
                "<br/>\n" +
                "\t从楼盘分析来看，楼盘成交还不错。万象城·悦玺销售了119套，排名第一，销售面积为12078平方米。\n" +
                "  　<br/>\n" +
                "<p><b>楼盘销售排行榜(按交易套数)</b>\n" +
                "<br/>\n" +
                "<table width=\"705\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" style=\"background:#000;\">\n" +
                "  <tr style=\"color:#fff; font-weight:bold;\">\n" +
                "    <td width=\"35\" height=\"30\" align=\"center\" bgcolor=\"#3366FF\">排名</td>\n" +
                "    <td width=\"139\" align=\"center\" bgcolor=\"#3366FF\">楼盘名称</td>\n" +
                "    <td width=\"91\" align=\"center\" bgcolor=\"#3366FF\">所属区域</td>\n" +
                "    <td width=\"73\" align=\"center\" bgcolor=\"#3366FF\">销售套数</td>\n" +
                "    <td width=\"90\" align=\"center\" bgcolor=\"#3366FF\">销售面积<br/>（平方米）</td>\n" +
                "    \n" +
                "  </tr>\n" +
                " \n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">1</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">万象城·悦玺<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">江干<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">119</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">12,078</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">2</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">瑞立东方花城<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">滨江<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">14</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">1,247</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">3</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">滨江·金色黎明<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">江干<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">6</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">584</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">4</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">金地·自在城<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">西湖<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">6</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">521</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">5</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">凯旋门<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">江干<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">5</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">541</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">6</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">万亚·金沙湖1号<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">下沙<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">5</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">356</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">7</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">天鸿香榭里<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">拱墅<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">4</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">353</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">8</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">郡原·九润公寓<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">江干<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">3</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">333</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">9</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">积家<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">滨江<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">3</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">206</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "\t  <tr>\n" +
                "\t    <td height=\"30\" align=\"center\" bgcolor=\"#ffffff\">10</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">裕丰青鸟·香石公寓<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">下城<br/></td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">3</td>\n" +
                "\t    <td align=\"center\" bgcolor=\"#ffffff\">366</td>\n" +
                "\t   \n" +
                "\t  </tr>\n" +
                "   \n" +
                "</table>\n" +
                "</p>\n" +
                "</dd>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div style=\"width:850px; margin:10px auto;\">\n" +
                "<!-- JiaThis Button BEGIN -->\n" +
                "<div id=\"ckepop\">\n" +
                "\t<span class=\"jiathis_txt\">分享到：</span>\n" +
                "\t<a class=\"jiathis_button_qzone\">QQ空间</a>\n" +
                "\t<a class=\"jiathis_button_tsina\">新浪微博</a>\n" +
                "\t<a class=\"jiathis_button_renren\">人人网</a>\n" +
                "\t<a class=\"jiathis_button_kaixin001\">开心网</a>\n" +
                "\t<!--a href=\"http://www.jiathis.com/share\" class=\"jiathis jiathis_txt jiathis_separator jtico jtico_jiathis\" target=\"_blank\">更多</a-->\n" +
                "\t<!--a class=\"jiathis_counter_style\"></a-->\n" +
                "</div>\n" +
                "<script type=\"text/javascript\" src=\"http://v2.jiathis.com/code/jia.js\" charset=\"utf-8\"></script>\n" +
                "<!-- JiaThis Button END -->\n" +
                "</div>\n" +
                "<div class=\"j_foot\">\n" +
                "\t|\n" +
                "\t<a href=\"/365ggfw/index.htm\" target=\"_blank\">关于我们</a> |\n" +
                "\t<a href=\"/365ggfw/ditu.htm\" target=\"_blank\">网站地图</a> |\n" +
                "\t<a href=\"/365ggfw/kehu.htm\" target=\"_blank\">联系方法</a> |\n" +
                "\t<a href=\"/viphtml/tmwzp/tmwzp.html\" target=\"_blank\">招聘信息</a> |\n" +
                "\t<a href=\"/365ggfw/mzsm.htm\" target=\"_blank\">免责声明</a> |\n" +
                "\t<a href=\"javascript:finderror();\" title=\"意见反馈\">意见反馈</a> |\n" +
                "\t<br />\n" +
                "\tCopyright 2012 TMSF.COM All Rights Reserved\n" +
                "\t<br />\n" +
                "\t经营许可证：浙B2-20100020号 网络实名：\n" +
                "\t<a href=\"/\">透明售房网</a> 版权所有：杭州中房信息科技有限公司\n" +
                "\t<br />\n" +
                "\t声明：本网站房产市场信息数据来源于杭州市住保房管网\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        ArrayList<NewHouseCanSell> list=new ArrayList<>();
        NewHouseCallSellPattern pattern=new NewHouseCallSellPattern();
        list=pattern.matcher(s);
        System.out.print("xx");
    }
}
