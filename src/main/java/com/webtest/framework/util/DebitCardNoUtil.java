package com.webtest.framework.util;

import java.util.Random;

import com.webtest.framework.constant.StringConstant;

public class DebitCardNoUtil {

	public static String generateString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(StringConstant.NUMBERCHAR.charAt(random.nextInt(StringConstant.NUMBERCHAR.length())));
		}

		return sb.toString();
	}

	public static String getGSBankno() {// 工商
		String[] arr = new String[] { "620302", "620402", "620403", "620404", "620407" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(12);
		return s;
	}

	public static String getNYBankno() {// 农行
		String[] arr = new String[] { "95595", "95596", "95597", "95598", "95599" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getYCBankno() {// 邮政
		String[] arr = new String[] { "622182", "620529", "623218", "621674", "621622" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getZHBankno() {// 中国银行
		String[] arr = new String[] { "621330", "621331", "621332", "621660", "621661" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getJSBankno() {// 建设银行
		String[] arr = new String[] { "589970", "436742", "621598", "621700", "622280" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getJTBankno() {// 交通银行
		String[] arr = new String[] { "621436", "621002", "621335", "621069", "622260" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getZXBankno() {// 中信银行
		String[] arr = new String[] { "433670", "433680", "620082", "622690", "622696" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getGDBankno() {// 光大银行
		String[] arr = new String[] { "622663", "622664", "622665", "622670", "622668" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getMSBankno() {// 民生银行
		String[] arr = new String[] { "623255", "900003", "621691", "472068", "356859" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getHXBankno() {// 华夏银行
		String[] arr = new String[] { "621222", "623020", "623021", "623022", "622630" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getGFBankno() {// 广发银行
		String[] arr = new String[] { "491035", "625071", "628259", "625810", "625810" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		// return arr[index];
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getZSBankno() {// 招商银行
		String[] arr = new String[] { "479228", "512425", "545621", "625803", "622581" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getPABankno() {// 平安银行
		String[] arr = new String[] { "412963", "415752", "415753", "622538", "998800" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getXYBankno() {// 兴业银行
		String[] arr = new String[] { "438589", "438588", "622908", "622909", "966666" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(12);
		return s;
	}

	public static String getPFBankno() {// 浦发银行
		String[] arr = new String[] { "622176", "622276", "984303", "625957", "622521" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		// return arr[index];
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getSHBankno() {// 上海银行
		String[] arr = new String[] { "356828", "625350", "625352", "519961", "356829" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getSJBankno() {// 盛京银行
		String[] arr = new String[] { "621244", "623081", "623108", "622955", "622466" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		// return arr[index];
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getZGBankno() {// 盛京银行
		String[] arr = new String[] { "623572", "623573", "623586", "623569", "623575" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getHKBankno() {// 汉口银行
		String[] arr = new String[] { "622325", "623029", "623105" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getDLBankno() {// 大连银行
		String[] arr = new String[] { "622993", "623070", "623069", "623172", "623173" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}

	public static String getNJBankno() {// 盛京银行
		String[] arr = new String[] { "628242", "622595", "622303", "622305", "621259" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getWLBankno() {// 乌鲁木齐商业银行
		String[] arr = new String[] { "628278", "625502", "625503", "625135", "622476" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getQDBankno() {// 青岛银行
		String[] arr = new String[] { "621252", "622146", "940061" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(10);
		return s;
	}

	public static String getCSBankno() {// 长沙
		String[] arr = new String[] { "622368", "940071", "621446", "621739", "620519" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		String s = arr[index] + DebitCardNoUtil.generateString(13);
		return s;
	}
}
