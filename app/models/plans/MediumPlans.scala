package models.plans

import java.util.Calendar

/**
 * 中日程
 * @author FScoward
 * @param planName プラン名
 * @param start 開始日
 * @param end 終了日
 * @smallPlan 小日程
 */
case class MediumPlans(planName: String, start: Calendar, end: Calendar, smallPlan: Array[SmallPlans])