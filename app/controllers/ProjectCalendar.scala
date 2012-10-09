package controllers

import play.api._
import play.api.mvc._

object ProjectCalendar extends Controller {
	def index = Action {
		Ok(views.html.large("test"))
	}
}