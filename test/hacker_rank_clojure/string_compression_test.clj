(ns hacker-rank-clojure.string-compression-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.string-compression :refer :all]))

(deftest test-string-compression
  (testing "sample I/O."
    (is (= "abca3b3"
           (string-compression "abcaaabbb"))
        (= "abcd"
           (string-compression "abcd"))
        (= "a3ba4c2a4ba"
           (string-compression "aaabaaaaccaaaaba")))))
