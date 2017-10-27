(ns hacker-rank-clojure.fp-hello-world-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-hello-world :refer :all]))

(deftest test-fp-hello-world
  (testing "sample I/O."
    (is (= "Hello World" (fp-hello-world)))))
