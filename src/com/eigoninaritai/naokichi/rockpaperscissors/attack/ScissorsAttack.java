package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * じゃんけんのチョキのクラス。
 */
public class ScissorsAttack extends AttackBase {
	/**
	 * じゃんけんのチョキの攻撃の種類を行う。
	 * @return じゃんけんのチョキの種類を返す。
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Scissors;
	}
	
	/**
	 * じゃんけんのチョキの文字列を取得する。
	 * @return じゃんけんのチョキの文字列を返す。
	 */
	@Override
	public String getAttackName() {
		return "チョキ";
	}
}
