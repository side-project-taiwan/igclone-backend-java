import { createBrowserRouter } from "react-router-dom";

import UserProfile from "@/components/screens/UserProfile";
import SubscribeUserPosts from "@/components/screens/SubscribeUserPosts";
import Home from "@/components/screens/Home";
import SignIn from "@/components/screens/SignIn";
import Profile from "@/components/screens/Profile";
import Signup from "@/components/screens/Signup";
import CreatePost from "@/components/screens/CreatePost";

const routes = [
  { path: "/t", element: <Home /> },
  { path: "/signin", element: <SignIn /> },
  { path: "/signup", element: <Signup /> },
  { path: "/profile", element: <Profile /> },
  { path: "/create", element: <CreatePost /> },
  { path: "/profile/:userid", element: <UserProfile /> },
  { path: "/myfollowingpost", element: <SubscribeUserPosts /> },
];

export const router = createBrowserRouter(routes);
