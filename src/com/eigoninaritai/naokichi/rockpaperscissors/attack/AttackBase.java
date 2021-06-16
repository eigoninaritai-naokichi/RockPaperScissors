package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * じゃんけんの攻撃ベースクラス。
 */
public abstract class AttackBase {
	/**
	 * じゃんけんの攻撃の種類を取得する。
	 * @return じゃんけんの攻撃の種類を返す。
	 */
	public abstract AttackType getAttackType();
	
	/**
	 * じゃんけんの攻撃の文字列を取得する。
	 * @return じゃんけんの攻撃の文字列を返す。
	 */
	public abstract String getAttackName();
}
