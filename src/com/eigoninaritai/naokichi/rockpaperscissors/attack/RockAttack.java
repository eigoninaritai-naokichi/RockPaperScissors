package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * じゃんけんのグーのクラス。
 */
public class RockAttack extends AttackBase {
	/**
	 * じゃんけんのグーの攻撃の種類を行う。
	 * @return じゃんけんのグーの攻撃の種類を返す。
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Rock;
	}
	
	/**
	 * じゃんけんのグーの文字列を取得する。
	 * @return じゃんけんのグーの文字列を返す。
	 */
	@Override
	public String getAttackName() {
		return "グー";
	}
}
