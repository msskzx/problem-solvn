# Problem Statement
Write a function that takes as input two timestamps of the form 2017/05/13 12:00 and calculates their differences in hours.
Please only return the full hour difference and round the results.
E.g., 2022/02/15 00:05 and 2022/02/15 01:00 would return 1 hour.
 
Once you did this, please expand the above function so that only the time difference will be counted between 09:00 – 17:00 and only on weekdays.
 
Let the user choose what function to use.

# Solution

This solution does not consider public holidays. Hence, the problem has two main cases:
- Normal difference: straightforward subtraction
- Difference only during working hours during weekdays

Difference only during working hours could be calculated as follows:
```
hours = number of days between dates * number of working hours per day + the remaining hours on (first date + last date)
```

However, we still need to consider the weekdays only so the update formula should be:
```
hours = (number of weekdays between first and last date that form a whole week + the remaining weekdays) * number of working hours per day + the remaining hours on (first date + last date) if weekdays
```

While disregarding the first and last date from calculation, get the number of days while considering weekdays only:
```
number of weekdays = 5 * total number of weeks
number of weeks = total days // 7
total_days = start date - end date - 1
```

Starting from the last date and going backwards for the number of remaining days, so we would not calculate the last date twice, the remaining weekdays could be calculated as follows:
```
remaining days = total days % 7

remaining weekdays = weekdays count in that remaining days
```