package com.eigoninaritai.naokichi.rockpaperscissors.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ユーザーのキーボード入力を読み取るクラス。
 */
public class KeyboardReader {
	/**
	 * ユーザーの入力を読み取る。
	 * @return ユーザーが入力した文字列を返す。
	 */
	public String readLine() {
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
		try {
			return inputStream.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
