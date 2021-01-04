fun main(args:Array<String>){
    //image1.png ~ image9.png 까지 출력
    for (idx in 1..9){
        println("image:${idx}.png")
    }

    //배열과 List 생성
    var ar = arrayOf<String>(
        "Java", "Android", "iOS", "Kotlin", "Swift")
    var list = listOf<String>(
        "iphone","ipad","ApplePencil","Macbook")

    //인덱스를 idx에 대입
    for (idx in ar.indices){
        println(idx)
    }
    //인덱스와 값을 idx에 대입
    for (idx in list.withIndex()){
        println(idx)
    }
}