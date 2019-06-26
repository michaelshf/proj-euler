(ns project-euler.exercise1-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.exercise1 :as e1]))

(deftest exercise1-test
  (testing "The example is solved"
    (is (= 23 (e1/sum-3s-5s 10))))

  (testing "The answer to problem."
    (println (str "Exercise1 is: " (e1/sum-3s-5s 1000)))))
