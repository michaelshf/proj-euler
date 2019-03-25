(ns project-euler.ex3refactor)

(defn largest-prime-factor
     ([n] (largest-prime-factor n 2))
     ([n i] (cond (= n i) n
                  (zero? (mod n i)) (recur (/ n i) i)
                  :else (recur n (inc i)))))

(largest-prime-factor 13195)
(largest-prime-factor 600851475143)
