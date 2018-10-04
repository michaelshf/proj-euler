(ns project-euler.ex4)
;A palindromic number reads the same both ways. 
;The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;Find the largest palindrome made from the product of two 3-digit numbers.

(defn is-palindrome? [number]
  (if (= (clojure.string/join (reverse (str number))) (str number))
    (Boolean/TRUE)
    (Boolean/FALSE)))

(is-palindrome? 10200)
(is-palindrome? 10201)

(defn big-factors? [number]
  (for [x (range (- number 1) 1 -1)]
    (if (and (< 100 x) (> 1000 x) (= (mod number x) 0) (< 100 (/ number x)) (> 1000 (/ number x)))
      (Boolean/TRUE)
      (Boolean/FALSE))))

(some true? (vec (big-factors? 121)))
(some true? (vec (big-factors? 10201)))
(some true? (vec (big-factors? 10203)))

(defn big-palindrome [number]
  (for [x (range number 1 -1)]
    (if (and (is-palindrome? x) (some true? (vec (big-factors? x))))
      (println x))))

(big-palindrome 121)
(println "mcihals")
(big-palindrome 10202)
(big-palindrome 20502)
(take 1 (big-palindrome 10202))
(take 100000 (big-palindrome 998001))
