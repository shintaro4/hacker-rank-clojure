(ns hacker-rank-clojure.string-mingling-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.string-mingling :refer :all]))

(deftest test-string-mingling
  (testing "sample I/O."
    (is (= "apbqcrdset"
           (string-mingling "abcde" "pqrst"))
        (= "hraacnkkeerr"
           (string-mingling "hacker" "ranker")))))
