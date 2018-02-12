(ns hacker-rank-clojure.fibonacci-fp-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fibonacci-fp :refer :all]))

(fibonacci)
(deftest test-fibonacci-fp
  (testing "sample I/O."
    (is (= 1 (nth @DP 1)))
    (is (= 1 (nth @DP 2)))
    (is (= 2 (nth @DP 3)))
    (is (= 3 (nth @DP 4)))
    (is (= 5 (nth @DP 5)))))
