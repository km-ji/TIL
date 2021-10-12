#5.3-1
DF_cross <- read.csv(file="cross_gender.csv")
table(DF_cross$Grade,DF_cross$Gender)
 
DF_student_body <- read.csv(file="student_body.csv")
table(DF_student_body$BloodType)
table(DF_student_body$Grade, DF_student_body$Gender)

#5.3-2
DF_coffee_sales <- read.csv(file="coffee_sales.csv")
TBL_sales <- table(DF_coffee_sales$Menu)
prop.table(TBL_sales)

DF_student_body <- read.csv(file="student_body.csv")
TBL_body <- table(DF_student_body$Grade)
prop.table(TBL_body)

#5.4-1
DF_gender <- read.csv(file="frequency_gender.csv")
barplot(table(DF_gender))

DF_gender <- read.csv(file="cross_gender.csv")
barplot(table(DF_gender), legend=TRUE)

DF_student_body <- read.csv(file="student_body.csv")
barplot(table(DF_student_body$BloodType), legend=TRUE)

#5.5-1
DF_coffee_sales <- read.csv(file="coffee_sales.csv")
pie(table(DF_coffee_sales$Menu))

DF_student_study <- read.csv(file="student_study.csv")
pie(table(DF_student_study$Free_Time))
