package  models

import java.util.Calendar

/**
 * @author FScoward
 * @param calendar 時刻、日付
 * @param what 何を 
 * @param where どこで
 */
case class ScheduleOfTheDay(calendar: Calendar, what: String, where: String)