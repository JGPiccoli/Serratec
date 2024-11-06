import { Route, Routes } from 'react-router-dom'
import Feed from '../pages/Feed'
import Posts from '../pages/Posts'
import Updates from '../pages/Updates'
import More from '../pages/More'
import Errors from '../pages/Errors'

export default function AppRoutes() {
  return (
    <Routes>
        <Route path='/' element={<Feed/>}></Route>
        <Route path='/posts' element={<Posts/>}></Route>
        <Route path='/Updates/:id' element={<Updates/>}></Route>
        <Route path='/more/:id' element={<More/>}></Route>
        <Route path='*' element={<Errors/>}></Route>
    </Routes>
  )
}
