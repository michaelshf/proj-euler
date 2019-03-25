(ns project-euler.ex3
  (require [clojure.java.io :as io]))

;; Largest prime factor
;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?
(println "michaels")

; find all the factors for a number, return a collection
; - this could be done by checking every number for mod 0, aggregating
(defn factor-filter [number]
  (remove nil?  (for [x (range 2 number)]
                (if (= 0 (mod number x))
                  x))))

; find which of those factors are prime

(defn prime-filter [number]
  (for [x (factor-filter number)]
    (if (empty? (factor-filter x))
      x)))

(defn biggest-prime-factor-finder [number]
  (if (empty? (prime-filter number))
    (println "Prime Number!")
    (apply max (filter some? (prime-filter number)))))


(factor-filter 5)
(factor-filter 10)
(factor-filter 13195)

(prime-filter 5)
(prime-filter 10)
(prime-filter 13195)
(filter some? (prime-filter 13195))

(biggest-prime-factor-finder 5)
(biggest-prime-factor-finder 10)

(biggest-prime-factor-finder 29)
(biggest-prime-factor-finder 13195)

