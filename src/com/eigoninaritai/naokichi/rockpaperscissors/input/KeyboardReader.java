package com.eigoninaritai.naokichi.rockpaperscissors.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ���[�U�[�̃L�[�{�[�h���͂�ǂݎ��N���X�B
 */
public class KeyboardReader {
	/**
	 * ���[�U�[�̓��͂�ǂݎ��B
	 * @return ���[�U�[�����͂����������Ԃ��B
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
