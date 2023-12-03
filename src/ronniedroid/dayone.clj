(ns ronniedroid.dayone
  (:gen-class)
  (:require [clojure.string :as str]))

(def input (slurp "resources/dayoneinput.txt"))

(def parsed-input (str/split input #"\n"))

(def part-one
  (->> parsed-input
       (map #(re-seq #"\d" %))
       (map #(str (first %) (last %)))
       (map read-string)
       (reduce +)))

part-one
