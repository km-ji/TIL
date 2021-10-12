#4-1 조건문
job.type <- 'A'
if (job.type=='B'){
  bonus <- 200
} else {
  bonus <- 100
}
print(bonus)

#4-2
job.type <- 'B'
bonus <- 100
if(job.type=='A'){
  bonus <- 200
}
print(bonus)


#4-3
score <- 85
if(score>90){
  grade <- 'A'
} else if (score>80){
  grade <- 'B'
} else if (score>70){
  grade <- 'C'
} else if (score>60){
  grade <- 'D'
} else{
  grade <- 'F'
}
print(grade)


#4-4
a <- 10
b <- 20
if (a>5 & b>5){
  print(a+b)
}
if (a>5 | b>30){
  print(a*b)
}

#4-5
a <- 10
b <- 20
if(a>b){
  c <- a
} else{
  c <- b
}
print(c)

a <- 10
b <- 20
c <- ifelse(a>b,a,b)
print(c)

#4-6 반복문
for(i in 1:5){
  print('*')
}

#4-7
for (i in 6:10){
  print(i)
}

#4-8
for(i in 1:9){
  cat('2*',i,'=',2*i,'\n')
}

#4-9
for(i in 1:20){
  if (i%%2==0){
    print(i)
  }
}

#4-10
sum <- 0
for (i in 1:100){
  sum <- sum+i
}
print(sum)


#4-11
norow <- nrow(iris)
mylabel <- c()
for ( i in 1:norow){
  if (iris$Petal.Length[i]<= 1.6){
      mylabel[i] <- 'L'
  } else if (iris$Petal.Length[i]>=5.1){
      mylabel[i] <- 'H'
  } else{
      mylabel[i] <- 'M'
  }
}
print(mylabel)
newds <- data.frame(iris$Petal.Length,mylabel)
head(newds)

#4-12
sum <- 0
i <- 1
while(i<=100){
  sum <- sum+i
  i <- i+1
}
print(sum)

#4-13
sum <- 0
for(i in 1:10){
  sum <- sum+i
  if(i>=5) break
}
sum

#4-14
sum <- 0
for ( i in 1:10){
  if (i%%2==0) next
  sum <- sum+i
}
sum

#4-15
apply(iris[,1:4],1,mean)  #row 방향으로 함수 적용
apply(iris[,1:4],2,mean)  #col 방향으로 함수 적용






