/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/15/2024
 * Program 3: operator overloads
 * Program defines the class CalendarDate and has methods that overload operators ==, >, <, ++, <<
 */

#include <sstream>
#include <string>

//class CalendarDate has private integers month, day, year
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

  //prints out shorthand date (mm/dd/yyyy)
  std::string ToString() const {
    std::stringstream ss;
    ss << month << "/" << day << "/" << year;
    return ss.str();
  }

  //prints out long date (Example: January 1, 1970)
  std::string LongDate() const {
    static const char* names[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};    
    std::stringstream ss;
    ss << names[month-1] << " " << day << ", " << year;
    return ss.str();
  }

  //overloads the == operator to compare whether two CalendarDate objects are equal
  bool operator == (const CalendarDate& other) const {
	return month == other.month && day == other.day && year == other.year;			
  }
  
  //overloads the > operator to compare whether one CalendarDate object is greater than another CalendarDate object
  bool operator > (const CalendarDate& other) const {
  	return (year > other.year || (year == other.year && (month > other.month || (month == other.month && day > other.day))));
  }
  
  //overloads the < operator to compare whether one CalendarDate object is less than another CalendarDate object
  bool operator < (const CalendarDate& other) const {
  	return (year < other.year || (year == other.year && (month < other.month || (month == other.month && day < other.day))));
  }
  
  //overloads the ++ prefix operator to increase year by one
  //when applied in a print statement, the year will be incremented by one and then printed
  CalendarDate& operator ++() {
    ++year;
    return *this;
  }
  
  //overloads the ++ postfix operator to increase year by one
  //when applied in a print statement, the year will be printed as is and only then be incremented by one
  CalendarDate operator ++(int) {
    CalendarDate result = *this;
    ++(*this);
    return result;
  }
};

//overloads the << operator to print out a long date to an output stream
inline std::ostream& operator << (std::ostream& stream, const CalendarDate& d) {
  return (stream << d.LongDate());
}
