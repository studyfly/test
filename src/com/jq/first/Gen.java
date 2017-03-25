package com.jq.first;

public class Gen{
	public static void main(String[] args) {
		String res = null;
		String str = "为感谢公司全体员工的努力工作，<br /><br /><br />5.奖品内容：手机充值卡，分20、50、100元面额。 获奖概率：90%以上。&nbsp;<br /><br /><br />三、注意事项：&nbsp;<br /><br /><br />1.请全体员工按时集合。&nbsp;<br /><br /><br />2.注意防晒，不要脱水。&nbsp;<br /><br /><br />3. 最后预祝大家活动愉快！";
		res = str.replaceAll("&nbsp;", "").replaceAll("<br />", "\n");
		res = str.replaceAll("<br />", "\n");
		System.out.println(res);
		
		String p = "<p>第一行</p><p></p><p>第二行</p><p>第三行</p>";
		System.out.println(p.replaceAll("<p>", "").replaceAll("</p>", "\n"));
	}
}
