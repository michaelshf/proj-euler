(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.ex1 :as ex1]
            [project-euler.ex2 :as ex2]
            [project-euler.ex3 :as ex3]))


(deftest example-one
  (testing "example 1 example"
    (is (= 23 (ex1/multiple-summer 10)))))


(deftest example-two
  (testing "example 2 provided example"
    (is (= 44 (ex2/even-fib-summer 100)))))

(deftest example-three
  (testing "example 3 provided example"
    (is (= 29 (ex3/biggest-prime-factor-finder 13195)))))
