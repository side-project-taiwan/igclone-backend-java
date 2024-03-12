import { useEffect, createContext, useReducer, useContext } from "react";
import NavBar from "@/components/Navbar";
import "./App.css";
import { BrowserRouter } from "react-router-dom";
import { reducer, initialState } from "./reducers/useReducer";

export const UserContext = createContext();

const Routing = () => {
  const history = useHistory();
  const { state, dispatch } = useContext(UserContext);
  useEffect(() => {
    const user = JSON.parse(localStorage.getItem("user"));
    if (user) {
      dispatch({ type: "USER", payload: user });
    } else {
      // console.log("********** in App.js useEffect before history push **************")
      history.push("/signin");
    }
  }, []);
  return <div></div>;
};

function App() {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <UserContext.Provider value={{ state, dispatch }}>
      <BrowserRouter>
        <NavBar />
        <Routing />
      </BrowserRouter>
    </UserContext.Provider>
  );
}

export default App;
