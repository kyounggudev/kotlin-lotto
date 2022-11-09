package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6){
            throw IllegalArgumentException("[ERROR] 로또 번호는 6개의 숫자로 이루어져야합니다.")
        }
        require(notDuplicate(numbers)){
            throw IllegalArgumentException("[ERROR] 로또 번호는 서로 중복돼서는 안됩니다.")
        }
        require(inRange(numbers))
    }

    private fun notDuplicate(numbers : List<Int>) : Boolean{
        return numbers.size == numbers.distinct().count()
    }
    private fun inRange(numbers : List<Int>) : Boolean{
        return !numbers.any { (it)< MIN|| (it)>MAX }
    }

    // TODO: 추가 기능 구현
}

