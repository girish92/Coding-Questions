/*

Source: codefight.com
Company: Asana

You have some tasks in your Asana account. For each ith of them you know its deadline i - the last day by which it should be completed. As you can see in your calendar, today is the day number day. Asana labels each task in accordance with its due date:

If the task is due today or it's already overdue, it is labeled as Today;
If the task should be completed within a week (but not today), i.e. its deadline is somewhere between day + 1 and day + 7 both inclusive, it is labeled as Upcoming;
All other tasks are labeled as Later;
Your goal is to find the number of tasks with each label.

Example

For deadline = [1, 2, 3, 4, 5] and day = 2, the output should be
tasksTypes(deadline, day) = [2, 3, 0];
For deadline = [1, 2, 4, 2, 10, 3, 1, 4, 5, 4, 9, 8] and day = 1, the output should be
tasksTypes(deadline, day) = [2, 8, 2].


[input] array.integer deadline

Array of positive integers.


[input] integer day

A positive integer.



[output] array.integer

Array of three elements - the number of tasks labeled as Today, Upcoming and Later, respectively.


*/

int[] tasksTypes(int[] deadline, int day) {

    int today = day;
    int upcomingStart = today + 1;
    int upcomingEnd = today + 7;
    int later = today + 8;

    int todayCount = 0;
    int upcomingCount = 0;
    int laterCount = 0;
    
    for(int i = 0; i < deadline.length; i++){
        if(deadline[i] <= today){
            todayCount++;
        }else if(deadline[i] >= upcomingStart
                 && deadline[i] <= upcomingEnd){
            upcomingCount++;
        }else if(deadline[i] >= later){
            laterCount++;
        }
    }
    int[] tasks = new int[]{todayCount, upcomingCount, laterCount};
    return tasks;
}
