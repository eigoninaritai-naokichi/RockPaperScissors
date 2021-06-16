package com.eigoninaritai.naokichi.rockpaperscissors.character;

import java.util.Random;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;

/**
 * ����񂯂�̃L�����N�^�[�̃x�[�X�N���X�B
 */
public abstract class CharacterBase {
	/**
	 * �L�����N�^�[�̍ő�HP�B
	 */
	private int MAX_HP = 20;
	
	/**
	 * �ő�̃_���[�W�̒l�B
	 */
	private int MAX_DAMAGE = 10;
	
	/**
	 * �ʏ�̃_���[�W�̒l�B
	 */
	private int NORMAL_DAMAGE = 1;
	
	/**
	 * ���݂̃L�����N�^�[��HP�B
	 */
	private int currentHP = MAX_HP;
	
	/**
	 * ���݂̃L�����N�^�[��HP��Ԃ��B
	 * @return ���݂̃L�����N�^�[��HP��Ԃ��B
	 */
	public int getCurrentHP() {
		return currentHP;
	}

	/**
	 * ����񂯂�̍U����I������B
	 * @return �I����������񂯂�̍U����Ԃ��B
	 */
	public abstract AttackBase selectAttack();

	/**
	 * �Ώۂ̃L�����N�^�[�Ƀ_���[�W��^����B
	 * @param cahracter �U���Ώۂ̃L�����N�^�[�B
	 */
	public void attack(CharacterBase cahracter) {
		// 10����1�̊m���ŃN���e�B�J���_���[�W���������A����ȊO�͒ʏ�_���[�W��^����B
		Random random = new Random();
		int damageTemp = random.nextInt(MAX_DAMAGE);
		int damage = NORMAL_DAMAGE;
		if (damageTemp == MAX_DAMAGE -1) {
			damage = MAX_DAMAGE;
			System.out.println("�N���e�B�J���I");
		}
		cahracter.receiveDamage(damage);
	}
	
	/**
	 * �_���[�W���󂯂�B
	 * @param damage �󂯂�_���[�W�̒l�B
	 */
	private void receiveDamage(int damage) {
		currentHP -= damage;
	}
}
