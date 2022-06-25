[patika.dev](https://patika.dev) üzerinden aldığım [Veri Yapıları ve Algoritmalar](https://app.patika.dev/courses/veri-yapilari-ve-algoritmalar) eğitimindeki bir proje.

## [22,27,16,2,18,6] -> Insertion Sort

### Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

1. Adım [2, 27, 16, 22, 18, 6] -> 2 ile 22 yer değiştirdi.
2. Adım [2, 6, 16, 22, 18, 27] -> 6 ile 27 yer değiştirdi.
3. Adım [2, 6, 16, 22, 18, 27] -> 3. sıradaki sayı en küçük olduğu için değişiklik olmadı.
4. Adım [2, 6, 16, 18, 22, 27] -> 18 ile 22 yer değiştirdi.
5. Adım [2, 6, 16, 18, 22, 27] -> 5. sıradaki sayı en küçük olduğu için değişiklik olmadı.
6. Adım [2, 6, 16, 18, 22, 27] -> 6. sıradaki sayı en büyük sayı olarak belirlenir ve sıralama biter.

### Big-O gösterimini yazınız.

O(n²) = O(6²) = O(36)

### Time Complexity: 

- Average case: Aradığımız sayının ortada olması,
- Worst case: Aradığımız sayının sonda olması,
- Best case: Aradığımız sayının dizinin en başında olması.

Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
-  Averge case

## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

1. Adım [2,3,5,8,7,9,4,15,6] -> 7 ile 2 yer değiştirdi.
2. Adım [2,3,5,8,7,9,4,15,6] -> 2. sıradaki 3 rakamı en küçük olduğu için değişiklik olmadı.
3. Adım [2,3,4,8,7,9,5,15,6] -> 5 ile 4 yer değiştirdi.
4. Adım [2,3,4,5,7,9,8,15,6] -> 8 ile 5 yer değiştirdi.
