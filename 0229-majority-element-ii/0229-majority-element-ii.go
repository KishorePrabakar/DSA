func majorityElement(nums []int) []int {
    counts := make(map[int]int)
    var t = len(nums)/3
    var res []int

    for _, num := range nums{
        counts[num]++
    }

    for num, count := range counts{
        if count > t{
            res = append(res, num)
        }
    }

    return res
}