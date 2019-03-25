(ns project-euler.ex7
  (:require [clojure.java.io :as io]))


;By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

(defn prime? [number]
  (not-any? true? (for [x (range 2 number)]
                 (if (= 0 (mod number x))
                   (Boolean/TRUE)))))
; this is fast enough for:(prime? 10000000000000000000), so should be good
(prime? 15)
(prime? 29)

(defn prime-list [number]
  (filter prime? (range 2 number)))

(defn lazy-primes []
  (filter prime? (range)))



(prime-list 30)
(nth (prime-list 30) 4)
(last (prime-list 15))
(count (prime-list 15))

; 10100th prime number?
(defn nth-prime [index]
  (loop [x 2]
    (if (not (> (count (prime-list x)) index))
      (do (recur (* x x)))
      (do (nth (prime-list x) (dec index))))))
; too slow
(nth-prime 100)
                                        ;store the intermediate data on the way:
(defn nth-prime2 [index]
  (last (take (+ 2 index) (lazy-primes))))

(nth-prime2 10001)
;still kinda slow, takes 30 seconds or so
