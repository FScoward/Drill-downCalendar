package models.plans

import java.util.Calendar

/**
 * 大日程
 * @author FScoward
 * @param planName プラン名 
 * @param start 開始日 
 * @param end 終了日
 */
case class Plans(planName: String, start: Calendar, end: Calendar, mediumPlan: Array[MediumPlans])