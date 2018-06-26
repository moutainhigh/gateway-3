/**
 * Copyright [2015-2017]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.gateway.common.utils;

/**
 * 十六进制工具类
 * @author xiaoshiwen<xiaoshiwen@zitopay.com>
 * @since 2017年5月8日
 */
public class HexUtil {

	public static String toHexString(byte[] value) {
		if (value == null) {
			return null;
		}

		StringBuffer sb = new StringBuffer(value.length * 2);
		for (int i = 0; i < value.length; i++) {
			sb.append(toHexString(value[i]));
		}
		return sb.toString();
	}

	private static String toHexString(byte value) {
		String hex = Integer.toHexString(value & 0xFF);

		return padZero(hex, 2);
	}

	private static String padZero(String hex, int length) {
		for (int i = hex.length(); i < length; i++) {
			hex = "0" + hex;
		}
		return hex.toUpperCase();
	}
}
