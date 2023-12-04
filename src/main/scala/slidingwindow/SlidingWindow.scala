package slidingwindow

object SlidingWindow {

  /** Method returns absolute value of the number
    *
    * @param Int
    * @return
    */
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val res = nums.filter(_ != `val`)
    res.indices.foldLeft(nums) { (nums, i) =>
      nums(i) = res(i)
      nums
    }
    res.length
  }

  def calculatwWeight(num: Int): Int = {

    val gender = if(num == 6) "M" else "F"

    val weight = if (gender=="M") num * 50 else num * 20

    weight
  }

}