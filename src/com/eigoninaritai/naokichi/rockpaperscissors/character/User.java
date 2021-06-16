package com.eigoninaritai.naokichi.rockpaperscissors.character;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.input.KeyboardReader;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackSelector;

/**
 * ����񂯂�̃��[�U�[�N���X�B
 */
public class User extends CharacterBase {
	/**
	 * ����񂯂�̍U����I������B
	 * @return �I����������񂯂�̍U����Ԃ��B
	 */
	@Override
	public AttackBase selectAttack() {
		try {
			System.out.println("���ɏo�����I��ł��������B");
			System.out.println("0:�O�[�A1:�p�[�A2:�`���L");
			KeyboardReader keyboardReader = new KeyboardReader();
			String attackTypeNumber = keyboardReader.readLine();
			AttackSelector attackSelector = new AttackSelector();
			return attackSelector.selectAttack(attackTypeNumber);
		} catch (NumberFormatException e) {
			System.out.println("�ȉ��̂����ꂩ�̒l�݂̂���͂��Ă��������B");
			return selectAttack();
		}
	}
}
