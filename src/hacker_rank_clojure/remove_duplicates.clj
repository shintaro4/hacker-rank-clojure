(ns hacker-rank-clojure.remove-duplicates)


(defn remove-duplicates
  "https://www.hackerrank.com/challenges/remove-duplicates/problem"
  [cs]
  (loop [i 0
         v []]
    (cond
      (= i (count cs)) (clojure.string/join v)
      :else (let [c (nth cs i)]
              (if (some #(= c %) v)
                (recur (inc i) v)
                (recur (inc i) (conj v c)))))))

;; entry point
(let [cs (vec (read-line))]
  (println (remove-duplicates cs)))
