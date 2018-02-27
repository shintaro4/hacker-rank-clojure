(ns hacker-rank-clojure.missing-numbers-fp-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.missing-numbers-fp :refer :all]))

(deftest test-missing-numbers-fp
  (testing "sample I/O."
    (is (= #{204 205 206}
           (missing-numbers-fp
            [203 204 205 206 207 208 203 204 205 206]
            [203 204 204 205 206 207 205 208 203 206 205 206 204])))))
