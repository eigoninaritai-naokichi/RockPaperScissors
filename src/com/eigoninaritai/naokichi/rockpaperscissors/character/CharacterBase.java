package com.eigoninaritai.naokichi.rockpaperscissors.character;

import java.util.Random;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;

/**
 * じゃんけんのキャラクターのベースクラス。
 */
public abstract class CharacterBase {
	/**
	 * キャラクターの最大HP。
	 */
	private int MAX_HP = 20;
	
	/**
	 * 最大のダメージの値。
	 */
	private int MAX_DAMAGE = 10;
	
	/**
	 * 通常のダメージの値。
	 */
	private int NORMAL_DAMAGE = 1;
	
	/**
	 * 現在のキャラクターのHP。
	 */
	private int currentHP = MAX_HP;
	
	/**
	 * 現在のキャラクターのHPを返す。
	 * @return 現在のキャラクターのHPを返す。
	 */
	public int getCurrentHP() {
		return currentHP;
	}

	/**
	 * じゃんけんの攻撃を選択する。
	 * @return 選択したじゃんけんの攻撃を返す。
	 */
	public abstract AttackBase selectAttack();

	/**
	 * 対象のキャラクターにダメージを与える。
	 * @param cahracter 攻撃対象のキャラクター。
	 */
	public void attack(CharacterBase cahracter) {
		// 10分の1の確率でクリティカルダメージが発生し、それ以外は通常ダメージを与える。
		Random random = new Random();
		int damageTemp = random.nextInt(MAX_DAMAGE);
		int damage = NORMAL_DAMAGE;
		if (damageTemp == MAX_DAMAGE -1) {
			damage = MAX_DAMAGE;
			System.out.println("クリティカル！");
		}
		cahracter.receiveDamage(damage);
	}
	
	/**
	 * ダメージを受ける。
	 * @param damage 受けるダメージの値。
	 */
	private void receiveDamage(int damage) {
		currentHP -= damage;
	}
}
