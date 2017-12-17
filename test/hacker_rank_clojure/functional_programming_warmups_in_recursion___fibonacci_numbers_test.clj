(ns hacker-rank-clojure.functional-programming-warmups-in-recursion---fibonacci-numbers-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.functional-programming-warmups-in-recursion---fibonacci-numbers :refer :all]))

(deftest test-functional-programming-warmups-in-recursion---fibonacci-numbers
  (testing "sample I/O."
    (is (= 1 (fibonacci 3))
        (= 2 (fibonacci 4))
        (= 3 (fibonacci 5)))))
