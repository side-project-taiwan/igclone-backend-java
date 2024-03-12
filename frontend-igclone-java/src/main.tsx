import React, { createContext } from "react";
import ReactDOM from "react-dom/client";
import { router } from "./router";
import { RouterProvider } from "react-router-dom";
import { reducer, initialState } from "@/reducers/useReducer";

import "./index.css";

export const UserContext = createContext({
  state: initialState,
  dispatch: (state: unknown, action: unknown) => state,
});

ReactDOM.createRoot(document.getElementById("root")!).render(
  <React.StrictMode>
    <UserContext.Provider value={{ state: initialState, dispatch: reducer }}>
      <RouterProvider router={router} />
    </UserContext.Provider>
  </React.StrictMode>
);
