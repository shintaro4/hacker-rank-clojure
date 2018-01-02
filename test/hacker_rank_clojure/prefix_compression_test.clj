(ns hacker-rank-clojure.prefix-compression-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.prefix-compression :refer :all]))

(deftest test-prefix-compression
  (testing "sample I/O."
    (is (= "abc"
           (prefix-compression "abcdefpr" "abcpqr"))
        (= "kit"
           (prefix-compression "kitkat" "kit"))
        (= "puppy"
           (prefix-compression "puppy" "puppy")))))
