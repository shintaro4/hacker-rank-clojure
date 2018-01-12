(ns hacker-rank-clojure.functional-programming-sums-of-powers-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.functional-programming-sums-of-powers :refer :all]))

(deftest test-fp-sum-of-odd-elements
  (testing "sample I/O."
    (is (= 1 (functional-programming-sums-of-powers 10 2)))
    (is (= 3 (functional-programming-sums-of-powers 100 2)))
    (is (= 1 (functional-programming-sums-of-powers 100 3)))))
