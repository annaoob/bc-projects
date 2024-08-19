/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/15/2024
 * Program 3: operator overloads
 * Program stores information about a CalendarDate and has methods that overload operators ==, >, <, ++
 */

#include <sstream>
#include <string>

//class CalendarDate holds private integers month, day, year
class CalendarDate {
 private:
  int month, day, year;

//constructor, defaults to January 1, 1970
 public:
  CalendarDate(int month = 1, int day = 1, int year = 1970) {
    this->month = month;
    this->day = day;
    this->year = year;
  }

  // ACCESSORS (getters)
  int get_month() const {
    return month;
  }

  int get_day() const {
    return day;
  }

  int get_year() const {
	return year;
  }

  // simple quick output
  //prints out shorthand date (mm/dd/yyyy)
  std::string ToString() const {
    std::stringstream ss;
    ss << month << "/" << day << "/" << year;
    return ss.str();
  }

    // I thought a long date was dinner with a person you don't like?
    // But we'll also use the January 1, 1970 format instead
  //prints out long date (Example: January 1, 1970)
  std::string LongDate() const {
    static const char* names[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    std::stringstream ss;
    ss << names[month-1] << " " << day << ", " << year;
    return ss.str();
  }

 /* CalendarDate& operator = (const CalendarDate& other) {
    day = other.day;
    month = other.month;
    year = other.year;
    return *this;
  }*/

  //overloads the == operator to compare whether two CalendarDates are equal
  bool operator == (const CalendarDate& other) const {
	return month == other.month && day == other.day && year == other.year;
  }

  //overloads the > operator to compare whether one CalendarDate is greater than another CalendarDate
  bool operator > (const CalendarDate& other) const {
  	return (year > other.year || (year == other.year && (month > other.month || (month == other.month && day > other.day))));
  }

  //overloads the < operator to compare whether one CalendarDate is less than another CalendarDate
  bool operator < (const CalendarDate& other) const {
  	return (year < other.year || (year == other.year && (month < other.month || (month == other.month && day < other.day))));
  }

  //overloads the ++ prefix operator to increase year by one
  //when applied in a print statement, the year will be printed as is and only then incremented by one
  CalendarDate& operator ++() {
    /*static const int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static const int leap_days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    const int* d = IsLeapYear() ? leap_days : days;
    ++day;
    if (day > d[month]) {
      day = 1;
      ++month;
      if (month > 12) {
        month = 1;
        ++year;
      }
    }*/
    ++year;
    return *this;
  }

  //overloads the ++ postfix operator to increase year by one
  //when applied in a print statement, the year will be incremented by one and then be printed
  CalendarDate operator ++(int) {
    CalendarDate result = *this;
    ++(*this);
    return result;
  }
/*
 private:
   bool IsLeapYear() {
     return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }
 */
};

//
inline std::ostream& operator << (std::ostream& stream, const CalendarDate& d) {
  return (stream << d.LongDate());
}

