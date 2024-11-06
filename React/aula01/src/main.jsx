import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Time from './components/Time.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Time/>
  </StrictMode>,
)
