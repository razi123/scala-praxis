var student = "English 99,Maths 30,Science 40"

val subject_marks = student.split(",")
val subjects = subject_marks.map(sm => sm.split(" ")(0))
val marks = subject_marks.map(sm => sm.split(" ")(1).toInt)

val sum = marks.sum
val total_subjects = marks.size
val avg = sum/total_subjects.toFloat

// substring and slice are same
student.slice(0,3)
student.substring(0,3)

val num1 = 10
val num2 = 20

val sum2 = num1 + num2

print(s"sum of num1 and num2 is $sum2")
print("sum of %d and %d is %d".format(num1, num2, sum2))

"%c for %s".format('A', "Apple")
"%d".format(50)
"%2d".format(51)
"%3d".format(50)

// int = 5000 will give error
"%f".format(5000f)
"%12f".format(5000f)

"%.2f".format(5000f)
"%8.2f".format(5000f)

val rev_string = "hello1"
for (i <- rev_string.length until 0) println(i)