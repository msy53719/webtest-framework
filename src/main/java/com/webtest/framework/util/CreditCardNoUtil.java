package com.webtest.framework.util;

import java.util.Random;

import com.webtest.framework.constant.StringConstant;

public class CreditCardNoUtil {

	// 信用卡
	private static Random getRan() {
		return new Random();
	}

	private static StringBuffer getStrBuff() {
		return new StringBuffer();
	}

	public static String generateString(int length) {
		// StringBuffer sb = new StringBuffer();
		// Random random = new Random();
		for (int i = 0; i < length; i++) {
			getStrBuff().append(StringConstant.NUMBERCHAR.charAt(getRan().nextInt(StringConstant.NUMBERCHAR.length())));
		}

		return getStrBuff().toString();
	}

	public static String getGSBankno() {// 工商
		String[] arr = new String[] { "427019", "427020", "427030", "427039", "427010" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getNYBankno() {// 农行
		String[] arr = new String[] { "625996", "625997", "625998", "628268", "622839" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getZHBankno() {// 中国银行
		String[] arr = new String[] { "409672", "512315", "512316", "512411", "514957" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getJSBankno() {// 建设银行
		String[] arr = new String[] { "531693", "532450", "552801", "557080", "558895" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getJTBankno() {// 交通银行
		String[] arr = new String[] { "622253", "622250", "521899", "628216", "628218" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getZXBankno() {// 中信银行
		String[] arr = new String[] { "403392", "356390", "356391", "622916", "628370" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getGDBankno() {// 光大银行
		String[] arr = new String[] { "356837", "356838", "628202", "524090", "625979" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getMSBankno() {// 民生银行
		String[] arr = new String[] { "622602", "628258", "622603", "625912", "523952" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getHXBankno() {// 华夏银行
		String[] arr = new String[] { "528709", "523959", "622638", "528708", "625967" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getGFBankno() {// 广发银行
		String[] arr = new String[] { "622556", "622557", "622558", "625072", "628260" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getZSBankno() {// 招商银行
		String[] arr = new String[] { "628290", "552534", "356888", "356886", "628262" };

		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getYCBankno() {// 邮政
		String[] arr = new String[] { "622810", "622811", "625919", "622812", "628310" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getPABankno() {// 平安银行
		String[] arr = new String[] { "531659", "435745", "622526", "998801", "528020" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getXYBankno() {// 兴业银行
		String[] arr = new String[] { "461982", "451289", "622902", "524070", "625087" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getPFBankno() {// 浦发银行
		String[] arr = new String[] { "622228", "625957", "625958", "622519", "515672" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getSHBankno() {// 上海银行
		String[] arr = new String[] { "520131", "356829", "628230", "622269", "625953" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getBJBankno() {// 北京银行
		String[] arr = new String[] { "622163", "628203", "622851", "522001", "622853" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getHZBankno() {// 杭州银行
		String[] arr = new String[] { "622286", "628236", "625800" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getNJBankno() {// 南京银行
		String[] arr = new String[] { "622303", "622595", "622596", "628242" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getJSuBankno() {// 江苏银行
		String[] arr = new String[] { "628210", "622283", "625902" };

		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getNBBankno() {// 宁波银行
		String[] arr = new String[] { "622778", "628207", "622282", "512431", "625903" };

		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(10);
		return s;
	}

	public static String getHFBankno() {// 恒丰银行
		String[] arr = new String[] { "940034", "622384" };
		int index = getRan().nextInt(arr.length);
		String s = arr[index] + CreditCardNoUtil.generateString(11);
		return s;
	}
}
// --各银行issue_bank
// --工行0102；农行0103；中国0104；建行0105；交通0301；邮政0100；招行0308；光大0303；中信0302；华夏0304；浦发0310
// --民生0305；平安0410；广发0306；兴业0309；北京0430；上海0501；杭州0502；南京0503；江苏0504；宁波0505