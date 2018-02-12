(ns hacker-rank-clojure.fibonacci-fp-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fibonacci-fp :refer :all]))

(fibonacci)
(def dp (into [] DP))
(deftest test-fibonacci-fp
  (testing "sample I/O."
    (is (= 1 (get dp 1)))
    (is (= 1 (get dp 2)))
    (is (= 2 (get dp 3)))
    (is (= 3 (get dp 4)))
    (is (= 5 (get dp 5)))))
