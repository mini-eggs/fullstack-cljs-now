(ns leiningen.new.fullstack-cljs-now
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "fullstack-cljs-now"))

(defn fullstack-cljs-now
  "For more information please read the README."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' fullstack-cljs-now project.")
    (->files data
             [".gitignore" (render "gitignore" data)]
             [".nowignore" (render "nowignore" data)]
             ["README" (render "README" data)]
             ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
             ["now.json" (render "now.json" data)]
             ["package.json" (render "package.json" data)]
             ["package-lock.json" (render "package-lock.json" data)]
             ["src/backend/main.cljs" (render "src/backend/main.cljs" data)]
             ["src/frontend/main.cljs" (render "src/frontend/main.cljs" data)])))

