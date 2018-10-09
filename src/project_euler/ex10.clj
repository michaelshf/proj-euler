(ns project-euler.ex10
  (:require [clojure.java.io :as io]))


; sum of primes below ten: 2+3+5+7 = 17
(defn prime? [number]
  (not-any? true? (for [x (range 2 number)]
                 (if (= 0 (mod number x))
                   (Boolean/TRUE)))))

(defn prime-list [number]
  (filter prime? (range 2 number)))


(defn any? [l]
  (reduce #(or %1 %2) l))
 
(defn prime? [n]
  (if (even? n) false
      (let [root (num (int (Math/sqrt n)))]
	(loop [i 3]
	  (if (> i root) true
	      (if (zero? (mod n i)) false
		  (recur (+ i 2))))))))
 
(defn n-primes [n]
  (loop [num 2 p [0]]
    (if (> (last p) n) p
	(recur (inc num) (if (prime? num) (concat p [num]) p)))))

(butlast (n-primes 10))
(butlast (n-primes 100))
(reduce + (prime-list 100))
(reduce + (butlast (n-primes 100)))

(n-primes 10000)

(reduce
  (fn [primes number]
    (if (some zero? (map (partial mod number) primes))
      primes
      (conj primes number)))
  [2]
  (take 100000 (iterate inc 3)))

