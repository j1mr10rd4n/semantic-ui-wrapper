(ns fulcrologic.semantic-ui.modules.ui-mount-node
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [MountNode]]))

(def ui-mount-node
  "A component that allows to manage classNames on a DOM node in declarative manner.

  Props:
    - className (string): Additional classes.
    - node (custom): The DOM node where we will apply class names. Defaults to document.body."
   (h/factory-apply MountNode))