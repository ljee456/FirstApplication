fun main(args:Array<String>){
    val score : Int = 90
    //socre가 90이상이면 합격 그렇지 않으면 불합격이라고 출력
    if(score >= 90) println("합격") else println("불합격")   //합격이 실행되면 불합격은 실행되지 않음
    println("합격"); println("불합격")    //앞이 실행되고 뒤도 실행되기 때문에 앞에 ; 를 추가해준다.


    //when
    var food:String = "탕수육"
    when(food){
        "탕수육" -> println("중식")
        "된장찌개" -> println("한식")
        "스테이크" -> println("양식")
        else -> println("그 외")
    }
    food = "짜장면"
    when(food){
        //값을 여러 개 나열하는 것이 가능
        "탕수육", "짜장면" -> println("중식")
        "된장찌개" -> println("한식")
        "스테이크" -> println("양식")
        else -> println("그 외")
    }
    //값에 Boolean 식 사용하는 것도 가능
    when{
        food is String -> println("food는 문자열")
        else -> println("food는 문자열이 아님")
    }

    val jumsu : Int = 50
    when{
        jumsu in 60..100 -> println("합격")
        else -> println("불합격")
    }
}

