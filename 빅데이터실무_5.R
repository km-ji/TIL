str(iris) #데이터셋 요약 정보 보기
iris[,5] #품종 데이터 포기
unique(iris[,5]) #품종의 종류 보기(중복 제거)

colSums(iris[,-5]) #열별 합계
colMeans(iris[,-5]) #열별 평균
rowSums(iris[,-5]) #행별 합계
rowMeans(iris[,-5]) #행별 평균

z <- matrix(1:20, nrow=4, ncol=5)
z
t(z) #행과열 방향 전환

#조건에 맞는 행과 열의 값 추출
IR.1 <- subset(iris, Species=="setosa")
IR.1
IR.2 <- subset(iris, Sepal.Length>5.0 & Sepal.Width>4.0)
IR.2
IR.2[,c(2,4)] #2,4 열의 값만 추출

a <- matrix(1:20, 4, 5)
b <- matrix(21:40, 4, 5)
a
b

2*a #매트릭스 a에 저장된 값들에 2를 곱하기
b-5
2*a+3*b

a+b
b-a
b/a
a*b

a <- a*3
b <- b-5

#매트릭스와 데이터프레임의 자료구조 확인
class(iris) #iris 데이터셋의 자료 구조 확인
class(state.x77) #state.x77 데이터셋의 자료 구조 확인
is.matrix(iris) #데이터셋이 매트릭스인지를 확인하는 함수
is.data.frame(iris) #데이터셋이 데이터프레임인지를 확인하는 함수
is.matrix(state.x77)
is.data.frame(state.x77)

#매트릭스와 데이터프레임의 자료구조 변환
##매트릭스를 데이터프레임으로 변환
st <- data.frame(state.x77)
head(st)
class(st)
##데이터프레임을 매트릭스로 변환
iris.m <- as.matrix(iris[,1:4])
head(iris.m)
class(iris.m)

#데이터프레임의 열 추출
iris[,"Species"] #결과=벡터. 매트릭스와 데이터프레임 모두 가능
iris[,5] #결과=벡터. 매트릭스와 데이터프레임 모두 가능
iris["Species"] #결과=데이터프레임. 데이터프레임만 가능
iris[5] #결과=데이터프레임, 데이터프레임만 가능
iris$Species #결과=벡터. 데이터프레임만 가능

#파일 데이터 읽기
setwd("D:\source") #작업폴더 지정
air <- read.csv("airquality.csv", header=T)
head(air)

#파일 데이터 쓰기
setwd("D:\source") #작업 폴더 지정
my.iris <- subset(iris, Species=='setosa') #Setosa 품종 데이터만 추출
write.scv(my.iris, "my_iris.csv", row.names=F) #.csv 파일에 저장하기
#(저장할 데이터가 들어있는 곳, 저장할 파일 이름, row.names=F : 행번호를 붙이지 말라는 것)


