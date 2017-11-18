(ns hacker-rank-clojure.eval-ex-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.eval-ex :refer :all]))

(deftest test-eval-ex
  (testing "sample I/O."
    (are [x y] (= x y)
      2423600.1887 (eval-ex 20.0000)
      143.6895 (eval-ex 5.0000)
      1.6487 (eval-ex 0.5000)
      0.6065 (eval-ex -0.5000))))
