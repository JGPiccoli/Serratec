import React from 'react'
import { BrowserRouter } from 'react-router-dom'
import Header from './components/Header/index.jsx'
import AppRouter from './routes/AppRouter'
import Footer from './components/Footer/index.jsx'

export default function App() {
  return (
    <div>
      <BrowserRouter>
        <Header/>
        <AppRouter/>     
        <Footer/> 
      </BrowserRouter>
    </div>
  )
}
