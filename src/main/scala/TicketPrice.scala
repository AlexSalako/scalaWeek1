class TicketPrice (val customer: String,
                   oneHour: Double = 2.0,
                   threeHour: Double = 4.5,
                   allDay: Double = 7.0) {

    def endOfDay = oneHour + threeHour + (allDay * 2)
    def oneHourDisc = (oneHour * 2) * 0.875
    def threeHourDisc = (threeHour * 2) - 1
    def allDayDisc = (allDay * 2) * 0.9
}
