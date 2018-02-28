(ns hacker-rank-clojure.common-divisors-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.common-divisors :refer :all]))

(deftest test-common-divisors
  (testing "sample I/O."
    (is (= 2 (common-divisors 10 4))
        (= 1 (common-divisors 1 100))
        (= 10 (common-divisors 288 240)))))
