package com.soywiz.klock

enum class Month(val index: Int) {
	January(1), // 31
	February(2), // 28/29
	March(3), // 31
	April(4), // 30
	May(5), // 31
	June(6), // 30
	July(7), // 31
	August(8), // 31
	September(9), // 30
	October(10), // 31
	November(11), // 30
	December(12); // 31

	val index0: Int get() = index - 1

	fun days(isLeap: Boolean): Int = days(index, isLeap)
	fun daysToStart(isLeap: Boolean): Int = daysToStart(index, isLeap)
	fun daysToEnd(isLeap: Boolean): Int = daysToEnd(index, isLeap)

	fun days(year: Int): Int = days(index, year)
	fun daysToStart(year: Int): Int = daysToStart(index, year)
	fun daysToEnd(year: Int): Int = daysToEnd(index, year)

	companion object {
		val BY_INDEX0 = values()
		operator fun invoke(index1: Int) = BY_INDEX0[(index1 - 1) umod 12]
		operator fun get(index1: Int) = BY_INDEX0[(index1 - 1) umod 12]

		fun check(month: Int): Int {
			if (month !in 1..12) throw DateException("Month $month not in 1..12")
			return month
		}

		fun normalize(month: Int) = ((month - 1) umod 12) + 1

		fun days(month: Int, isLeap: Boolean): Int {
			//val nmonth = check(month)
			val nmonth = normalize(month)
			val days = DAYS_TO_MONTH(isLeap)
			return days[nmonth] - days[nmonth - 1]
		}

		fun daysToStart(month: Int, isLeap: Boolean): Int = DAYS_TO_MONTH(isLeap)[(month - 1) umod 13]
		fun daysToEnd(month: Int, isLeap: Boolean): Int = DAYS_TO_MONTH(isLeap)[month umod 13]

		fun days(month: Int, year: Int): Int = days(month, Year.isLeap(year))
		fun daysToStart(month: Int, year: Int): Int = daysToStart(month, Year.isLeap(year))
		fun daysToEnd(month: Int, year: Int): Int = daysToEnd(month, Year.isLeap(year))

		fun DAYS_TO_MONTH(isLeap: Boolean): IntArray = if (isLeap) DAYS_TO_MONTH_366 else DAYS_TO_MONTH_365

		val DAYS_TO_MONTH_366 = intArrayOf(0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366)
		val DAYS_TO_MONTH_365 = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365)
	}
}
