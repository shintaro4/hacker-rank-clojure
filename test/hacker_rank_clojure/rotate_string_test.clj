(ns hacker-rank-clojure.rotate-string-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.rotate-string :refer :all]))

(deftest test-rotate-string
  (testing "sample I/O."
    (is (= ["bca" "cab" "abc"] (rotate-string [\a \b \c])))
    (is (= ["aaa" "aaa" "aaa"] (rotate-string [\a \a \a])))))
