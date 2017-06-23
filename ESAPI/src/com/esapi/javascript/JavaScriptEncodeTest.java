package com.esapi.javascript;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.errors.EncodingException;

public class JavaScriptEncodeTest {
	public static void main(String[] args) throws EncodingException {
		String jsStr = "<script>alert('xxxx')</script>";
		System.out.println("encodeForJavaScript= " + ESAPI.encoder().encodeForJavaScript(jsStr));
		
		String urlStr = "http://www.baidu.com";
		System.out.println("encodeForURL= " + ESAPI.encoder().encodeForURL(urlStr));
		System.out.println("encodeForJavaScript= " + ESAPI.encoder().encodeForJavaScript(urlStr));
		
		String htmlStr = "/szdgdgh";
		System.out.println("encodeForHTML= " + ESAPI.encoder().encodeForHTML(htmlStr));
		
		String cssStr = "ddg:tet";
		System.out.println("encodeForCSS=" + ESAPI.encoder().encodeForCSS(cssStr));
	}
}
