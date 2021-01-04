fun main(args:Array<String>){
    //1부터 1000까지의 합계 구하기
    var tot : Int = 0
    var idx : Int = 0
    while (idx < 1000){
        idx += 1
        tot += idx
    }
    println("tot:${tot}")

    //0.1을 1000번 더하기
    var sum : Double = 0.0
    idx = 0
    do {
        idx = idx + 1
        sum = sum + 0.1
    }while (idx < 1000)
    //실수를 이용해서 산술 연산을 수행하면 올바른 결과가 나오지 않을 수 있다.
    println("sum:${sum}")


    idx = 0
    while (idx < 10){
        idx = idx + 1
        //break이면 idx 가 3의 배수이면 종료
        //break 대신에 continue를 사용하면 3의 배수를 제외하고 출력한다.
        if(idx % 3 == 0){
            //break
            continue
        }
        println("idx:${idx}")
    }

//    for (i in 1..3){
//        for (j in 1..3){ //j가 여기 반복문을 빠져나감
//            if (j > 1){
//                break
//            }
//            println("i:${i} j:${j}")
//        }
//    }

    outer@ for (i in 1..3){
        for (j in 1..3){
            if (j > 1){
                //outer 라는 레이블을 가진 반복문을 종료한다.
                break@outer
            }
            println("i:${i} j:${j}")
        }
    }
}