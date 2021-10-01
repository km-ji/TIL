c(25, 20, 12, 10, 7, 5)
c("Americano", "Cappuccino", "Espresso", "Cafe Mocha", "Macchiato")
c(1:20)

#실습
ID <- c(1:15)
ID
name <- c("Harry", "Sam", "Susan")
name
has_Laptop <- c(TRUE, FALSE, TRUE)
has_Laptop

student_score <- c(80, 90, 95, 75, 85)
student_score[5]

#수열
#seq() : 수열
seq(1,20)
seq(2,24,by=2)

#rep():반복
rep(x=c(TRUE, FALSE, TRUE, TRUE), times=2)
rep(x=c(4,5,8), times=5)

seq(1,30)
seq(2,24, by=2)
rep(x=c(2,3,4), times=4)

#data.frame() : 하나 이상의 길이가 같은 벡터를 인자로 전달하면, 데이터 프레임을 생성하는 함수
DF_menu=data.frame(No=c(1,2,3), Menu=c("Americano", "Cafe Latte", "Espresso"), Price=c(4100, 4600, 3600))
DF_menu


#read.csv() : 외부데이터 부르는 함수
#사용방법1. DF <- read.csv(file="이름.csv")
#사용방법2. str()(DF_name)
DF_coffee_sales <- read.csv(file="coffee_sales.csv")
str(DF_coffee_sales)

#View() : 데이터 뷰어를 통해 데이터프레임의 정보를 보여주는 함수
#방법 : View(DF_name) / dim(x) => dim(DF_Student): 행과 열 반환/ length(x) => length(DF_student$Name) : 길이 반환
dim(DF_coffee_info)
length(DF_coffee_info)
#head(DF_name) : 앞 6개 데이터 추출
#tail(DF_name) : 뒤
#summary(DF_name) : 통계 요약(최소 최대값, 평균, 등)
summary(DF_coffee_info)

DF_coffee_info[2]
DF_coffee_info[c(2,3)]
DF_coffee_info[c("Owner", "Beans")]
DF_coffee_info[DF_coffee_info$Owner=="M",]










