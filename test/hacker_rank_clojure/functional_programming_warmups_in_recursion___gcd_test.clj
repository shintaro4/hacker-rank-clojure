(ns hacker-rank-clojure.functional-programming-warmups-in-recursion---gcd-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.functional-programming-warmups-in-recursion---gcd :refer :all]))

(deftest test-functional-programming-warmups-in-recursion---gcd
  (testing "sample I/O."
    (is (= 1 (gcd 1 5))
        (= 10 (gcd 10 100))
        (= 1 (gcd 22 131)))))
