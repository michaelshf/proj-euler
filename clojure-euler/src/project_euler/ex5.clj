(ns project-euler.ex5
  (require [clojure.java.io :as io]))

;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn one-ten-mod [number]
  (if (some false? (map
                     #(= 0 (mod number %))
                     (range 1 11)))
    (Boolean/FALSE)
    (Boolean/TRUE)))

(one-ten-mod 2520)
(one-ten-mod 100)

; now lets up it to 20, and put it in a lazy seq to find the first:
(defn one-twenty-mod [number]
  "takes a number, finds if every number from 1-20 is a factor of it"
  (if (some false? (map
                     #(= 0 (mod number %))
                     (range 1 21)))
    (Boolean/FALSE)
    (Boolean/TRUE)))

(defn one-ten-list []
  (filter (fn [x] (one-ten-mod x))
          (range 1 3000)))

(defn one-twenty-list []
  (take 2 (filter (fn [x] (one-twenty-mod x)) (range))))

(defn lazy-list []
  (fn [x] (one-ten-mod x) (range)))

(take 2  (filter (fn [x] (even? x)) (range)))
(take 2 (filter (fn [x] (one-ten-mod x)) (range)))
(take 2 (filter (fn [x] (one-twenty-mod x)) (range)))
(take 1 (lazy-list))

(println "michaels")
(one-ten-list)
(one-twenty-list)
