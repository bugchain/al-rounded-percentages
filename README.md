<h2>Getting 100% with rounded percentages<br>
การคำนวณหาค่า % ให้ได้ 100 %</h2>


<h2>ตัวอย่างข้อมูล</h2>
18.562874251497007 %<br>
20.958083832335326 %<br>
18.562874251497007 %<br>
19.161676646706585 %<br>
22.75449101796407 %<br><br>

ทำการปัดค่า หลังจุดทศนิยมถ้ามากกว่า .5 ปัดขึ้น น้อยกว่า .5 ปัดลงจะได้ข้อมูลตามนี้<br>
<br>
19 %<br>
21 %<br>
19 %<br>
19 %<br>
23 %<br>

นำค่ามากบวกกันทั้งหมด<br><br>
19 + 21 + 19 + 19 + 23 = 101<br>
จะเห็นว่าค่า % เกินมาเป็น 101 ซึ่งไม่ถูกต้อง<br><br>

<h2>วิธีการหาค่า % อิงจากค่าหลังจุดทศนิยมมากที่สุด <br><a href="https://en.wikipedia.org/wiki/Largest_remainder_method"> Largest Remainder Method</a></h2><br>

1. ปัดค่าลงทั้งหมด จะได้<br>
   18, 20, 18, 19, 22<br>
2. นำ 100 - (ค่าที่ปัดทั้งหมดบวกกัน)<br>
   100 - (18+20+18+19+22) = 3<br>
   3 คือค่าที่บอกว่าต้องปัดขึ้นกี่ตัว<br>
3. นำชุดข้อมูลมาเรียงใหม่ อิงจากตัวที่มีค่าหลังจุดทศนิยมมากที่สุด จะได้<br>
   20.958083832335326, 22.75449101796407, 18.562874251497007, 18.562874251497007, 19.161676646706585<br>
4. ปัดค่า 3 จำนวนแรกขึ้น (3 ที่ได้จากการคำนวนข้อ 2) จะได้<br>
   21, 23 19, 18, 19<br>
  
   นำค่ามาบวกกันจะเห็นว่าได้ 100% พอดี<br>
   21+23+19+18+19 = 100<br><br>

 Ref : https://revs.runtime-revolution.com/getting-100-with-rounded-percentages-273ffa70252b

<br>


    val floors = data.map { floor(it) }
    val sum = floors.sum()
    val diff = 100 - sum
    val sort = data.sortedByDescending { it - (floor(it)) }

    return sort.mapIndexed { index, d ->
        if (index < diff) d + 1 else d
    }.map { it.toInt() }

    /*
    val diff = 100 - (data.map { floor(it) }.sum())
    return data.sortedByDescending {
        it - (floor(it))
    }.mapIndexed { index, value ->
        if (index < diff) value + 1 else value
    }.map {
        floor(it)
    }.map {
        it.toInt()
    }
    */

                         
<br>

