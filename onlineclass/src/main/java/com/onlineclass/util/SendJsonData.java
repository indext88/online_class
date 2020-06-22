package com.onlineclass.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class SendJsonData {
	// 封装传递fastjson数据
	public static String sendJsonDatas(HttpServletResponse response, JSONArray data) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(data);
		out.flush();
		out.close();
		return null;
	}
}
