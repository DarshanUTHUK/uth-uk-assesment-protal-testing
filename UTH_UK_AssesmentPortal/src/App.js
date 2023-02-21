import React, {useState} from 'react';
import './App.css';
import {Login} from './Login';
import {Register} from './Register';


function App() {
  const [currentForm, setCurrentForm] = useState('register');

  const toggleForm = (forName) => {
    setCurrentForm(forName);
  }

  return (
    <div className="App">
      {
        currentForm == "register" ? <Register onFormSwitch={toggleForm} ></Register> : <Login onFormSwitch={toggleForm} ></Login>
      }
    </div>
  );
}

export default App;
