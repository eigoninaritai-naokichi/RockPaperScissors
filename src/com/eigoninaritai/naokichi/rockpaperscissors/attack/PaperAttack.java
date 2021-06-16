package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * じゃんけんのパーのクラス。
 */
public class PaperAttack extends AttackBase {
	/**
	 * じゃんけんのパーの攻撃の種類を取得する。
	 * @return じゃんけんのパーの攻撃の種類を返す。
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Paper;
	}
	
	/**
	 * じゃんけんのパーの文字列を取得する。
	 * @return じゃんけんのパーの文字列を返す。
	 */
	@Override
	public String getAttackName() {
		return "パー";
	}
}
