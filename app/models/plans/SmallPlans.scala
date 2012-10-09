package models.plans

/**
 * @author FScoward
 * @param todo やること 
 * @param priority 優先順位 
 * @param open 始めたか？
 * @param close 終わったか？
 */
case class SmallPlans(todo: String, priority: Int, open:Boolean, close: Boolean)