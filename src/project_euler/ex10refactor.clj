(defn square [n]
  (* n n))
 
(defn sum [s]
  (reduce + s))
 
(defn primes-under2 [n]
  (let [sieve (transient (set (cons 2 (range 3 n 2))))]
    (loop[s sieve
           f 3]
      (cond (> (square f) n) (persistent! s)
            :else (recur (reduce disj! s (range (square f) n f)) (inc f))))))
 
(defn problem10
  ([] (problem10 2000000))
  ([n] (bigint (sum (primes-under2 n)))))

(problem10)
